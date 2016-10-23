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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of CreateImage.
 * </p>
 */
public class CreateImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the new AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The ID of the new AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the new AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the new AMI.
     * </p>
     * 
     * @return The ID of the new AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the new AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the new AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageResult withImageId(String imageId) {
        setImageId(imageId);
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
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageResult == false)
            return false;
        CreateImageResult other = (CreateImageResult) obj;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageResult clone() {
        try {
            return (CreateImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}