package com.jd.designModel.observer.display.impl;

import com.jd.designModel.observer.display.DisplayElement;
import com.jd.designModel.observer.observer.Observer;
import com.jd.designModel.observer.subject.Subject;

/**
 * Created by lichunran on 2018/5/11.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("temperature : " + temperature + ", humidity : " + humidity);
    }
}
