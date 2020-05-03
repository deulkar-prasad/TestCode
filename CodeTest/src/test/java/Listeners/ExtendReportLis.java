package Listeners;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.maven.surefire.shade.common.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.utils.FileUtil;


public class ExtendReportLis 
{

	public static ExtentHtmlReporter report=null;
	public static ExtentReports extent=null;
	public static ExtentTest test=null;
	
	
	public static ExtentReports setup() 
	{
		String reportLocation = "./Reports/Reports.html";
		report=new ExtentHtmlReporter(reportLocation);
		report.config().setDocumentTitle("Car Test Report");
		report.config().setReportName("Automation Report");
		report.config().setTheme(Theme.DARK);
		System.out.println("***** Extent Report Lopcation is Initilised");
		report.start();
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Apllication", "Competentia");
		extent.setSystemInfo("Build Environment","QA");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		System.out.println("****** System info. set in extent reports");
		return extent;
	}
	
	public static void TestStepHandel(String Teststatus,WebDriver driver,ExtentTest extenttest, Throwable e)
	 {
		switch (Teststatus)
		{
		case "FAIL":
			extenttest.fail(MarkupHelper.createLabel("Test case is faild", ExtentColor.RED));
			extenttest.error(e.fillInStackTrace());
			
			
			/*try {
				extenttest.addScreenCaptureFromPath(CaptureScreenshot(driver));
			}catch(IOException io) {
				io.printStackTrace();
			}*/
			
			if(driver!=null)
			{
				driver.quit();
			}
			break;
			
		case "PASS":
			extenttest.fail(MarkupHelper.createLabel("Test case is faild", ExtentColor.GREEN));
			break;
		}
	}
	
	
	/*public static String CaptureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		String destination ="D:\\Selenium Course\\Competentia\\Competentia\\ScreenShots"+getcurrenttimeanddate()+".png";
		File target=new File(destination);
		FileUtils.copyFile(src, target);
		
		return destination;
	}
	*/
	private static String getcurrenttimeanddate()
	{
		String str=null;
		try {
			
			DateFormat dateformat=new SimpleDateFormat("MM/DD/YYYY HH:MM:ss:SSSS");
			Date date=new Date();
			str=dateformat.format(date);
			str=str.replace(" ","-").replaceAll("/","-").replaceAll(":","-");
			
		}catch (Exception e){
			
		}
		return str;
	}
	
	
	
	
}
