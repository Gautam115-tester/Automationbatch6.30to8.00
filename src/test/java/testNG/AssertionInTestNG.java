package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {

	@Test
	public void AssertDemo() {
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		w.findElement(By.name("SubmitUser")).click();
////		Hard Assertion -->  it give result after execution
//		Assert.assertEquals(w.getTitle(), "Main Menus");
//		soft Assertion
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(w.getTitle(), "Main Menu");
	String sales = w.findElement(By.cssSelector
			("a[href=\"./sales/sales_order_entry.php?NewQuotation=Yes\"]")).getText();
		soft.assertEquals(sales, "Sales Quotation Entry");
		soft.assertAll();
		
	}
	
}
