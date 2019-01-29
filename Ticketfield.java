package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ticketfield {
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
      	driver.findElement(By.xpath("//a[@routerlink='ticket-fields']")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//section[@class='right-part']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//i[@class='icon-arrow-down']")).click();
    	
    	//single line of text
    	driver.findElement(By.xpath("//span[@class='ellipses']")).click();           
    	driver.findElement(By.xpath("//input[@placeholder='Enter Field Title']")).sendKeys("Text_filed");
    	driver.findElement(By.xpath("//label[@class='od-checkbox-label field-checkbox']")).click();
    	driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Text");
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[2]")).click();
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[3]")).click();
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    	
    	//Paragraph field
    	 driver.findElement(By.cssSelector(".chooser-suggestions li:nth-child(2)")).click();          
    	driver.findElement(By.xpath("//input[@placeholder='Enter Field Title']")).sendKeys("Text_filed1");
    	driver.findElement(By.xpath("//label[@class='od-checkbox-label field-checkbox']")).click();
    	driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Text");
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[2]")).click();
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[3]")).click();
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    	
    	//Drop down filed
    	
    	
        driver.findElement(By.cssSelector(".chooser-suggestions li:nth-child(3)")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Enter Field Title']")).sendKeys("Text_filed1");
    	driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Text");
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[2]")).click();
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[3]")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Value 1']")).sendKeys("option1");
    	driver.findElement(By.xpath("//i[@class='icon-plus_line ']")).click();
    	driver.findElement(By.xpath("//i[@class='icon-plus_line ']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@id='opt-1']")).sendKeys("option2");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='opt-2']")).sendKeys("option3");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//button[text()='Save']")).click(); 
    	
    	
    	
    	//Date filed
    	
    	driver.findElement(By.cssSelector(".chooser-suggestions li:nth-child(5)")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Enter Field Title']")).sendKeys("Text_filed1");
    	driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Text");
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[2]")).click();
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[3]")).click();
    	driver.findElement(By.xpath("//button[text()='Save']")).click(); 
    	
    	
    	//Regex filed
    	driver.findElement(By.cssSelector(".chooser-suggestions li:nth-child(6)")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Enter Field Title']")).sendKeys("Text_filed1_Regex");
    	driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Text");
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[2]")).click();
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[3]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Expression']")).sendKeys("Alphabets");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Error Text']")).sendKeys("Entered text not matching");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    	
    	
    	
    	//Dependent dropdown
    	driver.findElement(By.cssSelector(".chooser-suggestions li:nth-child(4)")).click();
    	driver.findElement(By.xpath("//input[@placeholder='Enter Field Title']")).sendKeys("Text_filed1");
    	driver.findElement(By.xpath("//textarea[@placeholder='Enter Description']")).sendKeys("Text");
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[2]")).click();
    	driver.findElement(By.xpath("(//label[@class='od-checkbox-label'])[3]")).click();
    	driver.findElement(By.cssSelector("input[type='file']")).sendKeys("/home/sandhyakb/Downloads/SampleCustomLabel (2).xlsx");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    	
    	
    	
    		   
    	

   }
}
