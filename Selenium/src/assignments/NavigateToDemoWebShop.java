package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToDemoWebShop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Register")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("Female")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("FirstName")).sendKeys("kaavz");
	Thread.sleep(2000);
	driver.findElement(By. id  ("LastName")).sendKeys("raaj");
	Thread.sleep(2000);
	driver.findElement(By.id("Email")).sendKeys("kavz@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("Password")).sendKeys("143");
	Thread.sleep(2000);
	driver.findElement(By.id("Confirm password")).sendKeys("143");
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
  	
}
}
