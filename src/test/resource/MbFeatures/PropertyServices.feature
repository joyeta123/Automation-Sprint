Feature: Magicbricks Property Services
Background: 
	Given User is on Magicbricks homepage
	
	And Hover on property services
	
	@RentReceipt
  Scenario Outline: Rent Receipt form
  When User clciks on the generate rent receipt
  And User fills the rent receipt form with <Rent Amount>, <Address>, <Landlord Name>, <Start Date>, <End Date>, <Tenant Name>, <Mob Number> and <Email>
  And User click on the terms and conditions checkbox
  And User click on the generate rent receipt now button
  Then User will get an option to download the rent receipt
  
  Examples:
  |Rent Amount|Address|Landlord Name|Start Date|End Date|Tenant Name|Mob Number|Email|
  |10000|Navi Mumbai|Aksh|1|30|Anish|9876543210|Anish@gmail.com|


#=======================================================================================================================================================

  @EnquireNowForm
	Scenario: Enquire Now form
	When User clicks on rent agreement
	And User clicks on enquire now for free
	And User fills the enquire now form with the following Your Name, Your Email, Your Mobile Number and Write your question
	|ABC|abc@gmail.com|9090909090|None|
	Then User will click on send request


#=======================================================================================================================================================

  @RentAgreement
	Scenario: Rent Agreement Form
	When User clicks on rent agreement1
	And User clicks on get free rent agreement
	And User clicks on owner
	And User fills the form with Owner Name, Owner Mob Number, Owner Email, Owner Address, Pincode, City, State
	|Alok|8765964765|Alok@gmail.com|Navi Mumbai|755085|Mumbai|Maharashtra|
	Then User clicks on the next button


#=======================================================================================================================================================

  @HomeInteriors
	Scenario: Home Interiors Form
	When User clicks on home interiors
	And User clicks on calculate for kitchens and wardrobes
	And User select the layout and size of the kitchen
	And User select the number and size of the wardrobes
	And User enter their details with User Name, User Mobile Number and User Email
	|Joyeta|9209012238|joyetabarman5650@gmail.com|
	And User selects the interior requirement, time period, budget and city
	Then User clicks on get free estimate
	
	
#=======================================================================================================================================================


	@Bug
	Scenario Outline: Enquiry form
	When User clicks on rent agreement2
	And User clicks on enquire now for free1
	And User fills the enquire now form with <Your Name>, <Your Email> and <Your Mobile Number>
	Then User will click on send request1
	
	Examples:
	|Your Name|Your Email|Your Mobile Number|
	|ABC|abc@gmail.com|9090909090|
	
	
#========================================================================================================================================================