package WebElements_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToShoppersStack {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.shoppersstack.com/products_page/18");
	driver.findElement(By.id("Check Delivery")).sendKeys("560011");
	driver.findElement(By.id("Check")).click();
}
}
