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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NotificationDestinationConfig
 */
class NotificationDestinationConfigJsonMarshaller {

    public void marshall(NotificationDestinationConfig notificationDestinationConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (notificationDestinationConfig.getUri() != null) {
            String uri = notificationDestinationConfig.getUri();
            jsonWriter.name("Uri");
            jsonWriter.value(uri);
        }
        jsonWriter.endObject();
    }

    private static NotificationDestinationConfigJsonMarshaller instance;

    public static NotificationDestinationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationDestinationConfigJsonMarshaller();
        return instance;
    }
}
