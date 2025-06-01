package com.sopromadze.blogapi.repository;

import com.sopromadze.blogapi.model.Album;
import com.sopromadze.blogapi.model.Photo;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

@Repository
public class PhotoRepository {
    public Page<Photo> findByAlbumId(Long albumId, Pageable pageable) {
		Album album = new Album();
		Photo photo = new Photo("sample title", "some url", "thumb", album);
        return new PageImpl<>(Collections.singletonList(photo));
    }

    public Page<Photo> findAll(Pageable pageable) {
        throw new NotImplementedException("TODO");
    }

    public Optional<Object> findById(Long id) {
        throw new NotImplementedException("TODO");
    }

    public Photo save(Photo photo) {
        return photo;
    }

    public void deleteById(Long id) {
    }
}
