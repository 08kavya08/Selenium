package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.className("username")).sendKeys("kaavz@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("kaavz143");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Login in'")).submit();
}
}
