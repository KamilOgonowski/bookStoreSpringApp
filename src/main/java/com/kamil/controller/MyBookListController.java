package com.kamil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kamil.entity.Book;
import com.kamil.entity.MyBookList;
import com.kamil.service.MyBookListService;

@Controller
public class MyBookListController {
	
	@Autowired
	private MyBookListService mBService;
	
	
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteBookFromMyList(@PathVariable("id") int id) {
		mBService.deleteById(id);
		
		return "redirect:/my_books";
	}

}
