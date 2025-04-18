package com.pom.selenium.amazon;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GotoCartAndValidateItem {
	WebDriver driver;
	
	public GotoCartAndValidateItem(WebDriver driver) {
		this.driver = driver;
	}
	
	public void validateCart() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
//		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@class='a-truncate-cut']")).getText();
		System.out.println(text);
		assertEquals(text, "Black Retro Electric Variable Kettle 1.7 Litre Capacity ~ 2400w");
//		assertTrue(Pattern.compile("Black Retro Electric *").matcher(text).matches());
		System.out.println("-------Asserted that selected kettle matches the text that we wanted using the REGEX");
		System.out.println("Step 3::: Verified and asserted that selected kettle matches the text that we wanted... Done");

	}
}
