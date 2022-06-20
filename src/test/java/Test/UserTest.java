package Test;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import Sprint.User;

public class UserTest {
	
	@Test(priority=2)
	public void GetMethod()
	{
		User obj = new User();
		obj.GetMethod();
	}
	@Test(priority=1)
	public void PostMethod() throws FileNotFoundException
	{
		User obj = new User();
		obj.PostMethod();
	}
	
	@Test(priority=3)
	public void PutMethod() throws FileNotFoundException
	{
		User obj = new User();
		obj.PutMethod();
	}
	
	@Test
	public void DeleteMethod()
	{
		User obj = new User();
		obj.DeleteMethod();
	}

}
