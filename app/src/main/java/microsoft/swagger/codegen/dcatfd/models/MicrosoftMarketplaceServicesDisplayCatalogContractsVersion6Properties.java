package microsoft.swagger.codegen.dcatfd.models;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties {
    /**
     * The dimensions property.
     */
    @JsonProperty(value = "Dimensions")
    private MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions dimensions;

    /**
     * Get the dimensions value.
     *
     * @return the dimensions value
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions value.
     *
     * @param dimensions the dimension value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties withDimensions(MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
