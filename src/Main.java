import static io.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Main {
	
	public static  void main(String[] args) throws Exception {	
		Validdata();
		Validdata2();
		emptyFirstname();
		Firstname_int();	
		Firstname_boolean();
		longFirstname();
		emptyLastname();
		Lastname_int();
		Lastname_boolean();
		longLastname();
		emptyTotalPrice();
		TotalPrice_string();
		TotalPrice_boolean();
		longTotalprice();
		emptyDepositPaid();
		DepositPaid_string();
		DepositPaid_int();
		longDepositPaid();
		emptyCheckin();
		Checkin_string();
		Checkin_int();
		Checkin_boolean();
		longCheckin();
		emptyCheckout();
		Checkout_string();
		Checkout_int();
		Checkout_boolean();
		longCheckout();
		Checkin_more_Checkout();
		emptyAdditionalneeds();
		Additionalneeds_int();
		Additionalneeds_boolean();
		longAdditionalneeds();
	}
	
	@Test (priority=0) //Valid Test-cases 1
	public static void Validdata() throws IOException {
		PositiveTestCases.Validdata();
	}
	
	@Test (priority=1) //Valid Test-cases 2
	public static void Validdata2() throws IOException {
		PositiveTestCases.Validdata2();
	}
	
	@Test (priority=2) //empty first name
	public static void emptyFirstname() throws IOException {
		NegativeTestCases.emptyFirstname();
	}
	
	@Test (priority=3) //first name value in integer
	public static void Firstname_int() throws IOException {
		NegativeTestCases.Firstname_int();
	}
	
	@Test (priority=4) //first name value in boolean
	public static void Firstname_boolean() throws IOException {
		NegativeTestCases.Firstname_boolean();
	}
	
	@Test (priority=5) //first name value more >= 255 characters
	public static void longFirstname() throws IOException {
		NegativeTestCases.longFirstname();
	}
	
	@Test (priority=6) //empty last name
	public static void emptyLastname() throws IOException {
		NegativeTestCases.emptyLastname();
	}
	
	@Test (priority=7) //last name value in integer
	public static void Lastname_int() throws IOException {
		NegativeTestCases.Lastname_int();
	}
	
	@Test (priority=8) //last name value in boolean
	public static void Lastname_boolean() throws IOException {
		NegativeTestCases.Lastname_boolean();
	}	
	@Test (priority=9) //last name value more >= 255 characters
	public static void longLastname() throws IOException {
		NegativeTestCases.longLastname();
	}
	
	@Test (priority=10) //empty total price
	public static void emptyTotalPrice() throws IOException {
		NegativeTestCases.emptyTotalPrice();
	}
	
	@Test (priority=11) //total price value in string
	public static void TotalPrice_string() throws IOException {
		NegativeTestCases.TotalPrice_string();
	}
	
	@Test (priority=12) //total price value in boolean
	public static void TotalPrice_boolean() throws IOException {
		NegativeTestCases.TotalPrice_boolean();
	}
	
	@Test (priority=13) //total price value more >= 255 characters
	public static void longTotalprice() throws IOException {
		NegativeTestCases.longTotalprice();
	}
	
	@Test (priority=14) //empty deposit paid
	public static void emptyDepositPaid() throws IOException {
		NegativeTestCases.emptyDepositPaid();;
	}
	
	@Test (priority=15) //deposit paid value in string
	public static void DepositPaid_string() throws IOException {
		NegativeTestCases.DepositPaid_string();
	}
	
	@Test (priority=16) //deposit paid value in integer
	public static void DepositPaid_int() throws IOException {
		NegativeTestCases.DepositPaid_int();;
	}
	
	@Test (priority=17) //deposit paid value more >= 255 characters
	public static void longDepositPaid() throws IOException {
		NegativeTestCases.longDepositPaid();
	}
	
	@Test (priority=18) //empty checkin
	public static void emptyCheckin() throws IOException {
		NegativeTestCases.emptyCheckin();
	}
	
	@Test (priority=19) //checkin value in string
	public static void Checkin_string() throws IOException {
		NegativeTestCases.Checkin_string();;
	}
	
	@Test (priority=20) //checkin value in integer
	public static void Checkin_int() throws IOException {
		NegativeTestCases.Checkin_int();
	}
	
	@Test (priority=21) //checkin value in boolean
	public static void Checkin_boolean() throws IOException {
		NegativeTestCases.Checkin_boolean();
	}
	
	@Test (priority=22) //checkin value more >= 255 characters
	public static void longCheckin() throws IOException {
		NegativeTestCases.longCheckin();
	}
	
	@Test (priority=23) //empty checkout
	public static void emptyCheckout() throws IOException {
		NegativeTestCases.emptyCheckout();
	}
	
	@Test (priority=24) //checkout value in string
	public static void Checkout_string() throws IOException {
		NegativeTestCases.Checkout_string();;
	}
	
	@Test (priority=25) //checkout value in integer
	public static void Checkout_int() throws IOException {
		NegativeTestCases.Checkout_int();
	}
	
	@Test (priority=26) //checkout value in boolean
	public static void Checkout_boolean() throws IOException {
		NegativeTestCases.Checkout_boolean();
	}
	
	@Test (priority=27) //checkout value more >= 255 characters
	public static void longCheckout() throws IOException {
		NegativeTestCases.longCheckout();
	}
	
	@Test (priority=28) //checkin date more than checkout date
	public static void Checkin_more_Checkout() throws IOException {
		NegativeTestCases.Checkin_more_Checkout();
	}
	
	
	@Test (priority=29) //empty additional needs
	public static void emptyAdditionalneeds() throws IOException {
		NegativeTestCases.emptyAdditionalneeds();
	}
	
	@Test (priority=30) //additional needs value in integer
	public static void Additionalneeds_int() throws IOException {
		NegativeTestCases.Additionalneeds_int();
	}
	
	@Test (priority=31) //additional needs value in boolean
	public static void Additionalneeds_boolean() throws IOException {
		NegativeTestCases.Additionalneeds_boolean();
	}
	
	@Test (priority=32) //additional needs value more >= 255 characters
	public static void longAdditionalneeds() throws IOException {
		NegativeTestCases.longAdditionalneeds();
	}
	
}

