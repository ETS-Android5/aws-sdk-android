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
 * JSON unmarshaller for POJO TopicRuleDestinationSummary
 */
class TopicRuleDestinationSummaryJsonUnmarshaller implements
        Unmarshaller<TopicRuleDestinationSummary, JsonUnmarshallerContext> {

    public TopicRuleDestinationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TopicRuleDestinationSummary topicRuleDestinationSummary = new TopicRuleDestinationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("arn")) {
                topicRuleDestinationSummary.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                topicRuleDestinationSummary.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("createdAt")) {
                topicRuleDestinationSummary.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdatedAt")) {
                topicRuleDestinationSummary.setLastUpdatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("statusReason")) {
                topicRuleDestinationSummary.setStatusReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("httpUrlSummary")) {
                topicRuleDestinationSummary
                        .setHttpUrlSummary(HttpUrlDestinationSummaryJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("vpcDestinationSummary")) {
                topicRuleDestinationSummary
                        .setVpcDestinationSummary(VpcDestinationSummaryJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return topicRuleDestinationSummary;
    }

    private static TopicRuleDestinationSummaryJsonUnmarshaller instance;

    public static TopicRuleDestinationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicRuleDestinationSummaryJsonUnmarshaller();
        return instance;
    }
}
