/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy {
    /**
     * The recurrenceGracePeriodInSeconds property.
     */
    @JsonProperty(value = "recurrenceGracePeriodInSeconds")
    private Integer recurrenceGracePeriodInSeconds;

    /**
     * The recurrencePeriodicity property.
     */
    @JsonProperty(value = "recurrencePeriodicity")
    private String recurrencePeriodicity;

    /**
     * The recurrenceTerms property.
     */
    @JsonProperty(value = "recurrenceTerms")
    private String recurrenceTerms;

    /**
     * The recurrencePolicyId property.
     */
    @JsonProperty(value = "recurrencePolicyId")
    private String recurrencePolicyId;

    /**
     * Get the recurrenceGracePeriodInSeconds value.
     *
     * @return the recurrenceGracePeriodInSeconds value
     */
    public Integer recurrenceGracePeriodInSeconds() {
        return this.recurrenceGracePeriodInSeconds;
    }

    /**
     * Set the recurrenceGracePeriodInSeconds value.
     *
     * @param recurrenceGracePeriodInSeconds the recurrenceGracePeriodInSeconds value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy withRecurrenceGracePeriodInSeconds(Integer recurrenceGracePeriodInSeconds) {
        this.recurrenceGracePeriodInSeconds = recurrenceGracePeriodInSeconds;
        return this;
    }

    /**
     * Get the recurrencePeriodicity value.
     *
     * @return the recurrencePeriodicity value
     */
    public String recurrencePeriodicity() {
        return this.recurrencePeriodicity;
    }

    /**
     * Set the recurrencePeriodicity value.
     *
     * @param recurrencePeriodicity the recurrencePeriodicity value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy withRecurrencePeriodicity(String recurrencePeriodicity) {
        this.recurrencePeriodicity = recurrencePeriodicity;
        return this;
    }

    /**
     * Get the recurrenceTerms value.
     *
     * @return the recurrenceTerms value
     */
    public String recurrenceTerms() {
        return this.recurrenceTerms;
    }

    /**
     * Set the recurrenceTerms value.
     *
     * @param recurrenceTerms the recurrenceTerms value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy withRecurrenceTerms(String recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
        return this;
    }

    /**
     * Get the recurrencePolicyId value.
     *
     * @return the recurrencePolicyId value
     */
    public String recurrencePolicyId() {
        return this.recurrencePolicyId;
    }

    /**
     * Set the recurrencePolicyId value.
     *
     * @param recurrencePolicyId the recurrencePolicyId value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6RecurrencePolicy withRecurrencePolicyId(String recurrencePolicyId) {
        this.recurrencePolicyId = recurrencePolicyId;
        return this;
    }

}
