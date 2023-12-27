package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LibraryController {
	
	@Autowired
	private BookService service;
	
	
	@GetMapping("/")
	public String showPage() {
		System.out.println("i m in the shopage");
	return "redirect:new-Book";
	}
	
	@GetMapping("/disp")
	public String showAllBooks(@RequestParam("username") String username,@RequestParam("pasword") int pasword,Model model) {
		model.addAttribute("books", service.findAllBook());
		if(username.equals("praval")) {
		return "new";}else {
			return "errorpage";}
	}
	@GetMapping("/lib")
	public String library(Model model) {
		
		return "Library";
	}
	

	
	@GetMapping("/new-Book")
	public String ShowBookCreation(Model model) {
		System.out.println("i am in show book");
		model.addAttribute("book", new Book());
		return "new-Book";
	}
	
	@PostMapping("/add")
	public String addNewBook(@ModelAttribute("book") Book book, Model model) {
		System.out.println("i am int addnew book");
	System.out.println(book);
	
	service.saveBook(book);
	model.addAttribute("books", service.findAllBook());
	System.out.println("after service");
	return "new";
	}
	
	 @GetMapping("/{id}")
	   public String showBookById(@PathVariable Integer id, Model model) {
	      Book book = service.findById(id).orElseThrow(() -> new IllegalArgumentException("InvalidBook id :: " + id));
	      model.addAttribute("book", book);
	      return "edit-book";
	   }
		@PostMapping("/{id}/delete")
		public String deleteBookById(@PathVariable Integer id, Model model) {
			service.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book id :" + id));
			service.deleteById(id);
			model.addAttribute("books", service.findAllBook());
			return "new";
		}
	@PostMapping("/{id}/update")
	public String updateBook(@PathVariable Integer id, Model model, @ModelAttribute Book book) {

		service.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book id :: " + id));
		service.saveBook(book);
		model.addAttribute("books", service.findAllBook());

		return "new";
	}
	
	
	
	
}
