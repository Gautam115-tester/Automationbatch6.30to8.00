package cucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SaucedemoLogin {
WebDriver w;
	@Given("Launch Chrome Browser.")
	public void launch_chrome_browser() {
	    w = new ChromeDriver();
	}
	@Given("Open SauceDemo site.")
	public void open_sauce_demo_site() {
	   w.get("https://www.saucedemo.com/");
	}
	@When("Enter {string} in username field.")
	public void enter_in_username_field(String user) {
	    w.findElement(By.id("user-name")).sendKeys(user);
	}
	@When("Enter {string} in password field.")
	public void enter_in_password_field(String pass) {
	    w.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click on Login button.")
	public void click_on_login_button() {
	    w.findElement(By.id("login-button")).click();
	}
	@Then("validate login by checking url.")
	public void validate_login_by_checking_url() {
	  String expURL = "https://www.saucedemo.com/inventory.html";
	  String actURL = w.getCurrentUrl();
	  Assert.assertEquals(expURL, actURL);
	}
	@Then("check also swag lab should present.")
	public void check_also_swag_lab_should_present() {
	String actelement =   w.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
	String expelement = "Swag Labs";
	Assert.assertEquals(expelement, actelement);
	}
	
}
