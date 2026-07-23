package com.eaf.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
private WebDriver driver;
public RegistrationPage(WebDriver driver) {
    this.driver = driver;
}

private By fullNameTextBox = By.id("name");
private By emailTextBox = By.id("email");
private By passwordTextBox = By.id("password");
private By countryDropDown = By.id("country");
private By phoneNumberTextBox = By.id("mobile_number");
private By checkBox = By.name("news_letters");
private By signUpButton = By.id("register-user");
private By fullNameHelperMessage = By.xpath("//p[conatins(text(),'John Smith')]");
	

public void enterFullName(String fullName) {
	driver.findElement(fullNameTextBox).sendKeys(fullName);
}

public void enterEmail(String email) {
	driver.findElement(emailTextBox).sendKeys(email);
}

public void enterPassword(String password) {
	driver.findElement(passwordTextBox).sendKeys(password);
}

public void selectCountry(String countryCode) {
	driver.findElement(countryDropDown).sendKeys(countryCode);
}

public void enterPhoneNumber(String phoneNumber) {
	driver.findElement(phoneNumberTextBox).sendKeys(phoneNumber);
}

public void clickCheckBox() {
	driver.findElement(checkBox).click();
}

public void clickSignUpButton() {
	driver.findElement(signUpButton).click();
}






}
