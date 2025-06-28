package com.example.webapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, World!")));
	}

	@Test
	public void shouldReturnName() throws Exception {
		this.mockMvc.perform(get("/jorge")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Jorge!")));
	}

	@Test
	public void shouldReturnAlguem() throws Exception {
		this.mockMvc.perform(get("/alguem")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Alguém!")));
	}

	@Test
	public void shouldReturnNinguem() throws Exception {
		this.mockMvc.perform(get("/ninguem")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Ninguém!")));
	}
	
	@Test
	public void shouldReturnSomeone() throws Exception {
		this.mockMvc.perform(get("/someone")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, Someone!")));
	}
}