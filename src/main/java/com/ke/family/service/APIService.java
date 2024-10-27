package com.ke.family.service;

import com.ke.family.model.BooksModel;

public interface APIService {

	public String get();
	
	public BooksModel bookDetails (int id);
}
