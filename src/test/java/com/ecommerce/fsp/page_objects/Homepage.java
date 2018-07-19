package com.ecommerce.fsp.page_objects;

import com.ecommerce.fsp.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {

    @FindBy(id = "searchSuggestControlDesktop")
    private WebElement searchTxtbox;


    public void enterText(String product){
        searchTxtbox.sendKeys(product);
    }
}
