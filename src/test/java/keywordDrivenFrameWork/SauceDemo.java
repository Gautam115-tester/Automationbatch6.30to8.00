package keywordDrivenFrameWork;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class SauceDemo {
	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		SauceDemoRepo r = new SauceDemoRepo(w);
		w.get("https://www.saucedemo.com/");
		//		Reader it will read an file
		FileInputStream fis = new FileInputStream("C:\\Users\\Lab-03-Demo\\Downloads\\saucedemoKDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		for(int j = 1;j<= sheet1.getLastRowNum();j++) {
			XSSFRow data = sheet1.getRow(j);
			XSSFCell username = data.getCell(1);
			XSSFCell password = sheet1.getRow(1).getCell(2);
			for(int i = 1; i <= 2;i++) {
				XSSFRow row = sheet1.getRow(i);
				XSSFCell teststep = row.getCell(0);
				try {
					if (teststep.toString().equals("Enter data and click on login btn")) {
						r.EnterData(username.toString(), password.toString());
						r.login();
					} 
					else if (teststep.toString().equals("click on openmenu and click on logout btn")) {
						r.openmenu();
						Thread.sleep(2000);
						r.logout();
					}
					else {
						System.out.println("Invalid Steps");
					}
				} catch (Exception e) {
					TakesScreenshot tss = (TakesScreenshot) w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), 
							new File("C:\\Users\\Lab-03-Demo\\Pictures\\"+username.toString()+" "+password.toString()+".png"));	
				String errorcode =	w.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText();
					System.out.println(errorcode);
					r.clearData();
					w.navigate().refresh();
				}	
			}		
		}			
	}
}