/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package microsoft.swagger.codegen.dcatfd.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The
 * MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract
 * model.
 */
public class MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract {
    /**
     * The skuIds property.
     */
    @JsonProperty(value = "skuIds")
    private List<String> skuIds;

    /**
     * The products property.
     */
    @JsonProperty(value = "products")
    private List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails> products;

    /**
     * The totalResultCount property.
     */
    @JsonProperty(value = "totalResultCount")
    private Integer totalResultCount;

    /**
     * The hasMorePages property.
     */
    @JsonProperty(value = "hasMorePages")
    private Boolean hasMorePages;

    /**
     * Get the skuIds value.
     *
     * @return the skuIds value
     */
    public List<String> skuIds() {
        return this.skuIds;
    }

    /**
     * Set the skuIds value.
     *
     * @param skuIds the skuIds value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract withSkuIds(List<String> skuIds) {
        this.skuIds = skuIds;
        return this;
    }

    /**
     * Get the products value.
     *
     * @return the products value
     */
    public List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails> products() {
        return this.products;
    }

    /**
     * Set the products value.
     *
     * @param products the products value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract withProducts(List<MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6ProductDetails> products) {
        this.products = products;
        return this;
    }

    /**
     * Get the totalResultCount value.
     *
     * @return the totalResultCount value
     */
    public Integer totalResultCount() {
        return this.totalResultCount;
    }

    /**
     * Set the totalResultCount value.
     *
     * @param totalResultCount the totalResultCount value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract withTotalResultCount(Integer totalResultCount) {
        this.totalResultCount = totalResultCount;
        return this;
    }

    /**
     * Get the hasMorePages value.
     *
     * @return the hasMorePages value
     */
    public Boolean hasMorePages() {
        return this.hasMorePages;
    }

    /**
     * Set the hasMorePages value.
     *
     * @param hasMorePages the hasMorePages value to set
     * @return the MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract object itself.
     */
    public MicrosoftMarketplaceServicesDisplayCatalogContractsVersion6SkuSearchResultContract withHasMorePages(Boolean hasMorePages) {
        this.hasMorePages = hasMorePages;
        return this;
    }

}