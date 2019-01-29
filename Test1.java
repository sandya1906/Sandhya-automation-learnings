package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="/home/sandhyakb/Downloads/chromedriver";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.quit();
	}
}

