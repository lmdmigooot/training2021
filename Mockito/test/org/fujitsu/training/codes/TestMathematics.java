package org.fujitsu.training.codes;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class TestMathematics {
	
	@Mock
	private Mathematics math;
	
	@Mock
	private ArrayList<String> arrList = new ArrayList<>();
	
	
	@BeforeEach
	public void setup() {
		
	}
	
	@AfterEach
	public void teardown() {

	}
	
	@Test
	public void testDiv01() {
		
		when(math.div(10, 10)).thenReturn(10); //Strict on return type
		when(math.div(10, 0)).thenReturn(0);
		when(math.div(10, 50)).thenReturn(60);
		when(math.div(10, 60)).thenReturn(70);
		
		System.out.println(math.div(10, 10));//can be assert or SOut
		System.out.println(math.div(10, 0));
		System.out.println(math.div(10, 50));
		System.out.println(math.div(10, 60));
		
		
	}

	@Test
	public void testDiv02() {
		//use on Object return type
		doReturn(100).when(arrList).get(0); //not strict on return type
		Assertions.assertEquals("Fe", arrList.get(0));
	}
	
	@Test
	public void testDiv03() {
		
		when(math.div(10, 2)).thenThrow(ArithmeticException.class);
		
		Assertions.assertThrows(ArithmeticException.class, ()->{
			math.div(10, 2);
		});
	}
	
	@Test
	public void testDiv04() {
		//doNothing().when(math).display();
	}
}
