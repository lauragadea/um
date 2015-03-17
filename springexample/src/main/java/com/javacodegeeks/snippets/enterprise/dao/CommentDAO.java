package com.javacodegeeks.snippets.enterprise.dao;

import com.javacodegeeks.snippets.enterprise.model.Comment;



public interface CommentDAO {
	
	void persistComment(Comment comment);
	
	Comment findCommentById(String id);
	
	void updateComment(Comment comment);
	
	void deleteComment(Comment comment);

}
