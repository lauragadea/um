package com.javacodegeeks.snippets.enterprise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacodegeeks.snippets.enterprise.dao.CommentDAO;
import com.javacodegeeks.snippets.enterprise.model.Comment;



@Service("commentService")
public class CommentServiceImpl implements CommentService{
	@Autowired
	CommentDAO commentDAO;
	
	
	@Transactional
	public void persistComment(Comment comment) {
		commentDAO.persistComment(comment);
		
	}


	@Transactional
	public void updateComment(Comment comment) {
		commentDAO.updateComment(comment);
		
	}
	
	
	@Transactional
	public Comment findCommentById(String id) {
		return commentDAO.findCommentById(id);
	}
	

	@Transactional
	public void deleteComment(Comment comment) {
		commentDAO.deleteComment(comment);
		
	}
	
}
