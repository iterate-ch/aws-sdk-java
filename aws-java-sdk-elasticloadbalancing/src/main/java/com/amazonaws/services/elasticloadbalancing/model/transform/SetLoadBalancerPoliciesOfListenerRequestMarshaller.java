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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * SetLoadBalancerPoliciesOfListenerRequest Marshaller
 */

public class SetLoadBalancerPoliciesOfListenerRequestMarshaller implements
        Marshaller<Request<SetLoadBalancerPoliciesOfListenerRequest>, SetLoadBalancerPoliciesOfListenerRequest> {

    public Request<SetLoadBalancerPoliciesOfListenerRequest> marshall(SetLoadBalancerPoliciesOfListenerRequest setLoadBalancerPoliciesOfListenerRequest) {

        if (setLoadBalancerPoliciesOfListenerRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<SetLoadBalancerPoliciesOfListenerRequest> request = new DefaultRequest<SetLoadBalancerPoliciesOfListenerRequest>(
                setLoadBalancerPoliciesOfListenerRequest, "AmazonElasticLoadBalancing");
        request.addParameter("Action", "SetLoadBalancerPoliciesOfListener");
        request.addParameter("Version", "2012-06-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (setLoadBalancerPoliciesOfListenerRequest.getLoadBalancerName() != null) {
            request.addParameter("LoadBalancerName", StringUtils.fromString(setLoadBalancerPoliciesOfListenerRequest.getLoadBalancerName()));
        }

        if (setLoadBalancerPoliciesOfListenerRequest.getLoadBalancerPort() != null) {
            request.addParameter("LoadBalancerPort", StringUtils.fromInteger(setLoadBalancerPoliciesOfListenerRequest.getLoadBalancerPort()));
        }

        com.amazonaws.internal.SdkInternalList<String> policyNamesList = (com.amazonaws.internal.SdkInternalList<String>) setLoadBalancerPoliciesOfListenerRequest
                .getPolicyNames();
        if (policyNamesList.isEmpty()) {
            request.addParameter("PolicyNames", "");
        }
        if (!policyNamesList.isEmpty() || !policyNamesList.isAutoConstruct()) {
            int policyNamesListIndex = 1;

            for (String policyNamesListValue : policyNamesList) {
                if (policyNamesListValue != null) {
                    request.addParameter("PolicyNames.member." + policyNamesListIndex, StringUtils.fromString(policyNamesListValue));
                }
                policyNamesListIndex++;
            }
        }

        return request;
    }

}
