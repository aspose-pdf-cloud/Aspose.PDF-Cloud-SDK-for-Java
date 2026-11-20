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
import com.aspose.asposecloudpdf.model.Direction;
import com.aspose.asposecloudpdf.model.Link;
import com.aspose.asposecloudpdf.model.LinkElement;
import com.aspose.asposecloudpdf.model.PageLayout;
import com.aspose.asposecloudpdf.model.PageMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Provides link to DisplayProperties.
 */
@ApiModel(description = "Provides link to DisplayProperties.")

public class DisplayProperties extends LinkElement {
  @SerializedName("CenterWindow")
  private Boolean centerWindow = null;

  @SerializedName("Direction")
  private Direction direction = null;

  @SerializedName("DisplayDocTitle")
  private Boolean displayDocTitle = null;

  @SerializedName("HideMenuBar")
  private Boolean hideMenuBar = null;

  @SerializedName("HideToolBar")
  private Boolean hideToolBar = null;

  @SerializedName("HideWindowUI")
  private Boolean hideWindowUI = null;

  @SerializedName("NonFullScreenPageMode")
  private PageMode nonFullScreenPageMode = null;

  @SerializedName("PageLayout")
  private PageLayout pageLayout = null;

  @SerializedName("PageMode")
  private PageMode pageMode = null;

  public DisplayProperties centerWindow(Boolean centerWindow) {
    this.centerWindow = centerWindow;
    return this;
  }

   /**
   * Gets or sets flag specifying whether position of the document&#39;s window will be centerd on the screen.
   * @return centerWindow
  **/
  @ApiModelProperty(example = "false", value = "Gets or sets flag specifying whether position of the document's window will be centerd on the screen.")
  public Boolean isCenterWindow() {
    return centerWindow;
  }

  public void setCenterWindow(Boolean centerWindow) {
    this.centerWindow = centerWindow;
  }

  public DisplayProperties direction(Direction direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Gets or sets reading order of text: L2R (left to right) or R2L (right to left).
   * @return direction
  **/
  @ApiModelProperty(value = "Gets or sets reading order of text: L2R (left to right) or R2L (right to left).")
  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public DisplayProperties displayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
    return this;
  }

   /**
   * Gets or sets flag specifying whether document&#39;s window title bar should display document title.
   * @return displayDocTitle
  **/
  @ApiModelProperty(example = "false", value = "Gets or sets flag specifying whether document's window title bar should display document title.")
  public Boolean isDisplayDocTitle() {
    return displayDocTitle;
  }

  public void setDisplayDocTitle(Boolean displayDocTitle) {
    this.displayDocTitle = displayDocTitle;
  }

  public DisplayProperties hideMenuBar(Boolean hideMenuBar) {
    this.hideMenuBar = hideMenuBar;
    return this;
  }

   /**
   * Gets or sets flag specifying whether menu bar should be hidden when document is active.
   * @return hideMenuBar
  **/
  @ApiModelProperty(example = "false", value = "Gets or sets flag specifying whether menu bar should be hidden when document is active.")
  public Boolean isHideMenuBar() {
    return hideMenuBar;
  }

  public void setHideMenuBar(Boolean hideMenuBar) {
    this.hideMenuBar = hideMenuBar;
  }

  public DisplayProperties hideToolBar(Boolean hideToolBar) {
    this.hideToolBar = hideToolBar;
    return this;
  }

   /**
   * Gets or sets flag specifying whether toolbar should be hidden when document is active.
   * @return hideToolBar
  **/
  @ApiModelProperty(example = "false", value = "Gets or sets flag specifying whether toolbar should be hidden when document is active.")
  public Boolean isHideToolBar() {
    return hideToolBar;
  }

  public void setHideToolBar(Boolean hideToolBar) {
    this.hideToolBar = hideToolBar;
  }

  public DisplayProperties hideWindowUI(Boolean hideWindowUI) {
    this.hideWindowUI = hideWindowUI;
    return this;
  }

