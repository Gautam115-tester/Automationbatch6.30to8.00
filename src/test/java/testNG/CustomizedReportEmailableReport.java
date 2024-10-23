package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomizedReportEmailableReport {

	@Test
	public void Frontaccounting() {
		WebDriver w = new ChromeDriver();
		Reporter.log("Chrome Browser Has been launch");
		w.get("https://demo.frontaccounting.eu/");
		Reporter.log("Chrome Browser Has been Redirected to this FrontAccounting demo site");
		w.findElement(By.name("SubmitUser")).click();
		Reporter.log("User login successfully");
		w.findElement(By.linkText("Logout")).click();	
		Reporter.log("User logout successfully");
	}
}