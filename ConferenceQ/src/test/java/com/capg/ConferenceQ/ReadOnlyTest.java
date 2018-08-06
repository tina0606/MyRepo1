package com.capg.ConferenceQ;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadOnlyTest {

	WebDriver driver;
	@Test
	public void ExampleForAlert() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","D:\\Srinivas\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8089/ConferenceW/txt.html");
			
			WebElement str=driver.findElement(By.name("name"));
			System.out.println("Read Only is"+str.getAttribute("value"));
			assertEquals("capgemini",str.getAttribute("value"));
			

}
}