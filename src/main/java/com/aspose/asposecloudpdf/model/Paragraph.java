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
import com.aspose.asposecloudpdf.model.LineSpacing;
import com.aspose.asposecloudpdf.model.Rectangle;
import com.aspose.asposecloudpdf.model.TextHorizontalAlignment;
import com.aspose.asposecloudpdf.model.TextLine;
import com.aspose.asposecloudpdf.model.VerticalAlignment;
import com.aspose.asposecloudpdf.model.WrapMode;
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
 * Represents text paragraphs as multiline text object.
 */
@ApiModel(description = "Represents text paragraphs as multiline text object.")

public class Paragraph {
  @SerializedName("LineSpacing")
  private LineSpacing lineSpacing = null;

  @SerializedName("WrapMode")
  private WrapMode wrapMode = null;

  @SerializedName("HorizontalAlignment")
  private TextHorizontalAlignment horizontalAlignment = null;

  @SerializedName("LeftMargin")
  private Double leftMargin = null;

  @SerializedName("RightMargin")
  private Double rightMargin = null;

  @SerializedName("TopMargin")
  private Double topMargin = null;

  @SerializedName("BottomMargin")
  private Double bottomMargin = null;

  @SerializedName("Rectangle")
  private Rectangle rectangle = null;

  @SerializedName("Rotation")
  private Double rotation = null;

  @SerializedName("SubsequentLinesIndent")
  private Double subsequentLinesIndent = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("Lines")
  private List<TextLine> lines = new ArrayList<TextLine>();

  public Paragraph lineSpacing(LineSpacing lineSpacing) {
    this.lineSpacing = lineSpacing;
    return this;
  }

   /**
   * Line spacing mode.
   * @return lineSpacing
  **/
  @ApiModelProperty(value = "Line spacing mode.")
  public LineSpacing getLineSpacing() {
    return lineSpacing;
  }

  public void setLineSpacing(LineSpacing lineSpacing) {
    this.lineSpacing = lineSpacing;
  }

  public Paragraph wrapMode(WrapMode wrapMode) {
    this.wrapMode = wrapMode;
    return this;
  }

   /**
   * Word wrap mode.
   * @return wrapMode
  **/
  @ApiModelProperty(value = "Word wrap mode.")
  public WrapMode getWrapMode() {
    return wrapMode;
  }

  public void setWrapMode(WrapMode wrapMode) {
    this.wrapMode = wrapMode;
  }

  public Paragraph horizontalAlignment(TextHorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Horizontal alignment for the text inside paragraph&#39;s rectangle.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Horizontal alignment for the text inside paragraph's rectangle.")
  public TextHorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(TextHorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public Paragraph leftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
    return this;
  }

   /**
   * Left margin.
   * @return leftMargin
  **/
  @ApiModelProperty(value = "Left margin.")
  public Double getLeftMargin() {
    return leftMargin;
  }

  public void setLeftMargin(Double leftMargin) {
    this.leftMargin = leftMargin;
  }

  public Paragraph rightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
    return this;
  }

   /**
   * Right margin.
   * @return rightMargin
  **/
  @ApiModelProperty(value = "Right margin.")
  public Double getRightMargin() {
    return rightMargin;
  }

  public void setRightMargin(Double rightMargin) {
    this.rightMargin = rightMargin;
  }

  public Paragraph topMargin(Double topMargin) {
    this.topMargin = topMargin;
    return this;
  }

   /**
   * Top margin.
   * @return topMargin
  **/
  @ApiModelProperty(value = "Top margin.")
  public Double getTopMargin() {
    return topMargin;
  }

  public void setTopMargin(Double topMargin) {
    this.topMargin = topMargin;
  }

