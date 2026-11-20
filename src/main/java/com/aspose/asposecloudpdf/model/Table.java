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
import com.aspose.asposecloudpdf.model.BorderCornerStyle;
import com.aspose.asposecloudpdf.model.BorderInfo;
import com.aspose.asposecloudpdf.model.Color;
import com.aspose.asposecloudpdf.model.ColumnAdjustment;
import com.aspose.asposecloudpdf.model.HorizontalAlignment;
import com.aspose.asposecloudpdf.model.Link;
import com.aspose.asposecloudpdf.model.LinkElement;
import com.aspose.asposecloudpdf.model.MarginInfo;
import com.aspose.asposecloudpdf.model.Row;
import com.aspose.asposecloudpdf.model.TableBroken;
import com.aspose.asposecloudpdf.model.TextRect;
import com.aspose.asposecloudpdf.model.TextState;
import com.aspose.asposecloudpdf.model.VerticalAlignment;
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
 * Represents a table that can be added to the page.
 */
@ApiModel(description = "Represents a table that can be added to the page.")

public class Table extends LinkElement {
  @SerializedName("Alignment")
  private HorizontalAlignment alignment = null;

  @SerializedName("HorizontalAlignment")
  private HorizontalAlignment horizontalAlignment = null;

  @SerializedName("VerticalAlignment")
  private VerticalAlignment verticalAlignment = null;

  @SerializedName("Top")
  private Double top = null;

  @SerializedName("Left")
  private Double left = null;

  @SerializedName("DefaultCellTextState")
  private TextState defaultCellTextState = null;

  @SerializedName("DefaultCellPadding")
  private MarginInfo defaultCellPadding = null;

  @SerializedName("Border")
  private BorderInfo border = null;

  @SerializedName("Margin")
  private MarginInfo margin = null;

  @SerializedName("Rows")
  private List<Row> rows = new ArrayList<Row>();

  @SerializedName("DefaultColumnWidth")
  private String defaultColumnWidth = null;

  @SerializedName("DefaultCellBorder")
  private BorderInfo defaultCellBorder = null;

  @SerializedName("Broken")
  private TableBroken broken = null;

  @SerializedName("ColumnWidths")
  private String columnWidths = null;

  @SerializedName("RepeatingRowsCount")
  private Integer repeatingRowsCount = null;

  @SerializedName("RepeatingColumnsCount")
  private Integer repeatingColumnsCount = null;

  @SerializedName("RepeatingRowsStyle")
  private TextState repeatingRowsStyle = null;

  @SerializedName("CornerStyle")
  private BorderCornerStyle cornerStyle = null;

  @SerializedName("BreakText")
  private TextRect breakText = null;

  @SerializedName("BackgroundColor")
  private Color backgroundColor = null;

  @SerializedName("IsBordersIncluded")
  private Boolean isBordersIncluded = null;

  @SerializedName("ColumnAdjustment")
  private ColumnAdjustment columnAdjustment = null;

  @SerializedName("ZIndex")
  private Integer zindex = null;

  public Table alignment(HorizontalAlignment alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Gets HorizontalAlignment of the table alignment.
   * @return alignment
  **/
  @ApiModelProperty(value = "Gets HorizontalAlignment of the table alignment.")
  public HorizontalAlignment getAlignment() {
    return alignment;
  }

  public void setAlignment(HorizontalAlignment alignment) {
    this.alignment = alignment;
  }

  public Table horizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
    return this;
  }

   /**
   * Gets HorizontalAlignment of the table alignment.
   * @return horizontalAlignment
  **/
  @ApiModelProperty(value = "Gets HorizontalAlignment of the table alignment.")
  public HorizontalAlignment getHorizontalAlignment() {
    return horizontalAlignment;
  }

