package mytour;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendEmail {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// send email booking code 
		System.setProperty("webdriver.gecko.driver", "E:\\automation\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/intl/vi/gmail/about/");
		
	// 	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL  + "t");
	 	
	 	driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
	 	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("mtsendmailtest@gmail.com");
	 	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mytourtest");
	 	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	 	
	 	Thread.sleep(5000);
	 	
	 	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
	 	
	 // input mail content
	 	driver.findElement(By.xpath("//textarea[@id=':ni']")).sendKeys("thomnt.tester@mytour.vn");
	 	driver.findElement(By.xpath("//input[@id=':n1']")).sendKeys("Booking daily");
	 	driver.findElement(By.xpath("//div[@id=':o2']")).sendKeys("See attachment as booking daily ");
	 	driver.findElement(By.xpath("//div[@id=':oo']")).click();
	 	
	 	
		
		
	}

}
