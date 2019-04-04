package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Home extends Lib{

	public static void gettitle(WebDriver driver) {
		
		titleprint(driver);
		
	}
	
	public static void clickquote(WebDriver driver, String zipcode) {
		WebElement quote = findEle(driver, ".//*[@id='zip']") ;
		quote.sendKeys(zipcode);
		
		WebElement strquotes= findEle(driver, ".//*[@id='submitButton']");
		strquotes.click();
		
	}
}
