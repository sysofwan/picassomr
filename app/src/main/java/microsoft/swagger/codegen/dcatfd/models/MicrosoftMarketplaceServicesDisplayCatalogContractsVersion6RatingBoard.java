/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The domains property.
     */
    @JsonProperty(value = "domains")
    private List<String> domains;

    /**
     * The defaultForDomains property.
     */
    @JsonProperty(value = "defaultForDomains")
    private List<String> defaultForDomains;

    /**
     * The alternateIds property.
     */
    @JsonProperty(value = "alternateIds")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardAlternateId> alternateIds;

    /**
     * The localizedProperties property.
     */
    @JsonProperty(value = "localizedProperties")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardLocalizedProperties> localizedProperties;

    /**
     * The marketProperties property.
     */
    @JsonProperty(value = "marketProperties")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties> marketProperties;

    /**
     * The ratings property.
     */
    @JsonProperty(value = "ratings")
    private Map<String, MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating> ratings;

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
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the domains value.
     *
     * @return the domains value
     */
    public List<String> domains() {
        return this.domains;
    }

    /**
     * Set the domains value.
     *
     * @param domains the domains value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withDomains(List<String> domains) {
        this.domains = domains;
        return this;
    }

    /**
     * Get the defaultForDomains value.
     *
     * @return the defaultForDomains value
     */
    public List<String> defaultForDomains() {
        return this.defaultForDomains;
    }

    /**
     * Set the defaultForDomains value.
     *
     * @param defaultForDomains the defaultForDomains value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withDefaultForDomains(List<String> defaultForDomains) {
        this.defaultForDomains = defaultForDomains;
        return this;
    }

    /**
     * Get the alternateIds value.
     *
     * @return the alternateIds value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardAlternateId> alternateIds() {
        return this.alternateIds;
    }

    /**
     * Set the alternateIds value.
     *
     * @param alternateIds the alternateIds value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withAlternateIds(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardAlternateId> alternateIds) {
        this.alternateIds = alternateIds;
        return this;
    }

    /**
     * Get the localizedProperties value.
     *
     * @return the localizedProperties value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardLocalizedProperties> localizedProperties() {
        return this.localizedProperties;
    }

    /**
     * Set the localizedProperties value.
     *
     * @param localizedProperties the localizedProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withLocalizedProperties(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardLocalizedProperties> localizedProperties) {
        this.localizedProperties = localizedProperties;
        return this;
    }

    /**
     * Get the marketProperties value.
     *
     * @return the marketProperties value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties> marketProperties() {
        return this.marketProperties;
    }

    /**
     * Set the marketProperties value.
     *
     * @param marketProperties the marketProperties value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withMarketProperties(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoardMarketProperties> marketProperties) {
        this.marketProperties = marketProperties;
        return this;
    }

    /**
     * Get the ratings value.
     *
     * @return the ratings value
     */
    public Map<String, MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating> ratings() {
        return this.ratings;
    }

    /**
     * Set the ratings value.
     *
     * @param ratings the ratings value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RatingBoard withRatings(Map<String, MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6Rating> ratings) {
        this.ratings = ratings;
        return this;
    }

}
