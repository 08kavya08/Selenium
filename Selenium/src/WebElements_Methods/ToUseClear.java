package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys("kaavz143");
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("kaaaavvzz");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
	
	
	
	
	
}
}
