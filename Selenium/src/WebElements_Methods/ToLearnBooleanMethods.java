package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {
public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.instagram.com/");
	 Thread.sleep(3000);
	 System.out.println("Before entering the data");
WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
System.out.println(loginbutton.isDisplayed()  );
System.out.println(loginbutton.isEnabled());
System.out.println("-----");
System.out.println("After entering the data");
driver.findElement(By.name("username")).sendKeys("1234567890");
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("i dnt knw");
System.out.println(loginbutton.isDisplayed());
System.out.println(loginbutton.isEnabled());

	 
}
}
