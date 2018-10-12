package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class VoliaHomePage extends BasePage {

	public VoliaHomePage(WebDriver driver) {
		super(driver);
	}

//		Количество li-элементов в колонке «Для бізнесу» из подвала
	@FindBys(@FindBy(css="#footer li:nth-child(4) > ul > li"))
	private List<WebElement> b2bFooterHomePage;		
	
//		Ссылка в поле Menu для перехода на DataCenterPage
	@FindBy(css="#header > div.top li:nth-child(3) > a")
	private WebElement dataCenterLink;
		
//		Ссылка в поле login-block для перехода на MyVoliaPage
	@FindBy(css="#login-block > a")
	private WebElement myVoliaLink;

	@FindBy(css="#header > div.top > ul.menu > li.menu-item.last > a")
	private WebElement companyLink;
	
	@FindBy(css="#logo input")
	private WebElement searchField;
	
	@FindBy(css="#logo button")
	private WebElement searchSubmit;
	
		
    public void clickCompanyPage() {
    	companyLink.click();
    }	
		
    public int numberb2bFooterHomePage(){
        return b2bFooterHomePage.size();
    }
    
    public void clickdataCenterPage() {
    	dataCenterLink.click();
    }
    
    public void clickSignInMyVoliaPage() {
    	myVoliaLink.click();
    } 
    
    public void inputsearchField(String textSearch) {
    	searchField.sendKeys(textSearch);
    }	
    
    public void submitSearch() {
    	searchSubmit.submit();
//    	.click();
    }
}
