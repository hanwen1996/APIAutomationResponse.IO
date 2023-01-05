import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONObject;

public class NegativeTestCases {
	public static String data = null;
	public static void emptyFirstname() throws IOException {
		String firstname = "";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
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
	
	public static void Firstname_int() throws IOException {
		int firstname = 100;
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
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
		   			    		    
		   if (responseCode == 500) { //success
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
	
	
	public static void Firstname_boolean() throws IOException {
		boolean firstname = true;
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
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
		   			    		    
		   if (responseCode == 500) { //success
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
	
	public static void longFirstname() throws IOException {
		String firstname = "JimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJim";
		String lastname = "Ho Han";
		String totalprice = "100";
		String depositpaid = "false";
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
	
	public static void emptyLastname() throws IOException {
		String firstname = "John";
		String lastname = "";
		int totalprice = 100;
		Boolean depositpaid = true;
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
	
	public static void Lastname_int() throws IOException {
		String firstname = "Wen";
		int lastname = 100;
		String totalprice = "100";
		Boolean depositpaid = true;
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
		   			    		    
		   if (responseCode == 500) { //success
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
	
	
	public static void Lastname_boolean() throws IOException {
		String firstname = "Wen";
		boolean lastname = true;
		int totalprice = 100;
		Boolean depositpaid = true;
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
		   			    		    
		   if (responseCode == 500) { //success
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
	
	public static void longLastname() throws IOException {
		String firstname = "Wen";
		String lastname = "JimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJimJim";;
		String totalprice = "100";
		String depositpaid = "false";
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
	
	public static void emptyTotalPrice() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		String totalprice = null;
		Boolean depositpaid = true;
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
	
	public static void TotalPrice_string() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		String totalprice = "sd1234@#$$";
		Boolean depositpaid = true;
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
	
	public static void TotalPrice_boolean() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		Boolean totalprice = true;
		Boolean depositpaid = true;
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
	
	public static void longTotalprice() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		String totalprice = "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100555";
		String depositpaid = "false";
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
	
	public static void emptyDepositPaid() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = null;
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
	
	public static void DepositPaid_string() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		String depositpaid = "abcd1234!@#$";
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
	
	public static void DepositPaid_int() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		int depositpaid = 100;
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
	
	public static void longDepositPaid() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		String depositpaid = "truetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetruetru";
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
	
	public static void emptyCheckin() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin",""); 
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
	
	public static void Checkin_string() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","abcd1234!@#$"); 
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
	
	public static void Checkin_int() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin",1234); 
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
	
	public static void Checkin_boolean() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin",true); 
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
	
	public static void longCheckin() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-012019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-012019-01-01 2019-01-012019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 "); 
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
	
	public static void emptyCheckout() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2023-01-01"); 
		bookingdates.put("checkout", "");		
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
	
	public static void Checkout_string() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();

		bookingdates.put("checkin","2023-01-10"); 
		bookingdates.put("checkout","abcd1234!@#$");		
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
	
	public static void Checkout_int() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2023-01-10"); 
		bookingdates.put("checkout",1234);		
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
	
	public static void Checkout_boolean() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2023-01-10"); 
		bookingdates.put("checkout",true);		
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
	
	public static void longCheckout() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2019-01-01");
	    bookingdates.put("checkout","2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-012019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-012019-01-01 2019-01-012019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01 2019-01-01");		
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
	
	public static void Checkin_more_Checkout() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "Breakfast";
		JSONObject jsonData = new JSONObject();
	
		bookingdates.put("checkin","2023-02-10"); 
		bookingdates.put("checkout","2023-01-04");		
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
	
	public static void emptyAdditionalneeds() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "";
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
	
	public static void Additionalneeds_int() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		int additionalneeds = 1234;
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
	
	public static void Additionalneeds_boolean() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		int totalprice = 100;
		Boolean depositpaid = true;
		JSONObject bookingdates = new JSONObject();
		boolean additionalneeds = true;
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
	
	public static void longAdditionalneeds() throws IOException {
		String firstname = "Wen";
		String lastname = "Ho Han";
		String totalprice = "100";
		String depositpaid = "false";
		JSONObject bookingdates = new JSONObject();
		String additionalneeds = "BreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfastBreakfast";
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
