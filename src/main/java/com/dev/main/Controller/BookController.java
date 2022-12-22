package com.dev.main.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.main.entity.Book;
import com.dev.main.repository.Bookrepository;

@RestController
public class BookController {
	@Autowired
	private Bookrepository repository;
	
	@PostMapping("/postbook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added book with id:"+book.getId();
	}
	@GetMapping("/getbook")
	public List<Book> getBook(){
		return repository.findAll();
	}
	@GetMapping("/findBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id){
		return repository.findById(id);
	}
	@DeleteMapping("/findbyid/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id: " +id;
	}
}
