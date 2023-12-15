package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIdLocators {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("kaaavz");
		driver.findElement(By.id("LastName")).sendKeys("raaaj");
		driver.findElement(By.id("Email")).sendKeys("kavyaraj@gamil.com");

	}
   
}
