package com.jd.designModel2.observer.subject;

import com.jd.designModel2.observer.observer.Observer;

/**
 * Created by lichunran on 2018/8/9.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
