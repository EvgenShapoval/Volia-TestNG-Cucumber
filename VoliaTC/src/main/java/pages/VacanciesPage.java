package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacanciesPage extends BasePage {
	
	public VacanciesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#content li:nth-child(4) > a")
	private WebElement itLink;
	
	
    public void clickITPage() {
    	itLink.click();
    }	
}
