package com.design.chapter2.observer.pattern;

/**
 * Created by Jurel on 10/23/2015.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
