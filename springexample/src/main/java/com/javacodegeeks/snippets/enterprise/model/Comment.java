package com.javacodegeeks.snippets.enterprise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "COMENTARIOS")
public class Comment {
	
	@Id
	@Column(name = "idCOMENTARIO", nullable = false)
	private String id;
	
	@Column(name = "COM", nullable = false)
	private String com;
	
	@Column(name = "STATE", nullable = false)
	private long state;
	
	public Comment(){
		
	}

	public Comment(String id, String com, int state) {
		super();
		this.id = id;
		this.com = com;
		this.state = state;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public long getState() {
		return state;
	}

	public void setState(long state) {
		this.state = state;
	}
	
	
}
