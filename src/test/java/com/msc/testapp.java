package com.msc;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class testapp {
	@Test
	public void testLogin() {
		WebDriverManager.firefoxdriver().setup();
		WebDriverManager driver = new ChromeDriverManager();
		driver.get("https://google.com");
		Assert.assertEquals(driver.getTitle(),"Google");
		driver.close();
	}
}
