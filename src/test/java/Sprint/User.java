package Sprint;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import io.restassured.RestAssured;

public class User {
	
	public void GetMethod()
	{
		RestAssured.given().baseUri("http://localhost:8081").when().log().all()
		.get("/users").then().log().all().assertThat().statusCode(200);
	}
	public void PostMethod() throws FileNotFoundException
	{
		 RestAssured.given().baseUri("http://localhost:8081")
		   .body(getFileContent("C:\\swati\\UserManagement\\src\\test\\resources\\CreateUser.txt"))
		   .header("Accept","application/json").header("Content-Type","application/json")
		  .when().log().all().post("/user").then().log().all().assertThat();
	}
	public void PutMethod() throws FileNotFoundException
	{
		  RestAssured.given().baseUri("http://localhost:8081")
		   .body(getFileContent("C:\\swati\\UserManagement\\src\\test\\resources\\PutUser.txt"))
		   .header("Accept","application/json").header("Content-Type","application/json")
		   .when().log().all().put("/user/103").then().log().all().assertThat();
	}
	public void DeleteMethod()
	{
		RestAssured.given().baseUri("http://localhost:8081").when().log().all()
		.delete("/user/110").then().log().all().assertThat().statusCode(204);
	}
	public static String getFileContent(String filePath) throws FileNotFoundException 
	   {
	       File file = new File(filePath);
	       Scanner sc = new Scanner(file);
	       sc.useDelimiter("\\Z");
	       return sc.next();
	   }

}
