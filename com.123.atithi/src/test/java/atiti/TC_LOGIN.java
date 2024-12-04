package atiti;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;

public class TC_LOGIN extends BaseClass {
		@Test
		public void Verify_User_Is_Able_To_Login() throws IOException {
			
			home_Page.getHome().click();	

		}

}
