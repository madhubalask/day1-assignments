package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("MadhuBala");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Madhu");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Bala");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Madhubalaanand2@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345678");
	}

}
