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
 * Inspects text for syntax and the part of speech of words in the document. For
 * more information, <a>how-syntax</a>.
 * </p>
 */
public class DetectSyntaxRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF
     * encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String text;

    /**
     * <p>
     * The language code of the input documents. You can specify any of the
     * following languages supported by Amazon Comprehend: German ("de"),
     * English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or
     * Portuguese ("pt").
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     */
    private String languageCode;

    /**
     * <p>
     * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF
     * encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         A UTF-8 string. Each string must contain fewer that 5,000 bytes
     *         of UTF encoded characters.
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF
     * encoded characters.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 string. Each string must contain fewer that 5,000
     *            bytes of UTF encoded characters.
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF
     * encoded characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param text <p>
     *            A UTF-8 string. Each string must contain fewer that 5,000
     *            bytes of UTF encoded characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectSyntaxRequest withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * The language code of the input documents. You can specify any of the
     * following languages supported by Amazon Comprehend: German ("de"),
     * English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or
     * Portuguese ("pt").
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @return <p>
     *         The language code of the input documents. You can specify any of
     *         the following languages supported by Amazon Comprehend: German
     *         ("de"), English ("en"), Spanish ("es"), French ("fr"), Italian
     *         ("it"), or Portuguese ("pt").
     *         </p>
     * @see SyntaxLanguageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * <p>
     * The language code of the input documents. You can specify any of the
     * following languages supported by Amazon Comprehend: German ("de"),
     * English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or
     * Portuguese ("pt").
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language code of the input documents. You can specify any
     *            of the following languages supported by Amazon Comprehend:
     *            German ("de"), English ("en"), Spanish ("es"), French ("fr"),
     *            Italian ("it"), or Portuguese ("pt").
     *            </p>
     * @see SyntaxLanguageCode
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code of the input documents. You can specify any of the
     * following languages supported by Amazon Comprehend: German ("de"),
     * English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or
     * Portuguese ("pt").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language code of the input documents. You can specify any
     *            of the following languages supported by Amazon Comprehend:
     *            German ("de"), English ("en"), Spanish ("es"), French ("fr"),
     *            Italian ("it"), or Portuguese ("pt").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SyntaxLanguageCode
     */
    public DetectSyntaxRequest withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * <p>
     * The language code of the input documents. You can specify any of the
     * following languages supported by Amazon Comprehend: German ("de"),
     * English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or
     * Portuguese ("pt").
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language code of the input documents. You can specify any
     *            of the following languages supported by Amazon Comprehend:
     *            German ("de"), English ("en"), Spanish ("es"), French ("fr"),
     *            Italian ("it"), or Portuguese ("pt").
     *            </p>
     * @see SyntaxLanguageCode
     */
    public void setLanguageCode(SyntaxLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * The language code of the input documents. You can specify any of the
     * following languages supported by Amazon Comprehend: German ("de"),
     * English ("en"), Spanish ("es"), French ("fr"), Italian ("it"), or
     * Portuguese ("pt").
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>en, es, fr, de, it, pt
     *
     * @param languageCode <p>
     *            The language code of the input documents. You can specify any
     *            of the following languages supported by Amazon Comprehend:
     *            German ("de"), English ("en"), Spanish ("es"), French ("fr"),
     *            Italian ("it"), or Portuguese ("pt").
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SyntaxLanguageCode
     */
    public DetectSyntaxRequest withLanguageCode(SyntaxLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
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
            sb.append("LanguageCode: " + getLanguageCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectSyntaxRequest == false)
            return false;
        DetectSyntaxRequest other = (DetectSyntaxRequest) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null
                && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }
}
