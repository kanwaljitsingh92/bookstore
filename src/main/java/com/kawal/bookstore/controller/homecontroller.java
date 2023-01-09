package com.kawal.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kawal.bookstore.model.Enquiry;
import com.kawal.bookstore.service.AuthorService;

@Controller
public class homecontroller {
	
	@Autowired
	public AuthorService theauthservice;
     
	@GetMapping("/")
	public String showindex(Model themodel) {
		themodel.addAttribute("enquiry", new Enquiry());
		return "index";
	}
	@GetMapping("/author")
	public String showAuthor(Model themodel) {
	 
	  themodel.addAttribute("authors", theauthservice.showAuthor());
		return "author";
	}
	@PostMapping("/author")
	public String searchAuthor(Model themodel,@ModelAttribute Enquiry theenquiry) {
	 System.out.println(theenquiry.getSearchString());
		String authorname= theenquiry.getSearchString();
	  themodel.addAttribute("authors", theauthservice.searchAuthor(authorname));
		return "author";
	}
}
