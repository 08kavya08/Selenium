package WebElements_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenStreetUsingFindElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.woodenstreet.com/");
	Thread.sleep(2000);
List<WebElement> allele = driver.findElements(By.xpath("//ul[@class='container flex']/li"));
	 for(WebElement ele:allele) {
		 System.out.println(ele.getText());
	 }
}
}
