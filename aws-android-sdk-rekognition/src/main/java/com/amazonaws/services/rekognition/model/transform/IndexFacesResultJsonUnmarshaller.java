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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response IndexFacesResult
 */
public class IndexFacesResultJsonUnmarshaller implements
        Unmarshaller<IndexFacesResult, JsonUnmarshallerContext> {

    public IndexFacesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        IndexFacesResult indexFacesResult = new IndexFacesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("FaceRecords")) {
                indexFacesResult.setFaceRecords(new ListUnmarshaller<FaceRecord>(
                        FaceRecordJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OrientationCorrection")) {
                indexFacesResult.setOrientationCorrection(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FaceModelVersion")) {
                indexFacesResult.setFaceModelVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("UnindexedFaces")) {
                indexFacesResult.setUnindexedFaces(new ListUnmarshaller<UnindexedFace>(
                        UnindexedFaceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return indexFacesResult;
    }

    private static IndexFacesResultJsonUnmarshaller instance;

    public static IndexFacesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IndexFacesResultJsonUnmarshaller();
        return instance;
    }
}
