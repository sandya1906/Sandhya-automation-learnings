package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ticketingrule {
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
		driver.findElement(By.xpath("//h3[.=' Ticketing Rules']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[@class='right-part']//button[@class='od-button small']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Rule Name']")).sendKeys("Rule1");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select")).click();
		driver.findElement(By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='source']")).click();
		driver.findElement(By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='is_equal']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-chips-holder'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-chips-holder'])[1]//ul//li[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-chips-holder'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-chips-holder'])[2]//ul//li[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='act-priority'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-chips-holder'])[3]//div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='ng-chips-holder'])[3]//ul//li[10]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Save']")).click();
	}

}
