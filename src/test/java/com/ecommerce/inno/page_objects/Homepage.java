package com.ecommerce.inno.page_objects;

import com.ecommerce.inno.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    @FindBy(id = "searchSuggestControlDesktop")
    private WebElement searchTxtbox;

    @FindBy(id = "headerLogin")
    public WebElement createAccount;

    public void enterText(String product) {
        searchTxtbox.sendKeys(product);
    }

    public String isOnHomePage() {
        return driver.getCurrentUrl();
    }
}
