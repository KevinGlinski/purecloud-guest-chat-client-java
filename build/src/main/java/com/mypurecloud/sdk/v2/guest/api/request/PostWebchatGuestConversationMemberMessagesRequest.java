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

public class PostWebchatGuestConversationMemberMessagesRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public PostWebchatGuestConversationMemberMessagesRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String memberId;
	public String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public PostWebchatGuestConversationMemberMessagesRequest withMemberId(String memberId) {
	    this.setMemberId(memberId);
	    return this;
	} 
	
	private CreateWebChatMessageRequest body;
	public CreateWebChatMessageRequest getBody() {
		return this.body;
	}

	public void setBody(CreateWebChatMessageRequest body) {
		this.body = body;
	}

	public PostWebchatGuestConversationMemberMessagesRequest withBody(CreateWebChatMessageRequest body) {
	    this.setBody(body);
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

    public PostWebchatGuestConversationMemberMessagesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<CreateWebChatMessageRequest> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PostWebchatGuestConversationMemberMessagesRequest.");
        }
        
        // verify the required parameter 'memberId' is set
        if (this.memberId == null) {
            throw new IllegalStateException("Missing the required parameter 'memberId' when building request for PostWebchatGuestConversationMemberMessagesRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWebchatGuestConversationMemberMessagesRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/webchat/guest/conversations/{conversationId}/members/{memberId}/messages")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("memberId", memberId)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("Guest Chat JWT")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId, String memberId, CreateWebChatMessageRequest body) {
	    return new Builder()
	            .withRequiredParams(conversationId, memberId, body);
	}
	

	public static class Builder {
		private final PostWebchatGuestConversationMemberMessagesRequest request;

		private Builder() {
			request = new PostWebchatGuestConversationMemberMessagesRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withMemberId(String memberId) {
			request.setMemberId(memberId);
			return this;
		}
		
		public Builder withBody(CreateWebChatMessageRequest body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String memberId, CreateWebChatMessageRequest body) {
			request.setConversationId(conversationId);
						request.setMemberId(memberId);
						request.setBody(body);
			
			return this;
		}
		

		public PostWebchatGuestConversationMemberMessagesRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for PostWebchatGuestConversationMemberMessagesRequest.");
            }
            
            // verify the required parameter 'memberId' is set
            if (request.memberId == null) {
                throw new IllegalStateException("Missing the required parameter 'memberId' when building request for PostWebchatGuestConversationMemberMessagesRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PostWebchatGuestConversationMemberMessagesRequest.");
            }
            
			return request;
		}
	}
}
