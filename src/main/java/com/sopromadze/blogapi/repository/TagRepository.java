package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Tag;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TagRepository {
    public Tag findByName(String name) {
		throw new NotImplementedException("TODO");
    }

    public Page<Tag> findAll(Pageable pageable) {
		throw new NotImplementedException("TODO");
    }

	public Optional<Object> findById(Long id) {
		throw new NotImplementedException("TODO");
	}

	public Tag save(Tag tag) {
		return tag;
	}

	public void deleteById(Long id) {
	}
}
