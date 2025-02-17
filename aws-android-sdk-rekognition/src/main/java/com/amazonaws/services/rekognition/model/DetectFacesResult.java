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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

public class DetectFacesResult implements Serializable {
    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     */
    private java.util.List<FaceDetail> faceDetails;

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String orientationCorrection;

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     *
     * @return <p>
     *         Details of each face found in the image.
     *         </p>
     */
    public java.util.List<FaceDetail> getFaceDetails() {
        return faceDetails;
    }

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     *
     * @param faceDetails <p>
     *            Details of each face found in the image.
     *            </p>
     */
    public void setFaceDetails(java.util.Collection<FaceDetail> faceDetails) {
        if (faceDetails == null) {
            this.faceDetails = null;
            return;
        }

        this.faceDetails = new java.util.ArrayList<FaceDetail>(faceDetails);
    }

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceDetails <p>
     *            Details of each face found in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectFacesResult withFaceDetails(FaceDetail... faceDetails) {
        if (getFaceDetails() == null) {
            this.faceDetails = new java.util.ArrayList<FaceDetail>(faceDetails.length);
        }
        for (FaceDetail value : faceDetails) {
            this.faceDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Details of each face found in the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceDetails <p>
     *            Details of each face found in the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectFacesResult withFaceDetails(java.util.Collection<FaceDetail> faceDetails) {
        setFaceDetails(faceDetails);
        return this;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The value of <code>OrientationCorrection</code> is always null.
     *         </p>
     *         <p>
     *         If the input image is in .jpeg format, it might contain
     *         exchangeable image file format (Exif) metadata that includes the
     *         image's orientation. Amazon Rekognition uses this orientation
     *         information to perform image correction. The bounding box
     *         coordinates are translated to represent object locations after
     *         the orientation information in the Exif metadata is used to
     *         correct the image orientation. Images in .png format don't
     *         contain Exif metadata.
     *         </p>
     *         <p>
     *         Amazon Rekognition doesn’t perform image correction for images in
     *         .png format and .jpeg images without orientation information in
     *         the image Exif metadata. The bounding box coordinates aren't
     *         translated and represent the object locations before the image is
     *         rotated.
     *         </p>
     * @see OrientationCorrection
     */
    public String getOrientationCorrection() {
        return orientationCorrection;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public DetectFacesResult withOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
        return this;
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * The value of <code>OrientationCorrection</code> is always null.
     * </p>
     * <p>
     * If the input image is in .jpeg format, it might contain exchangeable
     * image file format (Exif) metadata that includes the image's orientation.
     * Amazon Rekognition uses this orientation information to perform image
     * correction. The bounding box coordinates are translated to represent
     * object locations after the orientation information in the Exif metadata
     * is used to correct the image orientation. Images in .png format don't
     * contain Exif metadata.
     * </p>
     * <p>
     * Amazon Rekognition doesn’t perform image correction for images in .png
     * format and .jpeg images without orientation information in the image Exif
     * metadata. The bounding box coordinates aren't translated and represent
     * the object locations before the image is rotated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The value of <code>OrientationCorrection</code> is always
     *            null.
     *            </p>
     *            <p>
     *            If the input image is in .jpeg format, it might contain
     *            exchangeable image file format (Exif) metadata that includes
     *            the image's orientation. Amazon Rekognition uses this
     *            orientation information to perform image correction. The
     *            bounding box coordinates are translated to represent object
     *            locations after the orientation information in the Exif
     *            metadata is used to correct the image orientation. Images in
     *            .png format don't contain Exif metadata.
     *            </p>
     *            <p>
     *            Amazon Rekognition doesn’t perform image correction for images
     *            in .png format and .jpeg images without orientation
     *            information in the image Exif metadata. The bounding box
     *            coordinates aren't translated and represent the object
     *            locations before the image is rotated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public DetectFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
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
        if (getFaceDetails() != null)
            sb.append("FaceDetails: " + getFaceDetails() + ",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: " + getOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFaceDetails() == null) ? 0 : getFaceDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectFacesResult == false)
            return false;
        DetectFacesResult other = (DetectFacesResult) obj;

        if (other.getFaceDetails() == null ^ this.getFaceDetails() == null)
            return false;
        if (other.getFaceDetails() != null
                && other.getFaceDetails().equals(this.getFaceDetails()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null
                && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        return true;
    }
}
