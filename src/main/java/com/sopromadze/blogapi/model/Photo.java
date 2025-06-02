package com.sopromadze.blogapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sopromadze.blogapi.model.audit.UserDateAudit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Photo extends UserDateAudit {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotBlank
	private String title;

	@NotBlank
	private String url;

	@NotBlank
	private String thumbnailUrl;

	private Album album;

	public Photo(@NotBlank String title, @NotBlank String url, @NotBlank String thumbnailUrl, Album album) {
		this.title = title;
		this.url = url;
		this.thumbnailUrl = thumbnailUrl;
		this.album = album;
	}

	@JsonIgnore
	public Album getAlbum() {
		return album;
	}
}
