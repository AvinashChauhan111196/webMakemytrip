package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDef 
{

	public static void main(String args[]) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\avinashkc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
		
		driver.manage().window().maximize();

//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
//		Thread.sleep(5000);
			
		
		
//		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
//		
//		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
//		
//		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
		
		
//		driver .findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div"));
//		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/button")).click();
		
//		Alert alert = driver.switchTo().alert();
//		
//		alert.accept();
				
		driver.switchTo().parentFrame();

	}

}