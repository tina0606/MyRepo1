package com.capg.seleniumq;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GitHubTest {

	static WebDriver driver;

	@Before
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void Testgithub()
	{
		try {
			i_have_a_github_login_account();
			i_give_correct_username_and_password();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Given("^I have a github login account$")
	public static void i_have_a_github_login_account() throws Throwable {
//		driver.get("https://github.com/login");
	}
	@When("^I give correct username and password$")
	public static void i_give_correct_username_and_password() throws Throwable {
//		driver.findElement(By.id("login_field")).sendKeys("alekyaraju18");
//		driver.findElement(By.id("password")).sendKeys("Kvln@1896");
//		driver.findElement(By.name("commit")).click();
		
		//driver.get("https://github.com/logout");
         //driver.findElement(By.className("btn btn-block f4 py-3 mt-5")).click();
		//driver.findElement(By.className("sr-only right-0")).click();
	}
	@Then("^the result should be logged in page$")
	public void the_result_should_be_logged_in_page() throws Throwable {
		
	}
}