   /**
   * Gets or sets flag specifying whether user interface elements should be hidden when document is active.
   * @return hideWindowUI
  **/
  @ApiModelProperty(example = "false", value = "Gets or sets flag specifying whether user interface elements should be hidden when document is active.")
  public Boolean isHideWindowUI() {
    return hideWindowUI;
  }

  public void setHideWindowUI(Boolean hideWindowUI) {
    this.hideWindowUI = hideWindowUI;
  }

  public DisplayProperties nonFullScreenPageMode(PageMode nonFullScreenPageMode) {
    this.nonFullScreenPageMode = nonFullScreenPageMode;
    return this;
  }

   /**
   * Gets or sets page mode, specifying how to display the document on exiting full-screen mode.
   * @return nonFullScreenPageMode
  **/
  @ApiModelProperty(value = "Gets or sets page mode, specifying how to display the document on exiting full-screen mode.")
  public PageMode getNonFullScreenPageMode() {
    return nonFullScreenPageMode;
  }

  public void setNonFullScreenPageMode(PageMode nonFullScreenPageMode) {
    this.nonFullScreenPageMode = nonFullScreenPageMode;
  }

  public DisplayProperties pageLayout(PageLayout pageLayout) {
    this.pageLayout = pageLayout;
    return this;
  }

   /**
   * Gets or sets page layout which shall be used when the document is opened.
   * @return pageLayout
  **/
  @ApiModelProperty(value = "Gets or sets page layout which shall be used when the document is opened.")
  public PageLayout getPageLayout() {
    return pageLayout;
  }

  public void setPageLayout(PageLayout pageLayout) {
    this.pageLayout = pageLayout;
  }

  public DisplayProperties pageMode(PageMode pageMode) {
    this.pageMode = pageMode;
    return this;
  }

   /**
   * Gets or sets page mode, specifying how document should be displayed when opened.
   * @return pageMode
  **/
  @ApiModelProperty(value = "Gets or sets page mode, specifying how document should be displayed when opened.")
  public PageMode getPageMode() {
    return pageMode;
  }

  public void setPageMode(PageMode pageMode) {
    this.pageMode = pageMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayProperties displayProperties = (DisplayProperties) o;
    return Objects.equals(this.centerWindow, displayProperties.centerWindow) &&
        Objects.equals(this.direction, displayProperties.direction) &&
        Objects.equals(this.displayDocTitle, displayProperties.displayDocTitle) &&
        Objects.equals(this.hideMenuBar, displayProperties.hideMenuBar) &&
        Objects.equals(this.hideToolBar, displayProperties.hideToolBar) &&
        Objects.equals(this.hideWindowUI, displayProperties.hideWindowUI) &&
        Objects.equals(this.nonFullScreenPageMode, displayProperties.nonFullScreenPageMode) &&
        Objects.equals(this.pageLayout, displayProperties.pageLayout) &&
        Objects.equals(this.pageMode, displayProperties.pageMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centerWindow, direction, displayDocTitle, hideMenuBar, hideToolBar, hideWindowUI, nonFullScreenPageMode, pageLayout, pageMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayProperties {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    centerWindow: ").append(toIndentedString(centerWindow)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    displayDocTitle: ").append(toIndentedString(displayDocTitle)).append("\n");
    sb.append("    hideMenuBar: ").append(toIndentedString(hideMenuBar)).append("\n");
    sb.append("    hideToolBar: ").append(toIndentedString(hideToolBar)).append("\n");
    sb.append("    hideWindowUI: ").append(toIndentedString(hideWindowUI)).append("\n");
    sb.append("    nonFullScreenPageMode: ").append(toIndentedString(nonFullScreenPageMode)).append("\n");
    sb.append("    pageLayout: ").append(toIndentedString(pageLayout)).append("\n");
    sb.append("    pageMode: ").append(toIndentedString(pageMode)).append("\n");
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

