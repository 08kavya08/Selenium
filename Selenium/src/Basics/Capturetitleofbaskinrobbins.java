package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Capturetitleofbaskinrobbins {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.baskinrobbins.com");
	String titleofthewebpage = driver.getTitle();
	System.out.println("titleofthewebpage");
}
}
