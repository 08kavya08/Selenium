package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetSize {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(5000);
	Dimension webelementsize = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
	System.out.println(webelementsize)  ;
	System.out.println(webelementsize.getHeight());
	System.out.println(webelementsize.getWidth());
}
}
