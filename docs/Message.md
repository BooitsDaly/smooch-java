
# Message

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The message ID, generated automatically. | 
**authorId** | **String** | The ID of the message&#39;s author. | 
**role** | **String** | The role of the individual posting the message. Can be either *appUser* or *appMaker*. | 
**type** | [**TypeEnum**](#TypeEnum) | The message type. | 
**name** | **String** | The display name of the message author. | 
**text** | **String** | The message text. Required for text messages.  | 
**email** | **String** | The email address of the message author. |  [optional]
**avatarUrl** | **String** | The URL of the desired message avatar image. | 
**received** | **Float** | The unix timestamp of the moment the message was received. | 
**mediaUrl** | **String** | The mediaUrl for the image. Required for image messages.  |  [optional]
**mediaType** | **String** | The mediaType for the image. Required for image messages.  |  [optional]
**metadata** | **Object** | Flat JSON object containing any custom properties associated with the message. |  [optional]
**items** | [**List&lt;MessageItem&gt;**](MessageItem.md) | The items in the message list. Required for carousel and list messages.  |  [optional]
**actions** | [**List&lt;Action&gt;**](Action.md) | The actions in the message. |  [optional]
**payload** | **String** | The payload of a reply action, if applicable. |  [optional]
**displaySettings** | [**DisplaySettings**](DisplaySettings.md) | Settings to adjust the carousel layout. See [Display Settings](https://docs.smooch.io/rest/#display-settings). |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
IMAGE | &quot;image&quot;
CAROUSEL | &quot;carousel&quot;
LIST | &quot;list&quot;


