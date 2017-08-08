package com.example.test.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoomPage extends PageObject{

	private NewPlaceForm newPlaceForm;

	public RoomPage(WebDriver driver) {

	}

	@FindBy(className="add-place-btn")
	private WebElement addPlaceButton;

	@FindBy(className="place")
	private WebElement place;

	public void clickAddNewPlaceButton() {
		addPlaceButton.click();
	}

	public String getPlaceName() {
		return place.getText();
	}

}
