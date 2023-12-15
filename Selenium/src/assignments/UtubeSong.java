package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtubeSong {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("search-input")).sendKeys("animal songs");
	Thread.sleep(2000);
	driver.findElement(By.id("search-icon-legacy")).click();
	
}
} 