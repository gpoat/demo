package com.jd.designModel.observer.subject.impl;

import com.jd.designModel.observer.observer.Observer;
import com.jd.designModel.observer.subject.Subject;

import java.util.ArrayList;

/**
 * Created by lichunran on 2018/5/10.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void deleteObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i > 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
