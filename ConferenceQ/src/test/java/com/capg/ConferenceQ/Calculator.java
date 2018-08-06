package com.capg.ConferenceQ;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Calculator {

	@Before
	public void beforeScenario()
	{
		System.out.println("before");
		
	}
@After
	public void afterScenario()
	{
	System.out.println("After");
	}
@Test
public void TestCal()
{
	try {
		i_want_to_add_two_numbers();
		to_add_and(2,5);
	    result_should_be(7);
	} catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	@Given("^I want to add two numbers$")
	public void i_want_to_add_two_numbers() throws Throwable {
	  System.out.println("The given numbers");  
	   
	}

	@When("^to add (\\d+) and (\\d+)$")
	public void to_add_and(int arg1, int arg2) throws Throwable {
		System.out.println("The numbers");  
	    
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
		System.out.println("The result is"); 
	 
	}

}
