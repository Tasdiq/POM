package Test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	static WebDriver driver;

	@Before
	public void before() {
		System.out.println("This is before class");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TQ\\Desktop\\PITT\\sel\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.geico.com/");
		
	}
}
