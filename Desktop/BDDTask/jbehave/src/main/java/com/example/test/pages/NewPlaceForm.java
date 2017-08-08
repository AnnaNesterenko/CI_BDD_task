package com.example.test.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPlaceForm extends PageObject{

	public NewPlaceForm(WebDriver driver) { }

	@FindBy(className="add-place-form")
	private WebElement addPlaceForm;

	@FindBy(className="place-field")
	private WebElement placeField;

	@FindBy(className="place-capacity")
	private WebElement placeCapacity;

	@FindBy(className="place-type")
	private WebElement placeType;

	@FindBy(className="place-status")
	private WebElement placeStatus;

	@FindBy(id="save-btn")
	private WebElement saveButton;


	public boolean isNewPlaceFormDisplayed() {
		return addPlaceForm.isDisplayed();
	}

	public void clickSaveButton() {
		saveButton.click();
	}

	public void fillInNewPlaceForm(String placeNumber) {

	}

}
