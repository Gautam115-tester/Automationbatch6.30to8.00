package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class TestingOnAnnotation {
  WebDriver w;
  @Parameters("browser")  // parameter calling name
  @BeforeClass  // We only used at that time went we going to perform pre-conditon one time.
  public void openBrowser(String valueOfParameter) // it will execute itself only one time before Method 
  {
	  if (valueOfParameter.equals("chrome")) {
		  w = new ChromeDriver();
	} else if (valueOfParameter.equals("firefox")) {
		w = new FirefoxDriver();
	}   
		w.manage().window().maximize();
  } 
	@BeforeMethod // pre test condition -- > before executing an test condition it should execute everytime itself.
	public void LaunchURL() {
		w.get("https://demo.frontaccounting.eu/");
	}
	@Test (priority = 1)// Test condition -- > what we want to test 
	public void Login() {
		w.findElement(By.name("SubmitUser")).click();	
	}
	@Test (priority = 2) // test condition -- > what we want to test 
	public void SalesQuotationEntry() {
		w.findElement(By.name("SubmitUser")).click();	
		
		w.findElement(By.linkText("Sales Quotation Entry")).click();
	}
	@AfterMethod // post test condition --> after test condition is execute then it will execute itself. 
	public void logout() {
		w.findElement(By.linkText("Logout")).click();	
	}
	@AfterClass // It will execute itself after all execution is finish
	public void BrowserClosing() {
		w.quit();
	}
}