  public Paragraph bottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
    return this;
  }

   /**
   * Bottom margin.
   * @return bottomMargin
  **/
  @ApiModelProperty(value = "Bottom margin.")
  public Double getBottomMargin() {
    return bottomMargin;
  }

  public void setBottomMargin(Double bottomMargin) {
    this.bottomMargin = bottomMargin;
  }

  public Paragraph rectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
    return this;
  }

   /**
   * Rectangle of the paragraph.
   * @return rectangle
  **/
  @ApiModelProperty(value = "Rectangle of the paragraph.")
  public Rectangle getRectangle() {
    return rectangle;
  }

  public void setRectangle(Rectangle rectangle) {
    this.rectangle = rectangle;
  }

  public Paragraph rotation(Double rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Rotation angle in degrees.
   * @return rotation
  **/
  @ApiModelProperty(value = "Rotation angle in degrees.")
  public Double getRotation() {
    return rotation;
  }

  public void setRotation(Double rotation) {
    this.rotation = rotation;
  }

  public Paragraph subsequentLinesIndent(Double subsequentLinesIndent) {
    this.subsequentLinesIndent = subsequentLinesIndent;
    return this;
  }

   /**
   * Subsequent lines indent value.
   * @return subsequentLinesIndent
  **/
  @ApiModelProperty(value = "Subsequent lines indent value.")
  public Double getSubsequentLinesIndent() {
    return subsequentLinesIndent;
  }

  public void setSubsequentLinesIndent(Double subsequentLinesIndent) {
    this.subsequentLinesIndent = subsequentLinesIndent;
  }

  public Paragraph verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Vertical alignment for the text inside paragraph&#39;s rectangle
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Vertical alignment for the text inside paragraph's rectangle")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public Paragraph lines(List<TextLine> lines) {
    this.lines = lines;
    return this;
  }

  public Paragraph addLinesItem(TextLine linesItem) {
    this.lines.add(linesItem);
    return this;
  }

   /**
   * An array of text lines.
   * @return lines
  **/
  @ApiModelProperty(required = true, value = "An array of text lines.")
  public List<TextLine> getLines() {
    return lines;
  }

  public void setLines(List<TextLine> lines) {
    this.lines = lines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Paragraph paragraph = (Paragraph) o;
    return Objects.equals(this.lineSpacing, paragraph.lineSpacing) &&
        Objects.equals(this.wrapMode, paragraph.wrapMode) &&
        Objects.equals(this.horizontalAlignment, paragraph.horizontalAlignment) &&
        Objects.equals(this.leftMargin, paragraph.leftMargin) &&
        Objects.equals(this.rightMargin, paragraph.rightMargin) &&
        Objects.equals(this.topMargin, paragraph.topMargin) &&
        Objects.equals(this.bottomMargin, paragraph.bottomMargin) &&
        Objects.equals(this.rectangle, paragraph.rectangle) &&
        Objects.equals(this.rotation, paragraph.rotation) &&
        Objects.equals(this.subsequentLinesIndent, paragraph.subsequentLinesIndent) &&
        Objects.equals(this.verticalAlignment, paragraph.verticalAlignment) &&
        Objects.equals(this.lines, paragraph.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineSpacing, wrapMode, horizontalAlignment, leftMargin, rightMargin, topMargin, bottomMargin, rectangle, rotation, subsequentLinesIndent, verticalAlignment, lines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Paragraph {\n");
    
    sb.append("    lineSpacing: ").append(toIndentedString(lineSpacing)).append("\n");
    sb.append("    wrapMode: ").append(toIndentedString(wrapMode)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    leftMargin: ").append(toIndentedString(leftMargin)).append("\n");
    sb.append("    rightMargin: ").append(toIndentedString(rightMargin)).append("\n");
    sb.append("    topMargin: ").append(toIndentedString(topMargin)).append("\n");
    sb.append("    bottomMargin: ").append(toIndentedString(bottomMargin)).append("\n");
    sb.append("    rectangle: ").append(toIndentedString(rectangle)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    subsequentLinesIndent: ").append(toIndentedString(subsequentLinesIndent)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

