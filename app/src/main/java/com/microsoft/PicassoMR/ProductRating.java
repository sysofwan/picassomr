package com.microsoft.PicassoMR;

        import com.fasterxml.jackson.core.JsonGenerationException;
        import com.fasterxml.jackson.databind.JsonMappingException;
        import com.fasterxml.jackson.databind.ObjectMapper;
        import microsoft.swagger.codegen.ratingsedgefd.models.MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedReviewContract;
        import microsoft.swagger.codegen.ratingsedgefd.models.MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract;

        import java.io.IOException;

public class ProductRating
{
    public static MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract RequestProductRating() throws IOException
    {
        String productRatingBaseUrl = "https://ratingsedge.rnr.microsoft.com/V1.0/ratingsedge/summary/product/{id}";
        String productRatingQueryString = "?catalogid=1&market=US&locale=en-US&callsiteid=1&displayMode=0";
        GenerateRequest ratingRequest = new GenerateRequest(productRatingBaseUrl, productRatingQueryString, "8NKT9WTTRBJK");
        String returnVal = ratingRequest.GetResponse();
        System.out.println("\nRating Response: \n" + returnVal);

        ObjectMapper mapper = new ObjectMapper();
        try {
            MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract ratingObj =
                    mapper.readValue(returnVal, MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract.class);

            //Product rating to Use:
            // 1. rating
            String averageRating = ratingObj.averageRating().toString();
            System.out.println("Rating: " + averageRating);

            return ratingObj;
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
