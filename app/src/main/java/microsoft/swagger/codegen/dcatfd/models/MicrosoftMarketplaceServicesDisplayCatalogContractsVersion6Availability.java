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
 * The MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability {
    /**
     * The actions property.
     */
    @JsonProperty(value = "Actions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actions;

    /**
     * The availabilityASchema property.
     */
    @JsonProperty(value = "AvailabilityASchema")
    private String availabilityASchema;

    /**
     * The availabilityBSchema property.
     */
    @JsonProperty(value = "AvailabilityBSchema")
    private String availabilityBSchema;

    /**
     * The availabilityId property.
     */
    @JsonProperty(value = "AvailabilityId")
    private String availabilityId;

    /**
     * The lastModifiedDate property.
     */
    @JsonProperty(value = "LastModifiedDate")
    private String lastModifiedDate;

    /**
     * The markets property.
     */
    @JsonProperty(value = "Markets", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> markets;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties")
    private Object properties;

    /**
     * The skuId property.
     */
    @JsonProperty(value = "SkuId")
    private String skuId;

    /**
     * The conditions property.
     */
    @JsonProperty(value = "Conditions")
    private Object conditions;

    /**
     * The reportingData property.
     */
    @JsonProperty(value = "ReportingData")
    private Object reportingData;

    /**
     * The orderManagementData property.
     */
    @JsonProperty(value = "OrderManagementData")
    private Object orderManagementData;

    /**
     * Get the actions value.
     *
     * @return the actions value
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Get the availabilityASchema value.
     *
     * @return the availabilityASchema value
     */
    public String availabilityASchema() {
        return this.availabilityASchema;
    }

    /**
     * Set the availabilityASchema value.
     *
     * @param availabilityASchema the availabilityASchema value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withAvailabilityASchema(String availabilityASchema) {
        this.availabilityASchema = availabilityASchema;
        return this;
    }

    /**
     * Get the availabilityBSchema value.
     *
     * @return the availabilityBSchema value
     */
    public String availabilityBSchema() {
        return this.availabilityBSchema;
    }

    /**
     * Set the availabilityBSchema value.
     *
     * @param availabilityBSchema the availabilityBSchema value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withAvailabilityBSchema(String availabilityBSchema) {
        this.availabilityBSchema = availabilityBSchema;
        return this;
    }

    /**
     * Get the availabilityId value.
     *
     * @return the availabilityId value
     */
    public String availabilityId() {
        return this.availabilityId;
    }

    /**
     * Set the availabilityId value.
     *
     * @param availabilityId the availabilityId value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withAvailabilityId(String availabilityId) {
        this.availabilityId = availabilityId;
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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Get the markets value.
     *
     * @return the markets value
     */
    public List<String> markets() {
        return this.markets;
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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withProperties(Object properties) {
        this.properties = properties;
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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the conditions value.
     *
     * @return the conditions value
     */
    public Object conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions value.
     *
     * @param conditions the conditions value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withConditions(Object conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get the reportingData value.
     *
     * @return the reportingData value
     */
    public Object reportingData() {
        return this.reportingData;
    }

    /**
     * Set the reportingData value.
     *
     * @param reportingData the reportingData value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withReportingData(Object reportingData) {
        this.reportingData = reportingData;
        return this;
    }

    /**
     * Get the orderManagementData value.
     *
     * @return the orderManagementData value
     */
    public Object orderManagementData() {
        return this.orderManagementData;
    }

    /**
     * Set the orderManagementData value.
     *
     * @param orderManagementData the orderManagementData value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Availability withOrderManagementData(Object orderManagementData) {
        this.orderManagementData = orderManagementData;
        return this;
    }

}
