package com.myapp;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.myapp.sbtestapp.MyController;
import com.myapp.sbtestapp.SBBean;

@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(MyController.class)
//@SpringBootTest
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
//@ContextConfiguration
@WebAppConfiguration
public class MyControllerSpringTest {

	 @Autowired
	 private MockMvc mvc;
	 
	 @MockBean
	 private SBBean sbBean;
	
	 @Test
	 public void test_spring() throws Exception{
		 
		 when(sbBean.getName()).thenReturn("test");
		 
		 this.mvc.perform(get("/test"))
		 	.andExpect(status().isOk());
		 
		/* mvc.perform(get("/test").accept(MediaType.APPLICATION_JSON))
		 	.andExpect(status().isOk());*/
		 	
		 	//.andExpect((jsonPath("$.springContext", is("test"))));
		 
		 
	 }
	
}
