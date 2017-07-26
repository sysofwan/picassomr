/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The age property.
     */
    @JsonProperty(value = "age")
    private Integer age;

    /**
     * The isExpired property.
     */
    @JsonProperty(value = "isExpired")
    private Boolean isExpired;

    /**
     * The alternateIds property.
     */
    @JsonProperty(value = "alternateIds")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingAlternateId> alternateIds;

    /**
     * The localizedProperties property.
     */
    @JsonProperty(value = "localizedProperties")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingLocalizedProperties> localizedProperties;

    /**
     * The marketProperties property.
     */
    @JsonProperty(value = "marketProperties")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingMarketProperties> marketProperties;

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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the age value.
     *
     * @return the age value
     */
    public Integer age() {
        return this.age;
    }

    /**
     * Set the age value.
     *
     * @param age the age value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * Get the isExpired value.
     *
     * @return the isExpired value
     */
    public Boolean isExpired() {
        return this.isExpired;
    }

    /**
     * Set the isExpired value.
     *
     * @param isExpired the isExpired value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating withIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    /**
     * Get the alternateIds value.
     *
     * @return the alternateIds value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingAlternateId> alternateIds() {
        return this.alternateIds;
    }

    /**
     * Set the alternateIds value.
     *
     * @param alternateIds the alternateIds value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating withAlternateIds(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingAlternateId> alternateIds) {
        this.alternateIds = alternateIds;
        return this;
    }

    /**
     * Get the localizedProperties value.
     *
     * @return the localizedProperties value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingLocalizedProperties> localizedProperties() {
        return this.localizedProperties;
    }

    /**
     * Set the localizedProperties value.
     *
     * @param localizedProperties the localizedProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating withLocalizedProperties(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingLocalizedProperties> localizedProperties) {
        this.localizedProperties = localizedProperties;
        return this;
    }

    /**
     * Get the marketProperties value.
     *
     * @return the marketProperties value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingMarketProperties> marketProperties() {
        return this.marketProperties;
    }

    /**
     * Set the marketProperties value.
     *
     * @param marketProperties the marketProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating withMarketProperties(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingMarketProperties> marketProperties) {
        this.marketProperties = marketProperties;
        return this;
    }

}
