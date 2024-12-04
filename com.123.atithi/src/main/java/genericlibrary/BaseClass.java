package genericlibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepository.Homepage;
import pomRepository.LoginPage;


public class BaseClass {
	public DataUtility data_Utility = new DataUtility(); 
	public WebDriver driver;
	public static WebDriver listnersDriver;
	//public Homepage home_Page ;
	
	@BeforeClass(alwaysRun = true)
	public void launchTheBrowser() throws IOException {
		
		driver = new ChromeDriver();
		listnersDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("url"));
	//}
	
	//@BeforeMethod(alwaysRun = true)
	//public void performLogin() throws IOException {
		
		
		
		//LoginPage login_Page = new LoginPage(driver);
		/*login_Page.getusername().sendKeys(data_Utility.getDataFromProperties("username"));
		login_Page.getPassword().sendKeys(data_Utility.getDataFromProperties("password"));
		login_Page.getSignin().click();*/
		
		
		//home_Page = new Homepage(driver);
	//	home_Page.getHome().click();
	//	home_Page.getCheckindetails().click();
	//	home_Page.getCheckoutdetails().click();
	//	home_Page.getRequests().click();
	//}
	
	//@AfterMethod(alwaysRun = true)
	//public void performLogout() {
		
	//	home_Page.getSignout().click();
	//}
	
	//@AfterClass(alwaysRun = true)
	//public void closeTheBrowser() {
		//driver.quit();
	}
}	