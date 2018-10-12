package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends BasePage {

	public CompanyPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="#header li:nth-child(5) > a")
	private WebElement vacanciesLink;
	
	
    public void clickVacanciesPage() {
    	vacanciesLink.click();
    }	
}
