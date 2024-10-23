package pageObjectModel;
import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExDemo {
	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream fis = new FileInputStream("C:\\Users\\Lab-03-Demo\\Downloads\\orangeHrm.xlsx");
		DemoRepo d = new DemoRepo(w);
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		XSSFSheet sheet2 = work.getSheet("Sheet2");
		for(int i = 1; i <= sheet1.getLastRowNum();i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			try {
				for(int j = 1; j <= sheet2.getLastRowNum();j++) {
					XSSFRow row2 = sheet2.getRow(j);
					XSSFCell teststep = row2.getCell(0);
					
						switch (teststep.toString()) {
						case "login":
							d.login(username.toString(), password.toString());
							break;
						case "pim":
							d.PIM();
							break;
						case "select job title":
							d.jobtitleSelect("Automaton Tester");
							break;
						case "logout":
							d.logout();
							break;
						default:
							break;
						}
					}
			} catch (Exception e) {
				// TODO: handle exception
			}
				
			}
		}
	}
