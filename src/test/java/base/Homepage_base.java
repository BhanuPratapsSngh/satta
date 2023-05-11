package base;

import static base.Homepage_base.report;
import static base.Homepage_base.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homepage_base {
	public static WebDriver driver;
	public static Properties prop =new Properties();
	protected static ExtentTest test;
	protected static  ExtentReports report;

	public void setup() throws IOException{
		try {
		FileInputStream file=new FileInputStream("D:\\sali\\Satta\\HomepageGame.properties");
		prop.load(file);
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		catch(FileNotFoundException e){
			System.out.println("file nhi mili");
		}
	}

	public void end() {
		driver.quit();
	}
	public static void startTest()
	{
//	report = new ExtentReports("C:\\Users\\bpsingh\\.jenkins\\workspace\\bhanu\\homereport.html",true);
	report = new ExtentReports("D:\\sali\\Satta\\homereport.html",true);
	}

	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
}
