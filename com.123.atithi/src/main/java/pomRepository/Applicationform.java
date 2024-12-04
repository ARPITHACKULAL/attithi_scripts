package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Applicationform {
	
	@FindBy(xpath="//select[@name='title']")
	private WebElement Title ;
	
	/**
	 * @return the title
	 */
	public WebElement getTitle() {
		return Title;
	}
	@FindBy(xpath="//input[@name='name']")
	private WebElement Name ;
	
	@FindBy(xpath="//input[@name='occupation']")
	private WebElement Occupation;
	

	@FindBy(xpath="//input[@name='age']")
	private WebElement Age;
	
	@FindBy(xpath="//select[@name='deeksha']")
	private WebElement SelectDeeksha;
	
	@FindBy(xpath="//select[@name=\"gender\"]")
	private WebElement Gender;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement EmailID;
	
	@FindBy(xpath="//input[@name='aadhaar']")
	private WebElement AadhaarNumber;
	
	@FindBy(xpath="//select[@name='guestMembers']")
	private WebElement NumberofGuestmembers;
	
	@FindBy(xpath="//input[@name=\"guestNumber\"]")
	private WebElement Phonenumber;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	
	@FindBy(xpath="//input[@name='district']")
	private WebElement District;
	
	@FindBy(xpath="//input[@name='pinCode']")
	private WebElement PinCode;
	
	@FindBy(xpath="//input[@name='houseNumber']")
	private WebElement HouseNumber;
	
	@FindBy(xpath="//input[@name='streetName']")
	private WebElement StreetName;
	
	@FindBy(xpath="//button[text()='Add Guest']")
	private WebElement Guestadd;

	@FindBy(xpath="//input[@name='guestName']")
	private WebElement guestname;
	
	@FindBy(xpath="//input[@name='guestNumber']")
	private WebElement guestnum;
	
	@FindBy(xpath="//input[@name='guestAadhaar']")
	private WebElement guestadar;
	
	@FindBy(xpath="//input[@name='guestOccupation']")
	private WebElement guestocc;
	
	@FindBy(xpath="//input[@name='guestRelation']")
	private WebElement guestrelation;
	
	@FindBy(xpath="//input[@name='guestAddress1.state']")
	private WebElement guestadd1state;
	
	@FindBy(xpath="//input[@name='guestAddress1.district']")
	private WebElement guestadd1dist;
	@FindBy(xpath="//input[@name='guestAddress1.pinCode']")
	private WebElement guestadd1pin;
	
	@FindBy(xpath="//input[@name='guestAddress1.houseNumber']")
	private WebElement guestadd1houseno;
	@FindBy(xpath="//input[@name='guestAddress1.streetName']")
	private WebElement guestadd1streetname;
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	
	@FindBy(xpath="//input[@name='visitDate']")
	private WebElement arrival;
	
	@FindBy(xpath="//input[@name='departureDate']")
	private WebElement departure;
	
	@FindBy(xpath="//input[@value='no']")
	private WebElement visited;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//div[text()='↑']")
	private WebElement upload;
	
	/**
	 * @return the upload
	 */
	public WebElement getUpload() {
		return upload;
	}




	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return submit;
	}




	/**
	 * @return the visited
	 */
	public WebElement getVisited() {
		return visited;
	}




	/**
	 * @return the arrival
	 */
	public WebElement getArrival() {
		return arrival;
	}




	/**
	 * @return the departure
	 */
	public WebElement getDeparture() {
		return departure;
	}




	/**
	 * @return the proceed
	 */
	public WebElement getProceed() {
		return proceed;
	}




	/**
	 * @return the guestname
	 */
	public WebElement getGuestname() {
		return guestname;
	}


	/**
	 * @return the guestnum
	 */
	public WebElement getGuestnum() {
		return guestnum;
	}


	/**
	 * @return the guestadar
	 */
	public WebElement getGuestadar() {
		return guestadar;
	}


	/**
	 * @return the guestocc
	 */
	public WebElement getGuestocc() {
		return guestocc;
	}


	/**
	 * @return the guestrelation
	 */
	public WebElement getGuestrelation() {
		return guestrelation;
	}


	/**
	 * @return the guestadd1state
	 */
	public WebElement getGuestadd1state() {
		return guestadd1state;
	}


	/**
	 * @return the guestadd1dist
	 */
	public WebElement getGuestadd1dist() {
		return guestadd1dist;
	}


	/**
	 * @return the guestadd1pin
	 */
	public WebElement getGuestadd1pin() {
		return guestadd1pin;
	}


	/**
	 * @return the guestadd1houseno
	 */
	public WebElement getGuestadd1houseno() {
		return guestadd1houseno;
	}


	/**
	 * @return the guestadd1streetname
	 */
	public WebElement getGuestadd1streetname() {
		return guestadd1streetname;
	}


	/**
	 * @return the guestadd
	 */
	public WebElement getGuestadd() {
		return Guestadd;
	}

	
	public Applicationform(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	/**
	 * @return the name
	 */
	public WebElement getName() {
		return Name;
	}

	/**
	 * @return the occupation
	 */
	public WebElement getOccupation() {
		return Occupation;
	}

	/**
	 * @return the age
	 */
	public WebElement getAge() {
		return Age;
	}

	/**
	 * @return the selectdeeksha
	 */
	public WebElement getSelectdeeksha() {
		return SelectDeeksha;
	}

	/**
	 * @return the gender
	 */
	public WebElement getGender() {
		return Gender;
	}

	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return EmailID;
	}

	/**
	 * @return the aadhar
	 */
	public WebElement getAadhar() {
		return AadhaarNumber;
	}


	/**
	 * @return the selectDeeksha
	 */
	public WebElement getSelectDeeksha() {
		return SelectDeeksha;
	}

	/**
	 * @return the emailID
	 */
	public WebElement getEmailID() {
		return EmailID;
	}

	/**
	 * @return the aadhaarNumber
	 */
	public WebElement getAadhaarNumber() {
		return AadhaarNumber;
	}

	/**
	 * @return the numberofGuestmembers
	 */
	public WebElement getNumberofGuestmembers() {
		return NumberofGuestmembers;
	}

	/**
	 * @return the phonenumber
	 */
	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	/**
	 * @return the state
	 */
	public WebElement getState() {
		return State;
	}

	/**
	 * @return the district
	 */
	public WebElement getDistrict() {
		return District;
	}

	/**
	 * @return the pinCode
	 */
	public WebElement getPinCode() {
		return PinCode;
	}

	/**
	 * @return the houseNumber
	 */
	public WebElement getHouseNumber() {
		return HouseNumber;
	}

	/**
	 * @return the streetName
	 */
	public WebElement getStreetName() {
		return StreetName;
	}
	
	public void apllicationform1(String fname,String occ,String age1,String seldeeksha, String emailId,String adhar,String phnno,String pcode,String houuseno,String streetname) {
		 Name.sendKeys(fname);
		 Occupation.sendKeys(occ);
    	 Age.sendKeys(age1);
    	 SelectDeeksha.sendKeys(seldeeksha);
    	 
    	 EmailID.sendKeys(emailId);
    	 AadhaarNumber.sendKeys(adhar);
    	
    	 Phonenumber.sendKeys(phnno);
    	
    	 PinCode.sendKeys(pcode);
    	 HouseNumber.sendKeys(houuseno);
    	 StreetName.sendKeys(streetname);
	}
	public void applicationform1(String Guestname,String Guestadar,String Guestocc,String Guestrelation ,
			String Gueststate ,String GuestDIST ,String Guestpin ,String Guesthousenum,String Gueststreet, String guestadd1dist2, String pinCode2, String guestadd1houseno2, String guestadd1streetname2)
	{
		
	guestname.sendKeys(Guestname);
	//guestnum.sendKeys(Guestnum);
	 guestadar.sendKeys(Guestadar);
	 guestocc.sendKeys(Guestocc);
	 guestrelation.sendKeys(Guestrelation);
	 guestadd1state.sendKeys(Gueststate);
	 guestadd1dist.sendKeys(GuestDIST);
	 guestadd1pin.sendKeys(Guestpin);
	 guestadd1houseno.sendKeys(Guesthousenum);
	 guestadd1streetname.sendKeys(Gueststreet);
}




	}

