import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlearning {

	public static void main(String[] args) {
	//Webdriver Methods + class methods(may be this class method is not usable for firefox or ie) so we are going to use webDriver instead of chrome driver method	
      //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       //driver.close();
		System.out.println("print me");
		System.out.println("print her");
		System.out.println("print them");
 
	}

}