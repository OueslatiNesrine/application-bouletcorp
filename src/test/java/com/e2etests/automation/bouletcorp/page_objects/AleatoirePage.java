package com.e2etests.automation.bouletcorp.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class AleatoirePage extends BasePage {
	public ConfigFileReader configFileReader;
	/* @FindBy */
	@FindBy(how = How.CSS, using = "div[id='tabvanilla'] a:nth-child(3)")
	public static WebElement btnAleatoire;
	@FindBy(how = How.XPATH, using = "//img[@title='Twitter']")
	public static WebElement btnTwitter;
	@FindBy(how = How.XPATH, using = "//img[@title='Facebook']")
	public static WebElement btnFacebook;
	@FindBy(how = How.XPATH, using = "//a[@title='Share on Tumblr']")
	public static WebElement btnTumblr;

	public AleatoirePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Methods */
	public void openURL(String url) {
		Setup.getDriver().get(url);
		log.error(url);
	}

	public void verify() {
		String actuallUrl = Setup.getDriver().getCurrentUrl();
		Assert.assertNotEquals(configFileReader.getProperties("home.url.bouletcorp"), actuallUrl);
		log.error(actuallUrl);
	}

	public void verifyTwitter() {
		String attValue = btnTwitter.getAttribute("title");
		log.error("The attribute value is :" + attValue);
		boolean result = btnTwitter.isDisplayed();
		log.error(result);
		// Dimension dimensions = btnTwitter.getSize();
		// System.out.println("Hight: " + dimensions.height + "Width: " +
		// dimensions.width);
		// Point point = btnTwitter.getLocation();
		// System.out.println("x cordinate: " + point.x + "Y cordinate: " + point.y);
	}

	public void verifyFacebook() {
		String attValue = btnFacebook.getAttribute("title");
		log.error("The attribute value is :" + attValue);
		boolean result = btnFacebook.isDisplayed();
		log.error(result);
	}

	public void verifyTumblr() {
		String attValue = btnTumblr.getAttribute("title");
		log.error("The attribute value is :" + attValue);
		boolean result = btnTumblr.isDisplayed();
		log.error(result);
	}

}
