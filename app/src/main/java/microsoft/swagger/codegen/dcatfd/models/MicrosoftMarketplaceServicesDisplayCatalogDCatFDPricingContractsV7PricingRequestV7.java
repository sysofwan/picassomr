/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7PricingRequestV7
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7PricingRequestV7 {
    /**
     * The productPricingParameters property.
     */
    @JsonProperty(value = "productPricingParameters", access = JsonProperty.Access.WRITE_ONLY)
    private List<MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7ProductPricingParametersV7> productPricingParameters;

    /**
     * The requestPricingParameters property.
     */
    @JsonProperty(value = "requestPricingParameters")
    private MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7RequestPricingParametersV7 requestPricingParameters;

    /**
     * Get the productPricingParameters value.
     *
     * @return the productPricingParameters value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7ProductPricingParametersV7> productPricingParameters() {
        return this.productPricingParameters;
    }

    /**
     * Get the requestPricingParameters value.
     *
     * @return the requestPricingParameters value
     */
    public MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7RequestPricingParametersV7 requestPricingParameters() {
        return this.requestPricingParameters;
    }

    /**
     * Set the requestPricingParameters value.
     *
     * @param requestPricingParameters the requestPricingParameters value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7PricingRequestV7 object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7PricingRequestV7 withRequestPricingParameters(MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7RequestPricingParametersV7 requestPricingParameters) {
        this.requestPricingParameters = requestPricingParameters;
        return this;
    }

}
