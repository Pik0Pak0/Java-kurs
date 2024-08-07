package com.robie.sobie.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTempeture() {
        double sum=0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        double avg = sum/temperatures.getTemperatures().size();
        return avg;
    }

    public double medianTemperature() {
        List<Double> list = new ArrayList<>();
        for(Map.Entry<String,Double> temperature:
        temperatures.getTemperatures().entrySet()) {
            list.add(temperature.getValue());
        }
        Collections.sort(list);
        double median;
        if(list.size()%2==1){
            median = list.get(list.size()/2);
        } else {
            median = (list.get((list.size()/2)-1)+list.get(list.size()/2))/2;
        }
        return median;
    }
}
