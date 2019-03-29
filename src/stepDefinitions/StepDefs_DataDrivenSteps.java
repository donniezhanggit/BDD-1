package stepDefinitions;

import cucumber.api.java.en.Then;
import seleniumPages.Page_GoogleHomepage;

public class StepDefs_DataDrivenSteps {

	Page_GoogleHomepage googleHomepage = new Page_GoogleHomepage();

	@Then("^I search for \"([^\"]*)\" on Google$")
	public void i_search_for_on_Google(String searchWord) {
		googleHomepage.searchOnGoogleHomepage(searchWord);

	}
}
