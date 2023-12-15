 package dropdown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import graphql.relay.Edge;

public class ToHandleSingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	//dropdown
WebElement dayDropdown = driver.findElement(By.id("day"));
    WebElement monthDropdown = driver.findElement(By.id("month"));  
WebElement yearDropdown = driver.findElement(By.id("year"));

//select class to handle
Select daySelect =new Select(dayDropdown);
Select monthselect=new Select(monthDropdown);
Select yearselect=new Select(yearDropdown);

 
//call the methods
daySelect.selectByIndex(8);
monthselect.selectByValue("Oct");
yearselect.selectByVisibleText("2001");



//to fetch all options
List<WebElement> allMonths = monthselect .getOptions();
for(WebElement month:allMonths) {
	System.out.println(month.getText());
	monthselect.selectByVisibleText(month.getText());
	Thread.sleep(2000);
	
}



	
}
}
