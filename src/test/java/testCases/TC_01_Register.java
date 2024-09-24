package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClasses.BaseTest;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC_01_Register extends BaseTest {
	@Test
	public void Register() {
		log.info("Register Testing");
		HomePage homePage = new HomePage(driver);

		log.info("Click 'My Account' header dropdown");
		homePage.clickMyAccountDropdown();

		log.info("Click 'Register' link");
		homePage.clickRegisterLink();

		RegisterPage registerPage = new RegisterPage(driver);

		log.info("Enter to 'FirstName' textbox");
		registerPage.sendKeysToFirstNameTextbox("Dong");

		log.info("Enter to 'LastName' textbox");
		registerPage.sendKeysToLastNameTextbox("Do");

		log.info("Enter to 'Email' textbox");
		registerPage.sendKeysToEmailTextbox("dongafc" + getRandomNumber() + "@gmail.com");

		log.info("Enter to 'Telephone' textbox");
		registerPage.sendKeysToTelephoneTextbox("0123456789");

		log.info("Enter to 'Password' textbox");
		registerPage.sendKeysToPasswordTextbox("SeJava3@");

		log.info("Enter to 'Password Confirm' textbox");
		registerPage.sendKeysToConfirmPasswordTextbox("SeJava3@");

		log.info("Check 'Privacy Policy' checkbox");
		registerPage.checkPrivacyPolicyCheckbox();

		log.info("Click 'Continue' Button");
		registerPage.clickContinueButton();

		log.info("Verify register success message");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your Account Has Been Created!");
	}

}
