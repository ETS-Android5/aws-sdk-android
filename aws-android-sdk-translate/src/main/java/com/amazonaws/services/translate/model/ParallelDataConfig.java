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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the format and S3 location of the parallel data input file.
 * </p>
 */
public class ParallelDataConfig implements Serializable {
    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input
     * file. The folder must be in the same Region as the API endpoint you are
     * calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TSV, CSV, TMX
     */
    private String format;

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input
     * file. The folder must be in the same Region as the API endpoint you are
     * calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The URI of the Amazon S3 folder that contains the parallel data
     *         input file. The folder must be in the same Region as the API
     *         endpoint you are calling.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input
     * file. The folder must be in the same Region as the API endpoint you are
     * calling.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The URI of the Amazon S3 folder that contains the parallel
     *            data input file. The folder must be in the same Region as the
     *            API endpoint you are calling.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The URI of the Amazon S3 folder that contains the parallel data input
     * file. The folder must be in the same Region as the API endpoint you are
     * calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The URI of the Amazon S3 folder that contains the parallel
     *            data input file. The folder must be in the same Region as the
     *            API endpoint you are calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParallelDataConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TSV, CSV, TMX
     *
     * @return <p>
     *         The format of the parallel data input file.
     *         </p>
     * @see ParallelDataFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TSV, CSV, TMX
     *
     * @param format <p>
     *            The format of the parallel data input file.
     *            </p>
     * @see ParallelDataFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TSV, CSV, TMX
     *
     * @param format <p>
     *            The format of the parallel data input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataFormat
     */
    public ParallelDataConfig withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TSV, CSV, TMX
     *
     * @param format <p>
     *            The format of the parallel data input file.
     *            </p>
     * @see ParallelDataFormat
     */
    public void setFormat(ParallelDataFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the parallel data input file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TSV, CSV, TMX
     *
     * @param format <p>
     *            The format of the parallel data input file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParallelDataFormat
     */
    public ParallelDataConfig withFormat(ParallelDataFormat format) {
        this.format = format.toString();
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getFormat() != null)
            sb.append("Format: " + getFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelDataConfig == false)
            return false;
        ParallelDataConfig other = (ParallelDataConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        return true;
    }
}
