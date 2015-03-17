package com.javacodegeeks.snippets.enterprise.dao;
import com.javacodegeeks.snippets.enterprise.model.Comment;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("commentDAO")
public class CommentDAOImpl implements CommentDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void persistComment(Comment comment) {
		sessionFactory.getCurrentSession().persist(comment);
	}
	
	
	public Comment findCommentById(String id) {
		return (Comment) sessionFactory.getCurrentSession().get(Comment.class, id);
	}

	
	public void updateComment(Comment comment) {
		sessionFactory.getCurrentSession().update(comment);

	}
	
	
	public void deleteComment(Comment comment) {
		sessionFactory.getCurrentSession().delete(comment);

	}
}
