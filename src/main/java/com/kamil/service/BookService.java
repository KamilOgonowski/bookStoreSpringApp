package com.kamil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamil.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	

}
