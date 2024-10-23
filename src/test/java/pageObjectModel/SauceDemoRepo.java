package pageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SauceDemoRepo {
	public SauceDemoRepo(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}
	@FindBy(id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "login-button") WebElement loginbtn;
	@FindBy(css = "button[id=\"react-burger-menu-btn\"]") WebElement openmenubtn;
	@FindBy(linkText = "Logout") WebElement logoutbtn;
	public void login() {
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginbtn.click();
	}
	public void logout() {
		openmenubtn.click();
		logoutbtn.click();
	}	
}