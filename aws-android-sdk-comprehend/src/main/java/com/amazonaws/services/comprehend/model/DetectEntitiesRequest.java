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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Inspects text for named entities, and returns information about them. For
 * more information, about named entities, see <a>how-entities</a>.
 * </p>
 */
public class DetectEntitiesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * If your request includes the endpoint for a custom entity recognition
     * model, Amazon Comprehend uses the language of your custom model, and it
     * ignores any language code that you specify here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     */
    private String languageCode;

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointArn;

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A UTF-8 text string. Each string must contain fewer that 5,000
     *         bytes of UTF-8 encoded characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 text string. Each string must contain fewer that 5,000
     *            bytes of UTF-8 encoded characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 text string. Each string must contain fewer that 5,000 bytes of
     * UTF-8 encoded characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 text string. Each string must contain fewer that 5,000
     *            bytes of UTF-8 encoded characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * If your request includes the endpoint for a custom entity recognition
     * model, Amazon Comprehend uses the language of your custom model, and it
     * ignores any language code that you specify here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @return <p>
     *         The language of the input documents. You can specify any of the
     *         primary languages supported by Amazon Comprehend. All documents
     *         must be in the same language.
     *         </p>
     *         <p>
     *         If your request includes the endpoint for a custom entity
     *         recognition model, Amazon Comprehend uses the language of your
     *         custom model, and it ignores any language code that you specify
     *         here.
     *         </p>
     * @see LanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * If your request includes the endpoint for a custom entity recognition
     * model, Amazon Comprehend uses the language of your custom model, and it
     * ignores any language code that you specify here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     *            <p>
     *            If your request includes the endpoint for a custom entity
     *            recognition model, Amazon Comprehend uses the language of your
     *            custom model, and it ignores any language code that you
     *            specify here.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * If your request includes the endpoint for a custom entity recognition
     * model, Amazon Comprehend uses the language of your custom model, and it
     * ignores any language code that you specify here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     *            <p>
     *            If your request includes the endpoint for a custom entity
     *            recognition model, Amazon Comprehend uses the language of your
     *            custom model, and it ignores any language code that you
     *            specify here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DetectEntitiesRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * If your request includes the endpoint for a custom entity recognition
     * model, Amazon Comprehend uses the language of your custom model, and it
     * ignores any language code that you specify here.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     *            <p>
     *            If your request includes the endpoint for a custom entity
     *            recognition model, Amazon Comprehend uses the language of your
     *            custom model, and it ignores any language code that you
     *            specify here.
     *            </p>
     * @see LanguageCode
     */
    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language of the input documents. You can specify any of the primary
     * languages supported by Amazon Comprehend. All documents must be in the
     * same language.
     * </p>
     * <p>
     * If your request includes the endpoint for a custom entity recognition
     * model, Amazon Comprehend uses the language of your custom model, and it
     * ignores any language code that you specify here.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt, ar, hi, ja, ko, zh, zh-TW
     *
     * @param languageCode <p>
     *            The language of the input documents. You can specify any of
     *            the primary languages supported by Amazon Comprehend. All
     *            documents must be in the same language.
     *            </p>
     *            <p>
     *            If your request includes the endpoint for a custom entity
     *            recognition model, Amazon Comprehend uses the language of your
     *            custom model, and it ignores any language code that you
     *            specify here.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LanguageCode
     */
    public DetectEntitiesRequest withLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name of an endpoint that is associated with a
     *         custom entity recognition model. Provide an endpoint if you want
     *         to detect entities by using your own custom model instead of the
     *         default model that is used by Amazon Comprehend.
     *         </p>
     *         <p>
     *         If you specify an endpoint, Amazon Comprehend uses the language
     *         of your custom model, and it ignores any language code that you
     *         provide in your request.
     *         </p>
     *         <p>
     *         For information about endpoints, see <a href=
     *         "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *         >Managing endpoints</a>.
     *         </p>
     */
    public String getEndpointArn() {
        return endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name of an endpoint that is associated
     *            with a custom entity recognition model. Provide an endpoint if
     *            you want to detect entities by using your own custom model
     *            instead of the default model that is used by Amazon
     *            Comprehend.
     *            </p>
     *            <p>
     *            If you specify an endpoint, Amazon Comprehend uses the
     *            language of your custom model, and it ignores any language
     *            code that you provide in your request.
     *            </p>
     *            <p>
     *            For information about endpoints, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *            >Managing endpoints</a>.
     *            </p>
     */
    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of an endpoint that is associated with a custom
     * entity recognition model. Provide an endpoint if you want to detect
     * entities by using your own custom model instead of the default model that
     * is used by Amazon Comprehend.
     * </p>
     * <p>
     * If you specify an endpoint, Amazon Comprehend uses the language of your
     * custom model, and it ignores any language code that you provide in your
     * request.
     * </p>
     * <p>
     * For information about endpoints, see <a href=
     * "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     * >Managing endpoints</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws(-[^:]+)?:comprehend:[a-zA-Z0-9-]*:[0-9]{12}:entity
     * -recognizer-endpoint/[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointArn <p>
     *            The Amazon Resource Name of an endpoint that is associated
     *            with a custom entity recognition model. Provide an endpoint if
     *            you want to detect entities by using your own custom model
     *            instead of the default model that is used by Amazon
     *            Comprehend.
     *            </p>
     *            <p>
     *            If you specify an endpoint, Amazon Comprehend uses the
     *            language of your custom model, and it ignores any language
     *            code that you provide in your request.
     *            </p>
     *            <p>
     *            For information about endpoints, see <a href=
     *            "https://docs.aws.amazon.com/comprehend/latest/dg/manage-endpoints.html"
     *            >Managing endpoints</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectEntitiesRequest withEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
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
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: " + getEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode
                + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectEntitiesRequest == false)
            return false;
        DetectEntitiesRequest other = (DetectEntitiesRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null
                && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        return true;
    }
}
