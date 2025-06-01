package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Album;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

@Repository
public class AlbumRepository {
    public Page<Album> findByCreatedBy(Long userId, Pageable pageable) {
		Album album = new Album();
        return new PageImpl<Album>(Collections.singletonList(album));
    }

    public Optional<Object> findById(@NotNull Long albumId) {
        throw new NotImplementedException("TODO");
    }

    public Page<Album> findAll(Pageable pageable) {
        throw new NotImplementedException("TODO");
    }

    public Album save(Album album) {
        return album;
    }

    public void deleteById(Long id) {

    }
}
