package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Post;
import com.sopromadze.blogapi.model.Tag;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository {
    public Page<Post> findByCreatedBy(Long userId, Pageable pageable) {
        return null;
    }

    public Page<Post> findByCategory(Long categoryId, Pageable pageable) {
        return null;
    }

    public Page<Post> findByTags(List<Tag> tags, Pageable pageable) {
        return null;
    }

    public Long countByCreatedBy(Long userId) {
        return null;
    }

    public Optional<Object> findById(Long postId) {
        throw new NotImplementedException("TODO");
    }

    public Post save(Post post) {
        return post;
    }

    public void deleteById(Long id) {
    }

    public Page<Post> findAll(Pageable pageable) {
        throw new NotImplementedException("TODO");
    }
}
