package com.e2etests.automation.bouletcorp.step_definitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.bouletcorp.page_objects.AleatoirePage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AleatoireStepDefinition {
	public AleatoirePage aleatoirePage;
	public WebDriverWait wait;

	public AleatoireStepDefinition() {
		aleatoirePage = new AleatoirePage();

	}

	@Given("Je me connecte sur l application bouletcorp {string}")
	public void jeMeConnecteSurLApplicationBouletcorp(String string) throws InterruptedException {
		aleatoirePage.openURL(string);
		wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(10));
	}

	@When("Je tape sur le bouton aleatoire")
	public void jeTapeSurLeBoutonAleatoire() {
		AleatoirePage.btnAleatoire.click();
	}

	@Then("Je verifie la page change")
	public void jeVerifieLaPageChange() {
		aleatoirePage.UrlChanged();
	}

	@And("les widgets facebouk, twitter et tumblr sont bien affiches")
	public void lesWidgetsFaceboukTwitterEtTumblrSontBienAffiches() {
		boolean facebook = aleatoirePage.isElementDisplayed(AleatoirePage.btnFacebook);
		Assert.assertTrue(facebook);
		boolean twitter = aleatoirePage.isElementDisplayed(AleatoirePage.btnTwitter);
		Assert.assertTrue(twitter);
		boolean tumblr = aleatoirePage.isElementDisplayed(AleatoirePage.btnTumblr);
		Assert.assertTrue(tumblr);
		
	   
	}




}
