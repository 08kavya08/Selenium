package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToGetScreenshotOfZomato {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/mysore/collections");
	Thread.sleep(2000);
	File temp = driver.findElement(By.xpath("//img[@alt='Zomato']")).getScreenshotAs(OutputType.FILE);
	File src = new File("./ErrorShots/zomato.png");
	FileHandler.copy(temp, src);
}
}
