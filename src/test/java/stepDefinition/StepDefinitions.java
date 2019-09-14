package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@Given("^User is provided with an end point for customers search$")
	public void user_is_provided_with_an_end_point_for_customers_search() throws Throwable {
	    System.out.println("Running the step: User is provided with an end point for customers search");
	    for(int i=1;i<=5;i++)
	    {
	    	Thread.sleep(1000);
	    	System.out.println("Tick Tick " +i);
	    }
	}

	@When("^User hits the end point with GET request$")
	public void user_hits_the_end_point_with_GET_request() throws Throwable {
		System.out.println("Running the step: User hits the end point with GET request");
		for(int i=1;i<=5;i++)
	    {
	    	Thread.sleep(1000);
	    	System.out.println("Tick Tick " +i);
	    }
	}

	@Then("^the API should respond with all the customers data$")
	public void the_API_should_respond_with_all_the_customers_data() throws Throwable {
		System.out.println("Running the Step: the API should respond with all the customers data");
		for(int i=1;i<=5;i++)
	    {
	    	Thread.sleep(1000);
	    	System.out.println("Tick Tick " +i);
	    }
	}

	@When("^User hits the end point with GET request with (\\d+)$")
	public void user_hits_the_end_point_with_GET_request_with(int custId) throws Throwable {
		System.out.println("Running the Step: User hits the end point with GET request with "+custId); 
		for(int i=1;i<=5;i++)
	    {
	    	Thread.sleep(1000);
	    	System.out.println("Tick Tick " +i);
	    }
	}
}
