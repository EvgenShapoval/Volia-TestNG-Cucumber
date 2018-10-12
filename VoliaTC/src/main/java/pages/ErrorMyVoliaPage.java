package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorMyVoliaPage extends BasePage {

	public ErrorMyVoliaPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="errors_otm")
	private WebElement errors;
	
	
    public String actualErrorMyVoliaPage(){
        return errors.getText();
    }
}
