package com.pom.selenium.amazon;

import org.openqa.selenium.WebDriver;

public class WebsiteLaunch {
	WebDriver driver;
	public WebsiteLaunch(WebDriver driver) {
		this.driver = driver;
	}
	public void launchWebsite() {
		driver.get("https://www.amazon.co.za");
		driver.manage().window().maximize();
		System.out.println("Step 1::: Launch Website... Done");
	}}
