package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	
	public static void titleprint(WebDriver driver) {
		
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
	}
	
	public static WebElement findEle(WebDriver driver, String xpath) {
	WebElement Ele =	driver.findElement(By.xpath(xpath));
		
	return Ele;
	}

}
