package com.capg.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.capg.beans.LoginBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	private WebDriver driver;
    private LoginBean pageBean;
	@Before
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "D:\\Srinivas\\drivers\\chromedriver.exe");
		
	}
	
	@Given("^I want to login$")
	public void i_want_to_login() throws Throwable {
		driver = new ChromeDriver();
		driver.get("file:///D:/Alekya_Selenium/LoginQ/login.html");
		driver.manage().window().maximize();
		pageBean= new LoginBean();
		PageFactory.initElements(driver, pageBean);
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
	    pageBean.setUsername("Alekya");
	    pageBean.setPassword("aalu");
	    Thread.sleep(3000);
	    pageBean.submitclick();
	}

	@Then("^the result should be my login home page$")
	public void the_result_should_be_my_login_home_page() throws Throwable {
	  Assert.assertEquals("Google",driver.getTitle());
	
	}
	@After
	public void afterScenario()
	{
		driver.close();
	}
}
