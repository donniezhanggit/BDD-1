package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumPages.Page_VehicleSearch;

public class StepDefs_VehicleSearch {

	Page_VehicleSearch vehicleSearchPage = new Page_VehicleSearch();
	WebDriver driver = new ChromeDriver();

	@Given("^I have launched the vehicle search website$")
	public void i_have_launched_the_vehicle_search_website() {
		vehicleSearchPage.launchBrowser();
		vehicleSearchPage.openVehicleSearchURL();
	}

	@When("^I click Find Vehicle$")
	public void i_click_Find_Vehicle() {
		vehicleSearchPage.clickFindVehicle();
	}

	@Then("^the error message \"([^\"]*)\" is displayed$")
	public void the_error_message_is_displayed(String expectedError) {
		vehicleSearchPage.invalidRegError(expectedError);
		driver.close();
	}

	@When("^I enter \"([^\"]*)\" in the search field$")
	public void i_enter_in_the_search_field(String expectedVehicleReg) {
		vehicleSearchPage.keyVehicleReg(expectedVehicleReg);
		vehicleSearchPage.clickFindVehicle();
	}

	@Then("^the message \"([^\"]*)\" is displayed$")
	public void the_message_is_displayed(String noResultMessage) {
		vehicleSearchPage.vehicleNotFound(noResultMessage);
		driver.close();
	}

	@Then("^the correct details are displayed$")
	public void the_correct_details_are_displayed() {
		vehicleSearchPage.vehicleDtailsResult();
		driver.close();
	}

}
