package MbStepDefinition;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import MbDriverSetup.SetupClass;
import MbPages.RentReceiptFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition {
	static WebDriver driver;
	RentReceiptFactory h1;
	
	
	@Given("User is on Magicbricks homepage")
	public void user_is_on_magicbricks_homepage() {
		driver = SetupClass.edgedriver();
	//	driver = SetupClass.chromedriver();
	}
	
	@And("Hover on property services")
	public void hover_on_property_services() {
		h1 = new RentReceiptFactory(driver);
		h1.HoverOnPropertyServicesOption();
	}
	
	
//_________________________________________________________________________________________________________________________________________________________________________________________
//                                            (Rent Receipt form)
//_________________________________________________________________________________________________________________________________________________________________________________________
	
	
	@When("User clciks on the generate rent receipt")
	public void user_clciks_on_the_generate_rent_receipt() {
		h1.clickGenerateRentReceipt();
		h1.SwitchToGenerateRentReceipt();
	}

	@And("^User fills the rent receipt form with (.*), (.*), (.*), (.*), (.*), (.*), (.*) and (.*)$")
	public void user_fills_the_rent_receipt_form_with_and(String rentAmount, String address, String landlordName, String startDate, String endDate, String tenantName, String mobNumber, String eMail) throws InterruptedException {
	    h1.fillRentReceiptForm(rentAmount, address, landlordName, startDate, endDate, tenantName, mobNumber, eMail);
	}

	@And("User click on the terms and conditions checkbox")
	public void user_click_on_the_terms_and_conditions_checkbox() {
	    h1.clickCheckBox();
	}

	@And("User click on the generate rent receipt now button")
	public void user_click_on_the_generate_rent_receipt_now_button() {
	    h1.clickGenerateRentReceiptbtn();
	}

	@Then("User will get an option to download the rent receipt")
	public void user_will_get_an_option_to_download_the_rent_receipt() {
		String actual = h1.messageDisplayed();
		String expected = "Your Rent Receipt is Ready!";
		Assert.assertEquals(expected, actual);
	}
	
	@AfterStep
	public static void takeScreendown(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
//___________________________________________________________________________________________________________________________________________________________________________________
//                                           (Enquire Now form)
//___________________________________________________________________________________________________________________________________________________________________________________
	

	@When("User clicks on rent agreement")
	public void user_clicks_on_rent_agreement() {
	    h1.clickRentAgreement();
	    h1.SwitchToRentAgreement();
	}

	@And("User clicks on enquire now for free")
	public void user_clicks_on_enquire_now_for_free() throws AWTException {
		h1 = new RentReceiptFactory(driver);
		h1.clickEnquireNowBtn();
	}
	
	@And("User fills the enquire now form with the following Your Name, Your Email, Your Mobile Number and Write your question")
	public void user_fills_the_enquire_now_form_with_your_name_your_email_your_mobile_number_and_write_your_question(DataTable dataTable) {
	    List<List<String >> cells = dataTable.cells();
	    h1.fillEnquireNowForm(cells.get(0).get(0),cells.get(0).get(1), cells.get(0).get(2),cells.get(0).get(3));
	}

	@Then("User will click on send request")
	public void user_will_click_on_send_request() {
	    h1.clickSendReuest();
	    String actual = h1.messageDisplayed1();
	    String expected = "Verify your number";
	    Assert.assertEquals(expected, actual);
    }
	
	@AfterStep
	public static void takeScreendown1(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}

	
//________________________________________________________________________________________________________________________________________________________________________________________
//                                                (Rent Agreement Form)
//________________________________________________________________________________________________________________________________________________________________________________________
	
	
	@When("User clicks on rent agreement1")
	public void user_clicks_on_rent_agreement1() {
	    h1.clickRentAgreement();
	    h1.SwitchToRentAgreement1();
	}

	@And("User clicks on get free rent agreement")
	public void user_clicks_on_get_free_rent_agreement() {
	    h1.clickGetFreeRentAgreement();
	}

	@And("User clicks on owner")
	public void user_clicks_on_owner() {
	    h1.selectAsOwner();
	}

	@And("User fills the form with Owner Name, Owner Mob Number, Owner Email, Owner Address, Pincode, City, State")
	public void user_fills_the_form_with_owner_name_owner_mob_number_owner_email_owner_address_pincode_city_state(DataTable dataTable) throws InterruptedException {
		List<List<String >> cells = dataTable.cells();
	    h1.fillRentAgreementForm(cells.get(0).get(0),cells.get(0).get(1), cells.get(0).get(2),cells.get(0).get(3), cells.get(0).get(4), cells.get(0).get(5), cells.get(0).get(6));
	}

	@Then("User clicks on the next button")
	public void user_clicks_on_the_next_button() {
	    h1.clickNext();
	    String actual = h1.messageDisplayed2();
	    String expected = "Validate your Details";
	    Assert.assertEquals(expected, actual);
	}
	
	@AfterStep
	public static void takeScreendown2(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}

	
//___________________________________________________________________________________________________________________________________________________________________________________
//                                          (Home Interiors Form)
//___________________________________________________________________________________________________________________________________________________________________________________
	
	
	@When("User clicks on home interiors")
	public void user_clicks_on_home_interiors() {
	    h1.clickHomeInteriors();
	    h1.SwitchToHomeInteriors();
	}

	@And("User clicks on calculate for kitchens and wardrobes")
	public void user_clicks_on_calculate_for_kitchens_and_wardrobes() {
	    h1.clickonCalculateForKitchensAndWardrobes();
	}

	@And("User select the layout and size of the kitchen")
	public void user_select_the_layout_and_size_of_the_kitchen() {
	    h1.selectKitchenLayout();
	    h1.selectKitchenSize();
	}

	@And("User select the number and size of the wardrobes")
	public void user_select_the_number_and_size_of_the_wardrobes() {
	    h1.addNumberOfWardrobes();
	    h1.addNumberOfWardrobes();
	    h1.addNumberOfWardrobes();
	    h1.selectWardrobeSize();
	}
	
	@And("User enter their details with User Name, User Mobile Number and User Email")
	public void user_enter_their_details_with_user_name_user_mobile_number_and_user_email(DataTable dataTable) throws InterruptedException {
		List<List<String >> cells = dataTable.cells();
	    h1.enterUserDetails(cells.get(0).get(0), cells.get(0).get(1), cells.get(0).get(2));
	}

	@And("User selects the interior requirement, time period, budget and city")
	public void user_selects_the_interior_requirement_time_period_budget_and_city() throws InterruptedException {
	    h1.selectInteriorRequirement();
	    h1.selectTimePeriod();
	    h1.selectBudget();
	    h1.selectCity();
	}

	@Then("User clicks on get free estimate")
	public void user_clicks_on_get_free_estimate() {
	    h1.clickGetFreeEstimate();
	    String actual = h1.messageDisplayed3();
	    String expected = "Estimated Cost";
	    Assert.assertEquals(expected, actual);
	}
	
	@AfterStep
	public static void takeScreendown3(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
//_____________________________________________________________________________________________________________________________________________________________________________________
//                                          (Bug in Enquiry form)
//_____________________________________________________________________________________________________________________________________________________________________________________
	
	
	@When("User clicks on rent agreement2")
	public void user_clicks_on_rent_agreement2() {
		h1.clickRentAgreement0();
	    h1.SwitchToRentAgreement0();
	}

	@And("User clicks on enquire now for free1")
	public void user_clicks_on_enquire_now_for_free1() throws AWTException {
		h1 = new RentReceiptFactory(driver);
		h1.clickEnquireNowBtn0();
	}

	@And("^User fills the enquire now form with (.*), (.*) and (.*)$")
	public void user_fills_the_enquire_now_form_with_and(String yourName, String yourEmail, String yourMobNumber) {
		h1.fillEnquireNowForm1(yourName, yourEmail, yourMobNumber);
	}

	@Then("User will click on send request1")
	public void user_will_click_on_send_request1() {
	    h1.clickSendReuest();
	    String actual = h1.messageDisplayed4();
	    String expected = "This field should not be empty";
	    Assert.assertEquals(actual, expected);
	}
	
	@AfterStep
	public static void takeScreendown4(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
}


//_______________________________________________________________________________________________________________________________________________________________________________________________________________________
//                                                  THE END
//_______________________________________________________________________________________________________________________________________________________________________________________________________________________
