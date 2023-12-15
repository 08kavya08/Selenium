package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetodominosz {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.dominos.com");
	driver.manage().window().setSize(new Dimension(800, 800));
	
}
}
    