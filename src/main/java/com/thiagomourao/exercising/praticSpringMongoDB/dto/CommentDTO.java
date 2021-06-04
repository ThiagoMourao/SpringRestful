package com.thiagomourao.exercising.praticSpringMongoDB.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO authorDto;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date date, AuthorDTO authorDto) {
		super();
		this.text = text;
		this.date = date;
		this.authorDto = authorDto;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthorDto() {
		return authorDto;
	}

	public void setAuthorDto(AuthorDTO authorDto) {
		this.authorDto = authorDto;
	}
	

}
