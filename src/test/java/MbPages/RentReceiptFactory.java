package MbPages;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RentReceiptFactory {
	WebDriver driver;
	WebDriverWait wait;
	
//________________________________________________________________________________________________________________________________________________________________________________
//                                               (Web Elemnets of Rent Receipt form)
//________________________________________________________________________________________________________________________________________________________________________________	
	
	@FindBy(xpath="(//a[@class=\"mb-header__sub__tabs__link js-menu-link\"])[5]")
	WebElement propertyServices;
	
	@FindBy(xpath ="//a[@href=\"https://www.magicbricks.com/propertyservices/rent-receipt.html\"]")
	WebElement generateRentReceipt;

	@FindBy(id ="rentAmount")
	WebElement rentAmountField;
	
	@FindBy(id ="rentedPropertyAddress")
	WebElement addressField;
	
	@FindBy(id ="landlordName")
	WebElement landlordNameField;
	
	@FindBy(id ="receiptStartDate")
	WebElement startDateField;
	
	@FindBy(id ="receiptEndDate")
	WebElement endDateField;
	
	@FindBy(id ="tenantName")
	WebElement tenantNameField;
	
	@FindBy(id ="tenantMobileNumber")
	WebElement mobNumberField;
	
	@FindBy(id ="email")
	WebElement eMailField;
	
	@FindBy(xpath ="//label[text()=\"I agree to Magicbricks \"]")
	WebElement checkBox;
	
	@FindBy(xpath ="//a[@class=\"mb-form__cta\"]")
	WebElement generateRentReceiptbtn;
	
	@FindBy(xpath ="//div[@class=\"rent-reciept__success__title\"]")
	WebElement displayedMessage;
	
//______________________________________________________________________________________________________________________________________________________________
//                                              (Methods of Rent Receipt form)
//______________________________________________________________________________________________________________________________________________________________
	
	public RentReceiptFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void HoverOnPropertyServicesOption() {
		Actions act = new Actions(driver);
		act.moveToElement(propertyServices).perform();
	}
	
	public void clickGenerateRentReceipt() {
		generateRentReceipt.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	}
	
	public void SwitchToGenerateRentReceipt() {
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		    }
		}
	}
	public void fillRentReceiptForm(String rentAmount, String address, String landlordName, String startDate, String endDate, String tenantName, String mobNumber, String eMail) {
		rentAmountField.sendKeys(rentAmount);
		addressField.sendKeys(address);
		landlordNameField.sendKeys(landlordName);
		
		startDateField.click();
		WebElement startDate1 = driver.findElement(By.xpath("//span[@aria-label=\"April 1, 2024\"]"));
		startDate1.click();
		
		endDateField.click();
		WebElement endDate1 = driver.findElement(By.xpath("(//span[@aria-label=\"April 30, 2024\"])[2]"));
		endDate1.click();
		
		tenantNameField.sendKeys(tenantName);
		mobNumberField.sendKeys(mobNumber);
		eMailField.sendKeys(eMail);
	}
	
	public void clickCheckBox() {
		checkBox.click();
	}
	
	public void clickGenerateRentReceiptbtn() {
		generateRentReceiptbtn.click();	
	}
	
	public String messageDisplayed() {
		System.out.println(displayedMessage.getText());
		return displayedMessage.getText();	
	}
	
	
//______________________________________________________________________________________________________________________________________________
//                                         (Web Elemnets of Enquire Now form)
//______________________________________________________________________________________________________________________________________________
	
	
	@FindBy(xpath ="//a[@href=\"https://www.magicbricks.com/rentalagreement/\"]")
	WebElement rentAgreement;
	
	@FindBy(xpath ="//button[@class=\"EnquireNowBtn\"]")
	WebElement enquireNowBtn;
	
	@FindBy(id ="contactName")
	WebElement NameField;
	
	@FindBy(id ="contactEmail")
	WebElement EMailField;
	
	@FindBy(id ="contactMobile")
	WebElement  ContactMobile;
	
	@FindBy(id ="contactQuestion")
	WebElement question;
	
	@FindBy(id ="Btn_contactCTA")
	WebElement sendRequest;
	
	@FindBy(xpath ="//p[@class=\"title\"]")
	WebElement displayedMessage1;
	
