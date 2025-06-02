package com.sopromadze.blogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopromadze.blogapi.model.audit.UserDateAudit;
import com.sopromadze.blogapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import jakarta.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
public class Todo extends UserDateAudit {

	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank
	private String title;

	private Boolean completed;

	private User user;

	@JsonIgnore
	public User getUser() {
		return user;
	}
}
