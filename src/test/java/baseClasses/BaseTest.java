package baseClasses;

import java.time.Duration;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	protected WebDriver driver;
	protected Logger log;

	@BeforeClass
	protected void beforeClass() {
		log = LogManager.getLogger(this.getClass());
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://localhost/opencart/upload/");
	}

	@AfterClass
	protected void afterClass() {
		driver.quit();
	}

	protected int getRandomNumber() {
		return new Random().nextInt(99999);
	}

}
