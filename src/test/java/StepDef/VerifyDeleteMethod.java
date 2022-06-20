package StepDef;

import Sprint.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyDeleteMethod {
	
	@Given("calling Delete Method")
	public void calling_delete_method() {
	    User obj = new User();
	    obj.DeleteMethod();
	}

	@Then("User Deleted Successfully")
	public void user_deleted_successfully() {
	    System.out.println("User Deleted Successfully");
	}
}
