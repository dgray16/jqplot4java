package br.com.digilabs.jqplot.chart.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.com.digilabs.jqplot.json.JSONArray;


/**
 *
 * @author bernardo.moura
 */
public class BarData<T extends Number> extends AbstractCollectionData<Collection<T>> {
    
    private Collection<Collection<T>> data = new ArrayList<Collection<T>>();

    public BarData() {
    }
    
    public BarData(Collection<T>... values) {
        addValues(values);
    }    

    public Collection<Collection<T>> getData() {
        return data;
    }

    public String toJsonString() {
        JSONArray jsonArray = new JSONArray(data);
        return jsonArray.toString();
    }    

    
}