/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.gamelift.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DescribeGameSessionsRequest Marshaller
 */
public class DescribeGameSessionsRequestMarshaller implements Marshaller<Request<DescribeGameSessionsRequest>, DescribeGameSessionsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DescribeGameSessionsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeGameSessionsRequest> marshall(DescribeGameSessionsRequest describeGameSessionsRequest) {

        if (describeGameSessionsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeGameSessionsRequest> request = new DefaultRequest<DescribeGameSessionsRequest>(describeGameSessionsRequest, "AmazonGameLift");
        request.addHeader("X-Amz-Target", "GameLift.DescribeGameSessions");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (describeGameSessionsRequest.getFleetId() != null) {
                jsonGenerator.writeFieldName("FleetId").writeValue(describeGameSessionsRequest.getFleetId());
            }
            if (describeGameSessionsRequest.getGameSessionId() != null) {
                jsonGenerator.writeFieldName("GameSessionId").writeValue(describeGameSessionsRequest.getGameSessionId());
            }
            if (describeGameSessionsRequest.getAliasId() != null) {
                jsonGenerator.writeFieldName("AliasId").writeValue(describeGameSessionsRequest.getAliasId());
            }
            if (describeGameSessionsRequest.getStatusFilter() != null) {
                jsonGenerator.writeFieldName("StatusFilter").writeValue(describeGameSessionsRequest.getStatusFilter());
            }
            if (describeGameSessionsRequest.getLimit() != null) {
                jsonGenerator.writeFieldName("Limit").writeValue(describeGameSessionsRequest.getLimit());
            }
            if (describeGameSessionsRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("NextToken").writeValue(describeGameSessionsRequest.getNextToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
