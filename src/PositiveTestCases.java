import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.JSONObject;

public class PositiveTestCases {
	public static String data = null;
	public static void Validdata() throws IOException {
		String firstname = "John";
		String lastname = "Wick";
		String totalprice = "120";
		Boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Queen bed";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2018-01-01"); 
		bookingdates.put("checkout","2018-01-01");		
		 jsonData.put("firstname", firstname);
		 jsonData.put("lastname", lastname);
		 jsonData.put("totalprice", totalprice);
		 jsonData.put("depositpaid", depositpaid);		 
	     jsonData.put("bookingdates", bookingdates);
	     jsonData.put("additionalneeds", additionalneeds);		    
	     data = jsonData.toString();
	     System.out.println(data);
	     URL obj = new URL("https://restful-booker.herokuapp.com/booking");
	     HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		    postConnection.setRequestMethod("POST");
		    postConnection.setRequestProperty("Content-Type", "application/json");
		    postConnection.setRequestProperty("Accept", "application/json");

		    postConnection.setDoOutput(true);
		    OutputStream os = postConnection.getOutputStream();
		    os.write(data.getBytes());
		    os.flush();
		    os.close();

		   int responseCode = postConnection.getResponseCode();		   
		   System.out.println("POST Response Code :  " + responseCode);
		   System.out.println("POST Response Message : " + postConnection.getResponseMessage());
		   			    		    
		   if (responseCode == 200) { //success
		        BufferedReader in = new BufferedReader(new InputStreamReader(
		            postConnection.getInputStream()));
		        String inputLine;
		        StringBuffer response = new StringBuffer();

		        while ((inputLine = in .readLine()) != null) {
		            response.append(inputLine);
		        } in .close();

		        // print result
		        System.out.println(response.toString());
		    } else {
		        System.out.println("POST NOT WORKED");
		    }
	}	
	
	public static void Validdata2() throws IOException {
		String firstname = "Wen!123";
		String lastname = "Ho.Han";
		String totalprice = "100";
		Boolean depositpaid = false;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2023-01-01"); 
		bookingdates.put("checkout","2023-01-10");		
		 jsonData.put("firstname", firstname);
		 jsonData.put("lastname", lastname);
		 jsonData.put("totalprice", totalprice);
		 jsonData.put("depositpaid", depositpaid);		 
	     jsonData.put("bookingdates", bookingdates);
	     jsonData.put("additionalneeds", additionalneeds);	
	     data = jsonData.toString();
	     System.out.println(data);
	     URL obj = new URL("https://restful-booker.herokuapp.com/booking");
	     HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
		    postConnection.setRequestMethod("POST");
		    postConnection.setRequestProperty("Content-Type", "application/json");
		    postConnection.setRequestProperty("Accept", "application/json");

		    postConnection.setDoOutput(true);
		    OutputStream os = postConnection.getOutputStream();
		    os.write(data.getBytes());
		    os.flush();
		    os.close();

		   int responseCode = postConnection.getResponseCode();		   
		   System.out.println("POST Response Code :  " + responseCode);
		   System.out.println("POST Response Message : " + postConnection.getResponseMessage());
		   			    		    
		   if (responseCode == 200) { //success
		        BufferedReader in = new BufferedReader(new InputStreamReader(
		            postConnection.getInputStream()));
		        String inputLine;
		        StringBuffer response = new StringBuffer();

		        while ((inputLine = in .readLine()) != null) {
		            response.append(inputLine);
		        } in .close();

		        // print result
		        System.out.println(response.toString());
		    } else {
		        System.out.println("POST NOT WORKED");
		    }
	}
	
	
	
	
	
	

}
