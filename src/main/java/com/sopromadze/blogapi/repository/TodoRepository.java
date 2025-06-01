package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Todo;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TodoRepository {
    public Page<Todo> findByCreatedBy(Long userId, Pageable pageable) {
		throw new NotImplementedException("TODO");
    }

	public Todo save(Todo todo) {
		return todo;
	}

	public Optional<Object> findById(Long id) {
		throw new NotImplementedException("TODO");
	}

	public void deleteById(Long id) {

	}
}
