package atiti;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;

public class TC_Deeksha  extends BaseClass{
	@Test
	public void Verify_User_Is_Able_To_Login_to_applicationform() throws IOException, InterruptedException {
	Thread.sleep(3000);
	driver.get(data_Utility.getDataFromProperties("deekshaurl"));
	Thread.sleep(3000);
	}

	
	

}
