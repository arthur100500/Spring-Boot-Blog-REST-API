package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Comment;
import com.sopromadze.blogapi.model.Post;
import com.sopromadze.blogapi.model.user.User;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

@Repository
public class CommentRepository {
    public Page<Comment> findByPostId(Long postId, Pageable pageable) {
        return new PageImpl<>(Collections.singletonList(new Comment("hello there!")));
    }

	public Comment save(Comment comment) {
		return comment;
	}

	public Optional<Object> findById(Long id) {
		User user = new User();
		user.setId(1L);
		Post post = new Post();
		post.setId(33L);
		post.setTitle("Post title (from comment repo)");
		post.setBody("Post body (from comment)");
		Comment comment = new Comment();
		comment.setId(id);
		comment.setName("Comment name");
		comment.setBody("Comment body");
		comment.setPost(post);
		comment.setUser(user);
		post.setComments(Collections.singletonList(comment));
		return Optional.of(comment);
	}

	public void deleteById(Long id) {
	}
}
