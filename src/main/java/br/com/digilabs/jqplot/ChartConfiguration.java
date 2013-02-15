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
package br.com.digilabs.jqplot;

import java.io.Serializable;
import java.util.Collection;

import br.com.digilabs.jqplot.axis.Axis;
import br.com.digilabs.jqplot.axis.XAxis;
import br.com.digilabs.jqplot.axis.YAxis;
import br.com.digilabs.jqplot.elements.*;

import java.util.ArrayList;

/**
 * 
 * Base configuration of JqPlot Chart. See jqplot documention
 * http://www.jqplot.com/docs/files/usage-txt.html
 * 
 * @param <T>
 *            Type of {@link Axis}
 * 
 * @author inaiat
 */
public class ChartConfiguration<T extends Serializable> implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7082325039222592701L;

    /** The series. */
    protected Collection<Serie> series;

    /** The axes. */
    protected Axes<T> axes;

    /** The title. */
    protected Title title;

    /** The axes defaults. */
    protected Axis<T> axesDefaults;

    /** The series defaults. */
    private SeriesDefaults seriesDefaults;

    /** The stack series. */
    private Boolean stackSeries;

    /** The show marker. */
    private Boolean showMarker;

    /** The legend. */
    private Legend legend;

    /** The capture right click. */
    private Boolean captureRightClick = null;

    /** The series colors. */
    private Collection<String> seriesColors;

    /** The animate. */
    private Boolean animate;

    /** The highlighter. */
    private Highlighter highlighter;

    /** The grid. */
    private Grid<T> grid;

    /** The cursor. */
    private Cursor cursor;

    /** The gridPadding attribute */
    private GridPadding gridPadding;    


    /**
     * Checks if is capture right click.
     * 
     * @return the boolean
     */
    public Boolean isCaptureRightClick() {
	return captureRightClick;
    }

    /**
     * Sets the capture right click.
     * 
     * @param captureRightClick
     *            the new capture right click
     */
    public ChartConfiguration<T> setCaptureRightClick(Boolean captureRightClick) {
	this.captureRightClick = captureRightClick;
	return this;
    }

    /**
     * Gets the legend.
     * 
     * @return the legend
     */
    public Legend getLegend() {
	return legend;
    }

    /**
     * Sets the legend.
     * 
     * @param legend
     *            the new legend
     */
    public ChartConfiguration<T> setLegend(Legend legend) {
	this.legend = legend;
	return this;
    }

    /**
     * Sets the simple title.
     * 
     * @param title
     *            the new simple title
     */
    public ChartConfiguration<T> setSimpleTitle(String title) {
	if (title == null) {
	    this.title = new Title(title);
	} else {
	    this.title.setText(title);
	}
	return this;
    }

    /**
     * Instantiates the cursor.
     * 
     * @return the cursor
     */
    public Cursor withCursor() {
	if (cursor == null) {
	    cursor = new Cursor();
	}
	return cursor;	
    }
    
    /**
     * Instantiates the grid.
     * 
     * @return the grid
     */
    public Grid<T> withGrid() {
	if (grid == null) {
	    grid = new Grid<T>();
	}
	return grid;
    }
    
    /**
     * Instantiates the axes.
     * 
     * @return the axes
     */
    public Axes<T> withAxes() {
	if (axes == null) {
	    this.axes = new Axes<T>();
	}
	return this.axes;
    }
    
    /**
     * Instantiates the axes defaults.
     * 
     * @return the axis
     */
    public Axis<T> withAxesDefaults() {
	if (axesDefaults == null) {
	    axesDefaults = new Axis<T>();
	}
	return axesDefaults;
    }
    
    public XAxis<T> withXAxis() {
	return withAxes().withXaxis();
    }
    
    public YAxis<T> withYAxis() {
	return withAxes().withYaxis();
    }
    
    public Collection<Serie> withSeries() {
	if (series == null) {
	    series = new ArrayList<Serie>();
	}
	return series;
    }  
    
    public SeriesDefaults withSeriesDefaults() {
	if (seriesDefaults == null) {
	    seriesDefaults = new SeriesDefaults();
	}
	return seriesDefaults;
    }
    
    public Collection<String> withSeriesColors() {
	if (this.seriesColors == null) {
	    this.seriesColors = new ArrayList<String>();
	}
	return seriesColors;
    }
    
    public Highlighter withHighlighter() {
	if (highlighter == null) {
	    highlighter = new Highlighter();
	}
	return highlighter;
    }

    
    /**
     * Creates the cursor.
     * 
     * @return the cursor
     * 
     * @deprecated use withCursor()
     */
    @Deprecated  
    public Cursor createCursor() {
	return withCursor();
    }

    /**
     * Creates the grid.
     * 
     * @return the grid
     * @deprecated use withGrid 
     */
    @Deprecated
    public Grid<T> createGrid() {
	return withGrid();
    }

    /**
     * Creates the axes.
     * 
     * @return the axes
     * 
     * @deprecated use withAxes()
     */
    @Deprecated
    public Axes<T> createAxes() {
	return withAxes();
    }

    /**
     * Creates the x axis.
     * 
     * @return the x axis
     */
    @Deprecated
    public XAxis<T> createXAxis() {
	return withXAxis();
    }

    /**
     * Creates the y axis.
     * 
     * @return the y axis
     */
    @Deprecated
    public YAxis<T> createYAxis() {
	return withYAxis();
    }

    /**
     * Creates the axes defaults.
     * 
     * @return the axis
     */
    @Deprecated
    public Axis<T> createAxesDefaults() {
	return withAxesDefaults();
    }

    /**
     * Sets the label x.
     * 
     * @param label
     *            the new label x
     */
    public ChartConfiguration<T> setLabelX(String label) {
	if (label != null) {	    
	    withAxes().getXaxis().setLabel(label);
	}
	return this;
    }

    /**
     * Sets the label y.
     * 
     * @param label
     *            the new label y
     */
    public ChartConfiguration<T> setLabelY(String label) {
	if (label != null) {
	    withAxes().getYaxis().setLabel(label);
	}
	return this;
    }

    /**
     * Creates the series.
     * 
     * @return the collection
     */
    @Deprecated
    public Collection<Serie> createSeries() {
	return withSeries();
    }    

    /**
     * Gets the series.
     * 
     * @return the series
     */
    public Collection<Serie> getSeries() {
	return series;
    }
    
    /**
     * Sets the series.
     * 
     * @param series
     *            the series to set
     */
    public ChartConfiguration<T> setSeries(Collection<Serie> series) {
	this.series = series;
	return this;
    }

    /**
     * Adds the series.
     * 
     * @param serie
     *            the serie
     */
    public ChartConfiguration<T> addSeries(Serie serie) {
	this.withSeries().add(serie);
	return this;
    }

    /**
     * Gets the title.
     * 
     * @return the title
     */
    public Title getTitle() {
	return title;
    }

    /**
     * Sets the title.
     * 
     * @param title
     *            the title to set
     */
    public ChartConfiguration<T> setTitle(Title title) {
	this.title = title;
	return this;
    }

    /**
     * Gets the axes defaults.
     * 
     * @return the axesDefaults
     */
    public Axis<T> getAxesDefaults() {
	return axesDefaults;
    }
	
    /**
     * Sets the axes defaults.
     * 
     * @param axesDefaults
     *            the axesDefaults to set
     */
    public ChartConfiguration<T> setAxesDefaults(Axis<T> axesDefaults) {
	this.axesDefaults = axesDefaults;
	return this;
    }

    /**
     * Gets the axes.
     * 
     * @return the axes
     */
    public Axes<T> getAxes() {
	return axes;
    }

    /**
     * Sets the axes.
     * 
     * @param axes
     *            the axes to set
     */
    public ChartConfiguration<T> setAxes(Axes<T> axes) {
	this.axes = axes;
	return this;
    }

    /**
     * Creates the series defaults.
     * 
     * @return the series defaults
     */
    @Deprecated
    public SeriesDefaults createSeriesDefaults() {
	return withSeriesDefaults();
    }

    /**
     * Gets the series defaults.
     * 
     * @return the seriesDefaults
     */
    public SeriesDefaults getSeriesDefaults() {
	return seriesDefaults;
    }

    /**
     * Sets the series defaults.
     * 
     * @param seriesDefaults
     *            the seriesDefaults to set
     */
    public ChartConfiguration<T> setSeriesDefaults(SeriesDefaults seriesDefaults) {
	this.seriesDefaults = seriesDefaults;
	return this;
    }

    /**
     * Gets the stack series.
     * 
     * @return the stackSeries
     */
    public Boolean getStackSeries() {
	return stackSeries;
    }

    /**
     * Sets the stack series.
     * 
     * @param stackSeries
     *            the stackSeries to set
     */
    public ChartConfiguration<T> setStackSeries(Boolean stackSeries) {
	this.stackSeries = stackSeries;
	return this;
    }

    /**
     * Gets the show marker.
     * 
     * @return the showMarker
     */
    public Boolean getShowMarker() {
	return showMarker;
    }

    /**
     * Sets the show marker.
     * 
     * @param showMarker
     *            the showMarker to set
     */
    public ChartConfiguration<T> setShowMarker(Boolean showMarker) {
	this.showMarker = showMarker;
	return this;
    }

    /**
     * Creates the series colors.
     * 
     * @return the collection
     */
    @Deprecated
    public Collection<String> createSeriesColors() {
	return withSeriesColors();
    }

    /**
     * Gets the series colors.
     * 
     * @return the series colors
     */
    public Collection<String> getSeriesColors() {
	return seriesColors;
    }

    /**
     * Sets the series colors.
     * 
     * @param seriesColor
     *            the new series colors
     */
    public ChartConfiguration<T> setSeriesColors(Collection<String> seriesColor) {
	this.seriesColors = seriesColor;
	return this;
    }

    /**
     * Gets the animate.
     * 
     * @return animate property
     */
    public Boolean getAnimate() {
	return animate;
    }

    /**
     * Turns on animation for all series in this plot.
     * 
     * @param animate
     *            true, false
     */
    public ChartConfiguration<T> setAnimate(Boolean animate) {
	this.animate = animate;
	return this;
    }

    /**
     * Creates the highlighter.
     * 
     * @return the highlighter
     */
    @Deprecated
    public Highlighter createHighlighter() {
	return withHighlighter();
    }

    /**
     * Gets the highlighter.
     * 
     * @return hightLighter
     */
    public Highlighter getHighlighter() {
	return highlighter;
    }

    /**
     * set the highlighter.
     * 
     * @param highlighter
     *            property
     */
    public ChartConfiguration<T> setHighlighter(Highlighter highlighter) {
	this.highlighter = highlighter;
	return this;
    }

    /**
     * Gets the grid.
     * 
     * @return the grid
     */
    public Grid<T> getGrid() {
	return grid;
    }

    /**
     * Sets the grid.
     * 
     * @param grid
     *            the new grid
     */
    public ChartConfiguration<T> setGrid(Grid<T> grid) {
	this.grid = grid;
	return this;
    }

    /**
     * Gets the cursor.
     * 
     * @return the cursor
     */
    public Cursor getCursor() {
	return cursor;
    }

    /**
     * Sets the cursor.
     * 
     * @param cursor
     *            the new cursor
     */
    public ChartConfiguration<T> setCursor(Cursor cursor) {
	this.cursor = cursor;
	return this;
    }

    /**
     * Gets gridPadding
     * 
     * @return
     */
    public GridPadding getGridPadding() {
	return gridPadding;
    }

    /**
     * Sets the gridPadding
     * 
     * @param gridPadding
     *            the new gridPadding
     */
    public ChartConfiguration<T> setGridPadding(GridPadding gridPadding) {
	this.gridPadding = gridPadding;
	return this;
    }
}
