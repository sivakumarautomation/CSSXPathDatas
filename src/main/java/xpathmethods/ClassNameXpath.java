package xpathmethods; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassNameXpath { //class//
	
	public static void main(String[] args) throws InterruptedException { //main//
		
		WebDriverManager.chromedriver().setup();

		WebDriver odriver = new ChromeDriver();

		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//XPATH//CLASS NAME
		
		       By un = By.className("login-email");
		       By no = By.className("login-password");
		       
		       WebElement a1 = odriver.findElement(un);
		       WebElement a2 = odriver.findElement(no);
		       
		       a1.sendKeys("abc@gmail.com");
		       a2.sendKeys("1234");
		       
		       Thread.sleep(3000);
		       
		       odriver.quit();
		
		
	}

}
