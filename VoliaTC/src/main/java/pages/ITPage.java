package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ITPage extends BasePage {
	
	public ITPage(WebDriver driver) {
		super(driver);
	}

	@FindBys(@FindBy(css="#article > div > ul"))
	private List<WebElement> itSize;
	
	
    public int numberITPage(){
        return itSize.size();
    }
}
