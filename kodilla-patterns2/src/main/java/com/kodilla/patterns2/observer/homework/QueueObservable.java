package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observer;

public interface QueueObservable {
    void registerObserver(MentorObserver observer);
    void notifyObservers();
    void removeObserver(MentorObserver observer);


}
