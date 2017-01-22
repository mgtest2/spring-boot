package com.myapp;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.myapp.sbtestapp.Application;
import com.myapp.sbtestapp.MyController;
import com.myapp.sbtestapp.MyDTO;
import com.myapp.sbtestapp.SBBean;

@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)

public class MyControllerSpringTest {

	 @Autowired
	 private MockMvc mvc;
	 
	 @MockBean
	 private MyDTO myDTO;
	 
	 @MockBean
	 private SBBean sbBean;
	
	 @Test
	 public void test_spring() throws Exception{
		 
		/* when(sbBean.getName()).thenReturn("test");*/
		 
		/* mvc.perform(get("/test").accept(MediaType.TEXT_PLAIN))
		 	.andExpect(status().isOk())
		 	.andExpect((jsonPath("$.springContext", is("test"))));*/
		 
		 
	 }
	
}
