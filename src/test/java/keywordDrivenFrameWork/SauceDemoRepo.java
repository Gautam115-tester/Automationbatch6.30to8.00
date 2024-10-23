package keywordDrivenFrameWork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SauceDemoRepo {
	public SauceDemoRepo(WebDriver wd) {
		PageFactory.initElements(wd, this);
	}
	@FindBy (id = "user-name") private WebElement username;
	@FindBy (name  = "password") private WebElement password;
	@FindBy (css = "input[value=\"Login\"]") private WebElement loginbtn;
	@FindBy (id = "react-burger-menu-btn") private WebElement openmenu;
	@FindBy (linkText = "Logout") private WebElement logoutbtn;
	
	
	public void EnterData(String user , String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	public void login() {
		loginbtn.click();
	}
	public void openmenu() {
		openmenu.click();
	}
	public void logout() {
		logoutbtn.click();
	}
	public void clearData() {
		username.clear();
		password.clear();
	}
	
	
	
	
	
}
