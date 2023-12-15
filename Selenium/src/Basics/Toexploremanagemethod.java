package Basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toexploremanagemethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://skillrary.com/");
	
	//To maximize
	//driver.manage().window().maximize();
	//Thread.sleep(3000);
	
	//To minimize
	//driver.manage().window().minimize();
	
	//To fullscreen
	//driver.manage().window().fullscreen();
	
	//Getsize
 // Dimension sizeofthewebpage = driver.manage().window().getSize();
//	System.out.println(sizeofthewebpage);
//	System.out.println(sizeofthewebpage.getHeight());
	//System.out.println(sizeofthewebpage.getWidth());
	
	//To set size
	//driver.manage().window().setSize(new Dimension(500, 500 ));
	
	//To get position
	//Point position = driver.manage().window().getPosition();
	//System.out.println(position );
	
	//To set position
	driver.manage().window().setPosition(new Point(50, 40));
	
	
	
}
}
