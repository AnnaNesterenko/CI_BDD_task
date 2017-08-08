package com.example.test.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage go() {
		return this;
	}

	@FindBy(id="home-page")
	private WebElement homePageImage;

	public boolean isHomePageDisplayed() {
		return homePageImage.isDisplayed();
	}
}
