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
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6GetCatalogManifestResponse
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6GetCatalogManifestResponse {
    /**
     * The catalogManifests property.
     */
    @JsonProperty(value = "catalogManifests", access = JsonProperty.Access.WRITE_ONLY)
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6CatalogManifestResponseContract> catalogManifests;

    /**
     * Get the catalogManifests value.
     *
     * @return the catalogManifests value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6CatalogManifestResponseContract> catalogManifests() {
        return this.catalogManifests;
    }

}