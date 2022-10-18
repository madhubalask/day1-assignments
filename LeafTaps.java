package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Madhu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BCA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("sghsgjhdvjfyhu");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhubalaanand4@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("xxxxxxx");
		driver.findElement(By.linkText("Upload Leads")).click();
		String name=driver.getTitle();
		System.out.println(name);
		
		
	}

}
