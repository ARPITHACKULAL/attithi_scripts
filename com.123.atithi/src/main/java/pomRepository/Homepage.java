package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//a[text()='Home']")
	private WebElement Home;
	
	@FindBy(xpath="//a[text()='Check-in Details']")
	private WebElement checkindetails;
	
	@FindBy(xpath="//a[text()='Check-out Details']")
	private WebElement checkoutdetails;
	
	@FindBy(xpath="//a[text()='Requests']")
	private WebElement requests;
	
	@FindBy(xpath="//h3[text()='Check-ins']")
	private WebElement checkinviews;
	
	@FindBy(xpath="//h3[text()='Check-outs']")
	private WebElement checkoutsview;
	
	@FindBy(xpath="//h4[text()='Requests']")
	private WebElement requestsview;
	
	@FindBy(xpath="//h4[text()='Allocate Rooms']")
	private WebElement allocateroomsview;
	
	
	/**
	 * @return the checkinviews
	 */
	public WebElement getCheckinviews() {
		return checkinviews;
	}

	/**
	 * @return the checkoutsview
	 */
	public WebElement getCheckoutsview() {
		return checkoutsview;
	}

	/**
	 * @return the requestsview
	 */
	public WebElement getRequestsview() {
		return requestsview;
	}

	/**
	 * @return the allocateroomsview
	 */
	public WebElement getAllocateroomsview() {
		return allocateroomsview;
	}

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the home
	 */
	public WebElement getHome() {
		return Home;
	}

	/**
	 * @return the checkindetails
	 */
	public WebElement getCheckindetails() {
		return checkindetails;
	}

	/**
	 * @return the checkoutdetails
	 */
	public WebElement getCheckoutdetails() {
		return checkoutdetails;
	}

	/**
	 * @return the requests
	 */
	public WebElement getRequests() {
		return requests;
	}
	
	
	
	
	

}