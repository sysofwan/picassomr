package com.vuforia.samples.SampleApplication.utils;

/**
 * Created by antho on 7/24/2017.
 */

import android.content.res.AssetManager;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.nio.Buffer;

import com.vuforia.Vec2I;
import com.vuforia.Vec2F;
import com.vuforia.Vec3F;


public class ObjLoader {
    public static CubeObject loadCubeObjModel(String fileName, AssetManager assets) {
        InputStream inputStream1 = null;
        InputStream inputStream2 = null;

        try {
            inputStream1 = assets.open(fileName+".obj", AssetManager.ACCESS_BUFFER);
            inputStream2 = assets.open(fileName+".obj", AssetManager.ACCESS_BUFFER);
        } catch (FileNotFoundException e) {
            System.err.println("Couldn' load file!");
            e.printStackTrace();
        } catch (IOException e)
        {
            System.err.println("Couldn' load stream!");
            e.printStackTrace();
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream1));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(inputStream2));
        String line = null;
        List<Vec3F> vertices = new ArrayList<Vec3F>();
        List<Vec2F> textures = new ArrayList<Vec2F>();
        List<Vec3F> normals = new ArrayList<Vec3F>();
        List<Integer> indices = new ArrayList<Integer>();
        double[] verticesArray = null;
        double[] normalsArray = null;
        double[] textureArray = null;
        short[] indicesArray = null;

        try {
            while(true) {
                line = reader.readLine();
                if (line == null) {
                    break;
                }
                String[] currentLine = line.split(" ");
                if (line.startsWith("v ")) {
                    Vec3F vertex = new Vec3F(Float.parseFloat(currentLine[1]),
                            Float.parseFloat(currentLine[2]), Float.parseFloat(currentLine[3]));
                    vertices.add(vertex);
                } else if (line.startsWith("vt ")) {
                    Vec2F texture = new Vec2F(Float.parseFloat(currentLine[1]),
                            Float.parseFloat(currentLine[2]));
                    textures.add(texture);
                } else if (line.startsWith("vn ")) {
                    Vec3F normal = new Vec3F(Float.parseFloat(currentLine[1]),
                            Float.parseFloat(currentLine[2]), Float.parseFloat(currentLine[3]));
                    normals.add(normal);
                } else if (line.startsWith("f ")) {

                }
            }

            textureArray = new double[vertices.size() * 2];
            normalsArray = new double[vertices.size() * 3];

            reader.close();

            line = reader2.readLine();
            while(line != null) {
                if (!line.startsWith("f ")) {
                    line = reader2.readLine();
                    continue;
                }
                String[] currentLine = line.split(" ");
                String[] vertex1 = currentLine[1].split("/");
                String[] vertex2 = currentLine[2].split("/");
                String[] vertex3 = currentLine[3].split("/");

                processVertex(vertex1, indices, textures, normals, textureArray, normalsArray);
                processVertex(vertex2, indices, textures, normals, textureArray, normalsArray);
                processVertex(vertex3, indices, textures, normals, textureArray, normalsArray);
                line = reader2.readLine();
            }
            reader2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        verticesArray = new double[vertices.size() * 3];
        indicesArray = new short[indices.size()];

        int vertexPointer = 0;
        for(Vec3F vertex:vertices) {
            float[] xyz = vertex.getData();
            verticesArray[vertexPointer++] = xyz[0];
            verticesArray[vertexPointer++] = xyz[1];
            verticesArray[vertexPointer++] = xyz[2];
        }

        for(int i=0;i<indices.size();i++) {
            indicesArray[i] = (short)Math.min(Math.max(indices.get(i), Short.MIN_VALUE), Short.MAX_VALUE);
        }
        return new CubeObject(verticesArray, textureArray, normalsArray, indicesArray);
    }

    private static void processVertex(String[] vertexData, List<Integer> indices,
        List<Vec2F> textures, List<Vec3F> normals, double[] textureArray, double[] normalsArray) {
        int currentVertexPointer = Integer.parseInt(vertexData[0]) - 1;
        indices.add(currentVertexPointer);
        if (!vertexData[1].isEmpty())
        {
            Vec2F currentTex = textures.get(Integer.parseInt(vertexData[1]) - 1);
            float[] currentTexXyz = currentTex.getData();
            textureArray[currentVertexPointer * 2] = currentTexXyz[0];
            textureArray[currentVertexPointer * 2 + 1] = 1 - currentTexXyz[1];
        }
        else {
            textureArray[currentVertexPointer * 2] = 0;
            textureArray[currentVertexPointer * 2 + 1] = 1 - 0;
        }
        if (!vertexData[2].isEmpty())
        {
            Vec3F currentNorm = normals.get(Integer.parseInt(vertexData[2]) - 1);
            float[] currentNormXyz = currentNorm.getData();
            normalsArray[currentVertexPointer * 3] = currentNormXyz[0];
            normalsArray[currentVertexPointer * 3 + 1] = currentNormXyz[1];
            normalsArray[currentVertexPointer * 3 + 2] = currentNormXyz[2];
        }
        else {
            normalsArray[currentVertexPointer * 3] = 0;
            normalsArray[currentVertexPointer * 3 + 1] = 0;
            normalsArray[currentVertexPointer * 3 + 2] = 0;
        }
    }
}
