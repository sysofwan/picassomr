/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.ratingsedgefd.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedCommentContract
 * model.
 */
public class MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedCommentContract {
    /**
     * The pagingInfo property.
     */
    @JsonProperty(value = "pagingInfo")
    private MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagingInfoContract pagingInfo;

    /**
     * The items property.
     */
    @JsonProperty(value = "items")
    private List<MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1CommentContract> items;

    /**
     * Get the pagingInfo value.
     *
     * @return the pagingInfo value
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagingInfoContract pagingInfo() {
        return this.pagingInfo;
    }

    /**
     * Set the pagingInfo value.
     *
     * @param pagingInfo the pagingInfo value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedCommentContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedCommentContract withPagingInfo(MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagingInfoContract pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1CommentContract> items() {
        return this.items;
    }

    /**
     * Set the items value.
     *
     * @param items the items value to set
     * @return the MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedCommentContract object itself.
     */
    public MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1PagedCommentContract withItems(List<MicrosoftMarketplaceStorefrontRatingsRatingsEdgeContractsV1CommentContract> items) {
        this.items = items;
        return this;
    }

}
