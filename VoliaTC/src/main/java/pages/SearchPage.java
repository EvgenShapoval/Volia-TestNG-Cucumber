package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}

//	@FindBy(css="#article input[type=\"Text\"]")
//	private WebElement searchText;
	
	@FindBy(xpath=".//*[@id='article']")
	private WebElement errorMessage;
	
	
	
//    public String textSearchPage() {
//    	return searchText.getAttribute("value");
//    }	
    
    public String errorMessage() {
    	return errorMessage.getText();
    }
}
