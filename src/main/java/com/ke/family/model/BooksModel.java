package com.ke.family.model;

public class BooksModel {
	
	private int id;
	private String bookName;
	private String authorName;
	private String isbn;
	private GenresModel genre;
	
	
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public GenresModel getGenre() {
		return genre;
	}

	public void setGenre(GenresModel genre) {
		this.genre = genre;
	}
}
