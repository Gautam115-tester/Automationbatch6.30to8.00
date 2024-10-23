package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml/5.3.0");

		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
