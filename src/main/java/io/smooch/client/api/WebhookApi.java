/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 2.6
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.api;

import io.smooch.client.ApiCallback;
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.ApiResponse;
import io.smooch.client.Configuration;
import io.smooch.client.Pair;
import io.smooch.client.ProgressRequestBody;
import io.smooch.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.smooch.client.model.ListWebhooksResponse;
import io.smooch.client.model.WebhookCreate;
import io.smooch.client.model.WebhookResponse;
import io.smooch.client.model.WebhookUpdate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhookApi {
    private ApiClient apiClient;

    public WebhookApi() {
        this(Configuration.getDefaultApiClient());
    }

    public WebhookApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createWebhook
     * @param appId Identifies the app. (required)
     * @param webhookCreateBody Body for a createWebhook request.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createWebhookCall(String appId, WebhookCreate webhookCreateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = webhookCreateBody;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/webhooks"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createWebhookValidateBeforeCall(String appId, WebhookCreate webhookCreateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling createWebhook(Async)");
        }
        
        // verify the required parameter 'webhookCreateBody' is set
        if (webhookCreateBody == null) {
            throw new ApiException("Missing the required parameter 'webhookCreateBody' when calling createWebhook(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createWebhookCall(appId, webhookCreateBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create a webhook for the specified app.
     * @param appId Identifies the app. (required)
     * @param webhookCreateBody Body for a createWebhook request.  (required)
     * @return WebhookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookResponse createWebhook(String appId, WebhookCreate webhookCreateBody) throws ApiException {
        ApiResponse<WebhookResponse> resp = createWebhookWithHttpInfo(appId, webhookCreateBody);
        return resp.getData();
    }

    /**
     * 
     * Create a webhook for the specified app.
     * @param appId Identifies the app. (required)
     * @param webhookCreateBody Body for a createWebhook request.  (required)
     * @return ApiResponse&lt;WebhookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookResponse> createWebhookWithHttpInfo(String appId, WebhookCreate webhookCreateBody) throws ApiException {
        com.squareup.okhttp.Call call = createWebhookValidateBeforeCall(appId, webhookCreateBody, null, null);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a webhook for the specified app.
     * @param appId Identifies the app. (required)
     * @param webhookCreateBody Body for a createWebhook request.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createWebhookAsync(String appId, WebhookCreate webhookCreateBody, final ApiCallback<WebhookResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createWebhookValidateBeforeCall(appId, webhookCreateBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteWebhook
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteWebhookCall(String appId, String webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/webhooks/{webhookId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteWebhookValidateBeforeCall(String appId, String webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteWebhook(Async)");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling deleteWebhook(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteWebhookCall(appId, webhookId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteWebhook(String appId, String webhookId) throws ApiException {
        deleteWebhookWithHttpInfo(appId, webhookId);
    }

    /**
     * 
     * Delete the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWebhookWithHttpInfo(String appId, String webhookId) throws ApiException {
        com.squareup.okhttp.Call call = deleteWebhookValidateBeforeCall(appId, webhookId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteWebhookAsync(String appId, String webhookId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteWebhookValidateBeforeCall(appId, webhookId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getWebhook
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhookCall(String appId, String webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/webhooks/{webhookId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWebhookValidateBeforeCall(String appId, String webhookId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getWebhook(Async)");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling getWebhook(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getWebhookCall(appId, webhookId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @return WebhookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookResponse getWebhook(String appId, String webhookId) throws ApiException {
        ApiResponse<WebhookResponse> resp = getWebhookWithHttpInfo(appId, webhookId);
        return resp.getData();
    }

    /**
     * 
     * Get the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @return ApiResponse&lt;WebhookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookResponse> getWebhookWithHttpInfo(String appId, String webhookId) throws ApiException {
        com.squareup.okhttp.Call call = getWebhookValidateBeforeCall(appId, webhookId, null, null);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhookAsync(String appId, String webhookId, final ApiCallback<WebhookResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWebhookValidateBeforeCall(appId, webhookId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listWebhooks
     * @param appId Identifies the app. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listWebhooksCall(String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/webhooks"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listWebhooksValidateBeforeCall(String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listWebhooks(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listWebhooksCall(appId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List webhooks for the specified app.
     * @param appId Identifies the app. (required)
     * @return ListWebhooksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListWebhooksResponse listWebhooks(String appId) throws ApiException {
        ApiResponse<ListWebhooksResponse> resp = listWebhooksWithHttpInfo(appId);
        return resp.getData();
    }

    /**
     * 
     * List webhooks for the specified app.
     * @param appId Identifies the app. (required)
     * @return ApiResponse&lt;ListWebhooksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListWebhooksResponse> listWebhooksWithHttpInfo(String appId) throws ApiException {
        com.squareup.okhttp.Call call = listWebhooksValidateBeforeCall(appId, null, null);
        Type localVarReturnType = new TypeToken<ListWebhooksResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List webhooks for the specified app.
     * @param appId Identifies the app. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listWebhooksAsync(String appId, final ApiCallback<ListWebhooksResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listWebhooksValidateBeforeCall(appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListWebhooksResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateWebhook
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param webhookUpdateBody Body for an updateWebhook request.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateWebhookCall(String appId, String webhookId, WebhookUpdate webhookUpdateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = webhookUpdateBody;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/webhooks/{webhookId}"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "webhookId" + "\\}", apiClient.escapeString(webhookId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateWebhookValidateBeforeCall(String appId, String webhookId, WebhookUpdate webhookUpdateBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateWebhook(Async)");
        }
        
        // verify the required parameter 'webhookId' is set
        if (webhookId == null) {
            throw new ApiException("Missing the required parameter 'webhookId' when calling updateWebhook(Async)");
        }
        
        // verify the required parameter 'webhookUpdateBody' is set
        if (webhookUpdateBody == null) {
            throw new ApiException("Missing the required parameter 'webhookUpdateBody' when calling updateWebhook(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateWebhookCall(appId, webhookId, webhookUpdateBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Update the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param webhookUpdateBody Body for an updateWebhook request.  (required)
     * @return WebhookResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public WebhookResponse updateWebhook(String appId, String webhookId, WebhookUpdate webhookUpdateBody) throws ApiException {
        ApiResponse<WebhookResponse> resp = updateWebhookWithHttpInfo(appId, webhookId, webhookUpdateBody);
        return resp.getData();
    }

    /**
     * 
     * Update the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param webhookUpdateBody Body for an updateWebhook request.  (required)
     * @return ApiResponse&lt;WebhookResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<WebhookResponse> updateWebhookWithHttpInfo(String appId, String webhookId, WebhookUpdate webhookUpdateBody) throws ApiException {
        com.squareup.okhttp.Call call = updateWebhookValidateBeforeCall(appId, webhookId, webhookUpdateBody, null, null);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update the specified webhook.
     * @param appId Identifies the app. (required)
     * @param webhookId Identifies the webhook. (required)
     * @param webhookUpdateBody Body for an updateWebhook request.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateWebhookAsync(String appId, String webhookId, WebhookUpdate webhookUpdateBody, final ApiCallback<WebhookResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateWebhookValidateBeforeCall(appId, webhookId, webhookUpdateBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<WebhookResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
