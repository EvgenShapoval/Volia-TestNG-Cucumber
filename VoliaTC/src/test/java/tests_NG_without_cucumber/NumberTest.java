package tests_NG_without_cucumber;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CompanyPage;
import pages.ITPage;
import pages.VacanciesPage;
import pages.VoliaHomePage;

public class NumberTest extends BaseTest {

	@Test
	public void numberITTest() {

		driver.get("https://volia.com/");
		
		VoliaHomePage homePage = new VoliaHomePage(driver);
				homePage.clickCompanyPage();
		
		CompanyPage companyPage = new CompanyPage(driver);
				companyPage.clickVacanciesPage();
		
		VacanciesPage vacanciesPage = new VacanciesPage(driver);
				vacanciesPage.clickITPage();
		
		ITPage iTPage = new ITPage(driver);
		
		int expNumberIT = 2;
		int actNumberIT = iTPage.numberITPage();
				
				
		Assert.assertTrue(expNumberIT == actNumberIT, "Fail. Expected the number IT in ITPage - " +
				expNumberIT + ". Actual the number IT - " + actNumberIT);
				}		
}
