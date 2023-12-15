package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetoamazon {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com");
	String sourcecode = driver.getPageSource();
	System.out.println(sourcecode);
	
}
}  
