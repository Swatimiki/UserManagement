package StepDef;

import java.io.FileNotFoundException;

import Sprint.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class VerifyGetFeature {
	@Given("calling Get Method")
	public void calling_get_method() {
	    User obj = new User();
	    obj.GetMethod();
	}
	
	@Then("Execcuted Successfully")
	public void execcuted_successfully() {
		System.out.println("Get Method Executed succesfully");
	
	}

}
