package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClickAndGetText {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	
	String login = driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).getText();
	System.out.println( login);
	driver.close();
}
}
