package FirstClassSelenium.FirstClassSelenium;

 
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.testng.Assert.assertEquals;

import org.json.simple.JSONObject;

public class RestAPIExcercises {

	//@Test
	public void getSingleUser() {
		RequestSpecification request=RestAssured.given();
		/*request.header("Content-Type","application/json");
		JSONObject json=new JSONObject();
		
		json.put(id, value)*/
		Response response=request.get("https://reqres.in/api/users/2");
		int code=response.getStatusCode();
		int expectedCode=200;
	//	System.out.println(code);
		assertEquals(code, expectedCode,"The actual code is "+code+" and the expected code should be "+expectedCode);
	}
	@Test
	public void SingleUserNotFound() {
		RequestSpecification request=RestAssured.given();
		
		Response response=request.get("https://reqres.in/api/users/23");
		int code=response.getStatusCode();
		int expectedCode=404;
		assertEquals(code, expectedCode,"The actual code is "+code+" and the expected code should be "+expectedCode);
	}

  //@Test
	public void GetExchange_SendingParam_authnticationKey() {
		RequestSpecification request=RestAssured.given();

		
		String url="https://currency-exchange.p.rapidapi.com/exchange";
		//String[] params={"q": "1.0","from": "SGD","to": "MYR"};
		request.header("x-rapidapi-host","currency-exchange.p.rapidapi.com");
		request.header("x-rapidapi-key","1e47c82255msh0f5dbe48bf95aaep1f153ajsn0985dd780321");
		request.param("q", "1.0");
		request.param("from", "SGD");
		request.param("to", "MYR");
		
		
		Response response=request.get(url);
		System.out.println(response.contentType().toString());
		System.out.println(response.headers());
		System.out.println(response.asString());
		int code=response.getStatusCode();
		int expectedCode=200;
		
		assertEquals(code, expectedCode,"The actual code is "+code+" and the expected code should be "+expectedCode);
	}
	
	//@Test
	public void GetListQuotes_SendingParam_authnticationKey() {
		RequestSpecification request=RestAssured.given();

		
		String url="https://currency-exchange.p.rapidapi.com/listquotes";
		request.header("x-rapidapi-host","currency-exchange.p.rapidapi.com");
		request.header("x-rapidapi-key","1e47c82255msh0f5dbe48bf95aaep1f153ajsn0985dd780321");
		
		Response response=request.get(url);
		//System.out.println(response.contentType().toString());
		//System.out.println(response.headers());
		System.out.println(response.asString());
		int code=response.getStatusCode();
		int expectedCode=200;
		
		assertEquals(code, expectedCode,"The actual code is "+code+" and the expected code should be "+expectedCode);
	}
	
	//@Test
	public void Wordsapi_GetHasTypes_authnticationKey() {
		RequestSpecification request=RestAssured.given();

		
		String url="https://wordsapiv1.p.rapidapi.com/words/hatchback/typeOf";
		request.header("x-rapidapi-host","wordsapiv1.p.rapidapi.com");
		request.header("x-rapidapi-key","1e47c82255msh0f5dbe48bf95aaep1f153ajsn0985dd780321");
		
		Response response=request.get(url);
		//System.out.println(response.contentType().toString());
		//System.out.println(response.headers());
		System.out.println(response.asString());
		int code=response.getStatusCode();
		int expectedCode=200;
		
		assertEquals(code, expectedCode,"The actual code is "+code+" and the expected code should be "+expectedCode);
	}
	
	//@Test
	public void postJason() {
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("id","207");
		json.put("title","KannanTitle");
		json.put("author","Unni Kannan");
		
		request.body(json.toJSONString());
		
		Response response=request.post("https://jsonplaceholder.typicode.com/posts");
		int code=response.getStatusCode();
		System.out.println(code);
	}
	
	//@Test
	public void putJason() {
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("id","207");
		json.put("title","RajesTitle");
		json.put("author","Unni Kannan");
		
		request.body(json.toJSONString());
		
		Response response=request.put("https://jsonplaceholder.typicode.com/posts/7");
		int code=response.getStatusCode();
		System.out.println(code);
	}
}
