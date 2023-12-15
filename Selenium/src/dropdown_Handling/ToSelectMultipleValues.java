package dropdown_Handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectMultipleValues {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapp.skillrary.com/");
	WebElement listbox = driver.findElement(By.id("cars"));
	//select class
	Select multiSelect=new Select(listbox);
	System.out.println(multiSelect.isMultiple());
	//to select
	multiSelect.selectByIndex(0);
	multiSelect.selectByValue("199");
	Thread.sleep(2000);
	//to deselect
	//multiSelect.deselectByIndex(0);
//	multiSelect.deselectByValue("199");
	multiSelect.deselectAll();
			
	
}
}
