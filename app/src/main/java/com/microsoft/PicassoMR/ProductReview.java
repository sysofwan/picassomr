package com.microsoft.PicassoMR;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import microsoft.swagger.codegen.ratingsedgefd.models.MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract;

import java.io.IOException;

public class ProductReview
{
    public static MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract RequestProductReview() throws IOException
    {
        String productReviewBaseUrl = "https://ratingsedge.rnr.microsoft.com/V1.0/ratingsedge/wsfb/product/{id}";
        String productReviewQueryString = "?catalogId=1&market=US&skipItems=0&pageSize=2&orderBy=1&locale=en-US&starFilters=2;3&treatmentIds=&displayMode=0";
        GenerateRequest reviewRequest = new GenerateRequest(productReviewBaseUrl, productReviewQueryString, "8NKT9WTTRBJK");
        String returnVal = reviewRequest.GetResponse();
        System.out.println("\nReview Response: \n" + returnVal);

        ObjectMapper mapper = new ObjectMapper();

        mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES,true);
        try {
            MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract reviewObj =
                    mapper.readValue(returnVal, MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract.class);

            //Product Spec to Use:
            // 1. review
            // reviewObj.items()
            String review = reviewObj.items().get(0).reviewText();
            System.out.println("Review: " + review);

            return reviewObj;
        } catch (JsonGenerationException e) {
            System.out.println(e);
        } catch (JsonMappingException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        return null;
    }
}
