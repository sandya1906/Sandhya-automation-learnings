package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auxstatus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/sandhyakb/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirectdev117.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.xpath("//span[@class='sprite settings_new']")).click();
      	Thread.sleep(5000);
      	driver.findElement(By.xpath("(//h3[@class='title profile-text mat-line'])[11]")).click();
      	Thread.sleep(4000);
	    driver.findElement(By.xpath("(//button[@class='od-button small'])[2]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter Status Name']")).sendKeys("Busy1");
	    driver.findElement(By.xpath("//input[@placeholder='Enter Status Description']")).sendKeys("break");
	    driver.findElement(By.xpath("//i[@class='icon-arrow-down']")).click();
	    driver.findElement(By.cssSelector(".chooser-suggestions li:nth-child(2)")).click();
        driver.findElement(By.xpath("(//button[@class='od-button small'])[2]")).click();
        Thread.sleep(5000);
        driver.get("http://testing.onedirectdev117.in/v2/settings/agent-status");
        Thread.sleep(5000);
        WebElement e1=driver.findElement(By.cssSelector("i[class='icon-delete']"));
    	Actions a=new Actions(driver);
    	a.moveToElement(e1).build().perform();
      	driver.findElement(By.cssSelector("i[class='icon-delete']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//button[text()=' Yes ']")).click(); 
	}
		
	}


