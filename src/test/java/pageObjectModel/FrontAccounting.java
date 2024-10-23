package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrontAccounting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		FrontAccountingRepo r = new FrontAccountingRepo(w);
		w.get("https://demo.frontaccounting.eu/index.php");
		Thread.sleep(2000);
		r.clearvalues();
		Thread.sleep(2000);
		r.EnterAData();
		Thread.sleep(2000);
		r.login();
		Thread.sleep(2000);
		r.SalesQuotationEntry();
		Thread.sleep(2000);
		r.clickOnCancelQuotation();
		Thread.sleep(2000);
		r.Alert();
		Thread.sleep(2000);
		r.logout();
	}
}