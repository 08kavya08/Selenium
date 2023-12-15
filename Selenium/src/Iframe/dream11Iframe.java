package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11Iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		//using index
		//driver.switchTo().frame(0);
	//	driver.findElement(By.id("regEmail")).sendKeys("4204204200"); 
		
		//using string id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		//using webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("regEmail")).sendKeys("4204204200");
		Thread.sleep(2000);
		//switch to back
		driver.switchTo().parentFrame();
		  
		
		
	}
	}


