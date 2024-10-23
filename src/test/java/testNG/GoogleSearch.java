package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class GoogleSearch {
//WebDriver w;
	RemoteWebDriver w;
DesiredCapabilities dc;
	@BeforeClass
	public void launchBrowser() {
		
		dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("firefox");
		
		  w = new RemoteWebDriver(dc);
		
		 
		 w.manage().window().maximize();
	}
	@BeforeMethod
	public void openURL() throws Exception {
		
		w.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	@Test(dataProviderClass = DataproviderRepo.class,dataProvider = "getdata")
	public void search(String search) throws Exception {
		w.findElement(By.id("APjFqb")).sendKeys(search,Keys.ENTER);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void back() throws Exception {
		w.navigate().back();
		Thread.sleep(2000);
	}
	@AfterClass
	public void browserClose() {
		w.quit();
	}

}
