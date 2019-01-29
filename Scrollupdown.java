package Automation;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/sandhyakb/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testing.onedirect.in");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("charlie.onedirect@gmail.com");
		driver.findElement(By.name("password")).sendKeys("t");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='product-image']")).click();
	    Thread.sleep(10000);
		//driver.get("http://www.flipkart.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 List<WebElement> list=driver.findElements(By.xpath("//span[@class='ui-paginator-pages']//child::a"));
		 for(WebElement webwl:list) {
			String value= webwl.getText().trim();
			if(value.equals("2")){
				System.out.println(value);
				Thread.sleep(5000);
				webwl.click();
			
				
				
			}
			 
		 }
		/*for(int i=0;i<5;i++) {
			js.executeScript("window ,scrollBy(0,500)");   //scroll down
			Thread.sleep(1000);
		}
		for(int i=0;i<5;i++) {
			js.executeScript("window ,scrollBy(0,-500)");        //scroll up
			Thread.sleep(1000);
		}*/

		
	}
	

}
