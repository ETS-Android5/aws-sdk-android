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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RegistrationConfig
 */
class RegistrationConfigJsonMarshaller {

    public void marshall(RegistrationConfig registrationConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (registrationConfig.getTemplateBody() != null) {
            String templateBody = registrationConfig.getTemplateBody();
            jsonWriter.name("templateBody");
            jsonWriter.value(templateBody);
        }
        if (registrationConfig.getRoleArn() != null) {
            String roleArn = registrationConfig.getRoleArn();
            jsonWriter.name("roleArn");
            jsonWriter.value(roleArn);
        }
        jsonWriter.endObject();
    }

    private static RegistrationConfigJsonMarshaller instance;

    public static RegistrationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RegistrationConfigJsonMarshaller();
        return instance;
    }
}
