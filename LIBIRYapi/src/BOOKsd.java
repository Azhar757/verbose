


import static io.restassured.RestAssured.*;

import org.testng.annotations.*;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
@Test
public class  BOOKsd { 
	@Test(dataProvider="bookdata")
	static void m1(String isbnvalue, String aislevalue) {
 
	String Addbookresp=RestAssured.baseURI="http://216.10.245.166";
	given().log().all().body(payload22.bodyaddbook(isbnvalue,aislevalue)).
	
	when().log().all().post("Library/Addbook.php")
	.then().log().all().assertThat().statusCode(200).extract().response().asString();
	
	
	JsonPath js = new JsonPath(Addbookresp);
	String id=js.get("ID");
	
	
	
	
	}
	
	
	
@DataProvider(name="bookdata")	
static Object getdata() {
	
		
		return new Object[][] {{"asdDasve","fadfsD4e"},{"tvfaDdfs3e","dr4aesf"},{"sdfFr4se","asdfsDer5"}}; 
	}
	
	
	

}
