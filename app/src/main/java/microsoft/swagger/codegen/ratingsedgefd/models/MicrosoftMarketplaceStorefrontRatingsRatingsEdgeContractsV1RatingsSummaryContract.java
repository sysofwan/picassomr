/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.ratingsedgefd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract
 * model.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract {
    /**
     * The catalogId property.
     */
    @JsonProperty(value = "CatalogId")
    private Integer catalogId;

    /**
     * The productId property.
     */
    @JsonProperty(value = "ProductId")
    private String productId;

    /**
     * The market property.
     */
    @JsonProperty(value = "Market")
    private String market;

    /**
     * The averageRating property.
     */
    @JsonProperty(value = "AverageRating")
    private Double averageRating;

    /**
     * The totalRatingsCount property.
     */
    @JsonProperty(value = "TotalRatingsCount")
    private Integer totalRatingsCount;

    /**
     * The reviewsCount property.
     */
    @JsonProperty(value = "ReviewsCount")
    private Integer reviewsCount;

    /**
     * The star5Count property.
     */
    @JsonProperty(value = "Star5Count")
    private Integer star5Count;

    /**
     * The star4Count property.
     */
    @JsonProperty(value = "Star4Count")
    private Integer star4Count;

    /**
     * The star3Count property.
     */
    @JsonProperty(value = "Star3Count")
    private Integer star3Count;

    /**
     * The star2Count property.
     */
    @JsonProperty(value = "Star2Count")
    private Integer star2Count;

    /**
     * The star1Count property.
     */
    @JsonProperty(value = "Star1Count")
    private Integer star1Count;

    /**
     * The star5ReviewCount property.
     */
    @JsonProperty(value = "Star5ReviewCount")
    private Integer star5ReviewCount;

    /**
     * The star4ReviewCount property.
     */
    @JsonProperty(value = "Star4ReviewCount")
    private Integer star4ReviewCount;

    /**
     * The star3ReviewCount property.
     */
    @JsonProperty(value = "Star3ReviewCount")
    private Integer star3ReviewCount;

    /**
     * The star2ReviewCount property.
     */
    @JsonProperty(value = "Star2ReviewCount")
    private Integer star2ReviewCount;

    /**
     * The star1ReviewCount property.
     */
    @JsonProperty(value = "Star1ReviewCount")
    private Integer star1ReviewCount;

    /**
     * The mostFavorableReview property.
     */
    @JsonProperty(value = "MostFavorableReview")
    private MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReviewContract mostFavorableReview;

    /**
     * The mostCriticalReview property.
     */
    @JsonProperty(value = "MostCriticalReview")
    private MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReviewContract mostCriticalReview;

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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withProductId(String productId) {
        this.productId = productId;
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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withMarket(String market) {
        this.market = market;
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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withAverageRating(Double averageRating) {
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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withTotalRatingsCount(Integer totalRatingsCount) {
        this.totalRatingsCount = totalRatingsCount;
        return this;
    }

    /**
     * Get the reviewsCount value.
     *
     * @return the reviewsCount value
     */
    public Integer reviewsCount() {
        return this.reviewsCount;
    }

    /**
     * Set the reviewsCount value.
     *
     * @param reviewsCount the reviewsCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
        return this;
    }

    /**
     * Get the star5Count value.
     *
     * @return the star5Count value
     */
    public Integer star5Count() {
        return this.star5Count;
    }

    /**
     * Set the star5Count value.
     *
     * @param star5Count the star5Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar5Count(Integer star5Count) {
        this.star5Count = star5Count;
        return this;
    }

    /**
     * Get the star4Count value.
     *
     * @return the star4Count value
     */
    public Integer star4Count() {
        return this.star4Count;
    }

    /**
     * Set the star4Count value.
     *
     * @param star4Count the star4Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar4Count(Integer star4Count) {
        this.star4Count = star4Count;
        return this;
    }

    /**
     * Get the star3Count value.
     *
     * @return the star3Count value
     */
    public Integer star3Count() {
        return this.star3Count;
    }

    /**
     * Set the star3Count value.
     *
     * @param star3Count the star3Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar3Count(Integer star3Count) {
        this.star3Count = star3Count;
        return this;
    }

    /**
     * Get the star2Count value.
     *
     * @return the star2Count value
     */
    public Integer star2Count() {
        return this.star2Count;
    }

    /**
     * Set the star2Count value.
     *
     * @param star2Count the star2Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar2Count(Integer star2Count) {
        this.star2Count = star2Count;
        return this;
    }

    /**
     * Get the star1Count value.
     *
     * @return the star1Count value
     */
    public Integer star1Count() {
        return this.star1Count;
    }

    /**
     * Set the star1Count value.
     *
     * @param star1Count the star1Count value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar1Count(Integer star1Count) {
        this.star1Count = star1Count;
        return this;
    }

    /**
     * Get the star5ReviewCount value.
     *
     * @return the star5ReviewCount value
     */
    public Integer star5ReviewCount() {
        return this.star5ReviewCount;
    }

    /**
     * Set the star5ReviewCount value.
     *
     * @param star5ReviewCount the star5ReviewCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar5ReviewCount(Integer star5ReviewCount) {
        this.star5ReviewCount = star5ReviewCount;
        return this;
    }

    /**
     * Get the star4ReviewCount value.
     *
     * @return the star4ReviewCount value
     */
    public Integer star4ReviewCount() {
        return this.star4ReviewCount;
    }

    /**
     * Set the star4ReviewCount value.
     *
     * @param star4ReviewCount the star4ReviewCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar4ReviewCount(Integer star4ReviewCount) {
        this.star4ReviewCount = star4ReviewCount;
        return this;
    }

    /**
     * Get the star3ReviewCount value.
     *
     * @return the star3ReviewCount value
     */
    public Integer star3ReviewCount() {
        return this.star3ReviewCount;
    }

    /**
     * Set the star3ReviewCount value.
     *
     * @param star3ReviewCount the star3ReviewCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar3ReviewCount(Integer star3ReviewCount) {
        this.star3ReviewCount = star3ReviewCount;
        return this;
    }

    /**
     * Get the star2ReviewCount value.
     *
     * @return the star2ReviewCount value
     */
    public Integer star2ReviewCount() {
        return this.star2ReviewCount;
    }

    /**
     * Set the star2ReviewCount value.
     *
     * @param star2ReviewCount the star2ReviewCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar2ReviewCount(Integer star2ReviewCount) {
        this.star2ReviewCount = star2ReviewCount;
        return this;
    }

    /**
     * Get the star1ReviewCount value.
     *
     * @return the star1ReviewCount value
     */
    public Integer star1ReviewCount() {
        return this.star1ReviewCount;
    }

    /**
     * Set the star1ReviewCount value.
     *
     * @param star1ReviewCount the star1ReviewCount value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withStar1ReviewCount(Integer star1ReviewCount) {
        this.star1ReviewCount = star1ReviewCount;
        return this;
    }

    /**
     * Get the mostFavorableReview value.
     *
     * @return the mostFavorableReview value
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReviewContract mostFavorableReview() {
        return this.mostFavorableReview;
    }

    /**
     * Set the mostFavorableReview value.
     *
     * @param mostFavorableReview the mostFavorableReview value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withMostFavorableReview(MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReviewContract mostFavorableReview) {
        this.mostFavorableReview = mostFavorableReview;
        return this;
    }

    /**
     * Get the mostCriticalReview value.
     *
     * @return the mostCriticalReview value
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReviewContract mostCriticalReview() {
        return this.mostCriticalReview;
    }

    /**
     * Set the mostCriticalReview value.
     *
     * @param mostCriticalReview the mostCriticalReview value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1RatingsSummaryContract withMostCriticalReview(MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1ReviewContract mostCriticalReview) {
        this.mostCriticalReview = mostCriticalReview;
        return this;
    }

}