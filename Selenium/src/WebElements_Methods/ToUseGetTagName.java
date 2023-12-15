package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetTagName {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://actitime.com/");
	Thread.sleep(4000);
	String tagname = driver.findElement(By.linkText("Try Free")).getTagName();
	System.out.println(tagname);
			
}
}
