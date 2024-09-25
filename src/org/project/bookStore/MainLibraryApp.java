package org.project.bookStore;
public class MainLibraryApp {
    public static void main(String[] args) {
        Library<Media> library = new Library<>();
        User user1 = new User("Ali");
        User user2 = new User("Ahmed");

        library.addObserver(user1);
        library.addObserver(user2);

        BookMedia book1 = new BookMedia("The Alchemist", 1500);
        Movie movie1 = new Movie("Titanic", 2500);

        library.addMedia(book1);
        library.addMedia(movie1);

  
        library.updateMediaPrice(book1, 1600);
        library.updateMediaPrice(movie1, 2700);
    }
}
