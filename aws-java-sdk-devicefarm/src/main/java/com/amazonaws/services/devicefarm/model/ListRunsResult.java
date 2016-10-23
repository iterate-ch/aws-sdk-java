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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the result of a list runs request.
 * </p>
 */
public class ListRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the runs.
     * </p>
     */
    private java.util.List<Run> runs;
    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the runs.
     * </p>
     * 
     * @return Information about the runs.
     */

    public java.util.List<Run> getRuns() {
        return runs;
    }

    /**
     * <p>
     * Information about the runs.
     * </p>
     * 
     * @param runs
     *        Information about the runs.
     */

    public void setRuns(java.util.Collection<Run> runs) {
        if (runs == null) {
            this.runs = null;
            return;
        }

        this.runs = new java.util.ArrayList<Run>(runs);
    }

    /**
     * <p>
     * Information about the runs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuns(java.util.Collection)} or {@link #withRuns(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param runs
     *        Information about the runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunsResult withRuns(Run... runs) {
        if (this.runs == null) {
            setRuns(new java.util.ArrayList<Run>(runs.length));
        }
        for (Run ele : runs) {
            this.runs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the runs.
     * </p>
     * 
     * @param runs
     *        Information about the runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunsResult withRuns(java.util.Collection<Run> runs) {
        setRuns(runs);
        return this;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return If the number of items that are returned is significantly large, this is an identifier that is also
     *         returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is an identifier that is also returned,
     * which can be used in a subsequent call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large, this is an identifier that is also
     *        returned, which can be used in a subsequent call to this operation to return the next set of items in the
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRunsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRuns() != null)
            sb.append("Runs: " + getRuns() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRunsResult == false)
            return false;
        ListRunsResult other = (ListRunsResult) obj;
        if (other.getRuns() == null ^ this.getRuns() == null)
            return false;
        if (other.getRuns() != null && other.getRuns().equals(this.getRuns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuns() == null) ? 0 : getRuns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRunsResult clone() {
        try {
            return (ListRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}