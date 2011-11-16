/* To change this template, choose Tools | Templates
/*
 * and open the template in the editor.
 */
package jqplot.chart.elements;

import jqplot.JqPlotResources;

/**
 *
 * @author inaiat
 */
public class Serie implements Element {

    private String label;
    private JqPlotResources renderer;
    private RendererOptions rendererOptions;
    private Boolean fill;

    public RendererOptions getRendererOptions() {
        return rendererOptions;
    }

    public void setRendererOptions(RendererOptions rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the renderer
     */
    public JqPlotResources getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(JqPlotResources renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the fill
     */
    public Boolean getFill() {
        return fill;
    }

    /**
     * @param fill the fill to set
     */
    public void setFill(Boolean fill) {
        this.fill = fill;
    }
}