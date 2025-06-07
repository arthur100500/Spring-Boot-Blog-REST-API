package com.sopromadze.blogapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sopromadze.blogapi.config.SecurityConfig;
import com.sopromadze.blogapi.payload.CommentRequest;
import com.sopromadze.blogapi.security.UserPrincipal;
import jakarta.servlet.ServletException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.context.TestContextManager;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@RunWith(SpringRunner.class)
@DisabledInAotMode
@SpringBootTest(classes = BlogApiApplication.class)
@AutoConfigureMockMvc
public class BlogApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Test
    void updateComment() throws InstantiationException, Exception, JsonProcessingException {
        CommentRequest v = ReflectionUtils.<CommentRequest>allocateInstance(CommentRequest.class);
        String warningText = "MUST NOT APPEAR IN TEST!";
        new Object();
        ArrayList<GrantedAuthority> v1 = new ArrayList<GrantedAuthority>();
        v1.add(new SimpleGrantedAuthority("ROLE_USER"));
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
                v1
        );
        Object response = this.mockMvc.perform(
                MockMvcRequestBuilders.put("/api/posts/{postId}/comments/{id}", v2)
                        .content(new ObjectMapper().writeValueAsString(v))
                        .contentType(MediaType.APPLICATION_JSON)
                        .with(SecurityMockMvcRequestPostProcessors.user(userDetails))
        );
    }


}
