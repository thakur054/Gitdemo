import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// globally introduce the implicitly wait so that it will not througherror
		//driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        //Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        
        
        //no of checkbox on page for this check common name or parent etc
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        
        //if we want to click add more passenger lets say 6 then we need to intoduce while loop -it will exec.till the condtion reaches to false
       
       /*int i=1;  using while loop
       while(i<5)
       {
    	   driver.findElement(By.id("hrefIncAdt")).click(); 
    	   i++;
       }*/
        
        for(int i=1; i<=4; i++)
        {	
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
       driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click(); 
       System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
       }
}

