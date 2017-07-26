/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.ratingsedgefd.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract
 * model.
 */
public class MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract {
    /**
     * The catalogId property.
     */
    @JsonProperty(value = "catalogId")
    private Integer catalogId;

    /**
     * The collectionId property.
     */
    @JsonProperty(value = "collectionId")
    private String collectionId;

    /**
     * The market property.
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * The reaction5Count property.
     */
    @JsonProperty(value = "reaction5Count")
    private Integer reaction5Count;

    /**
     * The reaction4Count property.
     */
    @JsonProperty(value = "reaction4Count")
    private Integer reaction4Count;

    /**
     * The reaction3Count property.
     */
    @JsonProperty(value = "reaction3Count")
    private Integer reaction3Count;

    /**
     * The reaction2Count property.
     */
    @JsonProperty(value = "reaction2Count")
    private Integer reaction2Count;

    /**
     * The reaction1Count property.
     */
    @JsonProperty(value = "reaction1Count")
    private Integer reaction1Count;

    /**
     * Get the catalogId value.
     *
     * @return the catalogId value
     */
    public Integer catalogId() {
        return this.catalogId;
    }

    /**
     * Set the catalogId value.
     *
     * @param catalogId the catalogId value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Get the collectionId value.
     *
     * @return the collectionId value
     */
    public String collectionId() {
        return this.collectionId;
    }

    /**
     * Set the collectionId value.
     *
     * @param collectionId the collectionId value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withCollectionId(String collectionId) {
        this.collectionId = collectionId;
        return this;
    }

    /**
     * Get the market value.
     *
     * @return the market value
     */
    public String market() {
        return this.market;
    }

    /**
     * Set the market value.
     *
     * @param market the market value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * Get the reaction5Count value.
     *
     * @return the reaction5Count value
     */
    public Integer reaction5Count() {
        return this.reaction5Count;
    }

    /**
     * Set the reaction5Count value.
     *
     * @param reaction5Count the reaction5Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withReaction5Count(Integer reaction5Count) {
        this.reaction5Count = reaction5Count;
        return this;
    }

    /**
     * Get the reaction4Count value.
     *
     * @return the reaction4Count value
     */
    public Integer reaction4Count() {
        return this.reaction4Count;
    }

    /**
     * Set the reaction4Count value.
     *
     * @param reaction4Count the reaction4Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withReaction4Count(Integer reaction4Count) {
        this.reaction4Count = reaction4Count;
        return this;
    }

    /**
     * Get the reaction3Count value.
     *
     * @return the reaction3Count value
     */
    public Integer reaction3Count() {
        return this.reaction3Count;
    }

    /**
     * Set the reaction3Count value.
     *
     * @param reaction3Count the reaction3Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withReaction3Count(Integer reaction3Count) {
        this.reaction3Count = reaction3Count;
        return this;
    }

    /**
     * Get the reaction2Count value.
     *
     * @return the reaction2Count value
     */
    public Integer reaction2Count() {
        return this.reaction2Count;
    }

    /**
     * Set the reaction2Count value.
     *
     * @param reaction2Count the reaction2Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withReaction2Count(Integer reaction2Count) {
        this.reaction2Count = reaction2Count;
        return this;
    }

    /**
     * Get the reaction1Count value.
     *
     * @return the reaction1Count value
     */
    public Integer reaction1Count() {
        return this.reaction1Count;
    }

    /**
     * Set the reaction1Count value.
     *
     * @param reaction1Count the reaction1Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReactionsSummaryContract withReaction1Count(Integer reaction1Count) {
        this.reaction1Count = reaction1Count;
        return this;
    }

}