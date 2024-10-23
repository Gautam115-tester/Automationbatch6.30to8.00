package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoRepo {
WebDriver w;
	public DemoRepo(WebDriver wd) {
		PageFactory.initElements(wd, this);
		w = wd;
	}
//	login
	@FindBy (name = "username") private WebElement username;
	@FindBy(name = "password") private WebElement password;
	@FindBy(css = "button[type=\"submit\"]") private WebElement loginbtn;
//	pim
	@FindBy(linkText = "PIM") private WebElement pim;
//	jobtitle
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i") private WebElement jobtitleDropdown;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div") private List<WebElement> TotalJobTitle;
//	logout
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i") private WebElement logoutDropDown;
	@FindBy(linkText =  "Logout") private WebElement logoutbtn;
	public void login(String user , String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbtn.click();
	}
	public void PIM() {
		pim.click();
	}
	public void jobtitleSelect(String total) throws Exception {
		jobtitleDropdown.click();
		Thread.sleep(2000);
		for (WebElement tjb : TotalJobTitle) {
			if (tjb.getText().equals(total)) {
				tjb.click();
				break;
			}
		}
	}
	public void logout() {
		logoutDropDown.click();
		logoutbtn.click();
	}
	
	
}
