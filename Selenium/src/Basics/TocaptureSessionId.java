package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class TocaptureSessionId {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rummycircle.com/");
		Thread.sleep(3000);
String sessionid = driver.getWindowHandle();
System.out.println(sessionid);//A702FF8E39BE0622CDDE32E009DC33F3 
	}                         //56D0902BD8324209B462E28FCB14A2F2.8

}
