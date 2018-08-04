package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "E:\\Test_Leaf\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.testleaf.com");
		//Class Dropdown{
			//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			//ChromeDriver driver=new ChromeDriver();
			
			//Load the URL
			driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
			
			//maximize the window
			driver.manage().window().maximize();
			
			//Click Sign up
			driver.findElementByLinkText("Sign up").click();
			
			//Select Country "India" by uing vaue
			WebElement country =driver.findElementById("userRegistrationForm:countries");
			Select dropdown=new Select(country);
			dropdown.selectByValue("94");
			
			// Close Browser
			driver.close();

	}

}
