import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiseseleniumlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// to maximize window tab
		driver.manage().deleteAllCookies();//to delete all cookies

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());//this is for above URL only all links of the page
		
		WebElement Footerdriver =driver.findElement(By.id("gf-BIG"));//here we need to concentrate on footer section so we created the webdriver subset or limiting the webdriver
		//in above line we have created footer driver as driver.
		
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		System.out.println("print me");
		
	}

}