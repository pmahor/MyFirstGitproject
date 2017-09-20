package FirstPack.First_Maven_proj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class First_Test_Class {
	

	@Test
	public static void firstmethod() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Pankaj BACKUP\\Selenium\\Workspace\\First_Selenium_Project\\libraries\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		// FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/");
		
		//driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		//Thread.sleep(20000);
		
		WebElement next = driver.findElement(By.xpath(".//*[@id='slide-16-layer-5']/a"));
		next.click();
		
		driver.navigate().back();
		Thread.sleep(20000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();


	}

}
