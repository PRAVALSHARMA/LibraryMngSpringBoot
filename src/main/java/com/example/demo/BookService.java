package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface BookService {
	public List<Book> findAllBook();
	public Book saveBook(Book book);
	public void deleteById(int id);
	public Optional<Book> findById(int id);
	

}
