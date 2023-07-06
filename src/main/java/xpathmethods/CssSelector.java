package xpathmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver odriver = new ChromeDriver();

		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		    By fn1 = By.cssSelector("#username");
		    By fn2 = By.cssSelector("#password");
		    
			WebElement fno = odriver.findElement(fn1);
			WebElement pwd = odriver.findElement(fn2);
			
			fno.sendKeys("admin");
			
			pwd.sendKeys("abcde");
			
			Thread.sleep(3000);
			
			String page = odriver.getCurrentUrl();
			System.out.println(page);

			String topic = odriver.getTitle();
			System.out.println(topic);
			
			odriver.quit();
			
	}

}
