package mytour;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.org.apache.bcel.internal.generic.Select;

public class BooingHotel {

	public static void main(String[] args) throws Exception {
		
	    System.setProperty("webdriver.gecko.driver", "E:\\automation\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
 		driver.get("https://mytour.vn/");

// search hotel 4117
 		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/form/div[1]/div/span/input[2]"));
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/form/div[1]/div/span/input[2]")).sendKeys("Demo ");
 		Thread.sleep(3000);
 		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/form/div[1]/div/span/div/div[1]/div[2]/span/strong")).click();
 		
 // choose booking date
// 		driver.findElement(By.xpath("/tr/td[4]"));
// 		driver.findElement(By.xpath("/tr/td[4]")).click();
 	
 		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/form/div[2]/div/div/div[2]/input")).click();
// 		driver.findElement(By.xpath("/tr/td[5]"));
// 		driver.findElement(By.xpath("/tr/td[5]")).click();
 		driver.findElement(By.xpath("//td[@class='active day']")).click();
 		
 // click on submit button
 		driver.findElement(By.xpath("//button[@class='events-tracking btn btn-block btn-lg btn-yellow']")).click();
 		
 // scroll down
 		JavascriptExecutor js = ((JavascriptExecutor) driver);
 		js.executeScript("window.scrollTo(0, 1200)");
 		
 // go to booking page (phong superior 3 nguoi)
 		driver.findElement(By.xpath("//button[@id-room='24354']")).click();
 		
 // input customer infor on booking page
 		driver.findElement(By.xpath("//input[@id='customer_email']")).sendKeys("ngocthomttk7@gmail.com");
 		driver.findElement(By.xpath("//input[@id='customer_phone']")).sendKeys("02471099999");
 		driver.findElement(By.xpath("//input[@id='customer_name']")).sendKeys("IT Test");
 // choose option city 
// 		driver.findElement(By.xpath("//span[@id='select2-customer_city-ct-container']")).click();
// 		driver.findElement(By.xpath("//li[@id='select2-customer_city-ct-result-u1x5-2']")).click();
 		
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//*[@class='select2-selection__arrow']")).click();
 	    driver.findElement(By.xpath("//*[@class='select2-results__option'][2]")).click();
 		
 		
 		js.executeScript("window.scrollTo(0, 250)");
 		
 // choose store near house  payment method		
 		driver.findElement(By.xpath("//a[@data-label='Pay at store']")).click();
 		Thread.sleep(3000);
 		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 		
 // click payment to get order
 		driver.findElement(By.xpath("//div[@class='confirm-payment show']")).click();
 	Thread.sleep(10000);	
 // Take screenshot
// 	WebDriverWait wait = new WebDriverWait(driver, 10); 
// 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("[//div[@class='booking-code']")));
 	
 	 DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
	 Calendar cal = Calendar.getInstance();
 	 String currentDateTime = dateFormat.format(cal.getTime());
 	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 	 FileUtils.copyFile(scrFile, new File("E:\\automation\\Screenshot\\"  + currentDateTime + ".jpeg"));
 		

 	 // print booking on screen
 	 
 	WebElement booking = driver.findElement(By.xpath("//strong[@class='blue']"));
 	booking.getText();
 	System.out.println("Booking hotel success! ");
 	System.out.println("Booking code:  " + booking.getText());
	 	
 	
 	
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	
 	
	}

}
