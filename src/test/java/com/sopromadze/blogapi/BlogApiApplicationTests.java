package com.sopromadze.blogapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sopromadze.blogapi.payload.CommentRequest;
import com.sopromadze.blogapi.security.UserPrincipal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.servlet.ServletException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@AutoConfigureMockMvc
@SpringBootTest(classes = { BlogApiApplication.class })
@RunWith(SpringRunner.class)
@DisabledInAotMode
@TestPropertySource(properties = {
		"spring.sql.init.mode=never",
		"spring.jpa.hibernate.ddl-auto=create-drop",
		"spring.jpa.defer-datasource-initialization=true"
})
public class BlogApiApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@PersistenceContext
	private EntityManager entityManager;


	@Test
	public void contextLoads() {
	}

	@Test
	@Transactional
	public void updateComment() throws Exception {
		CommentRequest v = new CommentRequest();
		String warningText = "MUST NOT APPEAR IN TEST!";
		new Object();
		ArrayList<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		String[] v2 = new String[2];
		v2[0] = "33";
		v2[1] = "33";
		UserDetails userDetails = new UserPrincipal(
				1L,
				"First name",
				"Last name",
				"Username",
				"Email@email.com",
				"Password213",
				authorities
		);
		Object response = this.mockMvc.perform(
				MockMvcRequestBuilders.put("/api/posts/{postId}/comments/{id}", v2)
						.content(new ObjectMapper().writeValueAsString(v))
						.contentType(MediaType.APPLICATION_JSON)
						.with(SecurityMockMvcRequestPostProcessors.user(userDetails))
		);
	}

	@Test
	public void updateComment2() throws Exception {
		CommentRequest v3 = new CommentRequest();
		ReflectionTestUtils.setField(v3, "body", "aLLLLLLLLL");
		UserPrincipal v4 = ReflectionUtils.allocateInstance(UserPrincipal.class);
		ReflectionTestUtils.setField(v4, "id", null);
		ReflectionTestUtils.setField(v4, "firstName", null);
		ReflectionTestUtils.setField(v4, "lastName", null);
		ReflectionTestUtils.setField(v4, "username", "Test user");
		ReflectionTestUtils.setField(v4, "email", null);
		ReflectionTestUtils.setField(v4, "password", "Test password");
		ArrayList<Object> v5 = new ArrayList<Object>();
		SimpleGrantedAuthority v6 = ReflectionUtils.allocateInstance(SimpleGrantedAuthority.class);
		ReflectionTestUtils.setField(v6, "role", "ROL");
		SimpleGrantedAuthority v7 = ReflectionUtils.<SimpleGrantedAuthority>allocateInstance(SimpleGrantedAuthority.class);
		ReflectionTestUtils.setField(v7, "role", "");
		SimpleGrantedAuthority v8 = ReflectionUtils.<SimpleGrantedAuthority>allocateInstance(SimpleGrantedAuthority.class);
		ReflectionTestUtils.setField(v8, "role", "ROLE_USER");
		v5.add(v6);
		v5.add(v7);
		v5.add(v8);
		ReflectionTestUtils.setField(v4, "authorities", v5);
		Object[] v9 = new Object[2];
		v9[0] = 0L;
		v9[1] = 0L;
		Assertions.assertThrows(ServletException.class, () -> {
			this.mockMvc.perform(MockMvcRequestBuilders.put("/api/posts/{postId}/comments/{id}", v9).content(new ObjectMapper().writeValueAsString(v3)).with(SecurityMockMvcRequestPostProcessors.user(v4)).contentType(MediaType.APPLICATION_JSON));
		});
	}

}
