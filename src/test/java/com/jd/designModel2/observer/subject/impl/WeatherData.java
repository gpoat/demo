package com.jd.designModel2.observer.subject.impl;

import com.jd.designModel2.observer.observer.Observer;
import com.jd.designModel2.observer.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichunran on 2018/8/9.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;

    private String temperature;

    private String humidity;

    private String pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
        }
    }
}
