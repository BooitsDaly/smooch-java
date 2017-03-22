/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AppUserLink
 */

public class AppUserLink {
  /**
   * The type of the channel to link.
   */
  public enum TypeEnum {
    @SerializedName("twilio")
    TWILIO("twilio");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("skipConfirmation")
  private String skipConfirmation = null;

  public AppUserLink type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the channel to link.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the channel to link.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AppUserLink skipConfirmation(String skipConfirmation) {
    this.skipConfirmation = skipConfirmation;
    return this;
  }

   /**
   * Flag indicating if the linking confirmation should be skipped.
   * @return skipConfirmation
  **/
  @ApiModelProperty(example = "null", value = "Flag indicating if the linking confirmation should be skipped.")
  public String getSkipConfirmation() {
    return skipConfirmation;
  }

  public void setSkipConfirmation(String skipConfirmation) {
    this.skipConfirmation = skipConfirmation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserLink appUserLink = (AppUserLink) o;
    return Objects.equals(this.type, appUserLink.type) &&
        Objects.equals(this.skipConfirmation, appUserLink.skipConfirmation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, skipConfirmation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserLink {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    skipConfirmation: ").append(toIndentedString(skipConfirmation)).append("\n");
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

