package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForDemoWebShop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("kavz@gamil.com");
	driver.findElement(By.id("Password")).sendKeys("kaaavvzz");
	driver.findElement(By.id("RememberMe")).click();  
}
}
