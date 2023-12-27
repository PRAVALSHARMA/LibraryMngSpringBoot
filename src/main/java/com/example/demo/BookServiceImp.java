package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookServiceImp implements BookService {
	@Autowired
	private BookRepo repo;

	@Override
	public List<Book> findAllBook() {
		// TODO Auto-generated method stub
		return StreamSupport.stream(repo.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return repo.save(book);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	 

	}

	@Override
	public Optional<Book> findById(int id) {
		return repo.findById(id);
		// TODO Auto-generated method stub

	}

}
