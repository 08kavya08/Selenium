package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubefavSong {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("search")).sendKeys("jagave neenu gelathiye");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='LOVE 360 | Jagave Neenu I Video Song | Sid Sriram | Praveen | Rachana Inder | Arjun Janya | Shashank']")).click();
	}

}
