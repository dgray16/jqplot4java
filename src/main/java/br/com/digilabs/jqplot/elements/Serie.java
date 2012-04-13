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

import br.com.digilabs.jqplot.JqPlotResources;

/**
 * The Class Serie.
 *
 * @author inaiat
 */
public class Serie implements Element {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7138260563176853708L;
    
    /** The label. */
    private String label;
    
    /** The renderer. */
    private JqPlotResources renderer;
    
    /** The renderer options. */
    private RendererOptions rendererOptions;
    
    /** The fill. */
    private Boolean fill;
    
    /** The line width. */
    private Integer lineWidth;
    
    /** The marker options. */
    private MarkerOptions markerOptions;
    
    /** The show marker. */
    private Boolean showMarker;
    
    /** The show alpha. */
    private Boolean showAlpha;
    
    /** The shadow. */
    private Boolean shadow;
    
    /** The shadow alpha. */
    private String shadowAlpha;
    
    /** The show line. */
    private Boolean showLine;
    
    /** The color. */
    private String color;

    /**
     * Instantiates a new serie.
     */
    public Serie() {
    }  

    /**
     * Instantiates a new serie.
     *
     * @param label the label
     */
    public Serie(String label) {
    	this.label = label;
    }

    /**
     * Line width.
     *
     * @param lineWidth the line width
     * @return the serie
     */
    public Serie lineWidth(Integer lineWidth) {
    	this.lineWidth = lineWidth;
    	return this;
    }
    
    /**
     * Marker options.
     *
     * @param markerOptions the marker options
     * @return the serie
     */
    public Serie markerOptions(MarkerOptions markerOptions) {
    	this.markerOptions = markerOptions;
    	return this;
    }
    
    /**
     * Show line.
     *
     * @param showLine the show line
     * @return the serie
     */
    public Serie showLine(Boolean showLine) {
    	this.setShowLine(showLine);
    	return this;
    }
    
    /**
     * Renderer options.
     *
     * @param rendererOptions the renderer options
     * @return the serie
     */
    public Serie rendererOptions(RendererOptions rendererOptions) {
    	this.rendererOptions = rendererOptions;
    	return this;
    }
    
    /**
     * Renderer.
     *
     * @param renderer the renderer
     * @return the serie
     */
    public Serie renderer(JqPlotResources renderer) {
    	this.renderer = renderer;
    	return this;
    }

    /**
     * Gets the shadow alpha.
     *
     * @return shadowAlpha
     */
    public String getShadowAlpha() {
        return shadowAlpha;
    }

    /**
     * Sets the shadow alpha.
     *
     * @param shadowAlpha the new shadow alpha
     */
    public void setShadowAlpha(String shadowAlpha) {
        this.shadowAlpha = shadowAlpha;
    }

    /**
     * Gets the show alpha.
     *
     * @return showAlpha true ou false
     */
    public Boolean getShowAlpha() {
        return showAlpha;
    }

    /**
     * Sets the show alpha.
     *
     * @param showAlpha the new show alpha
     */
    public void setShowAlpha(Boolean showAlpha) {
        this.showAlpha = showAlpha;
    }

    /**
     * Gets the shadow.
     *
     * @return shadow
     */
    public Boolean getShadow() {
        return shadow;
    }

    /**
     * Sets the shadow.
     *
     * @param shadow the new shadow
     */
    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    /**
     * Gets the show marker.
     *
     * @return the show marker
     */
    public Boolean getShowMarker() {
        return showMarker;
    }

    /**
     * Sets the show marker.
     *
     * @param showMarker the new show marker
     */
    public void setShowMarker(Boolean showMarker) {
        this.showMarker = showMarker;
    }
    
    /**
     * Gets the marker options.
     *
     * @return the marker options
     */
    public MarkerOptions getMarkerOptions() {
        return markerOptions;
    }

    /**
     * Sets the marker options.
     *
     * @param markerOptions the new marker options
     */
    public void setMarkerOptions(MarkerOptions markerOptions) {
        this.markerOptions = markerOptions;
    }

    /**
     * Gets the line width.
     *
     * @return the line width
     */
    public Integer getLineWidth() {
        return lineWidth;
    }

    /**
     * Sets the line width.
     *
     * @param lineWidth the new line width
     */
    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    /**
     * Gets the renderer options.
     *
     * @return the renderer options
     */
    public RendererOptions getRendererOptions() {
        return rendererOptions;
    }

    /**
     * Sets the renderer options.
     *
     * @param rendererOptions the new renderer options
     */
    public void setRendererOptions(RendererOptions rendererOptions) {
        this.rendererOptions = rendererOptions;
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
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets the renderer.
     *
     * @return the renderer
     */
    public JqPlotResources getRenderer() {
        return renderer;
    }

    /**
     * Sets the renderer.
     *
     * @param renderer the renderer to set
     */
    public void setRenderer(JqPlotResources renderer) {
        this.renderer = renderer;
    }

    /**
     * Gets the fill.
     *
     * @return the fill
     */
    public Boolean getFill() {
        return fill;
    }

    /**
     * Sets the fill.
     *
     * @param fill the fill to set
     */
    public void setFill(Boolean fill) {
        this.fill = fill;
    }


    /**
     * Gets the color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color.
     *
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }
	
	/**
	 * Gets the show line.
	 *
	 * @return the show line
	 */
	public Boolean getShowLine() {
		return showLine;
	}

	/**
	 * Sets the show line.
	 *
	 * @param showLine the new show line
	 */
	public void setShowLine(Boolean showLine) {
		this.showLine = showLine;
	}
}
