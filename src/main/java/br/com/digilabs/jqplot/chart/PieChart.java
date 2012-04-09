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
package br.com.digilabs.jqplot.chart;

import br.com.digilabs.jqplot.JqPlotResources;
import br.com.digilabs.jqplot.data.PieData;
import br.com.digilabs.jqplot.data.item.LabeledItem;
import br.com.digilabs.jqplot.elements.*;
import br.com.digilabs.jqplot.metadata.JqPlotPlugin;

/**
 * @author inaiat
 */
@JqPlotPlugin(values = {JqPlotResources.PieRenderer})
public class PieChart<T extends Number> extends AbstractChart<PieData<T>> {

	private static final long serialVersionUID = -9078771567964143651L;

	private PieData<T> data = new PieData<T>();

    /**
     * Construtor
     */
    public PieChart() {
        this(null);
    }

    /**
     * Construtor
     * @param title 
     */
    public PieChart(String title) {
        getChartConfiguration().setTitle(new Title(title));
        getChartConfiguration().setLegend(new Legend(true, Location.e));
        getChartConfiguration().setSeriesDefaults(new SeriesDefaults());
        getChartConfiguration().getSeriesDefaults().setRenderer(JqPlotResources.PieRenderer);
        getChartConfiguration().getSeriesDefaults().setRendererOptions(new RendererOptions());
        getChartConfiguration().getSeriesDefaults().getRendererOptions().setShowDataLabels(true);

    }

    /**
     * 
     * @param label
     * @param value 
     */
    public void addValue(String label, T value) {
        data.addValue(new LabeledItem<T>(label, value));
    }

    /**
     * 
     * @param value 
     */
    public void addValue(LabeledItem<T> value) {
        data.addValue(value);
    }

    /**
     * 
     * @param values 
     */
    public void addValues(LabeledItem<T>... values) {
        data.addValues(values);
    }

    /**
     * 
     * @return chartData
     */
    public PieData<T> getChartData() {
        return data;
    }

}