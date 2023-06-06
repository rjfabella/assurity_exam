package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class assurity {
	
	@Test
	public void responseValidation() {
		
		//Set base URI and verify response code
		baseURI = "https://api.tmsandbox.co.nz/v1/Categories/6329/Details.json?catalogue=false";
		get().then().statusCode(200).contentType(ContentType.JSON);

		//Verify Name and CanRelist values in response body
		get().then().body("Name", equalTo("Home & garden"));
		System.out.println("Acceptance Criteria 1 - PASS: 'Name' element has verified!");
		get().then().body("CanRelist", is(true)).log();
		System.out.println("Acceptance Criteria 2 - PASS: 'CanRelist' element has been verified!");	
			
		//Capture Promotions list 'Name' and 'Description'
		JsonPath jsonPathEvaluator = get().jsonPath();
		List<String> promotionsName = jsonPathEvaluator.getList("Promotions.Name");
		List<String> promotionsDescription = jsonPathEvaluator.getList("Promotions.Description");
		
		//Verify a Name with required Description exist on Promotions list
		for(int ctr = 0; ctr < promotionsName.size(); ctr++)
		{	
			if (promotionsName.get(ctr).equals("Feature") ) {
				if (!promotionsDescription.get(ctr).equals("Better position in category") ) {
					Assert.fail("'Feature' promotion does not have exptected description");
				} else {
					System.out.println("Acceptance Criteria 3 - PASS: Promotion named 'Feature' has been verified!");
				}
			}
		}
	}
	

}
