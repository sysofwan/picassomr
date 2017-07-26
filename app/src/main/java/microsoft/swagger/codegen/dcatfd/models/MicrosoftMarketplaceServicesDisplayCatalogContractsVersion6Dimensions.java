package microsoft.swagger.codegen.dcatfd.models;

        import java.util.List;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions {
    /**
     * The height property.
     */
    @JsonProperty(value = "Height")
    private String height;

    /**
     * The length property.
     */
    @JsonProperty(value = "Length")
    private String length;

    /**
     * The systemOfMeasurement property.
     */
    @JsonProperty(value = "SystemOfMeasurement")
    private String systemOfMeasurement;

    /**
     * The weight property.
     */
    @JsonProperty(value = "Weight")
    private String weight;

    /**
     * The width property.
     */
    @JsonProperty(value = "Width")
    private String width;

    /**
     * Get the height value.
     *
     * @return the height value
     */
    public String height() {
        return this.height;
    }

    /**
     * Set the height value.
     *
     * @param height the dimension value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * Get the length value.
     *
     * @return the length value
     */
    public String length() {
        return this.length;
    }

    /**
     * Set the length value.
     *
     * @param length the length value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions withLength(String length) {
        this.length = length;
        return this;
    }

    /**
     * Get the systemOfMeasurement value.
     *
     * @return the systemOfMeasurement value
     */
    public String systemOfMeasurement() {
        return this.systemOfMeasurement;
    }

    /**
     * Set the systemOfMeasurement value.
     *
     * @param systemOfMeasurement the systemOfMeasurement value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions withSystemOfMeasurement(String systemOfMeasurement) {
        this.systemOfMeasurement = systemOfMeasurement;
        return this;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public String weight() {
        return this.weight;
    }

    /**
     * Set the weight value.
     *
     * @param weight the weight value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions withWeight(String weight) {
        this.weight = weight;
        return this;
    }

    /**
     * Get the width value.
     *
     * @return the width value
     */
    public String width() {
        return this.width;
    }

    /**
     * Set the width value.
     *
     * @param width the weight value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Dimensions withWidth(String width) {
        this.width = width;
        return this;
    }
}
