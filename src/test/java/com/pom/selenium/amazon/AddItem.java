package com.pom.selenium.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItem {
	WebDriver driver;
	public AddItem(WebDriver driver) throws InterruptedException {
		this.driver = driver;
	}
	public void addItem() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Smeg 2400W Electric Kettle Black");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='a-autoid-1-announce']")).click();
		System.out.println("Step 2::: Added Smeg kettle to Cart... Done");
	}}
