package WebElements_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToExploreExplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/18");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.id("Check Delivery")).sendKeys("560011"); 
		WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeSelected(By.id("Check")));
		driver.findElement(By.id("Check")).click();
		
		

		

	}

}
