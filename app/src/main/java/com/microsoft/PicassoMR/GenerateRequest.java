package com.microsoft.PicassoMR;

import java.io.IOException;

public class GenerateRequest
{
    public String url;

    public GenerateRequest(String baseUrl, String queryString, String id)
    {
        String url = baseUrl + queryString;
        this.url = url.replace("{id}", id);
    }

    public String GetResponse()throws IOException
    {
        //baseUrl = this.baseUrl + productId;
        //String queryString = "?catalogId=1&market=US&skipItems=0&pageSize=2&orderBy=1&locale=en-US&starFilters=2;3&treatmentIds=&displayMode=0";

        return ServiceClient.SendHttpsRequestToValidSSL(this.url,"Get");

    }
}
