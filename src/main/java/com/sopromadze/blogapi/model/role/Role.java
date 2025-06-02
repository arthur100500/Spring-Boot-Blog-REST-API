package com.sopromadze.blogapi.model.role;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Role {
	private Long id;

	private RoleName name;

	public Role(RoleName name) {
		this.name = name;
	}
}
