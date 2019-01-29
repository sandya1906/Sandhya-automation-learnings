package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Userinviteflow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/sandhyakb/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirect.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='sprite settings_new']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='mat-list-item-content']//h3[.=' Users ']")).click();
		driver.findElement(By.xpath("//button[.=' + Add New User']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter email address']")).sendKeys("sandhyasandykb1996@gmail.com");

	}
}