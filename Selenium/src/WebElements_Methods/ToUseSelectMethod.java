package WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSelectMethod {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	WebElement element = driver.findElement(By.xpath("//option[text()='INR 100 - INR 199 ( 16 ) ']"));
	System.out.println(element.isSelected());
	element.click();
	System.out.println(element.isSelected());
	
}
}
