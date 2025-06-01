package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.exception.ResourceNotFoundException;
import com.sopromadze.blogapi.model.user.User;
import com.sopromadze.blogapi.security.UserPrincipal;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Repository
public class UserRepository {
    public Optional<User> findByUsername(@NotBlank String username) {
		throw new NotImplementedException("TODO");
    }

    Optional<User> findByEmail(@NotBlank String email) {
		throw new NotImplementedException("TODO");
    }

    public Boolean existsByUsername(@NotBlank String username) {
		throw new NotImplementedException("TODO");
    }

    public Boolean existsByEmail(@NotBlank String email) {
		throw new NotImplementedException("TODO");
    }

    public Optional<User> findByUsernameOrEmail(String username, String email) {
		throw new NotImplementedException("TODO");
    }

    public User getUser(UserPrincipal currentUser) {
		return getUserByName(currentUser.getUsername());
	}

	public User getUserByName(String username) {
		return findByUsername(username)
				.orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
	}

    public User save(User user) {
		return user;
    }

	public void deleteById(Long id) {
	}

	public Optional<Object> findById(Long id) {
		throw new NotImplementedException("TODO");
	}

	public int count() {
		throw new NotImplementedException("TODO");
	}
}
