package com.microsoft.PicassoMR;

import android.util.Base64;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

public class ServiceClient {

    public static String SendHttpRequest(String url, String httpMethod)
            throws IOException
    {
        URL httpUrl = new URL(url);
        URLConnection connection = httpUrl.openConnection();
        connection.connect();

        BufferedReader rd  = null;
        rd = new BufferedReader(
                  new InputStreamReader(connection.getInputStream()));

        StringBuilder sb = new StringBuilder();
            String line = null;
        while ((line = rd.readLine()) != null)
        {
            sb.append(line + '\n');
        }

        return sb.toString();
    }

    //  if you are hitting an HTTPS URL that has a valid SSL certificate from someone like Verisign or Thawte,
    //  but will not work with other SSL certificates unless you go down the Java keystore road
    public static String SendHttpsRequestToValidSSL(String url, String httpMethod)
            throws IOException
    {
        URL httpsUrl = null;
        httpsUrl = new URL(url);

        HttpsURLConnection  connection = (HttpsURLConnection)httpsUrl.openConnection();
        connection.setRequestProperty("MS-CV", "YxYtoIBkT0SVTTR9.21");
        connection.connect();

        BufferedReader rd  = null;
        rd = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = rd.readLine()) != null)
        {
            sb.append(line + '\n');
        }

        return sb.toString();
    }

    public static HttpsURLConnection SendHttpsRequestToInValidSSL(boolean ignoreInvalidCertificate, String user, String pass,
                                                   URL url)
            throws KeyManagementException, NoSuchAlgorithmException, IOException
    {
        SSLContext ctx = SSLContext.getInstance("TLS");
        if (ignoreInvalidCertificate){
            ctx.init(null, new TrustManager[] { new InvalidCertificateTrustManager() }, null);
        }
        SSLContext.setDefault(ctx);

        String authStr = user+":"+pass;
        String authEncoded = Base64.encodeToString(authStr.getBytes(),0);

        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setRequestProperty("Authorization", "Basic " + authEncoded);

        if (ignoreInvalidCertificate){
            connection.setHostnameVerifier(new InvalidCertificateHostVerifier());
        }

        return connection;
    }
}
