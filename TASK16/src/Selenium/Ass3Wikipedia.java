package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\GUVI\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();

		driver.findElement(By.id("searchInput")).sendKeys(" artificial intelligence");

		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("History")).click();

	}

}
