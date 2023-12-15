package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class togetcurrenturl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}

}
