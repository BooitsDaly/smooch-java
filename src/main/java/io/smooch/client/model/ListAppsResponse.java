/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.App;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ListAppsResponse
 */

public class ListAppsResponse {
  @SerializedName("apps")
  private List<App> apps = null;

  @SerializedName("hasMore")
  private Boolean hasMore = null;

  @SerializedName("offset")
  private Integer offset = null;

  public ListAppsResponse apps(List<App> apps) {
    this.apps = apps;
    return this;
  }

  public ListAppsResponse addAppsItem(App appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<App>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * The list of apps.
   * @return apps
  **/
  @ApiModelProperty(value = "The list of apps.")
  public List<App> getApps() {
    return apps;
  }

  public void setApps(List<App> apps) {
    this.apps = apps;
  }

  public ListAppsResponse hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Flag indicating if there are more apps that are not present in the response.
   * @return hasMore
  **/
  @ApiModelProperty(value = "Flag indicating if there are more apps that are not present in the response.")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public ListAppsResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The number of app records skipped in the returned list.
   * @return offset
  **/
  @ApiModelProperty(value = "The number of app records skipped in the returned list.")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAppsResponse listAppsResponse = (ListAppsResponse) o;
    return Objects.equals(this.apps, listAppsResponse.apps) &&
        Objects.equals(this.hasMore, listAppsResponse.hasMore) &&
        Objects.equals(this.offset, listAppsResponse.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, hasMore, offset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAppsResponse {\n");
    
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

