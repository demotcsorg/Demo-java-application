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
		Assertions.assertEquals("Hello Daily Code Buffer!", obj.getMessage("Daily Buffer"));
	}

}
