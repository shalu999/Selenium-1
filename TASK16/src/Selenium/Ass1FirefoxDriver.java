package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ass1FirefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\GUVI\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("The title of the page is  "+driver.getTitle()); 
		driver.close();
		

	}

}
