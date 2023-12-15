package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Toquitbrowser {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		driver.quit();
}
}