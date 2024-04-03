package mytour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccountRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.gecko.driver", "E:\\automation\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.get("https://mytour.vn/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		
//			driver.findElement(By.className("fa fa-user")).click();
//			driver.findElement(By.xpath("\\a[@class='dropdown-toggle']||[@data-toggle='dropdown']||[@role='button']")).click();
//			System.out.print(driver.getCurrentUrl());
//			driver.quit();
	}

}
