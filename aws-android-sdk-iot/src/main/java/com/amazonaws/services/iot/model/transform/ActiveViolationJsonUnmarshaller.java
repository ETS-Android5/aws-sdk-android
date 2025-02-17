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
 * JSON unmarshaller for POJO ActiveViolation
 */
class ActiveViolationJsonUnmarshaller implements
        Unmarshaller<ActiveViolation, JsonUnmarshallerContext> {

    public ActiveViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ActiveViolation activeViolation = new ActiveViolation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("violationId")) {
                activeViolation.setViolationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("thingName")) {
                activeViolation.setThingName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("securityProfileName")) {
                activeViolation.setSecurityProfileName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("behavior")) {
                activeViolation.setBehavior(BehaviorJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastViolationValue")) {
                activeViolation.setLastViolationValue(MetricValueJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("violationEventAdditionalInfo")) {
                activeViolation
                        .setViolationEventAdditionalInfo(ViolationEventAdditionalInfoJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("verificationState")) {
                activeViolation.setVerificationState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("verificationStateDescription")) {
                activeViolation.setVerificationStateDescription(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastViolationTime")) {
                activeViolation.setLastViolationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("violationStartTime")) {
                activeViolation.setViolationStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return activeViolation;
    }

    private static ActiveViolationJsonUnmarshaller instance;

    public static ActiveViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActiveViolationJsonUnmarshaller();
        return instance;
    }
}
