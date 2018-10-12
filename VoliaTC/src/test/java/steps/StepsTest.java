package steps;

import runner.RunTest;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CompanyPage;
import pages.ErrorMyVoliaPage;
import pages.ITPage;
import pages.SearchPage;
import pages.SignInMyVoliaPage;
import pages.VacanciesPage;
import pages.VoliaHomePage;

public class StepsTest extends RunTest{

	@Given("^Открыть HomePage volia.com$")
	public void open_HomePage_Volia() throws Throwable {
		driver.get("https://volia.com/");
	  	}
		
//	Scenario: Проверка количества вакансий на ITPage
	
	@When("^В блоке menu выбрать «Світ Волі»$")
	public void in_Menu_block_select_CompanyPage() throws Throwable {
		VoliaHomePage homePage = new VoliaHomePage(driver);
			homePage.clickCompanyPage();
	}
	
	@When("^На CompanyPage в блоке menu main кликнуть по «Вакансіі»$")
	public void in_CompanyPage_in_mainMenu_block_click_on_Vacancies() throws Throwable {
		CompanyPage companyPage = new CompanyPage(driver);
			companyPage.clickVacanciesPage();
	}
	
	@When("^На VacanciesPage в сайдбаре выбрать IT$")
	public void on_VacanciesPage_in_sidebar_select_IT() throws Throwable {
		VacanciesPage vacanciesPage = new VacanciesPage(driver);
			vacanciesPage.clickITPage();
		}
	
	@Then("^Проверить, что на ITPage отображается (\\d+) вакансии$")
	public void check_that_2_vacancies_are_displayed_on_ITPage(int expIT) throws Throwable {
		ITPage iTPage = new ITPage(driver);
		
		int expNumberIT = expIT;
		int actNumberIT = iTPage.numberITPage();
		
		Assert.assertTrue(expNumberIT == actNumberIT, 
				"Fail. Expected the number IT in ITPage - " +
				expNumberIT + ". Actual the number IT - " + actNumberIT);
		}
	
//	Scenario: Ошибка авторизации в Мой кабинет
		
	@When("^В login-block кликаем на Мій кабінет$")
	public void in_loginBlock_click_MyVolia() throws Throwable {
		VoliaHomePage homePage = new VoliaHomePage(driver);
			homePage.clickSignInMyVoliaPage();
		}
 
	@When("^На странице с формой вводим Номер договору або email - '(.*)'$")
	public void on_page_with_form_enter_number_contract_or_email(String usname) throws Throwable {
		SignInMyVoliaPage signInMyVoliaPage = new SignInMyVoliaPage(driver);
		signInMyVoliaPage.inputUsernameSignInMyVoliaPage(usname);
		}
	
	@When("^Вводим Password - '(.*)'$")
	public void enter_password(String pass) throws Throwable {
		SignInMyVoliaPage signInMyVoliaPage = new SignInMyVoliaPage(driver);
		signInMyVoliaPage.inputPasswordSignInMyVoliaPage(pass);
	}
	
	@When("^Кликаем чекбокс - Запам'ятати мене - и отправляем форму$")
	public void click_checkbox_and_send_form() throws Throwable {
		SignInMyVoliaPage signInMyVoliaPage = new SignInMyVoliaPage(driver);
		signInMyVoliaPage.clickAFormSignInMyVoliaPage();
		signInMyVoliaPage.clickSubmitSignInMyVoliaPage();
	}
	
	@Then("^Сравниваем полученный результат с ожидаемым - '(.*)'$")
	public void compare_result_with_expected(String expErrorMessage) throws Throwable {
		ErrorMyVoliaPage errorMyVolia = new ErrorMyVoliaPage(driver);
	
		String expectedError = expErrorMessage;
		String actualError = errorMyVolia.actualErrorMyVoliaPage();

		
		Assert.assertTrue(actualError.contains(expectedError),
				"Fail. Ожидали сообщение - " + expectedError 
				+ ". Было получено сообщение - " + actualError);
	}
	
//	Scenario: Проверка работы поиска
//	\"([^\"]*)\"$
//	
//	Scenario: Проверка работы поиска
//	Given Открыть HomePage volia.com
//	When В поисковую строку вводим текст: VoliaCloud
//	Then Сравниваем полученный результат с ожидаемым - Не знайдено жодної сторінки
//	
//	@When("^В поисковую строку вводим текст: '(.*)'$")
//	public void enter_text_into_search_box(String inputTextSearch) throws Throwable {
//		VoliaHomePage homePage = new VoliaHomePage(driver);
//			homePage.inputsearchField(inputTextSearch);
//			homePage.submitSearch();
//		}
//	
//	@Then("^Сравниваем полученный результат с ожидаемым - '(.*)'$")
//	public void compare_result_with_expected(String expErrorMessage) throws Throwable {
//		SearchPage searchPage = new SearchPage(driver);
//		
//		System.out.println(expErrorMessage);
//		
////		String expText = inputTextSearch;
////		String actText = searchPage.textSearchPage();
//		
//		String expErrorMess = expErrorMessage;
//		String actErrorMess = searchPage.errorMessage();
//
//		System.out.println(expErrorMess);
//		System.out.println(actErrorMess);
//		
//		Assert.assertTrue(actErrorMess.contains(expErrorMess), 
//				"Fail. Expected message - " +
//				expErrorMess + ". Actual message - " + actErrorMess);
//		}			
}
