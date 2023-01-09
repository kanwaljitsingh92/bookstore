package com.kawal.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.kawal.bookstore.model.Author;

@Service
public class AuthorService {

	public List<Author> showAuthor() {
		List<Author> theauthor = new ArrayList();
		Author tempauthor = new Author(1,"test1","https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&w=600","workholic");
		Author tempauthor1 = new Author(2,"test2","https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&w=600","workholic2");
		theauthor.add(tempauthor);
		theauthor.add(tempauthor1);
		return theauthor;
	}

	public List<Author> searchAuthor(String authorName) {
		List<Author> theauthor = new ArrayList();
		Author tempauthor = new Author(1,authorName,"https://images.pexels.com/photos/771742/pexels-photo-771742.jpeg?auto=compress&cs=tinysrgb&w=600","workholic");
		
		theauthor.add(tempauthor);
		return theauthor;
	}
}
