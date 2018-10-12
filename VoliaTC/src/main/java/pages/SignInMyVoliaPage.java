package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInMyVoliaPage extends BasePage{

	public SignInMyVoliaPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(css="#authenticationForm span")
	private WebElement aForm;
	
	@FindBy(id="buttonSubmitLogin")
	private WebElement buttonSubmit;
	
	
    public void inputUsernameSignInMyVoliaPage(String usname) {
    	username.sendKeys(usname);
    }
	
    public void inputPasswordSignInMyVoliaPage(String pass) {
    	password.sendKeys(pass);
    }
	
    public void clickAFormSignInMyVoliaPage() {
    	aForm.click();
    }
    
    public void clickSubmitSignInMyVoliaPage() {
    	buttonSubmit.click();
    }
}
