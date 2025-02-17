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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LineItemGroup
 */
class LineItemGroupJsonMarshaller {

    public void marshall(LineItemGroup lineItemGroup, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lineItemGroup.getLineItemGroupIndex() != null) {
            Integer lineItemGroupIndex = lineItemGroup.getLineItemGroupIndex();
            jsonWriter.name("LineItemGroupIndex");
            jsonWriter.value(lineItemGroupIndex);
        }
        if (lineItemGroup.getLineItems() != null) {
            java.util.List<LineItemFields> lineItems = lineItemGroup.getLineItems();
            jsonWriter.name("LineItems");
            jsonWriter.beginArray();
            for (LineItemFields lineItemsItem : lineItems) {
                if (lineItemsItem != null) {
                    LineItemFieldsJsonMarshaller.getInstance().marshall(lineItemsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LineItemGroupJsonMarshaller instance;

    public static LineItemGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LineItemGroupJsonMarshaller();
        return instance;
    }
}
