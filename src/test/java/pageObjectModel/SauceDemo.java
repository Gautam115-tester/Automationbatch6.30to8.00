package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SauceDemoRepo r = new SauceDemoRepo(w);
		w.get("https://www.saucedemo.com/");
		r.login();
		r.logout();

	}

}
