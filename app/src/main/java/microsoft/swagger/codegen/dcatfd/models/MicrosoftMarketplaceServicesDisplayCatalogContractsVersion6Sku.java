/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku {
    /**
     * The lastModifiedDate property.
     */
    @JsonProperty(value = "LastModifiedDate")
    private String lastModifiedDate;

    /**
     * The localizedProperties property.
     */
    @JsonProperty(value = "LocalizedProperties")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty> localizedProperties;

    /**
     * The marketProperties property.
     */
    @JsonProperty(value = "MarketProperties")
    private List<Object> marketProperties;

    /**
     * The productId property.
     */
    @JsonProperty(value = "ProductId")
    private String productId;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties")
    private MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties properties;

    /**
     * The skuASchema property.
     */
    @JsonProperty(value = "SkuASchema")
    private String skuASchema;

    /**
     * The skuBSchema property.
     */
    @JsonProperty(value = "SkuBSchema")
    private String skuBSchema;

    /**
     * The skuId property.
     */
    @JsonProperty(value = "SkuId")
    private String skuId;

    /**
     * The skuType property.
     */
    @JsonProperty(value = "SkuType")
    private String skuType;

    /**
     * The recurrencePolicy property.
     */
    @JsonProperty(value = "RecurrencePolicy")
    private MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy recurrencePolicy;

    /**
     * The subscriptionPolicyId property.
     */
    @JsonProperty(value = "SubscriptionPolicyId")
    private String subscriptionPolicyId;

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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Get the localizedProperties value.
     *
     * @return the localizedProperties value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty> localizedProperties() {
        return this.localizedProperties;
    }

    /**
     * Set the localizedProperties value.
     *
     * @param localizedProperties the localizedProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withLocalizedProperties(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6LocalizedProperty> localizedProperties) {
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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withMarketProperties(List<Object> marketProperties) {
        this.marketProperties = marketProperties;
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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withProductId(String productId) {
        this.productId = productId;
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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withProperties(MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Properties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the skuASchema value.
     *
     * @return the skuASchema value
     */
    public String skuASchema() {
        return this.skuASchema;
    }

    /**
     * Set the skuASchema value.
     *
     * @param skuASchema the skuASchema value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withSkuASchema(String skuASchema) {
        this.skuASchema = skuASchema;
        return this;
    }

    /**
     * Get the skuBSchema value.
     *
     * @return the skuBSchema value
     */
    public String skuBSchema() {
        return this.skuBSchema;
    }

    /**
     * Set the skuBSchema value.
     *
     * @param skuBSchema the skuBSchema value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withSkuBSchema(String skuBSchema) {
        this.skuBSchema = skuBSchema;
        return this;
    }

    /**
     * Get the skuId value.
     *
     * @return the skuId value
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId value.
     *
     * @param skuId the skuId value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the skuType value.
     *
     * @return the skuType value
     */
    public String skuType() {
        return this.skuType;
    }

    /**
     * Set the skuType value.
     *
     * @param skuType the skuType value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withSkuType(String skuType) {
        this.skuType = skuType;
        return this;
    }

    /**
     * Get the recurrencePolicy value.
     *
     * @return the recurrencePolicy value
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy recurrencePolicy() {
        return this.recurrencePolicy;
    }

    /**
     * Set the recurrencePolicy value.
     *
     * @param recurrencePolicy the recurrencePolicy value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withRecurrencePolicy(MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
        return this;
    }

    /**
     * Get the subscriptionPolicyId value.
     *
     * @return the subscriptionPolicyId value
     */
    public String subscriptionPolicyId() {
        return this.subscriptionPolicyId;
    }

    /**
     * Set the subscriptionPolicyId value.
     *
     * @param subscriptionPolicyId the subscriptionPolicyId value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Sku withSubscriptionPolicyId(String subscriptionPolicyId) {
        this.subscriptionPolicyId = subscriptionPolicyId;
        return this;
    }

}