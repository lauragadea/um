package com.javacodegeeks.snippets.enterprise.service;

import com.javacodegeeks.snippets.enterprise.model.Comment;

public interface CommentService{

	void persistComment(Comment comment);
	
	Comment findCommentById(String id);
	
	void updateComment(Comment comment);
	
	void deleteComment(Comment comment);
}
