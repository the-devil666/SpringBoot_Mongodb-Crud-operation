package com.dev.main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dev.main.entity.Book;

public interface Bookrepository extends MongoRepository<Book,Integer>{

}
