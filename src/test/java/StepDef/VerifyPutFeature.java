package StepDef;

import java.io.FileNotFoundException;

import Sprint.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPutFeature {

	@Given("calling Put Method")
	public void calling_put_method() throws FileNotFoundException {
	    User obj = new User();
	    obj.PutMethod();
	}

	@Then("Changes done Successfully")
	public void changes_done_successfully() {
		System.out.println("Put Method Executed Successfully");
	    
	}
}
