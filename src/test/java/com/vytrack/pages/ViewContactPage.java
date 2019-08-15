package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewContactPage extends NavigationBar {
    public ViewContactPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "a.email")
    public WebElement email;

}
