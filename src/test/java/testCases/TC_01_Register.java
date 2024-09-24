package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClasses.BaseTest;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC_01_Register extends BaseTest {
	@Test
	public void Register() {
		HomePage homePage = new HomePage(driver);

		homePage.clickMyAccountDropdown();

		homePage.clickRegisterLink();

		RegisterPage registerPage = new RegisterPage(driver);

		registerPage.sendKeysToFirstNameTextbox("Dong");

		registerPage.sendKeysToLastNameTextbox("Do");

		registerPage.sendKeysToEmailTextbox("dongafc" + getRandomNumber() + "@gmail.com");

		registerPage.sendKeysToTelephoneTextbox("0123456789");

		registerPage.sendKeysToPasswordTextbox("SeJava3@");

		registerPage.sendKeysToConfirmPasswordTextbox("SeJava3@");

		registerPage.checkPrivacyPolicyCheckbox();

		registerPage.clickContinueButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your Account Has Been Created!");
	}

}
