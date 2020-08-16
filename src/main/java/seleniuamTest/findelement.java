package seleniuamTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) {
		System.getProperty("WebDriver.Chromedriver.driver","E:\\Testing\\FirstselenTest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		

	}

}
