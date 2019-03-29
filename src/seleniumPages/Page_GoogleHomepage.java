package seleniumPages;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import common.Page_BasePage;

public class Page_GoogleHomepage extends Page_BasePage {

	public void launchBrowser() {
		driver = new ChromeDriver();
	}

	public void openGoogleURL() {
		driver.get("https://covercheck.vwfsinsuranceportal.co.uk");
	}

	public void checkSearchBoxIsDisplayed(){
			driver.findElement(By.name("btnfind")).click();
		}

	public void checkGoogleSearchButtonIsDisplayed() {
		if (driver.findElement(By.name("btnK")).isDisplayed()) {
			System.out.println("Google Search button is displayed");
		} else {
			System.out.println("Google Search button is NOT displayed");
		}
	}

	public void checkImFeelingLuckyButtonIsDisplayed() {
		if (driver.findElement(By.name("btnI")).isDisplayed()) {
			System.out.println("I'm Feeling Lucky button is displayed");
		} /*
			 * else {
			 * System.out.println("I'm Feeling Lucky button is NOT displayed");
			 * }
			 */
		driver.close();

	}

	public void searchOnGoogleHomepage(String keyword) {
		driver.findElement(By.name("q")).sendKeys(keyword);
		driver.findElement(By.name("btnK")).click();
	}
}