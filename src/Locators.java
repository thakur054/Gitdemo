import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//globally defined...as it will wait for 5 sec max if driver does not get required element/
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("anshul");
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.className("signInBtn")).click();
		//Implicit Wait
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// use to capture certain thing like incorrect password then implicit wait will apply
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anshul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("anshul.thakur@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("98876655678");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println((driver.findElement(By.cssSelector("p.infoMsg"))).getText());
		
		//driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='chkboxOne'][1]")).click();
		//we can use this (//input[@id='chkboxOne'])[1]
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		}

}