//__________________________________________________________________________________________________________________________________________________________
//                                                 (Methods of Enquire Now form)
//__________________________________________________________________________________________________________________________________________________________
	
	public void clickRentAgreement() {
		rentAgreement.click();
	}
	
	public void SwitchToRentAgreement() {
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		    }
		}
	}
		
	public void clickEnquireNowBtn() throws AWTException {
		enquireNowBtn.click();
	}
	
	public void fillEnquireNowForm(String name, String EMail, String mobile, String Question) {
		NameField.sendKeys(name);
		EMailField.sendKeys(EMail);
		ContactMobile.sendKeys(mobile);
		question.sendKeys(Question);
	}
	
	public void clickYourName() {
		NameField.click();
	}
	
	public void clickYourEMail() {
		EMailField.click();
	}
	
	public void clickYourMobileNumber() {
		ContactMobile.click();
	}
	
	public void clickWriteQuestion() {
		question.click();
	}
	
	public void clickSendReuest() {
		sendRequest.click();
	}
	
	public String messageDisplayed1() {
		System.out.println(displayedMessage1.getText());
		return displayedMessage1.getText();	
	}
	
	
//__________________________________________________________________________________________________________________________________________________
//                                             (Web Elemnets of Rent Agreement Form)
//__________________________________________________________________________________________________________________________________________________
	
	
	@FindBy(xpath ="//a[@href=\"https://www.magicbricks.com/rentalagreement/\"]")
	WebElement rentAgreement1;
	
	@FindBy(xpath ="//a[@class=\"mb-rental__action--btn btn-red large\"]")
	WebElement getRentAgreement;
	
	@FindBy(xpath ="//input[@class=\"rental__radiogroup-custom--radio\"]")
	WebElement selectOwner;
	
	@FindBy(id ="landlordname")
	WebElement ownerNameField;
	
	@FindBy(id ="mobile")
	WebElement ownerMobNumField;
	
	@FindBy(id ="email")
	WebElement ownerEmailField;
	
	@FindBy(id ="permanentAddress")
	WebElement ownerAddressField;
	
	@FindBy(id ="pincode")
	WebElement ownerPincodeField;
	
	@FindBy(xpath ="(//input[@class=\"rental__form__row--input-text\"])[6]")
	WebElement ownerCityField;
	
	@FindBy(xpath ="//li[text()=\"Mumbai\"]")
	WebElement clickCity;
	
	@FindBy(xpath ="(//input[@class=\"rental__form__row--input-text\"])[7]")
	WebElement ownerStateField;
	
	@FindBy(xpath ="//li[text()=\"Maharashtra\"]")
	WebElement clickState;
	
	@FindBy(xpath ="//a[@class=\"rental__action--btn btn-red xmedium\"]")
	WebElement NextBtn;
	
	@FindBy(xpath ="//div[text()=\"Validate your Details\"]")
	WebElement displayedMessage2;
	
//____________________________________________________________________________________________________________________________________________________________
//                                           (Methods of Rent Agreement Form)
//____________________________________________________________________________________________________________________________________________________________
	
	public void clickRentAgreement1() {
		rentAgreement.click();
	}
	
	public void SwitchToRentAgreement1() {
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		    }
		}
	}
	
	public void clickGetFreeRentAgreement() {
		getRentAgreement.click();
	}
	
	public void selectAsOwner() {
		selectOwner.click();
	}
	
	public void fillRentAgreementForm(String ownerName, String ownerMobNumber, String ownerEmail, String ownerAddress, String ownerPincode, String ownerCity, String ownerState) {
		ownerNameField.sendKeys(ownerName);
		ownerMobNumField.sendKeys(ownerMobNumber);
		ownerEmailField.sendKeys(ownerEmail);
		ownerAddressField.sendKeys(ownerAddress);
		ownerPincodeField.sendKeys(ownerPincode);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		
		ownerCityField.sendKeys(ownerCity);
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		clickCity.click();
		ownerStateField.sendKeys(ownerState);
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		clickState.click();
	}
	
	public void clickNext() {
		NextBtn.click();
	}
	
	
	public String messageDisplayed2() {
		System.out.println(displayedMessage2.getText());
		return displayedMessage2.getText();	
	}
	
	
//__________________________________________________________________________________________________________________________________________________________________________________________________
//                                             (Web Elemnets of Home Interiors Form)
//__________________________________________________________________________________________________________________________________________________________________________________________________
	
	
	@FindBy(xpath ="//a[@href=\"https://www.magicbricks.com/home-interior/?Inc=main_nav_web\"]")
	WebElement homeInteriors;
	
	@FindBy(xpath ="(//span[@class=\"cta-medium arrow-icn\"])[2]")
	WebElement calculate;
	
	@FindBy(xpath ="//div[text()=\"Island\"]")
	WebElement kitchenLayout;
	
	@FindBy(xpath ="//div[text()=\"Big (Above 100 sq ft)\"]")
	WebElement kitchenSize;
	
	@FindBy(xpath ="//button[@class=\"cta cta-filled\"]")
	WebElement next;
	
	@FindBy(xpath ="//button[text()=\"+\"]")
	WebElement numberOfWardrobes;
	
	@FindBy(xpath ="//div[text()=\"Medium\"]")
	WebElement wardrobeSize;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[1]")
	WebElement userName;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[2]")
	WebElement userMobileNumber;
	
	@FindBy(xpath ="(//input[@type=\"text\"])[3]")
	WebElement userEmail;
	
	@FindBy(xpath ="//button[text()=\"Verify\"]")
	WebElement verify;
	
	@FindBy(xpath ="//label[text()=\"Self-use\"]")
	WebElement interiorRequirement;
	
	@FindBy(xpath ="//label[text()=\"More than 3 Months\"]")
	WebElement timePeriod;
	
	@FindBy(xpath ="//label[text()=\"Over 10 Lakhs\"]")
	WebElement budget;
	
	@FindBy(xpath ="//div[@class=\"homdec__form__cityfield__input \"]")
	WebElement dropDown;
	
	@FindBy(xpath ="(//li[@class=\"homdec__form__cityfield__dropdown__list\"])[3]")
	WebElement city;
	
	@FindBy(xpath ="//span[text()=\"Estimated Cost\"]")
	WebElement displayedMessage3;
	
