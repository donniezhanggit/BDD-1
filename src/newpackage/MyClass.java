package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; //contains the webdriver class needed to instantiate the chrome driver

public class MyClass {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		
		if (actualTitle.contentEquals(expectedTitle)){
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed. Actual title does not match the expected title");
		}
		
		driver.close();
	}	
		
}