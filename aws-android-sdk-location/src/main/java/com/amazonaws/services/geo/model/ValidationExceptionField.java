/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.geo.model;

import java.io.Serializable;

/**
 * <p>
 * The input failed to meet the constraints specified by the AWS service in a
 * specified field.
 * </p>
 */
public class ValidationExceptionField implements Serializable {
    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The field name where the invalid entry was detected.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     *
     * @return <p>
     *         A message with the reason for the validation exception error.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     *
     * @param message <p>
     *            A message with the reason for the validation exception error.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message with the reason for the validation exception error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A message with the reason for the validation exception error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidationExceptionField withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The field name where the invalid entry was detected.
     * </p>
     *
     * @return <p>
     *         The field name where the invalid entry was detected.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The field name where the invalid entry was detected.
     * </p>
     *
     * @param name <p>
     *            The field name where the invalid entry was detected.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The field name where the invalid entry was detected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The field name where the invalid entry was detected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ValidationExceptionField withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationExceptionField == false)
            return false;
        ValidationExceptionField other = (ValidationExceptionField) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
