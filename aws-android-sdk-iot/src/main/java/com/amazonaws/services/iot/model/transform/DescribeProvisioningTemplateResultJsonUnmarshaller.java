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

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeProvisioningTemplateResult
 */
public class DescribeProvisioningTemplateResultJsonUnmarshaller implements
        Unmarshaller<DescribeProvisioningTemplateResult, JsonUnmarshallerContext> {

    public DescribeProvisioningTemplateResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeProvisioningTemplateResult describeProvisioningTemplateResult = new DescribeProvisioningTemplateResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("templateArn")) {
                describeProvisioningTemplateResult.setTemplateArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("templateName")) {
                describeProvisioningTemplateResult.setTemplateName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                describeProvisioningTemplateResult.setDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationDate")) {
                describeProvisioningTemplateResult.setCreationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastModifiedDate")) {
                describeProvisioningTemplateResult.setLastModifiedDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("defaultVersionId")) {
                describeProvisioningTemplateResult.setDefaultVersionId(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("templateBody")) {
                describeProvisioningTemplateResult.setTemplateBody(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("enabled")) {
                describeProvisioningTemplateResult.setEnabled(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("provisioningRoleArn")) {
                describeProvisioningTemplateResult.setProvisioningRoleArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("preProvisioningHook")) {
                describeProvisioningTemplateResult
                        .setPreProvisioningHook(ProvisioningHookJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeProvisioningTemplateResult;
    }

    private static DescribeProvisioningTemplateResultJsonUnmarshaller instance;

    public static DescribeProvisioningTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProvisioningTemplateResultJsonUnmarshaller();
        return instance;
    }
}
