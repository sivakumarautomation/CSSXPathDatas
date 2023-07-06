package xpathmethods; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText { //class//
	
	public static void main(String[] args) throws InterruptedException { //main//
		

		WebDriverManager.chromedriver().setup();

		WebDriver odriver = new ChromeDriver();

		odriver.get("https://app.hubspot.com/login");
		odriver.manage().window().maximize();
		
		odriver.manage().deleteAllCookies();
		
		//XPATH//
		
		    By linkText = By.linkText("Forgot my password");
		    
		    By partialLinkText = By.partialLinkText("Policy");
		    
		    WebElement link = odriver.findElement(linkText);
		    
		    WebElement pl = odriver.findElement(partialLinkText);
		    
		    link.click();
		    pl.click();
		    
		    Thread.sleep(6000);
		    
		     odriver.quit();
	}

}
