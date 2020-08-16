package seleniuamTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cromebasic {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","E:\\Testing\\FirstselenTest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
	
		driver.get("https://amazon.in");
		String pagetitle = driver.getTitle();
		System.out.println("current Title is :-" + pagetitle);
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(pagetitle.equals(expectedTitle))
		{
			System.out.println("Page Title is currect");
			
		}
		else
		{
			System.out.println("page Title is incurrect");
		}
		driver.close();
	System.out.println("browser will close");
	}
	

}
