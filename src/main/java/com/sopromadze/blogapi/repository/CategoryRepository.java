package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Category;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoryRepository {

    public Optional<Object> findById(Long id) {
        throw new NotImplementedException("TODO");
    }

    public Page<Category> findAll(Pageable pageable) {
        throw new NotImplementedException("TODO");
    }

    public Category save(Category category) {
        return category;
    }

    public void deleteById(Long id) {
    }
}
