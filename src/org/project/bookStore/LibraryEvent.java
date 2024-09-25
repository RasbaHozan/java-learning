
package org.project.bookStore;

public class LibraryEvent {
    private String message;

    public LibraryEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
