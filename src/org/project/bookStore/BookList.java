package org.project.bookStore;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	private List<Book> books = new ArrayList<Book>();

	public BookList() {
		super();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public BookList(List<Book> books) {
		super();
		this.books = books;
	}
}