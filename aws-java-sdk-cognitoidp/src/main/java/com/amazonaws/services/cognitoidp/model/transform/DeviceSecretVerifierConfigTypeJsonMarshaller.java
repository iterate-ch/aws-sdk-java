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
package com.amazonaws.services.cognitoidp.model.transform;

import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * DeviceSecretVerifierConfigTypeMarshaller
 */
public class DeviceSecretVerifierConfigTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DeviceSecretVerifierConfigType deviceSecretVerifierConfigType, StructuredJsonGenerator jsonGenerator) {

        if (deviceSecretVerifierConfigType == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deviceSecretVerifierConfigType.getPasswordVerifier() != null) {
                jsonGenerator.writeFieldName("PasswordVerifier").writeValue(deviceSecretVerifierConfigType.getPasswordVerifier());
            }
            if (deviceSecretVerifierConfigType.getSalt() != null) {
                jsonGenerator.writeFieldName("Salt").writeValue(deviceSecretVerifierConfigType.getSalt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeviceSecretVerifierConfigTypeJsonMarshaller instance;

    public static DeviceSecretVerifierConfigTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceSecretVerifierConfigTypeJsonMarshaller();
        return instance;
    }

}
