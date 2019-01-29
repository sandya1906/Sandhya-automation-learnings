package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusinessHr {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/sandhyakb/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirectdev117.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@class='sprite settings_new']")).click();
      	Thread.sleep(5000);
      	driver.findElement(By.xpath("(//h3[@class='title profile-text mat-line'])[9]")).click();
      	Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class='od-button small'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Schedule Name']")).sendKeys("new_BH1");
        driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("test");
        Thread.sleep(5000);
        //driver.findElement(By.cssSelector("input[id='md-radio-4-input']")).click();
        //driver.findElement(By.xpath("(//input[@class='od-checkbox' and @type='checkbox'])[5]")).click();
        //driver.findElement(By.xpath("(//div[@class='mat-radio-inner-circle'])[1]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter holiday name']")).sendKeys("test1");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Sun']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Select Holiday Date']")).click();
        driver.findElement(By.xpath("//div[@title='2018-8-31']")).click();
        driver.findElement(By.xpath("(//button[@class='od-button small'])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        Thread.sleep(5000);
        

	}

}
