package com.daniel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.daniel.DanielApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DanielApplication.class)
@WebAppConfiguration
public class DanielApplicationTests {

	@Test
	public void contextLoads() {
	}

}
