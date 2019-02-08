package com.mypurecloud.sdk.v2.guest.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.guest.ApiException;
import com.mypurecloud.sdk.v2.guest.ApiClient;
import com.mypurecloud.sdk.v2.guest.ApiRequest;
import com.mypurecloud.sdk.v2.guest.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.guest.ApiResponse;
import com.mypurecloud.sdk.v2.guest.Configuration;
import com.mypurecloud.sdk.v2.guest.model.*;
import com.mypurecloud.sdk.v2.guest.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.guest.model.ErrorBody;
import com.mypurecloud.sdk.v2.guest.model.WebChatGuestMediaRequest;
import com.mypurecloud.sdk.v2.guest.model.WebChatGuestMediaRequestEntityList;
import com.mypurecloud.sdk.v2.guest.model.WebChatMemberInfo;
import com.mypurecloud.sdk.v2.guest.model.WebChatMemberInfoEntityList;
import com.mypurecloud.sdk.v2.guest.model.WebChatMessage;
import com.mypurecloud.sdk.v2.guest.model.WebChatMessageEntityList;
import com.mypurecloud.sdk.v2.guest.model.CreateWebChatMessageRequest;
import com.mypurecloud.sdk.v2.guest.model.WebChatTyping;
import com.mypurecloud.sdk.v2.guest.model.CreateWebChatConversationResponse;
import com.mypurecloud.sdk.v2.guest.model.CreateWebChatConversationRequest;

public class GetWebchatGuestConversationMessageRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public GetWebchatGuestConversationMessageRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String messageId;
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public GetWebchatGuestConversationMessageRequest withMessageId(String messageId) {
	    this.setMessageId(messageId);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public GetWebchatGuestConversationMessageRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetWebchatGuestConversationMessageRequest.");
        }
        
        // verify the required parameter 'messageId' is set
        if (this.messageId == null) {
            throw new IllegalStateException("Missing the required parameter 'messageId' when building request for GetWebchatGuestConversationMessageRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/webchat/guest/conversations/{conversationId}/messages/{messageId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("messageId", messageId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("Guest Chat JWT")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId, String messageId) {
	    return new Builder()
	            .withRequiredParams(conversationId, messageId);
	}
	

	public static class Builder {
		private final GetWebchatGuestConversationMessageRequest request;

		private Builder() {
			request = new GetWebchatGuestConversationMessageRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withMessageId(String messageId) {
			request.setMessageId(messageId);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String messageId) {
			request.setConversationId(conversationId);
						request.setMessageId(messageId);
			
			return this;
		}
		

		public GetWebchatGuestConversationMessageRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for GetWebchatGuestConversationMessageRequest.");
            }
            
            // verify the required parameter 'messageId' is set
            if (request.messageId == null) {
                throw new IllegalStateException("Missing the required parameter 'messageId' when building request for GetWebchatGuestConversationMessageRequest.");
            }
            
			return request;
		}
	}
}
