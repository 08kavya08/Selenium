package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchSmnthnginAmazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(  2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("rx bikes");
	driver.findElement(By.id("nav-search-submit-button")).click();
}
}