/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultResponseContract
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultResponseContract {
    /**
     * The displayProductSearchResult property.
     */
    @JsonProperty(value = "displayProductSearchResult")
    private MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultContract displayProductSearchResult;

    /**
     * Get the displayProductSearchResult value.
     *
     * @return the displayProductSearchResult value
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultContract displayProductSearchResult() {
        return this.displayProductSearchResult;
    }

    /**
     * Set the displayProductSearchResult value.
     *
     * @param displayProductSearchResult the displayProductSearchResult value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultResponseContract object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultResponseContract withDisplayProductSearchResult(MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SearchResultContract displayProductSearchResult) {
        this.displayProductSearchResult = displayProductSearchResult;
        return this;
    }

}