//__________________________________________________________________________________________________________________________________________________________________________________
//                                            (Methods of Home Interiors Form)
//__________________________________________________________________________________________________________________________________________________________________________________
	
	public void clickHomeInteriors() {
		homeInteriors.click();
	}
	
	public void SwitchToHomeInteriors() {
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		    }
		}
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
	}
	
	public void clickonCalculateForKitchensAndWardrobes() {
		calculate.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		
	}
	
	public void selectKitchenLayout() {
		kitchenLayout.click();
		wait = new WebDriverWait(driver,Duration.ofSeconds(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	
	public void selectKitchenSize() {
		kitchenSize.click();
		next.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-100)");
	}
	
	public void addNumberOfWardrobes() {
		numberOfWardrobes.click();
	}
	
	public void selectWardrobeSize() {
		wardrobeSize.click();
		next.click();
	}
	
	public void enterUserDetails(String UserName, String userMobNumber, String UserEmail) throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		userName.sendKeys(UserName);
		userMobileNumber.sendKeys(userMobNumber);
		userEmail.sendKeys(UserEmail);
		next.click();
		Thread.sleep(15000);
		verify.click();
	}
	
	public void selectInteriorRequirement() throws InterruptedException {
		wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		interiorRequirement.click();
	}
	
	public void selectTimePeriod() {
		timePeriod.click();
	}
	
	public void selectBudget() {
		budget.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	}
	
	public void selectCity() throws InterruptedException {
		Thread.sleep(3000);
		dropDown.click();
		city.click();
	}
	
	public void clickGetFreeEstimate() throws InterruptedException {
		next.click();
		Thread.sleep(3000);
	}
	
	public String messageDisplayed3() {
		System.out.println(displayedMessage3.getText());
		return displayedMessage3.getText();	
	}
	
	
//________________________________________________________________________________________________________________________________________________________________________________
//                                             (Web Elemnets for Bug in Enquiry form)
//________________________________________________________________________________________________________________________________________________________________________________
	
	@FindBy(xpath ="//a[@href=\"https://www.magicbricks.com/rentalagreement/\"]")
	WebElement rentAgreement0;
	
	@FindBy(xpath ="//button[@class=\"EnquireNowBtn\"]")
	WebElement enquireNowBtn1;
	
	@FindBy(id ="contactName")
	WebElement NameField1;
	
	@FindBy(id ="contactEmail")
	WebElement EMailField1;
	
	@FindBy(id ="contactMobile")
	WebElement  ContactMobile1;
	
	@FindBy(id ="contactQuestion")
	WebElement question1;
	
	@FindBy(id ="Btn_contactCTA")
	WebElement sendRequest1;
	
	@FindBy(xpath ="//p[text()=\"Verify your number\"]")
	WebElement displayedMessage4;
	
//________________________________________________________________________________________________________________________________________________________________________________
//                                              (Methods for Bug in Enquiry form)
//________________________________________________________________________________________________________________________________________________________________________________

	public void clickRentAgreement0() {
		rentAgreement0.click();
	}
	
	public void SwitchToRentAgreement0() {
		String mainWindowHandle = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle);
		    }
		}
	}
		
	public void clickEnquireNowBtn0() throws AWTException {
		enquireNowBtn1.click();
	}
	
	public void fillEnquireNowForm1(String yourName, String yourEmail, String yourMobNumber) {
		NameField1.sendKeys(yourName);
		EMailField1.sendKeys(yourEmail);
		ContactMobile1.sendKeys(yourMobNumber);
	}
		
	public String messageDisplayed4() {
		System.out.println(displayedMessage4.getText());
		return displayedMessage4.getText();	
	}
}
//________________________________________________________________________________________________________________________________________________________________________________
//                                                           THE END
//________________________________________________________________________________________________________________________________________________________________________________