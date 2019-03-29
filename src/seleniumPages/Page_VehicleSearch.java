package seleniumPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import common.Page_BasePage;
import java.util.concurrent.TimeUnit;

public class Page_VehicleSearch extends Page_BasePage {

	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void openVehicleSearchURL() {
		driver.get("https://covercheck.vwfsinsuranceportal.co.uk");
	}

	public void clickFindVehicle() {
		driver.findElement(By.name("btnfind")).click();
	}

	public void invalidRegError(String expectedError) {
		String actualErrorMsg = driver.findElement(By.className("error-required")).getText();
		if (actualErrorMsg.equals(expectedError)) {
			System.out.println("Error message displayed as expected");

		}

		else {
			System.out.println("Expected message not found");
		}
	}

	public void keyVehicleReg(String expectedVehicleReg) {
		driver.findElement(By.id("vehicleReg")).sendKeys(expectedVehicleReg);
	}

	public void vehicleNotFound(String noResultMessage) {
		String actualResultMsg = driver.findElement(By.className("result")).getText();
		if (actualResultMsg.equals(noResultMessage)) {
			System.out.println("Correct result message displayed as expected");

		}

		else {
			System.out.println("Expected result not found");
		}
	}

	public void vehicleDtailsResult() {

		String expectedResultHeader = "Result for : OV12UYY";
		// String expectedCoverStart = "09 FEB 2022 : 16 : 26";
		// String expectedCoverEnd = " 18 FEB 2022 : 23 : 59";

		String actualResultHeader = driver.findElement(By.className("result")).getText();
		// String actualCoverStart =

		// String actualCoverStart =
		// String actualCoverEnd =
		if (actualResultHeader.equals(expectedResultHeader)) {
			System.out.println("Result header displayed");
		}

		else {
			System.out.println("Expected result not found");
		}
	}
}