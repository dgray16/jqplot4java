/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.io.Serializable;
import jqplot.renderer.plugin.PluginClasses;

/**
 *
 * @author inaiat
 */
public class Serie implements Serializable {

    private String label;
    private PluginClasses renderer;

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
    public PluginClasses getRenderer() {
        return renderer;
    }

    /**
     * @param renderer the renderer to set
     */
    public void setRenderer(PluginClasses renderer) {
        this.renderer = renderer;
    }
}
