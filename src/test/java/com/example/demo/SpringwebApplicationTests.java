package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class SpringwebApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testNameDailyCodeBuffer()
	{
		Messages obj = new Messages();
		Assertions.assertEquals("Hello these texts should match!", obj.getMessage("these texts should match"));
	}
	@Test
	public void testNameBlank()
	{
		Messages obj = new Messages();
		Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
	}

	@Test
	public void testNameNull()
	{
		Messages obj = new Messages();
		Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
	}

}
