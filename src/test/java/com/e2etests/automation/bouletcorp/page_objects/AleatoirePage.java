package com.e2etests.automation.bouletcorp.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class AleatoirePage {
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

	}

	/* Methods */
	public void openURL(String url) {
		Setup.getDriver().get(url);
		System.out.println(url);
	}

	public void verify() {
		String actuallUrl = Setup.getDriver().getCurrentUrl();
		Assert.assertNotEquals("https://bouletcorp.com/", actuallUrl);
		System.out.println(actuallUrl);
	}

	public void verifyTwitter() {
		String attValue = btnTwitter.getAttribute("title");
		System.out.println("The attribute value is :" + attValue);
		boolean result = btnTwitter.isDisplayed();
		System.out.println(result);
		// Dimension dimensions = btnTwitter.getSize();
		// System.out.println("Hight: " + dimensions.height + "Width: " +
		// dimensions.width);
		// Point point = btnTwitter.getLocation();
		// System.out.println("x cordinate: " + point.x + "Y cordinate: " + point.y);
	}

	public void verifyFacebook() {
		String attValue = btnFacebook.getAttribute("title");
		System.out.println("The attribute value is :" + attValue);
		boolean result = btnFacebook.isDisplayed();
		System.out.println(result);
	}

	public void verifyTumblr() {
		String attValue = btnTumblr.getAttribute("title");
		System.out.println("The attribute value is :" + attValue);
		boolean result = btnTumblr.isDisplayed();
		System.out.println(result);
	}

}
