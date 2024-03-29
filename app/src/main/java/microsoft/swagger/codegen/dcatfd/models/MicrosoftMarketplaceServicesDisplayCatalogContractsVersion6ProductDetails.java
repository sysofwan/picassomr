/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails {
    /**
     * The displaySkuAvailabilities property.
     */
    @JsonProperty(value = "DisplaySkuAvailabilities")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities> displaySkuAvailabilities;

    /**
     * The lastModifiedDate property.
     */
    @JsonProperty(value = "LastModifiedDate")
    private String lastModifiedDate;

    /**
     * The localizedProperties property.
     */
    @JsonProperty(value = "LocalizedProperties")
    private List<Object> localizedProperties;

    /**
     * The marketProperties property.
     */
    @JsonProperty(value = "MarketProperties")
    private List<Object> marketProperties;

    /**
     * The productASchema property.
     */
    @JsonProperty(value = "ProductASchema")
    private String productASchema;

    /**
     * The productBSchema property.
     */
    @JsonProperty(value = "ProductBSchema")
    private String productBSchema;

    /**
     * The productId property.
     */
    @JsonProperty(value = "ProductId")
    private String productId;

    /**
     * The domainDataVersion property.
     */
    @JsonProperty(value = "DomainDataVersion")
    private String domainDataVersion;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties")
    private Object properties;

    /**
     * The alternateIds property.
     */
    @JsonProperty(value = "AlternateIds")
    private List<Object> alternateIds;

    /**
     * The ingestionSource property.
     */
    @JsonProperty(value = "IngestionSource")
    private String ingestionSource;

    /**
     * The isMicrosoftProduct property.
     */
    @JsonProperty(value = "IsMicrosoftProduct")
    private Boolean isMicrosoftProduct;

    /**
     * The preferredSkuId property.
     */
    @JsonProperty(value = "PreferredSkuId")
    private String preferredSkuId;

    /**
     * The productType property.
     */
    @JsonProperty(value = "ProductType")
    private String productType;

    /**
     * The validationData property.
     */
    @JsonProperty(value = "ValidationData")
    private Object validationData;

    /**
     * The merchandizingTags property.
     */
    @JsonProperty(value = "MerchandizingTags")
    private Object merchandizingTags;

    /**
     * Get the displaySkuAvailabilities value.
     *
     * @return the displaySkuAvailabilities value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities> displaySkuAvailabilities() {
        return this.displaySkuAvailabilities;
    }

    /**
     * Set the displaySkuAvailabilities value.
     *
     * @param displaySkuAvailabilities the displaySkuAvailabilities value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withDisplaySkuAvailabilities(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuAvailabilities> displaySkuAvailabilities) {
        this.displaySkuAvailabilities = displaySkuAvailabilities;
        return this;
    }

    /**
     * Get the lastModifiedDate value.
     *
     * @return the lastModifiedDate value
     */
    public String lastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * Set the lastModifiedDate value.
     *
     * @param lastModifiedDate the lastModifiedDate value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Get the localizedProperties value.
     *
     * @return the localizedProperties value
     */
    public List<Object> localizedProperties() {
        return this.localizedProperties;
    }

    /**
     * Set the localizedProperties value.
     *
     * @param localizedProperties the localizedProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withLocalizedProperties(List<Object> localizedProperties) {
        this.localizedProperties = localizedProperties;
        return this;
    }

    /**
     * Get the marketProperties value.
     *
     * @return the marketProperties value
     */
    public List<Object> marketProperties() {
        return this.marketProperties;
    }

    /**
     * Set the marketProperties value.
     *
     * @param marketProperties the marketProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withMarketProperties(List<Object> marketProperties) {
        this.marketProperties = marketProperties;
        return this;
    }

    /**
     * Get the productASchema value.
     *
     * @return the productASchema value
     */
    public String productASchema() {
        return this.productASchema;
    }

    /**
     * Set the productASchema value.
     *
     * @param productASchema the productASchema value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withProductASchema(String productASchema) {
        this.productASchema = productASchema;
        return this;
    }

    /**
     * Get the productBSchema value.
     *
     * @return the productBSchema value
     */
    public String productBSchema() {
        return this.productBSchema;
    }

    /**
     * Set the productBSchema value.
     *
     * @param productBSchema the productBSchema value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withProductBSchema(String productBSchema) {
        this.productBSchema = productBSchema;
        return this;
    }

    /**
     * Get the productId value.
     *
     * @return the productId value
     */
    public String productId() {
        return this.productId;
    }

    /**
     * Set the productId value.
     *
     * @param productId the productId value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get the domainDataVersion value.
     *
     * @return the domainDataVersion value
     */
    public String domainDataVersion() {
        return this.domainDataVersion;
    }

    /**
     * Set the domainDataVersion value.
     *
     * @param domainDataVersion the domainDataVersion value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withDomainDataVersion(String domainDataVersion) {
        this.domainDataVersion = domainDataVersion;
        return this;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the alternateIds value.
     *
     * @return the alternateIds value
     */
    public List<Object> alternateIds() {
        return this.alternateIds;
    }

    /**
     * Set the alternateIds value.
     *
     * @param alternateIds the alternateIds value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withAlternateIds(List<Object> alternateIds) {
        this.alternateIds = alternateIds;
        return this;
    }

    /**
     * Get the ingestionSource value.
     *
     * @return the ingestionSource value
     */
    public String ingestionSource() {
        return this.ingestionSource;
    }

    /**
     * Set the ingestionSource value.
     *
     * @param ingestionSource the ingestionSource value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withIngestionSource(String ingestionSource) {
        this.ingestionSource = ingestionSource;
        return this;
    }

    /**
     * Get the isMicrosoftProduct value.
     *
     * @return the isMicrosoftProduct value
     */
    public Boolean isMicrosoftProduct() {
        return this.isMicrosoftProduct;
    }

    /**
     * Set the isMicrosoftProduct value.
     *
     * @param isMicrosoftProduct the isMicrosoftProduct value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withIsMicrosoftProduct(Boolean isMicrosoftProduct) {
        this.isMicrosoftProduct = isMicrosoftProduct;
        return this;
    }

    /**
     * Get the preferredSkuId value.
     *
     * @return the preferredSkuId value
     */
    public String preferredSkuId() {
        return this.preferredSkuId;
    }

    /**
     * Set the preferredSkuId value.
     *
     * @param preferredSkuId the preferredSkuId value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withPreferredSkuId(String preferredSkuId) {
        this.preferredSkuId = preferredSkuId;
        return this;
    }

    /**
     * Get the productType value.
     *
     * @return the productType value
     */
    public String productType() {
        return this.productType;
    }

    /**
     * Set the productType value.
     *
     * @param productType the productType value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Get the validationData value.
     *
     * @return the validationData value
     */
    public Object validationData() {
        return this.validationData;
    }

    /**
     * Set the validationData value.
     *
     * @param validationData the validationData value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withValidationData(Object validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * Get the merchandizingTags value.
     *
     * @return the merchandizingTags value
     */
    public Object merchandizingTags() {
        return this.merchandizingTags;
    }

    /**
     * Set the merchandizingTags value.
     *
     * @param merchandizingTags the merchandizingTags value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails withMerchandizingTags(Object merchandizingTags) {
        this.merchandizingTags = merchandizingTags;
        return this;
    }

}
