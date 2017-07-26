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
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainsContract
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainsContract {
    /**
     * The domains property.
     */
    @JsonProperty(value = "domains")
    private List<String> domains;

    /**
     * Get the domains value.
     *
     * @return the domains value
     */
    public List<String> domains() {
        return this.domains;
    }

    /**
     * Set the domains value.
     *
     * @param domains the domains value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainsContract object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainsContract withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

}