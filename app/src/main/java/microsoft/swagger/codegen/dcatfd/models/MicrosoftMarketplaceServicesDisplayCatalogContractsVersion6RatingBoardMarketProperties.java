/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties {
    /**
     * The market property.
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * The priority property.
     */
    @JsonProperty(value = "priority")
    private Integer priority;

    /**
     * Get the market value.
     *
     * @return the market value
     */
    public String market() {
        return this.market;
    }

    /**
     * Set the market value.
     *
     * @param market the market value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

}
