package microsoft.swagger.codegen.dcatfd.models;

        import java.util.List;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification {
    /**
     * The height property.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The length property.
     */
    @JsonProperty(value = "Value")
    private String value;

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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification withValue(String value) {
        this.value = value;
        return this;
    }
}
