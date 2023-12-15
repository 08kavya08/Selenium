package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseDependentAndIndependentXpath {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(2000);
	
}
}
