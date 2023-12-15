package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YonoSBIMoveByOffSet {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	driver.findElement(By.id("userName")).sendKeys("kiiran");
	driver.findElement(By.id("password")).sendKeys("kiranraj");
	//WebElement eyebutton = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
	
	Actions action=new Actions(driver);
	action.moveByOffset(118, 420).perform();

	
}
}
