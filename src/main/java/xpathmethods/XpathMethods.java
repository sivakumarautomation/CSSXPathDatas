package xpathmethods; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathMethods { //class//
	
	public static void main(String[] args) throws InterruptedException { //main//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver odriver = new ChromeDriver();
		
		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//XPath//Methods//Different//
		//1.Id//2.Position & Index
		
		By First = By.id("FirstName");

		By last = By.xpath("(//input[@type='text'])[3]");

		WebElement FirstLabel = odriver.findElement(First);

		WebElement Lastlabel = odriver.findElement(last);

		FirstLabel.sendKeys("siva");

		Lastlabel.sendKeys("kumar");

		Thread.sleep(4000);

		String Web = odriver.getCurrentUrl();
		System.out.println(Web);

		String title = odriver.getTitle();
		System.out.println(title);

		odriver.quit();
		
		      
		
	}

}
