package com.javacodegeeks.snippets.enterprise.controller;

import com.javacodegeeks.snippets.enterprise.model.Comment;

//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestBody;
//import com.javacodegeeks.snippets.enterprise.service.CommentService;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@RestController
public class CommentController {

	@RequestMapping(value = "/comment", method = RequestMethod.POST)
	public ResponseEntity<Comment> get() {

		    //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			//CommentService comService = (CommentService) context.getBean("commentService");
		
			Comment com = new Comment();
	
			com.setId("20");
			com.setCom("otro comentario");
			com.setState(0);
		
	//		comService.persistComment(com);
		//	context.close();
			return new ResponseEntity<Comment>(com, HttpStatus.OK);
	}
	
}
