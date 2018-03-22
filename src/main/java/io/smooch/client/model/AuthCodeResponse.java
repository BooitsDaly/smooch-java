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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AuthCodeResponse
 */

public class AuthCodeResponse {
  @SerializedName("authCode")
  private String authCode = null;

  public AuthCodeResponse authCode(String authCode) {
    this.authCode = authCode;
    return this;
  }

   /**
   * The auth code
   * @return authCode
  **/
  @ApiModelProperty(required = true, value = "The auth code")
  public String getAuthCode() {
    return authCode;
  }

  public void setAuthCode(String authCode) {
    this.authCode = authCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthCodeResponse authCodeResponse = (AuthCodeResponse) o;
    return Objects.equals(this.authCode, authCodeResponse.authCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthCodeResponse {\n");
    
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
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

