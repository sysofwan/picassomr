/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.ratingsedgefd.models;

import java.util.UUID;
//import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract
 * model.
 */
public class MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private UUID id;

    /**
     * The reviewId property.
     */
    @JsonProperty(value = "reviewId")
    private UUID reviewId;

    /**
     * The responderName property.
     */
    @JsonProperty(value = "responderName")
    private String responderName;

    /**
     * The text property.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * The isTakenDown property.
     */
    @JsonProperty(value = "isTakenDown")
    private Boolean isTakenDown;

    /**
     * The violationsFound property.
     */
    @JsonProperty(value = "violationsFound")
    private Boolean violationsFound;

    /**
     * The market property.
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * The locale property.
     */
    @JsonProperty(value = "locale")
    private String locale;

    /**
     * The catalogId property.
     */
    @JsonProperty(value = "catalogId")
    private Integer catalogId;

    /**
     * The submittedDateTime property.
     */
    @JsonProperty(value = "submittedDateTime")
    private String submittedDateTime;

    /**
     * The isPublic property.
     */
    @JsonProperty(value = "isPublic")
    private Boolean isPublic;

    /**
     * The deviceId property.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /**
     * The osVersion property.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get the reviewId value.
     *
     * @return the reviewId value
     */
    public UUID reviewId() {
        return this.reviewId;
    }

    /**
     * Set the reviewId value.
     *
     * @param reviewId the reviewId value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withReviewId(UUID reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    /**
     * Get the responderName value.
     *
     * @return the responderName value
     */
    public String responderName() {
        return this.responderName;
    }

    /**
     * Set the responderName value.
     *
     * @param responderName the responderName value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withResponderName(String responderName) {
        this.responderName = responderName;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the isTakenDown value.
     *
     * @return the isTakenDown value
     */
    public Boolean isTakenDown() {
        return this.isTakenDown;
    }

    /**
     * Set the isTakenDown value.
     *
     * @param isTakenDown the isTakenDown value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withIsTakenDown(Boolean isTakenDown) {
        this.isTakenDown = isTakenDown;
        return this;
    }

    /**
     * Get the violationsFound value.
     *
     * @return the violationsFound value
     */
    public Boolean violationsFound() {
        return this.violationsFound;
    }

    /**
     * Set the violationsFound value.
     *
     * @param violationsFound the violationsFound value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withViolationsFound(Boolean violationsFound) {
        this.violationsFound = violationsFound;
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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * Get the locale value.
     *
     * @return the locale value
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale value.
     *
     * @param locale the locale value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withLocale(String locale) {
        this.locale = locale;
        return this;
    }

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
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * Get the submittedDateTime value.
     *
     * @return the submittedDateTime value
     */
    public String submittedDateTime() {
        return this.submittedDateTime;
    }

    /**
     * Set the submittedDateTime value.
     *
     * @param submittedDateTime the submittedDateTime value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withSubmittedDateTime(String submittedDateTime) {
        this.submittedDateTime = submittedDateTime;
        return this;
    }

    /**
     * Get the isPublic value.
     *
     * @return the isPublic value
     */
    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * Set the isPublic value.
     *
     * @param isPublic the isPublic value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * Get the deviceId value.
     *
     * @return the deviceId value
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId value.
     *
     * @param deviceId the deviceId value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the osVersion value.
     *
     * @return the osVersion value
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion value.
     *
     * @param osVersion the osVersion value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1UserResponseContract withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

}
