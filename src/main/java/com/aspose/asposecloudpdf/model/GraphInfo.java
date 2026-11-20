/**
 *
 * Copyright (c) 2026 Aspose.PDF Cloud
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */


package com.aspose.asposecloudpdf.model;

import java.util.Objects;
import com.aspose.asposecloudpdf.model.Color;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents graphics info.
 */
@ApiModel(description = "Represents graphics info.")

public class GraphInfo {
  @SerializedName("LineWidth")
  private Double lineWidth = null;

  @SerializedName("Color")
  private Color color = null;

  @SerializedName("DashArray")
  private List<Integer> dashArray = null;

  @SerializedName("DashPhase")
  private Integer dashPhase = null;

  @SerializedName("FillColor")
  private Color fillColor = null;

  @SerializedName("IsDoubled")
  private Boolean isDoubled = null;

  @SerializedName("SkewAngleX")
  private Double skewAngleX = null;

  @SerializedName("SkewAngleY")
  private Double skewAngleY = null;

  @SerializedName("ScalingRateX")
  private Double scalingRateX = null;

  @SerializedName("ScalingRateY")
  private Double scalingRateY = null;

  @SerializedName("RotationAngle")
  private Double rotationAngle = null;

  public GraphInfo lineWidth(Double lineWidth) {
    this.lineWidth = lineWidth;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the line width of the graph.
   * @return lineWidth
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the line width of the graph.")
  public Double getLineWidth() {
    return lineWidth;
  }

  public void setLineWidth(Double lineWidth) {
    this.lineWidth = lineWidth;
  }

  public GraphInfo color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets a Color object that indicates the color of the graph.
   * @return color
  **/
  @ApiModelProperty(value = "Gets or sets a Color object that indicates the color of the graph.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public GraphInfo dashArray(List<Integer> dashArray) {
    this.dashArray = dashArray;
    return this;
  }

  public GraphInfo addDashArrayItem(Integer dashArrayItem) {
    if (this.dashArray == null) {
      this.dashArray = new ArrayList<Integer>();
    }
    this.dashArray.add(dashArrayItem);
    return this;
  }

   /**
   * Gets or sets a dash array.
   * @return dashArray
  **/
  @ApiModelProperty(value = "Gets or sets a dash array.")
  public List<Integer> getDashArray() {
    return dashArray;
  }

  public void setDashArray(List<Integer> dashArray) {
    this.dashArray = dashArray;
  }

  public GraphInfo dashPhase(Integer dashPhase) {
    this.dashPhase = dashPhase;
    return this;
  }

   /**
   * Gets or sets a dash phase.
   * @return dashPhase
  **/
  @ApiModelProperty(value = "Gets or sets a dash phase.")
  public Integer getDashPhase() {
    return dashPhase;
  }

  public void setDashPhase(Integer dashPhase) {
    this.dashPhase = dashPhase;
  }

  public GraphInfo fillColor(Color fillColor) {
    this.fillColor = fillColor;
    return this;
  }

   /**
   * Gets or sets a Color object that indicates the fill color of the graph.
   * @return fillColor
  **/
  @ApiModelProperty(value = "Gets or sets a Color object that indicates the fill color of the graph.")
  public Color getFillColor() {
    return fillColor;
  }

  public void setFillColor(Color fillColor) {
    this.fillColor = fillColor;
  }

  public GraphInfo isDoubled(Boolean isDoubled) {
    this.isDoubled = isDoubled;
    return this;
  }

   /**
   * Gets or sets is border doubled.
   * @return isDoubled
  **/
  @ApiModelProperty(value = "Gets or sets is border doubled.")
  public Boolean isIsDoubled() {
    return isDoubled;
  }

  public void setIsDoubled(Boolean isDoubled) {
    this.isDoubled = isDoubled;
  }

  public GraphInfo skewAngleX(Double skewAngleX) {
    this.skewAngleX = skewAngleX;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the skew angle of the x-coordinate when transforming a coordinate system.
   * @return skewAngleX
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the skew angle of the x-coordinate when transforming a coordinate system.")
  public Double getSkewAngleX() {
    return skewAngleX;
  }

  public void setSkewAngleX(Double skewAngleX) {
    this.skewAngleX = skewAngleX;
  }

  public GraphInfo skewAngleY(Double skewAngleY) {
    this.skewAngleY = skewAngleY;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the skew angle of the y-coordinate when transforming a coordinate system.
   * @return skewAngleY
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the skew angle of the y-coordinate when transforming a coordinate system.")
  public Double getSkewAngleY() {
    return skewAngleY;
  }

  public void setSkewAngleY(Double skewAngleY) {
    this.skewAngleY = skewAngleY;
  }

  public GraphInfo scalingRateX(Double scalingRateX) {
    this.scalingRateX = scalingRateX;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the scaling rate of the x-coordinate when transforming a coordinate system.
   * @return scalingRateX
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the scaling rate of the x-coordinate when transforming a coordinate system.")
  public Double getScalingRateX() {
    return scalingRateX;
  }

  public void setScalingRateX(Double scalingRateX) {
    this.scalingRateX = scalingRateX;
  }

  public GraphInfo scalingRateY(Double scalingRateY) {
    this.scalingRateY = scalingRateY;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the scaling rate of the y-coordinate when transforming a coordinate system.
   * @return scalingRateY
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the scaling rate of the y-coordinate when transforming a coordinate system.")
  public Double getScalingRateY() {
    return scalingRateY;
  }

  public void setScalingRateY(Double scalingRateY) {
    this.scalingRateY = scalingRateY;
  }

  public GraphInfo rotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
    return this;
  }

   /**
   * Gets or sets a float value that indicates the rotation angle of the coordinate system  when transforming a coordinate system.
   * @return rotationAngle
  **/
  @ApiModelProperty(value = "Gets or sets a float value that indicates the rotation angle of the coordinate system  when transforming a coordinate system.")
  public Double getRotationAngle() {
    return rotationAngle;
  }

  public void setRotationAngle(Double rotationAngle) {
    this.rotationAngle = rotationAngle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphInfo graphInfo = (GraphInfo) o;
    return Objects.equals(this.lineWidth, graphInfo.lineWidth) &&
        Objects.equals(this.color, graphInfo.color) &&
        Objects.equals(this.dashArray, graphInfo.dashArray) &&
        Objects.equals(this.dashPhase, graphInfo.dashPhase) &&
        Objects.equals(this.fillColor, graphInfo.fillColor) &&
        Objects.equals(this.isDoubled, graphInfo.isDoubled) &&
        Objects.equals(this.skewAngleX, graphInfo.skewAngleX) &&
        Objects.equals(this.skewAngleY, graphInfo.skewAngleY) &&
        Objects.equals(this.scalingRateX, graphInfo.scalingRateX) &&
        Objects.equals(this.scalingRateY, graphInfo.scalingRateY) &&
        Objects.equals(this.rotationAngle, graphInfo.rotationAngle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineWidth, color, dashArray, dashPhase, fillColor, isDoubled, skewAngleX, skewAngleY, scalingRateX, scalingRateY, rotationAngle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphInfo {\n");
    
    sb.append("    lineWidth: ").append(toIndentedString(lineWidth)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    dashArray: ").append(toIndentedString(dashArray)).append("\n");
    sb.append("    dashPhase: ").append(toIndentedString(dashPhase)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    isDoubled: ").append(toIndentedString(isDoubled)).append("\n");
    sb.append("    skewAngleX: ").append(toIndentedString(skewAngleX)).append("\n");
    sb.append("    skewAngleY: ").append(toIndentedString(skewAngleY)).append("\n");
    sb.append("    scalingRateX: ").append(toIndentedString(scalingRateX)).append("\n");
    sb.append("    scalingRateY: ").append(toIndentedString(scalingRateY)).append("\n");
    sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

