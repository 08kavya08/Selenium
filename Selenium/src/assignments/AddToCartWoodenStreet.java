package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartWoodenStreet {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.woodenstreet.com/");
	driver.findElement(By.id("loginclose1")).click();
	//item1
	driver.findElement(By.linkText("Sofas")).click();
	driver.findElement(By.xpath("//p[text()='Wooden Sofa Sets']")).click();
	driver.findElement(By.xpath("(//a[text()='Winster 3 Seater Printed Fabric Wooden Sofa (Honey Cream Checkered)'])[1]")).click();
	driver.findElement(By.xpath("//h1[text()='Winster 3 Seater Printed Fabric Wooden Sofa ']/..//a[@id='button-cart-buy-now']")).click();
	
	
	//item2
	driver.findElement(By.linkText("Living")).click();
	driver.findElement(By.xpath("//img[@title='TV Units and Stands']")).click();
	driver.findElement(By.xpath("(//a[text()='Hailey Engineered Wood Wall-Mounted Tv Unit with Shelf & Drawers (Exotic Teak Finish)'])[1]")).click();
	driver.findElement(By.xpath("//h1[text()='Hailey Engineered Wood Wall-Mounted Tv Unit with Shelf & Drawers ']/..//a[@id='button-cart-buy-now']")).click();
	 
	
	
}
}
