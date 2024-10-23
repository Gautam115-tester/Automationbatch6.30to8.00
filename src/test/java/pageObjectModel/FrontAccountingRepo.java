package pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class FrontAccountingRepo {
WebDriver w;
public FrontAccountingRepo(WebDriver wd) {
	w = wd;
}
//	1. element store 
	By username = By.name("user_name_entry_field"); // locator  // Global
	By password = By.name("password");
	By loginbtn = By.name("SubmitUser");
	By SQE = By.linkText("Sales Quotation Entry");
	By cancel = By.id("CancelOrder");
	By logoutbtn = By.linkText("Logout");
//	2. set of action
	public void clearvalues() {
		w.findElement(username).clear();
		w.findElement(password).clear();
	}
	public void EnterAData() {
		w.findElement(username).sendKeys("demouser");
		w.findElement(password).sendKeys("password");
	}
	public void login() {
		w.findElement(loginbtn).click();
	}
	public void SalesQuotationEntry() {
		w.findElement(SQE).click();
	}
	public void clickOnCancelQuotation() {
		w.findElement(cancel).click();
	}
	public void Alert() {
		w.switchTo().alert().accept();
	}
	public void logout() {
		w.findElement(logoutbtn).click();
	}
}