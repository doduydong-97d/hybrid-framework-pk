package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClasses.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[@class='dropdown']//span[text()='My Account']")
	private WebElement myAccountDropdown;

	@FindBy(xpath = "//li[@class='dropdown open']//a[text()='Register']")
	private WebElement registerLink;

	public void clickMyAccountDropdown() {
		myAccountDropdown.click();
	}

	public void clickRegisterLink() {
		registerLink.click();
	}

}
