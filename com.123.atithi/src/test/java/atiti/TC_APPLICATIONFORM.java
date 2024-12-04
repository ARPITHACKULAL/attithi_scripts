package atiti;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;


import genericlibrary.BaseClass;
import genericlibrary.DataUtility;
import genericlibrary.ExcelUtility;

import pomRepository.Applicationform;

public class TC_APPLICATIONFORM extends BaseClass {
	
	@Test
		public void Verify_User_Is_Able_To_Login_to_applicationform() throws Exception {
		
		
		driver.get(data_Utility.getDataFromProperties("applicationurl"));
		Applicationform app=new Applicationform(driver);
		app.getTitle().click();
		//app.getTitle().sendKeys("Sri");
	
		Select dropdown =new Select(app.getTitle());
		dropdown.selectByVisibleText("Sri");
		
		
		
		
		
		
		
		
	
		ExcelUtility EUTIL=new ExcelUtility();
		
	//	String Title=EUTIL.readDataFromExcel("Sheet1",1,1);
	//Thread.sleep(5000);
		
		String Name=EUTIL.readDataFromExcel("Sheet1",1,0);
		Thread.sleep(5000);
		
		
		String Occupation=EUTIL.readDataFromExcel("Sheet1",1,1);
		
		String Age=EUTIL.readDataFromExcel("Sheet1",1,2);
		
		Select dropdown1 =new Select(app.getGender());
		dropdown1.selectByVisibleText("Female");
		
		String Initiation =EUTIL.readDataFromExcel("Sheet1",1,3);
		
		String Email =EUTIL.readDataFromExcel("Sheet1",1,4);
		
		String Aadhaar =EUTIL.readDataFromExcel("Sheet1",1,5);
		
		//String NumberofGuestmembers=EUTIL.readDataFromExcel("Sheet1",1,6);
		
		String Phonenumber=EUTIL.readDataFromExcel("Sheet1",1,6);
		
		//String State=EUTIL.readDataFromExcel("Sheet1",1,9);
		
		//String District=EUTIL.readDataFromExcel("Sheet1",1,10);
		
		String PinCode=EUTIL.readDataFromExcel("Sheet1",1,7);
	
		String HouseNumber=EUTIL.readDataFromExcel("Sheet1",1,8);
		
		String StreetName=EUTIL.readDataFromExcel("Sheet1",1,9);
		
		Applicationform cn=new Applicationform (driver);
	
		cn.apllicationform1(Name, Occupation, Age, Initiation, Email, Aadhaar, Phonenumber,  PinCode, HouseNumber, StreetName);
		Thread.sleep(1000);
		cn.getGuestadd().click();
		
		
		String guestname=EUTIL.readDataFromExcel("Sheet1",1,0);
				
	   // String guestnum=EUTIL.readDataFromExcel("Sheet1",1,1);
		
	    String guestadar=EUTIL.readDataFromExcel("Sheet1",1,2);
	   
	    String guestocc=EUTIL.readDataFromExcel("Sheet1",1,3);
	    
	   	String guestrelation=EUTIL.readDataFromExcel("Sheet1",1,4);
		
	   
	   	
	   	String guestadd1pin=EUTIL.readDataFromExcel("Sheet1",1,7);

	   	String  guestadd1houseno=EUTIL.readDataFromExcel("Sheet1",1,8);

	   	String guestadd1streetname=EUTIL.readDataFromExcel("Sheet1",1,9);
	   	
	   	
	   	cn.applicationform1(guestname,guestadar, guestocc, guestrelation,  guestocc, guestadd1pin, HouseNumber, StreetName, PinCode, guestadd1houseno, guestadd1streetname, guestadd1streetname, guestadd1streetname);
	  cn.getProceed().click();
	  Thread.sleep(5000);
	 
	 Robot r=new  Robot();
	 
	  cn.getVisited().click();
	  Thread.sleep(3000);
	  cn.getArrival().click();
	  cn.getArrival().sendKeys("10");
	  cn.getArrival().sendKeys("12");
	  cn.getArrival().sendKeys("2025");
	  
	  
	  
	  r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
	  cn.getDeparture().click();
	  cn.getDeparture().sendKeys("20");
	  cn.getDeparture().sendKeys("10");
	  cn.getDeparture().sendKeys("2025");
	  cn.getUpload().click();
		  	 Thread.sleep(10000);
	   cn.getProceed().click();
	   cn.getSubmit().click();

		}
	
	

}
