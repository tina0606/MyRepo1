package com.capg.seleniumq;



import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {
	static Logger loge = Logger.getLogger(AlertExample.class.getName());
	WebDriver driver;
	@Test
	public void ExampleForAlert() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","D:\\Srinivas\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:4444/seleniumw/pitzza.html");
			WebElement element=driver.findElement(By.id("sel"));
			Select se=new Select(element);
			se.selectByVisibleText("Tomato");
			se.selectByVisibleText("Panner");
			List<WebElement> allSelectedOptions=se.getAllSelectedOptions();
			for(WebElement webElement:allSelectedOptions)
			{
				loge.info(""+webElement.getText());
			}
			Thread.sleep(2000);
			loge.info("done");
			driver.close();
		}
	}


//Select sauce=new Select(driver.findElement(By.id("sel")));
//			se.selectByIndex(2);
//			int i=0;
//			while(!sauce.getOptions().isEmpty())
//			{
//				loge.info(sauce.getAllSelectedOptions().get(i).getText());
//				sauce.deselectByIndex(i);
//				i++;
//			}
//		}
//		finally {
//			driver.close();
//		}



//		System.setProperty("webdriver.chrome.driver","D:\\Srinivas\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://localhost:4444/seleniumw/Alerts.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
//		Alert alert=driver.switchTo().alert();
//		loge.info(alert.getText());
//		alert.accept();
//		loge.info("Done");
	
		
		
//		driver.get("http://www.google.co.in");
//		Thread.sleep(2000);
//		driver.findElement(By.id("lst-ib")).sendKeys("mobile");
//		driver.findElement(By.name("btnK")).click();
//		loge.info("Done");
		
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.className("LM6RPg")).sendKeys("mobile");
//		driver.findElement(By.className("LM6RPg")).sendKeys("mobile");
		
		
