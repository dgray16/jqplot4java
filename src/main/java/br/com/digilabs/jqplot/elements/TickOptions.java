/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.elements;

/**
 * A 'tick' object showing the value of a tick/gridline on the plot.
 * 
 * @author inaiat
 */
public class TickOptions implements Element {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8139093369426118021L;

    /** The mark. */
    private String mark;

    /** The show mark. */
    private Boolean showMark;

    /** The show gridline. */
    private Boolean showGridline;

    /** The is minor tick. */
    private Boolean isMinorTick;

    /** The angle. */
    private Integer angle;

    /** The mark size. */
    private Integer markSize;

    /** The show. */
    private Boolean show;

    /** The show label. */
    private Boolean showLabel;

    /** The label position. */
    private String labelPosition;

    /** The label. */
    private String label;

    /** The format string. */
    private String formatString;

    /** The prefix. */
    private String prefix;

    /** The font family. */
    private String fontFamily;

    /** The font size. */
    private String fontSize;

    /** The font weight. */
    private String fontWeight;

    /** The font stretch. */
    private Double fontStretch;

    /** The text color. */
    private String textColor;

    /** The escape html. */
    private Boolean escapeHTML;

    /**
     * Gets the format string.
     * 
     * @return formatString
     */
    public String getFormatString() {
	return formatString;
    }

    /**
     * Sets the format string.
     * 
     * @param formatString
     *            the new format string
     */
    public void setFormatString(String formatString) {
	this.formatString = formatString;
    }

    /**
     * Sets the angle.
     * 
     * @param angle
     *            the angle to set
     */
    public void setAngle(Integer angle) {
	this.angle = angle;
    }

    /**
     * Gets the angle.
     * 
     * @return the angle
     */
    public Integer getAngle() {
	return angle;
    }

    /**
     * Gets the label position.
     * 
     * @return the labelPosition
     */
    public String getLabelPosition() {
	return labelPosition;
    }

    /**
     * Sets the label position.
     * 
     * @param labelPosition
     *            to set
     */
    public void setLabelPosition(String labelPosition) {
	this.labelPosition = labelPosition;
    }

    /**
     * Gets the mark.
     * 
     * @return the mark
     */
    public String getMark() {
	return mark;
    }

    /**
     * Sets the mark.
     * 
     * @param mark
     *            the new mark
     */
    public void setMark(String mark) {
	this.mark = mark;
    }

    /**
     * Gets the show mark.
     * 
     * @return the show mark
     */
    public Boolean getShowMark() {
	return showMark;
    }

    /**
     * Sets the show mark.
     * 
     * @param showMark
     *            the new show mark
     */
    public void setShowMark(Boolean showMark) {
	this.showMark = showMark;
    }

    /**
     * Gets the show gridline.
     * 
     * @return the show gridline
     */
    public Boolean getShowGridline() {
	return showGridline;
    }

    /**
     * Sets the show gridline.
     * 
     * @param showGridline
     *            the new show gridline
     */
    public void setShowGridline(Boolean showGridline) {
	this.showGridline = showGridline;
    }

    /**
     * Gets the checks if is minor tick.
     * 
     * @return the checks if is minor tick
     */
    public Boolean getIsMinorTick() {
	return isMinorTick;
    }

    /**
     * Sets the checks if is minor tick.
     * 
     * @param isMinorTick
     *            the new checks if is minor tick
     */
    public void setIsMinorTick(Boolean isMinorTick) {
	this.isMinorTick = isMinorTick;
    }

    /**
     * Gets the mark size.
     * 
     * @return the mark size
     */
    public Integer getMarkSize() {
	return markSize;
    }

    /**
     * Sets the mark size.
     * 
     * @param markSize
     *            the new mark size
     */
    public void setMarkSize(Integer markSize) {
	this.markSize = markSize;
    }

    /**
     * Gets the show.
     * 
     * @return the show
     */
    public Boolean getShow() {
	return show;
    }

    /**
     * Sets the show.
     * 
     * @param show
     *            the new show
     */
    public void setShow(Boolean show) {
	this.show = show;
    }

    /**
     * Gets the show label.
     * 
     * @return the show label
     */
    public Boolean getShowLabel() {
	return showLabel;
    }

    /**
     * Sets the show label.
     * 
     * @param showLabel
     *            the new show label
     */
    public void setShowLabel(Boolean showLabel) {
	this.showLabel = showLabel;
    }

    /**
     * Gets the label.
     * 
     * @return the label
     */
    public String getLabel() {
	return label;
    }

    /**
     * Sets the label.
     * 
     * @param label
     *            the new label
     */
    public void setLabel(String label) {
	this.label = label;
    }

    /**
     * Gets the prefix.
     * 
     * @return the prefix
     */
    public String getPrefix() {
	return prefix;
    }

    /**
     * Sets the prefix.
     * 
     * @param prefix
     *            the new prefix
     */
    public void setPrefix(String prefix) {
	this.prefix = prefix;
    }

    /**
     * Gets the font family.
     * 
     * @return the font family
     */
    public String getFontFamily() {
	return fontFamily;
    }

    /**
     * Sets the font family.
     * 
     * @param fontFamily
     *            the new font family
     */
    public void setFontFamily(String fontFamily) {
	this.fontFamily = fontFamily;
    }

    /**
     * Gets the font size.
     * 
     * @return the font size
     */
    public String getFontSize() {
	return fontSize;
    }

    /**
     * Sets the font size.
     * 
     * @param fontSize
     *            the new font size
     */
    public void setFontSize(String fontSize) {
	this.fontSize = fontSize;
    }

    /**
     * Gets the font weight.
     * 
     * @return the font weight
     */
    public String getFontWeight() {
	return fontWeight;
    }

    /**
     * Sets the font weight.
     * 
     * @param fontWeight
     *            the new font weight
     */
    public void setFontWeight(String fontWeight) {
	this.fontWeight = fontWeight;
    }

    /**
     * Gets the font stretch.
     * 
     * @return the font stretch
     */
    public Double getFontStretch() {
	return fontStretch;
    }

    /**
     * Sets the font stretch.
     * 
     * @param fontStretch
     *            the new font stretch
     */
    public void setFontStretch(Double fontStretch) {
	this.fontStretch = fontStretch;
    }

    /**
     * Gets the text color.
     * 
     * @return the text color
     */
    public String getTextColor() {
	return textColor;
    }

    /**
     * Sets the text color.
     * 
     * @param textColor
     *            the new text color
     */
    public void setTextColor(String textColor) {
	this.textColor = textColor;
    }

    /**
     * Gets the escape html.
     * 
     * @return the escape html
     */
    public Boolean getEscapeHTML() {
	return escapeHTML;
    }

    /**
     * Sets the escape html.
     * 
     * @param escapeHTML
     *            the new escape html
     */
    public void setEscapeHTML(Boolean escapeHTML) {
	this.escapeHTML = escapeHTML;
    }
}
