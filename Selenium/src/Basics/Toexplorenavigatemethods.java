package Basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toexplorenavigatemethods {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	//navigate tostring url
	//driver.navigate().to("https://www.instagram.com/");
	
	//navigate tourl url
	driver.navigate().to(new URL("https://www.instagram.com/") );
	
	//calling more than one method
	Navigation nav = driver.navigate();
	Thread.sleep(2000);
	nav.back();
	Thread.sleep(2000);
	nav.forward();
	Thread.sleep(2000);
	nav.refresh();
	
	
	
}
} 
