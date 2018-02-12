# smooch-java

The Java package for the Smooch API

The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project using the [Smooch api spec](https://github.com/smooch/api-spec).

## Installation

### Maven users

Add the following remote repo to your project's POM:

```xml
<project ...>
<repositories>
    <repository>
      <id>smooch.io</id>
      <url>https://smoochorg.bintray.com/maven/</url>
    </repository>
 </repositories>
</project>
```

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.smooch</groupId>
    <artifactId>api</artifactId>
    <version>2.9.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.smooch:api:2.9.0"
```

## Getting Started

### Authentication with JSON Web Tokens (JWTs)

JSON Web Tokens (JWTs) are an industry standard authentication mechanism. A great introduction to the technology is available [here](https://jwt.io/introduction/), and a broad set of supported JWT libraries for a variety of languages and platforms are available.

A JWT is composed of a header, a payload, and a signature. The payload contains information called claims which describe the subject to whom the token was issued.

Before you can make calls to the Smooch API, you'll need to create a JWT that proves you are authorized to use the API.

 #### **Step 1** Generate a KEY ID and SECRET on the settings tab in the [Smooch Dashboard](https://app.smooch.io/).

![secret key and id](https://docs.smooch.io/images/secret_keys.png)

 #### **Step 2** Generate the JWT

Using the [jjwt](https://github.com/jwtk/jjwt) package:

```java
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;
import java.security.Key;

import static io.jsonwebtoken.JwsHeader.KEY_ID;

// ...

String jwt = Jwts.builder()
  .claim("scope", "app")
  .setHeaderParam(KEY_ID, "YOUR_KEY_ID")
  .signWith(
    SignatureAlgorithm.HS256,
    "YOUR_SECRET".getBytes("UTF-8")
  )
  .compact();
```

### Running the code

```java

import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.Configuration;
import io.smooch.client.auth.*;
import io.smooch.client.api.AppApi;

import java.io.File;
import java.util.*;

public class AppApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: jwt
        ApiKeyAuth jwt = (ApiKeyAuth) defaultClient.getAuthentication("jwt");
        jwt.setApiKey("YOUR JWT");
        jwt.setApiKeyPrefix("Bearer");

        AppApi apiInstance = new AppApi();
        AppCreate appCreateBody = new AppCreate(); // AppCreate | Body for a createApp request.
        try {
            AppResponse result = apiInstance.createApp(appCreateBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppApi#createApp");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.smooch.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppApi* | [**createApp**](docs/AppApi.md#createApp) | **POST** /apps | 
*AppApi* | [**createSecretKey**](docs/AppApi.md#createSecretKey) | **POST** /apps/{appId}/keys | 
*AppApi* | [**deleteApp**](docs/AppApi.md#deleteApp) | **DELETE** /apps/{appId} | 
*AppApi* | [**deleteSecretKey**](docs/AppApi.md#deleteSecretKey) | **DELETE** /apps/{appId}/keys/{keyId} | 
*AppApi* | [**getApp**](docs/AppApi.md#getApp) | **GET** /apps/{appId} | 
*AppApi* | [**getAppJwt**](docs/AppApi.md#getAppJwt) | **GET** /apps/{appId}/keys/{keyId}/jwt | 
*AppApi* | [**getSecretKey**](docs/AppApi.md#getSecretKey) | **GET** /apps/{appId}/keys/{keyId} | 
*AppApi* | [**listApps**](docs/AppApi.md#listApps) | **GET** /apps | 
*AppApi* | [**listSecretKeys**](docs/AppApi.md#listSecretKeys) | **GET** /apps/{appId}/keys | 
*AppApi* | [**updateApp**](docs/AppApi.md#updateApp) | **PUT** /apps/{appId} | 
*AppUserApi* | [**deleteAppUserProfile**](docs/AppUserApi.md#deleteAppUserProfile) | **DELETE** /apps/{appId}/appusers/{userId}/profile | 
*AppUserApi* | [**getAppUser**](docs/AppUserApi.md#getAppUser) | **GET** /apps/{appId}/appusers/{userId} | 
*AppUserApi* | [**getAppUserAuthCode**](docs/AppUserApi.md#getAppUserAuthCode) | **GET** /apps/{appId}/appusers/{userId}/authcode | 
*AppUserApi* | [**getAppUserBusinessSystemIds**](docs/AppUserApi.md#getAppUserBusinessSystemIds) | **GET** /apps/{appId}/appusers/{userId}/businesssystems | 
*AppUserApi* | [**getAppUserEntityIds**](docs/AppUserApi.md#getAppUserEntityIds) | **GET** /apps/{appId}/appusers/{userId}/channels | 
*AppUserApi* | [**getLinkRequests**](docs/AppUserApi.md#getLinkRequests) | **GET** /apps/{appId}/appusers/{userId}/linkrequest | 
*AppUserApi* | [**linkAppUser**](docs/AppUserApi.md#linkAppUser) | **POST** /apps/{appId}/appusers/{userId}/channels | 
*AppUserApi* | [**postImageMessage**](docs/AppUserApi.md#postImageMessage) | **POST** /apps/{appId}/appusers/{userId}/images | 
*AppUserApi* | [**preCreateAppUser**](docs/AppUserApi.md#preCreateAppUser) | **POST** /apps/{appId}/appusers | 
*AppUserApi* | [**unlinkAppUser**](docs/AppUserApi.md#unlinkAppUser) | **DELETE** /apps/{appId}/appusers/{userId}/channels/{channel} | 
*AppUserApi* | [**updateAppUser**](docs/AppUserApi.md#updateAppUser) | **PUT** /apps/{appId}/appusers/{userId} | 
*AttachmentsApi* | [**uploadAttachment**](docs/AttachmentsApi.md#uploadAttachment) | **POST** /apps/{appId}/attachments | 
*ConversationApi* | [**deleteMessages**](docs/ConversationApi.md#deleteMessages) | **DELETE** /apps/{appId}/appusers/{userId}/messages | 
*ConversationApi* | [**getMessages**](docs/ConversationApi.md#getMessages) | **GET** /apps/{appId}/appusers/{userId}/messages | 
*ConversationApi* | [**postMessage**](docs/ConversationApi.md#postMessage) | **POST** /apps/{appId}/appusers/{userId}/messages | 
*ConversationApi* | [**resetUnreadCount**](docs/ConversationApi.md#resetUnreadCount) | **POST** /apps/{appId}/appusers/{userId}/conversation/read | 
*ConversationApi* | [**triggerTypingActivity**](docs/ConversationApi.md#triggerTypingActivity) | **POST** /apps/{appId}/appusers/{userId}/conversation/activity | 
*IntegrationApi* | [**createIntegration**](docs/IntegrationApi.md#createIntegration) | **POST** /apps/{appId}/integrations | 
*IntegrationApi* | [**createIntegrationMenu**](docs/IntegrationApi.md#createIntegrationMenu) | **POST** /apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**deleteIntegration**](docs/IntegrationApi.md#deleteIntegration) | **DELETE** /apps/{appId}/integrations/{integrationId} | 
*IntegrationApi* | [**deleteIntegrationMenu**](docs/IntegrationApi.md#deleteIntegrationMenu) | **DELETE** /apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**getIntegration**](docs/IntegrationApi.md#getIntegration) | **GET** /apps/{appId}/integrations/{integrationId} | 
*IntegrationApi* | [**getIntegrationMenu**](docs/IntegrationApi.md#getIntegrationMenu) | **GET** /apps/{appId}/integrations/{integrationId}/menu | 
*IntegrationApi* | [**listIntegrations**](docs/IntegrationApi.md#listIntegrations) | **GET** /apps/{appId}/integrations | 
*IntegrationApi* | [**updateIntegration**](docs/IntegrationApi.md#updateIntegration) | **PUT** /apps/{appId}/integrations/{integrationId} | 
*IntegrationApi* | [**updateIntegrationMenu**](docs/IntegrationApi.md#updateIntegrationMenu) | **PUT** /apps/{appId}/integrations/{integrationId}/menu | 
*MenuApi* | [**deleteMenu**](docs/MenuApi.md#deleteMenu) | **DELETE** /apps/{appId}/menu | 
*MenuApi* | [**getMenu**](docs/MenuApi.md#getMenu) | **GET** /apps/{appId}/menu | 
*MenuApi* | [**updateMenu**](docs/MenuApi.md#updateMenu) | **PUT** /apps/{appId}/menu | 
*ServiceAccountApi* | [**createSecretKey**](docs/ServiceAccountApi.md#createSecretKey) | **POST** /serviceaccounts/{serviceAccountId}/keys | 
*ServiceAccountApi* | [**createServiceAccount**](docs/ServiceAccountApi.md#createServiceAccount) | **POST** /serviceaccounts | 
*ServiceAccountApi* | [**deleteSecretKey**](docs/ServiceAccountApi.md#deleteSecretKey) | **DELETE** /serviceaccounts/{serviceAccountId}/keys/{keyId} | 
*ServiceAccountApi* | [**deleteServiceAccount**](docs/ServiceAccountApi.md#deleteServiceAccount) | **DELETE** /serviceaccounts/{serviceAccountId} | 
*ServiceAccountApi* | [**getJwt**](docs/ServiceAccountApi.md#getJwt) | **GET** /serviceaccounts/{serviceAccountId}/keys/{keyId}/jwt | 
*ServiceAccountApi* | [**getSecretKey**](docs/ServiceAccountApi.md#getSecretKey) | **GET** /serviceaccounts/{serviceAccountId}/keys/{keyId} | 
*ServiceAccountApi* | [**getServiceAccount**](docs/ServiceAccountApi.md#getServiceAccount) | **GET** /serviceaccounts/{serviceAccountId} | 
*ServiceAccountApi* | [**listSecretKeys**](docs/ServiceAccountApi.md#listSecretKeys) | **GET** /serviceaccounts/{serviceAccountId}/keys | 
*ServiceAccountApi* | [**listServiceAccounts**](docs/ServiceAccountApi.md#listServiceAccounts) | **GET** /serviceaccounts | 
*ServiceAccountApi* | [**updateServiceAccount**](docs/ServiceAccountApi.md#updateServiceAccount) | **PUT** /serviceaccounts/{serviceAccountId} | 
*WebhookApi* | [**createWebhook**](docs/WebhookApi.md#createWebhook) | **POST** /apps/{appId}/webhooks | 
*WebhookApi* | [**deleteWebhook**](docs/WebhookApi.md#deleteWebhook) | **DELETE** /apps/{appId}/webhooks/{webhookId} | 
*WebhookApi* | [**getWebhook**](docs/WebhookApi.md#getWebhook) | **GET** /apps/{appId}/webhooks/{webhookId} | 
*WebhookApi* | [**listWebhooks**](docs/WebhookApi.md#listWebhooks) | **GET** /apps/{appId}/webhooks | 
*WebhookApi* | [**updateWebhook**](docs/WebhookApi.md#updateWebhook) | **PUT** /apps/{appId}/webhooks/{webhookId} | 


## Documentation for Models

 - [Action](docs/Action.md)
 - [App](docs/App.md)
 - [AppCreate](docs/AppCreate.md)
 - [AppResponse](docs/AppResponse.md)
 - [AppSettings](docs/AppSettings.md)
 - [AppUpdate](docs/AppUpdate.md)
 - [AppUser](docs/AppUser.md)
 - [AppUserBusinessSystemsResponse](docs/AppUserBusinessSystemsResponse.md)
 - [AppUserChannelsResponse](docs/AppUserChannelsResponse.md)
 - [AppUserLink](docs/AppUserLink.md)
 - [AppUserPreCreate](docs/AppUserPreCreate.md)
 - [AppUserResponse](docs/AppUserResponse.md)
 - [AppUserUpdate](docs/AppUserUpdate.md)
 - [AttachmentResponse](docs/AttachmentResponse.md)
 - [AuthCodeResponse](docs/AuthCodeResponse.md)
 - [BusinessSystemItem](docs/BusinessSystemItem.md)
 - [ChannelEntityItem](docs/ChannelEntityItem.md)
 - [Client](docs/Client.md)
 - [ClientInfo](docs/ClientInfo.md)
 - [Confirmation](docs/Confirmation.md)
 - [Conversation](docs/Conversation.md)
 - [Destination](docs/Destination.md)
 - [DisplaySettings](docs/DisplaySettings.md)
 - [GetMessagesResponse](docs/GetMessagesResponse.md)
 - [Integration](docs/Integration.md)
 - [IntegrationCreate](docs/IntegrationCreate.md)
 - [IntegrationResponse](docs/IntegrationResponse.md)
 - [IntegrationUpdate](docs/IntegrationUpdate.md)
 - [JwtResponse](docs/JwtResponse.md)
 - [LinkRequestResponse](docs/LinkRequestResponse.md)
 - [LinkRequestResponseLinkRequests](docs/LinkRequestResponseLinkRequests.md)
 - [ListAppsResponse](docs/ListAppsResponse.md)
 - [ListIntegrationsResponse](docs/ListIntegrationsResponse.md)
 - [ListSecretKeysResponse](docs/ListSecretKeysResponse.md)
 - [ListServiceAccountsResponse](docs/ListServiceAccountsResponse.md)
 - [ListWebhooksResponse](docs/ListWebhooksResponse.md)
 - [Menu](docs/Menu.md)
 - [MenuItem](docs/MenuItem.md)
 - [MenuResponse](docs/MenuResponse.md)
 - [Message](docs/Message.md)
 - [MessageItem](docs/MessageItem.md)
 - [MessagePost](docs/MessagePost.md)
 - [MessageResponse](docs/MessageResponse.md)
 - [SecretKey](docs/SecretKey.md)
 - [SecretKeyCreate](docs/SecretKeyCreate.md)
 - [SecretKeyResponse](docs/SecretKeyResponse.md)
 - [ServiceAccount](docs/ServiceAccount.md)
 - [ServiceAccountCreate](docs/ServiceAccountCreate.md)
 - [ServiceAccountResponse](docs/ServiceAccountResponse.md)
 - [ServiceAccountUpdate](docs/ServiceAccountUpdate.md)
 - [Source](docs/Source.md)
 - [TypingActivityTrigger](docs/TypingActivityTrigger.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookCreate](docs/WebhookCreate.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookUpdate](docs/WebhookUpdate.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### jwt

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
