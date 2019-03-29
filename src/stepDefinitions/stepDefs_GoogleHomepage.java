package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumPages.Page_GoogleHomepage;

public class stepDefs_GoogleHomepage {

	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();
	WebDriver driver = new ChromeDriver();

	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser() {
		googleHomepage.launchBrowser();

	}

	@When("^I open Google homepage$")
	public void i_open_Google_homepage() {
		googleHomepage.openGoogleURL();

	}

	@Then("^the page displays search text box$")
	public void the_page_displays_search_text_box() {
		googleHomepage.checkSearchBoxIsDisplayed();
	}

	@Then("^the page displays Google search button$")
	public void the_page_displays_Google_search_button() {
		googleHomepage.checkGoogleSearchButtonIsDisplayed();
	}

	@Then("^the page displays I'm Feeling Lucky button$")
	public void the_page_displays_I_m_Feeling_Lucky_button() {
		googleHomepage.checkImFeelingLuckyButtonIsDisplayed();
	
	}

}
