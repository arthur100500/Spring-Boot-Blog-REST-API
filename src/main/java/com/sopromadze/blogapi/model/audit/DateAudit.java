package com.sopromadze.blogapi.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
@JsonIgnoreProperties(
		value = { "createdAt", "updatedAt" },
		allowGetters = true
)
public abstract class DateAudit implements Serializable {

	private static final long serialVersionUID = 1L;

	private Instant createdAt;

	private Instant updatedAt;

}
