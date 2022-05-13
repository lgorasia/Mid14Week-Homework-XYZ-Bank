package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utility {
    public CustomersPage() {
        PageFactory.initElements(driver,this
        );

    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement yourNameField;
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameTextField;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement logninButton;
    public void clickOnYourName(String name) {
       // mouseHoverToElementAndClick(yourNameField);
        //sendTextToElement(yourNameField, name);
        selectByVisibleTextFromDropDown(yourNameField,name);
    }
    public void clickOnLogin(){
        CustomListeners.test.log(Status.PASS, "clickOnLogin " + logninButton);
        clickOnElement(logninButton);
    }
    public String yourNameText(){
        CustomListeners.test.log(Status.PASS, "yourNameText " + yourNameTextField);
        return getTextFromElement(yourNameTextField);
    }
}
