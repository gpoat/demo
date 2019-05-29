package com.jd.designModel.observer;

import com.jd.designModel.observer.display.impl.CurrentConditionDisplay;
import com.jd.designModel.observer.subject.Subject;
import com.jd.designModel.observer.subject.impl.WeatherData;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lichunran on 2018/5/10.
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(20, 30, 19.4f );


    }



}
