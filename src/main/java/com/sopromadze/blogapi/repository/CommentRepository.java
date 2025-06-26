package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	Page<Comment> findByPostId(Long postId, Pageable pageable);

	@Query("SELECT comment FROM Comment comment WHERE comment.id = :postId")
	Optional<Comment> findById(Long postId);

	Comment save(Comment comment);
}
