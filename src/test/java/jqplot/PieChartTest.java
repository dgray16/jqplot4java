/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jqplot;

import java.util.HashMap;
import jqplot.chart.PieChart;
import jqplot.chart.data.PieChartData;
import junit.framework.TestCase;

/**
 *
 * @author bernardo.moura
 */
public class PieChartTest extends TestCase {

    public PieChartTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreatePieJquery() {
        PieChartData chartData = new PieChartData();
        
        PieChart<PieChartData> jqPlot = new PieChart<PieChartData>();

        HashMap<String, Double> data = new HashMap<String, Double>();
        data.put("aaa", 1.2);
        data.put("bbb", 1.3);
        data.put("ccc", 1.5);
        chartData.addValue(data);
        jqPlot.setChartData(chartData);
        System.out.println(JqPlotUtil.createJquery(jqPlot, "chart1"));
    }
//
//    public void testCreateDonutJquery() {
//        DonutChart jqPlot = new DonutChart();
//
//        HashMap<String, Double> data = new HashMap<String, Double>();
//        data.put("aaa", 1.2);
//        data.put("bbb", 1.3);
//        data.put("ccc", 1.5);
//
//        System.out.println(JqPlotUtil.createPieChartJquery(jqPlot, "chart1", data));
//    }
}
