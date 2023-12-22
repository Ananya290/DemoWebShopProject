package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	@FindBy(xpath="//input[@onclick='Billing.save()']")
	public WebElement Billing_Address_Continue_Btn;
	
	
	@FindBy(xpath="//input[@id='PickUpInStore']")
	public WebElement pick_Up_CheckBox;
		
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	public WebElement pick_Up_Continue_Btn;	
	
	@FindBy(xpath="//input[@id='shippingoption_0']")
	public WebElement shipping_option_CheckBox;
	
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	public WebElement shipping_Continue_Btn;
	
	@FindBy(xpath="//input[@id='paymentmethod_0']")
	public WebElement payment_Option;
	
	
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	public WebElement payment_method_continue;
	
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	public WebElement payment_info_continue;
	
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	public WebElement confirm_order;
	
	
	@FindBy(xpath="//strong")
	public WebElement success_msg;
	
	public CheckoutPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
	}
}
