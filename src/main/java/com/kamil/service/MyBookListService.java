package com.kamil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamil.entity.MyBookList;
import com.kamil.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository myBook;
	
//	public List<MyBookList> getMyBooks() {
//		return myBook.findAll();
//	}
	
	public void saveMyBook(MyBookList book) {
		myBook.save(book);
	}
	
	public List<MyBookList> getAllMyBooks(){
		return myBook.findAll();
	}
	
	public void deleteById(int id) {
		myBook.deleteById(id);
	}
	

}
