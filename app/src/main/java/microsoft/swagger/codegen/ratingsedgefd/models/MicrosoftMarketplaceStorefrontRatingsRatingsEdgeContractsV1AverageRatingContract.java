/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.ratingsedgefd.models;

//import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract
 * model.
 */
public class MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract {
    /**
     * The productId property.
     */
    @JsonProperty(value = "productId")
    private String productId;

    /**
     * The averageRating property.
     */
    @JsonProperty(value = "averageRating")
    private Double averageRating;

    /**
     * The totalRatingsCount property.
     */
    @JsonProperty(value = "totalRatingsCount")
    private Integer totalRatingsCount;

    /**
     * The resultStatus property.
     */
    @JsonProperty(value = "resultStatus")
    private Integer resultStatus;

    /**
     * The expiration property.
     */
    @JsonProperty(value = "expiration")
    private String expiration;

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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get the averageRating value.
     *
     * @return the averageRating value
     */
    public Double averageRating() {
        return this.averageRating;
    }

    /**
     * Set the averageRating value.
     *
     * @param averageRating the averageRating value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract withAverageRating(Double averageRating) {
        this.averageRating = averageRating;
        return this;
    }

    /**
     * Get the totalRatingsCount value.
     *
     * @return the totalRatingsCount value
     */
    public Integer totalRatingsCount() {
        return this.totalRatingsCount;
    }

    /**
     * Set the totalRatingsCount value.
     *
     * @param totalRatingsCount the totalRatingsCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract withTotalRatingsCount(Integer totalRatingsCount) {
        this.totalRatingsCount = totalRatingsCount;
        return this;
    }

    /**
     * Get the resultStatus value.
     *
     * @return the resultStatus value
     */
    public Integer resultStatus() {
        return this.resultStatus;
    }

    /**
     * Set the resultStatus value.
     *
     * @param resultStatus the resultStatus value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract withResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * Get the expiration value.
     *
     * @return the expiration value
     */
    public String expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration value.
     *
     * @param expiration the expiration value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1AverageRatingContract withExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

}
