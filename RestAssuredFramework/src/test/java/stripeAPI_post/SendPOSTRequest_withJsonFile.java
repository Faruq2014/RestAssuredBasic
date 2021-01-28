package stripeAPI_post;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPOSTRequest_withJsonFile {
	
	
@Test
public void JsonFile() {
//it will not create duplicate id by the server. so change the id appropriately. 
	Response response = given().contentType(ContentType.JSON)
			.body(new File("./users.json")).log().all()  //log().all() will print everything
			.post("http://localhost:3000/student");
	response.prettyPrint();
	System.out.println(response.getStatusCode());
}


@Test(priority=0)
public void JsonFileGet_Without_Log_All() {
System.err.println("JsonFileGet_Without_Log_All  >>>>>>>>>>>>>>>>>>>>>>>>>>>");
	Response response = given().contentType(ContentType.JSON)
			.body(new File("./users.json"))         //.log().all()  //log().all() will print everything
			.get("http://localhost:3000/student");
	response.prettyPrint();
	System.out.println(response.getStatusCode());
}


@Test(priority=1)
public void JsonFileGet_WithLog_All() {
	System.err.println("JsonFileGet_With_Log_All  >>>>>>>>>>>>>>>>>>>>>>>>>>>");
	Response response = given().contentType(ContentType.JSON)
			.body(new File("./users.json")).log().all()  //log().all() will print everything
			.get("http://localhost:3000/student");
	response.prettyPrint();
	System.out.println(response.getStatusCode());
}




}
