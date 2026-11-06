package com.example.student;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testAddStudent() throws Exception {

        mockMvc.perform(post("/students/add")
            .contentType("application/json")
            .content("{\"name\":\"Jyothika\",\"marks\":90}"))

            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name").value("Jyothika"));
    }
}