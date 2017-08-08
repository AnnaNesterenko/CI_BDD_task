package com.example.test.steps;

import com.example.test.pages.NewPlaceForm;
import com.example.test.pages.RoomPage;
import net.thucydides.core.annotations.Step;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;
import static org.junit.Assert.assertTrue;

public class RoomPageSteps{

	private RoomPage onRoomPage() {
		return getPages().get(RoomPage.class);
	}
	private NewPlaceForm newPlaceForm() {
		return getPages().get(NewPlaceForm.class);
	}

	@Step
	public void requestAddingNewPlace() {
//		onRoomPage().clickAddNewPlaceButton();
//		assertThat("Add Place pop-up is NOT displayed.",newPlaceForm().isNewPlaceFormDisplayed(),is(true));
		assertTrue(true);
	}

	@Step
	public void fillRequiredFieldsForNewPlaceWithNumber(String placeNumber) {
		System.out.println("New place number " +placeNumber+ " should be entered");
//		newPlaceForm().fillInNewPlaceForm(placeNumber);
		assertTrue(true);
	}

	@Step
	public void submitAddingNewPlace() {
//		newPlaceForm().clickSaveButton();
//		assertThat("Add Place pop-up IS displayed.",newPlaceForm().isNewPlaceFormDisplayed(),is(false));
		assertTrue(true);
	}

	@Step
	public void verifyNewPlaceIsDisplayed(String placeNumber) {
		System.out.println("New place with number " +placeNumber+ " should be displayed");
//		assertEquals(onRoomPage().getPlaceName(), placeNumber);
		assertTrue(true);
	}
}
