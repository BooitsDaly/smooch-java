/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.25
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
 * Author
 */

public class Author {
  @SerializedName("role")
  private String role = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  public Author role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the individual posting the message. The only accepted value is \"appMaker\".
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the individual posting the message. The only accepted value is \"appMaker\".")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Author name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the message author.
   * @return name
  **/
  @ApiModelProperty(value = "The display name of the message author.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the message author.
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the message author.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Author avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL of the desired message avatar image.
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The URL of the desired message avatar image.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.role, author.role) &&
        Objects.equals(this.name, author.name) &&
        Objects.equals(this.email, author.email) &&
        Objects.equals(this.avatarUrl, author.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, name, email, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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
