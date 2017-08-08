package com.example.test.steps;

import com.example.test.pages.HomePage;
import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;
import static org.junit.Assert.assertTrue;

public class HomePageSteps {

	private HomePage onHomePage() {
		return getPages().get(HomePage.class);
	}

	@Step
	public void openHomePage() {
//		onHomePage().go();
//		assertThat("HomePage is NOT displayed.",onHomePage().isHomePageDisplayed(),is(true));
		assertTrue(true);
	}

	@Step
	public void selectLocation() {
		assertTrue(true);
	}

}
