package com.db.billingservice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAppTestCase {

	@Test
	public void testGooglePage() {
		boolean expectedResult = true;
		boolean actualResult = false;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanid\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://junit.org/junit5");
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[2]/a"));
		element.click();
		WebElement texel = driver.findElement(By.xpath("//*[text()='Overview']"));
		actualResult = texel != null? true:false;
		assertEquals(actualResult, expectedResult);
		assertEquals(driver.getTitle(), "Overview (JUnit 5.7.0 API)");
		driver.close();
	}
	
}
