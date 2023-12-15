package WebElements_Methods;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnumInSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(4000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
}
}
