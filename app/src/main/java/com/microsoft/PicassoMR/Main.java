package com.microsoft.PicassoMR;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import microsoft.swagger.codegen.dcatfd.models.MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetailsResponseContract;
import org.json.JSONException;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException, JSONException {
        ProductInformation.RequestProductInfo();
        ProductReview.RequestProductReview();
        ProductRating.RequestProductRating();
    }
}
