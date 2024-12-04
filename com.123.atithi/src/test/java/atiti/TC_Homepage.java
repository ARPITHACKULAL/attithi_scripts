package atiti;

import org.openqa.selenium.WebDriver.Navigation;
import org.testng.annotations.Test;

import genericlibrary.BaseClass;

import pomRepository.Homepage;

public class TC_Homepage extends BaseClass {
	
	 @Test
	    public void Verify_User_Is_Able_To_click_on_home() throws InterruptedException {
	        Navigation nav = driver.navigate();
	        Homepage home = new Homepage(driver);
	       
	    home.getHome().click();
	      Thread.sleep(3000);
	      
	       home.getCheckindetails().click();
	       Thread.sleep(3000);
	      home.getCheckoutdetails().click();
	      Thread.sleep(3000);
	      
	      home.getRequests().click();
	       Thread.sleep(3000);
	       
	   //  home.getHome().click();
	      
	       
	     //  home.getCheckinviews().click();
	    //  home.getCheckoutsview().click();
	   // home.getRequestsview().click();
	    // home.getAllocateroomsview().click();

	 }
}
	


