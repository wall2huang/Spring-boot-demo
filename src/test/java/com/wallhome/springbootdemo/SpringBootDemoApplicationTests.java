package com.wallhome.springbootdemo;

import com.wallhome.springbootdemo.controller.UserController;
import org.assertj.core.util.Lists;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.lang.reflect.Field;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	MockMvc mvc;

	@Before
	public void setUp()
	{
		mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
	}

	@Test
	public void contextLoads() throws Exception
	{

		RequestBuilder requert = null;

		requert = MockMvcRequestBuilders.get("/user/");

		mvc.perform(requert)
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("success")));

	}


}
