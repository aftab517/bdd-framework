package com.ecommerce.fsp.page_objects;

import com.ecommerce.fsp.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class RegisterPage extends DriverFactory {

    @FindBy(name = "email")
    public WebElement emailTxtbox;

    @FindBy(id = "WC_AccountDisplay_links_3")
    public WebElement registerButton;

    @FindBy(linkText = "Accept cookies")
    private WebElement cookiesAccptPopUp;

    @FindBy(name = "title")
    private WebElement titleDropDown;

    @FindBy(name = "firstName")
    private WebElement firstName;

    @FindBy(name = "lastName")
    private WebElement lastName;

    @FindBy(name = "logonPassword")
    private WebElement password;

    @FindBy(name = "logonPasswordVerify")
    private WebElement confirmPassword;

    @FindBy(id = "WC_UserRegistrationAddForm_links_1")
    private WebElement createAccountBtn;

    @FindBy(css = ".dijitTooltipContainer.dijitTooltipContents")
    private WebElement confirmValidation;

    public void registerEmail(String email) {
        emailTxtbox.sendKeys(email);
        cookiesAccptPopUp.click();
        registerButton.click();
    }

    public void fillRegisterForm(List<Map<String, String>> data) {
        new Select(titleDropDown).selectByVisibleText(data.get(0).get("title"));
        firstName.sendKeys(data.get(0).get("first_name"));
        lastName.sendKeys(data.get(0).get("last_name"));
        password.sendKeys(data.get(0).get("password"));
        confirmPassword.sendKeys(data.get(0).get("confirm_password"));
        createAccountBtn.click();
    }

    public String getConfirmPasswordValidationMessage(){
        return confirmValidation.getText();
    }
}
