package com.jd.designModel.observer.subject;


import com.jd.designModel.observer.observer.Observer;

/**
 * Created by lichunran on 2018/5/10.
 */
public interface Subject {

    void registerObserver(Observer o);

    void deleteObserver(Observer o);

    void notifyObservers();

}
