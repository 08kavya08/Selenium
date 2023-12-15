package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitlemethod2 {
public static void main(String[] args) {
	
}{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String titleofthewebpage = driver.getTitle();
	System.out.println(titleofthewebpage);
}
}
