package microsoft.swagger.codegen.dcatfd.models;

        import java.util.List;

        import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
        import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty {
    /**
     * The skuButtonTitle property.
     */
    @JsonProperty(value = "SkuButtonTitle")
    private String skuButtonTitle;

    /**
     * The skuDescription property.
     */
    @JsonProperty(value = "SkuDescription")
    private String skuDescription;

    /**
     * The skuTitle property.
     */
    @JsonProperty(value = "SkuTitle")
    private String skuTitle;


    /**
     * The specifications property.
     */
    @JsonProperty(value = "Specifications")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification> specifications;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties")
    private MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties properties;

    /**
     * Get the specifications value.
     *
     * @return the specifications value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification> specifications() {
        return this.specifications;
    }

    /**
     * Set the specifications value.
     *
     * @param specifications the specifications value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty withSpecifications(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Specification> specifications) {
        this.specifications = specifications;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty withProperties(MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties properties) {
        this.properties = properties();
        return this;
    }

    /**
     * Get the skuButtonTitle value.
     *
     * @return the skuButtonTitle value
     */
    public String skuButtonTitle() {
        return this.skuButtonTitle;
    }

    /**
     * Set the skuType value.
     *
     * @param skuButtonTitle the skuType value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty withSkuButtonTitle(String skuButtonTitle) {
        this.skuButtonTitle = skuButtonTitle;
        return this;
    }

    /**
     * Get the skuDescription value.
     *
     * @return the skuDescription value
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Set the skuDescription value.
     *
     * @param skuDescription the skuDescription value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty withSkuDescription(String skuDescription) {
        this.skuDescription = skuDescription;
        return this;
    }

    /**
     * Get the skuTitle value.
     *
     * @return the skuTitle value
     */
    public String skuTitle() {
        return this.skuTitle;
    }

    /**
     * Set the skuTitle value.
     *
     * @param skuTitle the skuTitle value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperties object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty withSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle;
        return this;
    }
}
