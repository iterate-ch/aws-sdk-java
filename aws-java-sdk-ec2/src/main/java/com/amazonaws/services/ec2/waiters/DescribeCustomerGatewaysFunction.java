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

package com.amazonaws.services.ec2.waiters;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.waiters.SdkFunction;
import com.amazonaws.services.ec2.model.DescribeCustomerGatewaysRequest;
import com.amazonaws.services.ec2.model.DescribeCustomerGatewaysResult;
import com.amazonaws.services.ec2.AmazonEC2;

@SdkInternalApi
public class DescribeCustomerGatewaysFunction implements SdkFunction<DescribeCustomerGatewaysRequest, DescribeCustomerGatewaysResult> {

    /**
     * Represents the service client
     */
    private final AmazonEC2 client;

    /**
     * Constructs a new DescribeCustomerGatewaysFunction with the given client
     * 
     * @param client
     *        Service client
     */
    public DescribeCustomerGatewaysFunction(AmazonEC2 client) {
        this.client = client;
    }

    /**
     * Makes a call to the operation specified by the waiter by taking the corresponding request and returns the
     * corresponding result
     * 
     * @param describeCustomerGatewaysRequest
     *        Corresponding request for the operation
     * @return Corresponding result of the operation
     */
    @Override
    public DescribeCustomerGatewaysResult apply(DescribeCustomerGatewaysRequest describeCustomerGatewaysRequest) {
        return client.describeCustomerGateways(describeCustomerGatewaysRequest);
    }
}
