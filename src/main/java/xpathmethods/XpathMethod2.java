package xpathmethods; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathMethod2 { //class//
	
	public static void main(String[] args) throws InterruptedException { //main//
		
		WebDriverManager.chromedriver().setup();

		WebDriver odriver = new ChromeDriver();

		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//xpath//or/and//
		
		/*  By f1 = By.xpath("//input[@type='text' or @type='text' or@name='FirstName']");
		  
		         WebElement f1a = odriver.findElement(f1);
		         
		         f1a.sendKeys("Nucot"); */
		
		By f0 = By.xpath("//input[@id='FirstName' and @type='text']");
		
		WebElement fo1 = odriver.findElement(f0);
		fo1.sendKeys("Nucot Bangalore");
		
		Thread.sleep(3000);
		
		odriver.quit();
		
		         
		         
		  
		
	}

}
