package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Triggers {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/sandhyakb/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirect.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='sprite settings_new']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[.=' Triggers ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("app-triggers button[class='od-button small']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter Trigger Name']")).sendKeys("Testing trigger");
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Description']")).sendKeys("Test");
		driver.findElement(By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select")).click();
		driver.findElement(By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='current_priority']")).click();
		driver.findElement(By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='changed_to']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//app-auto-suggest//div[@class='agc-down-chevron']")).click();
		driver.findElement(By.xpath("//app-auto-suggest//ul[@class='agc-suggestions agc-expanded']//li[3]")).click();
		driver.findElement(By.cssSelector("app-action-ui-item div[class='pos-rel'] select  option[value='set_ticket_status']")).click();
		driver.findElement(By.xpath("(//app-auto-suggest//div[@class='agc-down-chevron'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//app-auto-suggest//ul)[2]//li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Inactive ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Save']")).click();


	}

}
