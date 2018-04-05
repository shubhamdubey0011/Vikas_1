package com.icpl.infostretch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Demo_Workspace/Infostretch/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("hello");
		driver.manage().window().maximize();
		driver.get("https://play.google.com/store");
		driver.findElement(By.xpath("//div/a[text()='Sign in']")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shubhamdubey0011@gmail.com");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("goldberg4609");
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//content/span[text()='Next']")).click();
		driver.navigate().to("https://play.google.com/store/apps/details?id=com.facebook.katana");
		//driver.close();
		


	}
}
