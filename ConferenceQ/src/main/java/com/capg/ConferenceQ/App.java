package com.capg.ConferenceQ;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App 
{
WebDriver driver;
@Test
public void ExampleForAlert() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","D:\\Srinivas\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8089/ConferenceW/ConferenceRegistartion.html");

		Thread.sleep(2000);
		driver.findElement(By.id("txtFirstName")).sendKeys("Alekya");
		driver.findElement(By.id("txtLastName")).sendKeys("Raju");
		driver.findElement(By.id("txtEmail")).sendKeys("alekya@mail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9587463210");
		
		WebElement element=driver.findElement(By.name("size"));
		Select se=new Select(element);
		se.selectByValue("two");
		
		driver.findElement(By.id("txtAddress1")).sendKeys("52 Apartments");
		driver.findElement(By.id("txtAddress2")).sendKeys("ECIL");
		
		WebElement element1=driver.findElement(By.name("city"));
		Select se1=new Select(element1);
		se1.selectByValue("Chennai");
		
		WebElement element2=driver.findElement(By.name("state"));
		Select se2=new Select(element2);
		se2.selectByValue("Tamilnadu");
		
		driver.findElement(By.name("memberStatus")).click();
		
		 driver.findElement(By.linkText("Next")).click();	
		
		 Alert alt = driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.id("txtCardholderName")).sendKeys("Alekya");
		driver.findElement(By.id("txtDebit")).sendKeys("154278562");
		driver.findElement(By.id("txtCvv")).sendKeys("154");
			
		driver.findElement(By.id("txtMonth")).sendKeys("November");
		driver.findElement(By.id("txtYear")).sendKeys("2022");
		
		driver.findElement(By.id("btnPayment")).click();
		 Alert alt1 = driver.switchTo().alert();
			alt1.accept();
}
}