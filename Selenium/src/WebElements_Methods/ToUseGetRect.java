package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRect {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(3000);
	Rectangle rect = driver.findElement(By.xpath("//button[@type='submit']")).getRect();
	System.out.println(rect);
}

}
