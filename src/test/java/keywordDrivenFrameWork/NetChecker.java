package keywordDrivenFrameWork;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class NetChecker {
	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().minimize();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("speed test",Keys.ENTER);
		for(int i = 1; i <= 1000;i++) {
			w.findElement(By.id("knowledge-verticals-internetspeedtest__test_button")).click();
		TimeUnit.SECONDS.sleep(40);
	String Downspeed = w.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/g-lightbox/div/div[2]/div/span/div/div/div[2]/div[2]/div[1]/div[1]/p[1]")).getText();
	System.out.println("Download speed is "+Downspeed+" Mbps for "+i+"try");
	String uploadspeed = w.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div[1]/div/div/div[1]/div/div/div/div/div[2]/div/g-lightbox/div/div[2]/div/span/div/div/div[2]/div[2]/div[1]/div[2]/p[1]")).getText();
	System.out.println("Upload speed is "+uploadspeed+" Mbps for "+i+"try");
	Actions act = new Actions(w);
WebElement cut =	w.findElement(By.cssSelector("svg[jsaction=\"wijbl\"]"));
act.moveToElement(cut).click().perform();
    TimeUnit.SECONDS.sleep(60);
		}
	}
}
