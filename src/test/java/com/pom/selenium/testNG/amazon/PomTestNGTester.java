package com.pom.selenium.testNG.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

import com.pom.selenium.amazon.AddItem;
import com.pom.selenium.amazon.GotoCartAndValidateItem;
import com.pom.selenium.amazon.WebsiteLaunch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomTestNGTester {
	WebDriver driver;

	@BeforeSuite
	public void startDriver() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		System.out.println("Invoking Before Test");
		Thread.sleep(1000);
	}

	@Test
	public void searchSmegKettle() throws InterruptedException {
		WebsiteLaunch websiteLauncher = new WebsiteLaunch(driver);
		AddItem addItem = new AddItem(driver);
		GotoCartAndValidateItem cartValidate = new GotoCartAndValidateItem(driver);

		websiteLauncher.launchWebsite();
		Thread.sleep(2000);

		addItem.addItem();
		Thread.sleep(8000);

		cartValidate.validateCart();
		Thread.sleep(10000);

	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Invoking AfterTest");
		driver.quit();
	}

}