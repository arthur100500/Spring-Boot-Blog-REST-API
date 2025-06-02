package com.sopromadze.blogapi.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sopromadze.blogapi.model.Album;
import com.sopromadze.blogapi.model.audit.DateAudit;
import com.sopromadze.blogapi.model.Comment;
import com.sopromadze.blogapi.model.Post;
import com.sopromadze.blogapi.model.role.Role;
import com.sopromadze.blogapi.model.Todo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class User extends DateAudit {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank
	@Size(max = 40)
	private String firstName;

	@NotBlank
	@Size(max = 40)
	private String lastName;

	@NotBlank
	@Size(max = 15)
	private String username;

	@NotBlank
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@Size(max = 100)
	private String password;

	@NotBlank
	@Size(max = 40)
	@Email
	private String email;

	private Address address;

	private String phone;

	private String website;

	private List<Role> roles;

	@JsonIgnore
	private List<Todo> todos;

	@JsonIgnore
	private List<Album> albums;

	@JsonIgnore
	private List<Post> posts;

	@JsonIgnore
	private List<Comment> comments;

	private Company company;

	public User(String firstName, String lastName, String username, String email, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.password = password;
	}



	public List<Todo> getTodos() {

		return todos == null ? null : new ArrayList<>(todos);
	}

	public void setTodos(List<Todo> todos) {

		if (todos == null) {
			this.todos = null;
		} else {
			this.todos = Collections.unmodifiableList(todos);
		}
	}

	public List<Album> getAlbums() {

		return albums == null ? null : new ArrayList<>(albums);
	}

	public void setAlbums(List<Album> albums) {

		if (albums == null) {
			this.albums = null;
		} else {
			this.albums = Collections.unmodifiableList(albums);
		}
	}


	public List<Post> getPosts() {

		return posts == null ? null : new ArrayList<>(posts);
	}

	public void setPosts(List<Post> posts) {

		if (posts == null) {
			this.posts = null;
		} else {
			this.posts = Collections.unmodifiableList(posts);
		}
	}

	public List<Role> getRoles() {

		return roles == null ? null : new ArrayList<>(roles);
	}

	public void setRoles(List<Role> roles) {

		if (roles == null) {
			this.roles = null;
		} else {
			this.roles = Collections.unmodifiableList(roles);
		}
	}

	public List<Comment> getComments() {
		return comments == null ? null : new ArrayList<>(comments);
	}

	public void setComments(List<Comment> comments) {

		if (comments == null) {
			this.comments = null;
		} else {
			this.comments = Collections.unmodifiableList(comments);
		}
	}
}
