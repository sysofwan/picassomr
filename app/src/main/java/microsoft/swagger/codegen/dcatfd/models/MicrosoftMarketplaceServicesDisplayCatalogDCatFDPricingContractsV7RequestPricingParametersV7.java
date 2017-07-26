/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7RequestPricingParametersV7
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7RequestPricingParametersV7 {
    /**
     * The orderHistory property.
     */
    @JsonProperty(value = "orderHistory", access = JsonProperty.Access.WRITE_ONLY)
    private List<MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7OrderHistoryV7> orderHistory;

    /**
     * The parameters property.
     */
    @JsonProperty(value = "parameters", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> parameters;

    /**
     * Get the orderHistory value.
     *
     * @return the orderHistory value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogDCatFDPricingContractsV7OrderHistoryV7> orderHistory() {
        return this.orderHistory;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public Map<String, String> parameters() {
        return this.parameters;
    }

}