package com.myapp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

import org.springframework.test.util.ReflectionTestUtils;

import com.myapp.sbtestapp.MyController;
import com.myapp.sbtestapp.MyDTO;
import com.myapp.sbtestapp.SBBean;


public class MyControllerTest {

	@Test
	public void test(){
		
		MyController controller = new MyController();
		ReflectionTestUtils.setField(controller, "myDTO", new MyDTO()); 
		SBBean sbBean = mock(SBBean.class);
		when(sbBean.getName()).thenReturn("test");
		ReflectionTestUtils.setField(controller, "sbBean", sbBean); 
		
		
		MyDTO dto = controller.testController();
		
		
		assertEquals("set to dto", dto.getName());
		assertEquals("test", dto.getSpringContext());
	}
	
}
