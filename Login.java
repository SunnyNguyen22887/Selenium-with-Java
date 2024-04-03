package mytour;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.beust.jcommander.Parameters;



public class Login {
	static WebDriver driver;
	static WebDriverWait wait;
	
	
	public static void main(String[] args) throws Exception {
		    System.setProperty("webdriver.gecko.driver", "E:\\automation\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
     		driver.get("https://mytour.vn/");

     		Thread.sleep(3000);

	   
		    driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		    driver.findElement(By.xpath("//a[@modal-name='modal-login']")).click();
		    	    
		    Thread.sleep(3000);
		  

// input name and pass to login	    
		    driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/form/div[4]/input")).sendKeys("test123@gmail.com");
		    driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[2]/form/div[5]/input")).sendKeys("123456");
		    driver.findElement(By.xpath("/html/body/div[7]/div/div/div/div[3]/button")).click();
		  

//	explicit wait to close form advertisment    
//		    WebDriverWait wait = new WebDriverWait(driver, 10);
//		    WebElement element  =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[9]/form[1]/div")));
//		    driver.findElement(By.id("ematic_closeExitIntentOverlay_1_xl_1_2")).click();

		    
		    
Thread.sleep(3000);
         if (driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).getText().equalsIgnoreCase("Tài khoản"))  
		    {
		    	System.out.println("Login failed! ");
		    }
        else {
	            System.out.println("Login success! ");
            }
Thread.sleep(3000);
         driver.quit();
//
//		    if(driver.findElement(By.xpath("//a[@onclick='logout();']")).getText().equalsIgnoreCase("Thoát"))
//		    {
//		    	 System.out.println("Login success! ");
//		    }
//		    else {
//		    	System.out.println("Login failed! ");
//		    }
//		    
}
	}
