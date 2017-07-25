/*===============================================================================
Copyright (c) 2016 PTC Inc. All Rights Reserved.

Copyright (c) 2012-2014 Qualcomm Connected Experiences, Inc. All Rights Reserved.

Vuforia is a trademark of PTC Inc., registered in the United States and other 
countries.
===============================================================================*/

package com.vuforia.samples.SampleApplication.utils;

public class CubeShaders
{

    // old
    public static final String CUBE_MESH_VERTEX_SHADER = " \n" + "\n"
        + "attribute vec4 vertexPosition; \n"
        + "attribute vec2 vertexTexCoord; \n" + "\n"
        + "varying vec2 texCoord; \n" + "\n"
        + "uniform mat4 modelViewProjectionMatrix; \n" + "\n"
        + "void main() \n" + "{ \n"
        + "   gl_Position = modelViewProjectionMatrix * vertexPosition; \n"
        + "   texCoord = vertexTexCoord; \n"
        + "} \n";

    // old
    public static final String CUBE_MESH_FRAGMENT_SHADER = " \n" + "\n"
            + "precision mediump float; \n" + " \n"
            + "varying vec2 texCoord; \n"
            + "uniform sampler2D texSampler2D; \n" + " \n"
            + "void main() \n"
            + "{ \n" + "   gl_FragColor = texture2D(texSampler2D, texCoord); \n"
            + "} \n";

    /*
    public static final String CUBE_MESH_VERTEX_SHADER = " \n" + "\n"
            + "attribute vec4 vertexPosition; \n"
            + "attribute vec2 vertexTexCoord; \n"
            + "attribute vec3 normal; \n" + "\n"
            + "varying vec2 texCoord; \n" + "\n"
            + "varying vec3 toLightVector; \n" + "\n"
            + "varying vec3 toCameraVector; \n" + "\n"
            + "varying vec3 surfaceNormal; \n" + "\n"
            + "uniform mat4 transformationMatrix; \n" + "\n"
            + "uniform mat4 modelViewProjectionMatrix; \n" + "\n"
            + "uniform vec3 lightPosition; \n" + "\n"
            + "void main() \n" + "{ \n"
            //+ "   vec4 worldPosition = transformationMatrix * vertexPosition; \n"
            + "   gl_Position = modelViewProjectionMatrix * worldPosition; \n"
            + "   texCoord = vertexTexCoord; \n"
            //+ "   surfaceNormal = (transformationMatrix * vec4(normal, 0.0)).xyz; \n"
            //+ "   toLightVector = lightPosition * worldPosition.xyz; \n"
            //+ "   toCameraVector = (modelViewProjectionMatrix * vec4(0.0,0.0,0.0,1.0)).xyz * worldPosition.xyz; \n"
            + "} \n";

    public static final String CUBE_MESH_FRAGMENT_SHADER = " \n" + "\n"
            + "precision mediump float; \n" + " \n"
            + "varying vec2 texCoord; \n"
            + "varying vec3 toLightVector; \n" + "\n"
            + "varying vec3 toCameraVector; \n" + "\n"
            + "varying vec3 surfaceNormal; \n" + "\n"
            + "uniform sampler2D texSampler2D; \n" + " \n"
            + "uniform vec3 lightColor; \n" + "\n"
            + "void main() \n"
            + "{ \n"
            //+ "   vec3 unitNormal = normalize(surfaceNormal); \n"
            //+ "   vec3 unitLightVector = normalize(toLightVector); \n"
            //+ "   float nDot1 = dot(unitNormal, unitLightVector); \n"
            //+ "   float brightness = max(nDot1, 0.2); \n"
            //+ "   vec3 diffuse = brightness * lightColor; \n"
            //+ "   gl_FragColor = vec4(diffuse, 1.0) * texture2D(texSampler2D, texCoord) * vec4(lightColor, 1.0); \n"
            + "   gl_FragColor = texture2D(texSampler2D, texCoord); \n"
            + "} \n";
    */
}
