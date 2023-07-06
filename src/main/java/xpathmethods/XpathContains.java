package xpathmethods; //package//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathContains { //class//
	
	public static void main(String[] args) throws InterruptedException { //main//
		
		WebDriverManager.chromedriver().setup();

		WebDriver odriver = new ChromeDriver();

		odriver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		odriver.manage().window().maximize();
		odriver.manage().deleteAllCookies();
		
		//xpath contains//
		
		By Contains = By.xpath("//a[contains(text(),'Register')]");
		
	   WebElement Textlabel = odriver.findElement(Contains);
	   
	   String t1 = Textlabel.getText();
	   System.out.println(t1);
	   
	   Thread.sleep(3000);
		
	   odriver.quit();
	}

}
