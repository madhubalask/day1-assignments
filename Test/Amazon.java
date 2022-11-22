package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[]arg) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> phone = driver.findElements(By.xpath("//span[@class='a-price']//span[@class='a-price-whole']"));
		System.out.println(phone.size());
		
		for (int i = 0; i < phone.size(); i++) {
			 String value=phone.get(i).getText();
			 System.out.println(value);
			
		}	
		
	}

}
