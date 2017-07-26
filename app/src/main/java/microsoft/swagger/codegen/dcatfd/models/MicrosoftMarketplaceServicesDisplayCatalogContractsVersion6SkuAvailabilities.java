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
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities {
    /**
     * The availabilities property.
     */
    @JsonProperty(value = "Availabilities")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability> availabilities;

    /**
     * The sku property.
     */
    @JsonProperty(value = "Sku")
    private MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku sku;

    /**
     * Get the availabilities value.
     *
     * @return the availabilities value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability> availabilities() {
        return this.availabilities;
    }

    /**
     * Set the availabilities value.
     *
     * @param availabilities the availabilities value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities withAvailabilities(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability> availabilities) {
        this.availabilities = availabilities;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities withSku(MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku sku) {
        this.sku = sku;
        return this;
    }

}