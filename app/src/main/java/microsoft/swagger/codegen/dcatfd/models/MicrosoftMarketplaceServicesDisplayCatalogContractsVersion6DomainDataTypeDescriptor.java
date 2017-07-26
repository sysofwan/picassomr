/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainDataTypeDescriptor
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainDataTypeDescriptor {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The parent property.
     */
    @JsonProperty(value = "parent")
    private String parent;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainDataTypeDescriptor object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainDataTypeDescriptor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parent value.
     *
     * @return the parent value
     */
    public String parent() {
        return this.parent;
    }

    /**
     * Set the parent value.
     *
     * @param parent the parent value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainDataTypeDescriptor object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6DomainDataTypeDescriptor withParent(String parent) {
        this.parent = parent;
        return this;
    }

}
