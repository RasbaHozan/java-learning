package org.project.bookStore;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    private List<T> mediaItems;
    private List<LibraryObserver> observers;

    public Library() {
        mediaItems = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addMedia(T media) {
        mediaItems.add(media);
        notifyObservers(new LibraryEvent("Media Added: " + media.getClass().getSimpleName()));
    }

    public void updateMediaPrice(T media, double newPrice) {
        media.updatePrice(newPrice);
        notifyObservers(new LibraryEvent("Price Updated for: " + media.getClass().getSimpleName()));
    }

    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(LibraryEvent event) {
        for (LibraryObserver observer : observers) {
            observer.updateEvent(event);
        }
    }
}
