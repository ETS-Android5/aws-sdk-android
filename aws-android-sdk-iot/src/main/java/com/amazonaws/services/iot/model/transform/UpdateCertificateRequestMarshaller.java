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

package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for UpdateCertificateRequest
 */
public class UpdateCertificateRequestMarshaller implements
        Marshaller<Request<UpdateCertificateRequest>, UpdateCertificateRequest> {

    public Request<UpdateCertificateRequest> marshall(
            UpdateCertificateRequest updateCertificateRequest) {
        if (updateCertificateRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(UpdateCertificateRequest)");
        }

        Request<UpdateCertificateRequest> request = new DefaultRequest<UpdateCertificateRequest>(
                updateCertificateRequest, "AWSIot");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/certificates/{certificateId}";
        uriResourcePath = uriResourcePath.replace(
                "{certificateId}",
                (updateCertificateRequest.getCertificateId() == null) ? "" : StringUtils
                        .fromString(updateCertificateRequest.getCertificateId()));
        if (updateCertificateRequest.getNewStatus() != null) {
            request.addParameter("newStatus",
                    StringUtils.fromString(updateCertificateRequest.getNewStatus()));
        }
        request.setResourcePath(uriResourcePath);
        request.addHeader("Content-Length", "0");
        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
