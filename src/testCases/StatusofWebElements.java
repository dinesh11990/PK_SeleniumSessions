package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusofWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//isDisplayed() -> Whether webelement displayed in webpage    isEnabled() -> We can write in text field or not
		
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("Display status:" +searchStore.isDisplayed()); //true
		
		System.out.println("Enable status:" +searchStore.isEnabled()); //true
		
		//isSelected() - used for radio buttons, check boxes, dropdown
		
		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println(male.isSelected()); //False
		System.out.println(female.isSelected()); //False
		
		male.click();
		
		System.out.println(male.isSelected()); //False
		System.out.println(female.isSelected()); //False
		
		female.click();
		
		System.out.println(male.isSelected()); //False
		System.out.println(female.isSelected()); //False
		
		
		

		
	}

}
