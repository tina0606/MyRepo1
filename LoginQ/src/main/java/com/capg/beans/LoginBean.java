package com.capg.beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginBean {

	
	
	@FindBy(how=How.NAME,name="username")
	private WebElement Username;
	
	@FindBy(how=How.NAME,name="password")
	private WebElement Password;
	

	@FindBy(how=How.NAME,name="Login")
	private WebElement submit;
	
	public LoginBean()
	{
		
	}
	public void submitclick()
	{
		submit.click();
	}
	
	
	public String getUsername() {
		return Username.getAttribute("username");
	}

	public void setUsername(String username) {
		this.Username.sendKeys(username);
	}

	public String getPassword() {
		return Password.getAttribute("password");
	}

	public void setPassword(String password) {
		this.Password.sendKeys(password);
	}

	

	
}
