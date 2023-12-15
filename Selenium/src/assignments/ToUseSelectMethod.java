package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSelectMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).submit();
		Thread.sleep(2000);
		 WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']/../../..//span[text()='Get It in 2 Days']"));
		System.out.println(ele.isSelected());
		ele.click();
		Thread.sleep(2000);
		System.out.println(ele.isSelected()); 

	}

}
