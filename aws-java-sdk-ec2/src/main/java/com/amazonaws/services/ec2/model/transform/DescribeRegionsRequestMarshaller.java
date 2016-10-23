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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DescribeRegionsRequest Marshaller
 */

public class DescribeRegionsRequestMarshaller implements Marshaller<Request<DescribeRegionsRequest>, DescribeRegionsRequest> {

    public Request<DescribeRegionsRequest> marshall(DescribeRegionsRequest describeRegionsRequest) {

        if (describeRegionsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeRegionsRequest> request = new DefaultRequest<DescribeRegionsRequest>(describeRegionsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeRegions");
        request.addParameter("Version", "2016-09-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeRegionsRequestRegionNamesList = (com.amazonaws.internal.SdkInternalList<String>) describeRegionsRequest
                .getRegionNames();
        if (!describeRegionsRequestRegionNamesList.isEmpty() || !describeRegionsRequestRegionNamesList.isAutoConstruct()) {
            int regionNamesListIndex = 1;

            for (String describeRegionsRequestRegionNamesListValue : describeRegionsRequestRegionNamesList) {
                if (describeRegionsRequestRegionNamesListValue != null) {
                    request.addParameter("RegionName." + regionNamesListIndex, StringUtils.fromString(describeRegionsRequestRegionNamesListValue));
                }
                regionNamesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeRegionsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeRegionsRequest
                .getFilters();
        if (!describeRegionsRequestFiltersList.isEmpty() || !describeRegionsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeRegionsRequestFiltersListValue : describeRegionsRequestFiltersList) {

                if (describeRegionsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name", StringUtils.fromString(describeRegionsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeRegionsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        return request;
    }

}