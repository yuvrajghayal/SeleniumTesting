package seleniuamTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlCheck {

	public static void main(String[] args) {
		System.getProperty("webdriver.chromedriver.driver","E:\\Testing\\FirstselenTest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.cs-cart.com");
		String pageurl = driver.getCurrentUrl();
		String expeUrl = "https://demo.cs-cart.com/stores/d5869f6362b1df2c/";

		if(pageurl.equals(expeUrl)) {
			System.out.println("Page is Url is currect");
			
		}
		else {
			System.out.println("page Url is not currect");
		}
	}

}
