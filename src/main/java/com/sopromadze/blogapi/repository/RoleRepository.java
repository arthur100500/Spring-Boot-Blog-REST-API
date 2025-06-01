package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.role.Role;
import com.sopromadze.blogapi.model.role.RoleName;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RoleRepository {
    public Optional<Role> findByName(RoleName name) {
		throw new NotImplementedException("TODO");
    }
}
