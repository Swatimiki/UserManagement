package StepDef;

import java.io.FileNotFoundException;

import Sprint.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyPostFeature {
	@Given("calling Post Method")
	public void calling_post_method() throws FileNotFoundException {
		User obj = new User();
		obj.PostMethod();
	    
	}

	@Then("User Created Successfully")
	public void user_created_successfully() {
		System.out.println("User Created Successfully");
	    
	}

}
