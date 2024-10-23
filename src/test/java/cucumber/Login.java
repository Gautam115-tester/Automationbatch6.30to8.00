package cucumber;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Login {
	WebDriver w;
	@Given("lauch chrome browser And open saucedemo site in chrome browser.")
	public void lauch_chrome_browser_and_open_saucedemo_site_in_chrome_browser() {
	   w = new ChromeDriver();
	   w.get("https://www.saucedemo.com/");
	}
	@When("Enter {string} in username field And Enter {string} in password field And Click on login button.")
	public void enter_in_username_field_and_enter_in_password_field_and_click_on_login_button(String username, String password) {
	   w.findElement(By.id("user-name")).sendKeys(username);
	   w.findElement(By.id("password")).sendKeys(password);
	   w.findElement(By.name("login-button")).click();
	}
	@Then("I verify user is login by checking url of site.")
	public void i_verify_user_is_login_by_checking_url_of_site() {
		String acturl = w.getCurrentUrl();
		String expurl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(expurl, acturl);
	}
}
