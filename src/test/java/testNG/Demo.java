package testNG;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class Demo {
RemoteWebDriver w;
	DesiredCapabilities dc ;
	
	@Test (invocationCount = 2 , priority = 2)
	public void Google() {
	     dc	= new DesiredCapabilities();
	     
	     dc.setPlatform(Platform.WINDOWS);
	     dc.setBrowserName("chrome");
		
		w = new RemoteWebDriver(dc);
		w.get("https://www.google.com/");
	}
	

	
}