  public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
    this.horizontalAlignment = horizontalAlignment;
  }

  public Table verticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
    return this;
  }

   /**
   * Gets VerticalAlignment of the annotation.
   * @return verticalAlignment
  **/
  @ApiModelProperty(value = "Gets VerticalAlignment of the annotation.")
  public VerticalAlignment getVerticalAlignment() {
    return verticalAlignment;
  }

  public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
    this.verticalAlignment = verticalAlignment;
  }

  public Table top(Double top) {
    this.top = top;
    return this;
  }

   /**
   * Gets or sets the table top coordinate.
   * @return top
  **/
  @ApiModelProperty(value = "Gets or sets the table top coordinate.")
  public Double getTop() {
    return top;
  }

  public void setTop(Double top) {
    this.top = top;
  }

  public Table left(Double left) {
    this.left = left;
    return this;
  }

   /**
   * Gets or sets the table left coordinate.
   * @return left
  **/
  @ApiModelProperty(value = "Gets or sets the table left coordinate.")
  public Double getLeft() {
    return left;
  }

  public void setLeft(Double left) {
    this.left = left;
  }

  public Table defaultCellTextState(TextState defaultCellTextState) {
    this.defaultCellTextState = defaultCellTextState;
    return this;
  }

   /**
   * Gets or sets the default cell text state.
   * @return defaultCellTextState
  **/
  @ApiModelProperty(value = "Gets or sets the default cell text state.")
  public TextState getDefaultCellTextState() {
    return defaultCellTextState;
  }

  public void setDefaultCellTextState(TextState defaultCellTextState) {
    this.defaultCellTextState = defaultCellTextState;
  }

  public Table defaultCellPadding(MarginInfo defaultCellPadding) {
    this.defaultCellPadding = defaultCellPadding;
    return this;
  }

   /**
   * Gets or sets the default cell padding.
   * @return defaultCellPadding
  **/
  @ApiModelProperty(value = "Gets or sets the default cell padding.")
  public MarginInfo getDefaultCellPadding() {
    return defaultCellPadding;
  }

  public void setDefaultCellPadding(MarginInfo defaultCellPadding) {
    this.defaultCellPadding = defaultCellPadding;
  }

  public Table border(BorderInfo border) {
    this.border = border;
    return this;
  }

   /**
   * Gets or sets the border.
   * @return border
  **/
  @ApiModelProperty(value = "Gets or sets the border.")
  public BorderInfo getBorder() {
    return border;
  }

  public void setBorder(BorderInfo border) {
    this.border = border;
  }

  public Table margin(MarginInfo margin) {
    this.margin = margin;
    return this;
  }

   /**
   * Gets or sets a outer margin for paragraph (for pdf generation)
   * @return margin
  **/
  @ApiModelProperty(value = "Gets or sets a outer margin for paragraph (for pdf generation)")
  public MarginInfo getMargin() {
    return margin;
  }

  public void setMargin(MarginInfo margin) {
    this.margin = margin;
  }

  public Table rows(List<Row> rows) {
    this.rows = rows;
    return this;
  }

  public Table addRowsItem(Row rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Sets the rows of the table.
   * @return rows
  **/
  @ApiModelProperty(required = true, value = "Sets the rows of the table.")
  public List<Row> getRows() {
    return rows;
  }

  public void setRows(List<Row> rows) {
    this.rows = rows;
  }

  public Table defaultColumnWidth(String defaultColumnWidth) {
    this.defaultColumnWidth = defaultColumnWidth;
    return this;
  }

   /**
   * Gets default cell border;
   * @return defaultColumnWidth
  **/
  @ApiModelProperty(value = "Gets default cell border;")
  public String getDefaultColumnWidth() {
    return defaultColumnWidth;
  }

  public void setDefaultColumnWidth(String defaultColumnWidth) {
    this.defaultColumnWidth = defaultColumnWidth;
  }

  public Table defaultCellBorder(BorderInfo defaultCellBorder) {
    this.defaultCellBorder = defaultCellBorder;
    return this;
  }

   /**
   * Gets default cell border;
   * @return defaultCellBorder
  **/
  @ApiModelProperty(value = "Gets default cell border;")
  public BorderInfo getDefaultCellBorder() {
    return defaultCellBorder;
  }

  public void setDefaultCellBorder(BorderInfo defaultCellBorder) {
    this.defaultCellBorder = defaultCellBorder;
  }

  public Table broken(TableBroken broken) {
    this.broken = broken;
    return this;
  }

   /**
   * Gets or sets table vertial broken;
   * @return broken
  **/
  @ApiModelProperty(value = "Gets or sets table vertial broken;")
  public TableBroken getBroken() {
    return broken;
  }

  public void setBroken(TableBroken broken) {
    this.broken = broken;
  }

  public Table columnWidths(String columnWidths) {
    this.columnWidths = columnWidths;
    return this;
  }

   /**
   * Gets the column widths of the table.
   * @return columnWidths
  **/
  @ApiModelProperty(value = "Gets the column widths of the table.")
  public String getColumnWidths() {
    return columnWidths;
  }

  public void setColumnWidths(String columnWidths) {
    this.columnWidths = columnWidths;
  }

  public Table repeatingRowsCount(Integer repeatingRowsCount) {
    this.repeatingRowsCount = repeatingRowsCount;
    return this;
  }

   /**
   * Gets the first rows count repeated for several pages
   * @return repeatingRowsCount
  **/
  @ApiModelProperty(value = "Gets the first rows count repeated for several pages")
  public Integer getRepeatingRowsCount() {
    return repeatingRowsCount;
  }

  public void setRepeatingRowsCount(Integer repeatingRowsCount) {
    this.repeatingRowsCount = repeatingRowsCount;
  }

  public Table repeatingColumnsCount(Integer repeatingColumnsCount) {
    this.repeatingColumnsCount = repeatingColumnsCount;
    return this;
  }

   /**
   * Gets or sets the maximum columns count for table
   * @return repeatingColumnsCount
  **/
  @ApiModelProperty(value = "Gets or sets the maximum columns count for table")
  public Integer getRepeatingColumnsCount() {
    return repeatingColumnsCount;
  }

  public void setRepeatingColumnsCount(Integer repeatingColumnsCount) {
    this.repeatingColumnsCount = repeatingColumnsCount;
  }

  public Table repeatingRowsStyle(TextState repeatingRowsStyle) {
    this.repeatingRowsStyle = repeatingRowsStyle;
    return this;
  }

   /**
   * Gets the style for repeating rows
   * @return repeatingRowsStyle
  **/
  @ApiModelProperty(value = "Gets the style for repeating rows")
  public TextState getRepeatingRowsStyle() {
    return repeatingRowsStyle;
  }

  public void setRepeatingRowsStyle(TextState repeatingRowsStyle) {
    this.repeatingRowsStyle = repeatingRowsStyle;
  }

  public Table cornerStyle(BorderCornerStyle cornerStyle) {
    this.cornerStyle = cornerStyle;
    return this;
  }

   /**
   * Gets or sets the styles of the border corners
   * @return cornerStyle
  **/
  @ApiModelProperty(value = "Gets or sets the styles of the border corners")
  public BorderCornerStyle getCornerStyle() {
    return cornerStyle;
  }

  public void setCornerStyle(BorderCornerStyle cornerStyle) {
    this.cornerStyle = cornerStyle;
  }

  public Table breakText(TextRect breakText) {
    this.breakText = breakText;
    return this;
  }

   /**
   * Gets or sets break text for table
   * @return breakText
  **/
  @ApiModelProperty(value = "Gets or sets break text for table")
  public TextRect getBreakText() {
    return breakText;
  }

  public void setBreakText(TextRect breakText) {
    this.breakText = breakText;
  }

  public Table backgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Gets or sets table background color
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Gets or sets table background color")
  public Color getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(Color backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public Table isBordersIncluded(Boolean isBordersIncluded) {
    this.isBordersIncluded = isBordersIncluded;
    return this;
  }

   /**
   * Gets or sets border included in column widhts.
   * @return isBordersIncluded
  **/
  @ApiModelProperty(value = "Gets or sets border included in column widhts.")
  public Boolean isIsBordersIncluded() {
    return isBordersIncluded;
  }

  public void setIsBordersIncluded(Boolean isBordersIncluded) {
    this.isBordersIncluded = isBordersIncluded;
  }

  public Table columnAdjustment(ColumnAdjustment columnAdjustment) {
    this.columnAdjustment = columnAdjustment;
    return this;
  }

   /**
   * Gets or sets the table column adjustment.
   * @return columnAdjustment
  **/
  @ApiModelProperty(value = "Gets or sets the table column adjustment.")
  public ColumnAdjustment getColumnAdjustment() {
    return columnAdjustment;
  }

  public void setColumnAdjustment(ColumnAdjustment columnAdjustment) {
    this.columnAdjustment = columnAdjustment;
  }

  public Table zindex(Integer zindex) {
    this.zindex = zindex;
    return this;
  }

   /**
   * Gets ZIndex of the annotation.
   * @return zindex
  **/
  @ApiModelProperty(value = "Gets ZIndex of the annotation.")
  public Integer getZindex() {
    return zindex;
  }

  public void setZindex(Integer zindex) {
    this.zindex = zindex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(this.alignment, table.alignment) &&
        Objects.equals(this.horizontalAlignment, table.horizontalAlignment) &&
        Objects.equals(this.verticalAlignment, table.verticalAlignment) &&
        Objects.equals(this.top, table.top) &&
        Objects.equals(this.left, table.left) &&
        Objects.equals(this.defaultCellTextState, table.defaultCellTextState) &&
        Objects.equals(this.defaultCellPadding, table.defaultCellPadding) &&
        Objects.equals(this.border, table.border) &&
        Objects.equals(this.margin, table.margin) &&
        Objects.equals(this.rows, table.rows) &&
        Objects.equals(this.defaultColumnWidth, table.defaultColumnWidth) &&
        Objects.equals(this.defaultCellBorder, table.defaultCellBorder) &&
        Objects.equals(this.broken, table.broken) &&
        Objects.equals(this.columnWidths, table.columnWidths) &&
        Objects.equals(this.repeatingRowsCount, table.repeatingRowsCount) &&
        Objects.equals(this.repeatingColumnsCount, table.repeatingColumnsCount) &&
        Objects.equals(this.repeatingRowsStyle, table.repeatingRowsStyle) &&
        Objects.equals(this.cornerStyle, table.cornerStyle) &&
        Objects.equals(this.breakText, table.breakText) &&
        Objects.equals(this.backgroundColor, table.backgroundColor) &&
        Objects.equals(this.isBordersIncluded, table.isBordersIncluded) &&
        Objects.equals(this.columnAdjustment, table.columnAdjustment) &&
        Objects.equals(this.zindex, table.zindex) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, horizontalAlignment, verticalAlignment, top, left, defaultCellTextState, defaultCellPadding, border, margin, rows, defaultColumnWidth, defaultCellBorder, broken, columnWidths, repeatingRowsCount, repeatingColumnsCount, repeatingRowsStyle, cornerStyle, breakText, backgroundColor, isBordersIncluded, columnAdjustment, zindex, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Table {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    horizontalAlignment: ").append(toIndentedString(horizontalAlignment)).append("\n");
    sb.append("    verticalAlignment: ").append(toIndentedString(verticalAlignment)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    defaultCellTextState: ").append(toIndentedString(defaultCellTextState)).append("\n");
    sb.append("    defaultCellPadding: ").append(toIndentedString(defaultCellPadding)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    defaultColumnWidth: ").append(toIndentedString(defaultColumnWidth)).append("\n");
    sb.append("    defaultCellBorder: ").append(toIndentedString(defaultCellBorder)).append("\n");
    sb.append("    broken: ").append(toIndentedString(broken)).append("\n");
    sb.append("    columnWidths: ").append(toIndentedString(columnWidths)).append("\n");
    sb.append("    repeatingRowsCount: ").append(toIndentedString(repeatingRowsCount)).append("\n");
    sb.append("    repeatingColumnsCount: ").append(toIndentedString(repeatingColumnsCount)).append("\n");
    sb.append("    repeatingRowsStyle: ").append(toIndentedString(repeatingRowsStyle)).append("\n");
    sb.append("    cornerStyle: ").append(toIndentedString(cornerStyle)).append("\n");
    sb.append("    breakText: ").append(toIndentedString(breakText)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    isBordersIncluded: ").append(toIndentedString(isBordersIncluded)).append("\n");
    sb.append("    columnAdjustment: ").append(toIndentedString(columnAdjustment)).append("\n");
    sb.append("    zindex: ").append(toIndentedString(zindex)).append("\n");
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

