package com.icpl.infostretch;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseDriver {
	public  WebDriver driver;
	@BeforeTest
	@Parameters({ "browser" })
	
	public void browserconfig(String browser) {

		if (browser.equalsIgnoreCase("chrome")) 
		{
              
			String path = System.getProperty("user.dir") + "\\Drivers" +"\\chromedriver.exe";
			//System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path);

			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("IE")) {
			String path = System.getProperty("user.dir") + "\\Drivers" +"\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", path);
			driver = new InternetExplorerDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {

			String path = System.getProperty("user.dir") + "\\Drivers" +"\\geckodriver.exe";
			//System.out.println(path);
			System.setProperty("webdriver.gecko.driver", path);

			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("ieEdge")) {
			String path = System.getProperty("user.dir") + "\\Drivers" +"\\MicrosoftWebDriver.exe";
			System.setProperty("webdriver.edge.driver", path);

			driver = new EdgeDriver();
		}

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

	}

}
