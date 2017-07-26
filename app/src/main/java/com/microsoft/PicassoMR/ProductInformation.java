package com.microsoft.PicassoMR;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import microsoft.swagger.codegen.dcatfd.models.MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetailsResponseContract;

import java.io.IOException;

public class ProductInformation {

    public static MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetailsResponseContract RequestProductInfo() throws IOException
    {
        String productDetailBaseUrl = "https://displaycatalog.mp.microsoft.com/v7.0/products/";
        String productDetailQueryString = "?bigIds={id}&market=US&languages=en-us&catalogId=1";
        GenerateRequest productRequest = new GenerateRequest(productDetailBaseUrl, productDetailQueryString, "8NKT9WTTRBJK");
        String returnVal = productRequest.GetResponse();
        System.out.println("\nProduct Response: \n" + returnVal);

        ObjectMapper mapper = new ObjectMapper();
        try {
            MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetailsResponseContract productObj =
                    mapper.readValue(returnVal, MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetailsResponseContract.class);

            //Product Spec to Use:
            // 1. SkuTitle
            // 2. SkuDescription
            // 3. SkuButtonTitle
            // productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().localizedProperties()
            String title = productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().localizedProperties().get(0).skuTitle();

            // 4. Specifications
            // productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().localizedProperties().get(0).specifications()
            String name = productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().localizedProperties().get(0).specifications().get(0).name();
            String value = productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().localizedProperties().get(0).specifications().get(0).value();

            // 5. Dimensions
            // productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().properties().dimensions()
            String height = productObj.Products().get(0).displaySkuAvailabilities().get(0).sku().properties().dimensions().height();

            System.out.println(name + "\n" + value + "\n" + title + "\n" + height + "\n");

            return productObj;
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
