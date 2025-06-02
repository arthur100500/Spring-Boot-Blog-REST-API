package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Comment;
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
		throw new NotImplementedException("TODO");
	}

	public void deleteById(Long id) {
	}
}
