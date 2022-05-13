package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstNameField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement lastNameField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postcodeField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    public void clickOnFirstName(String name) {
        CustomListeners.test.log(Status.PASS, "clickOnFirstName " + firstNameField);
        sendTextToElement(firstNameField, name);
    }

    public void clickOnLastName(String lastName) {
        CustomListeners.test.log(Status.PASS, "clickOnLastName " + lastNameField);
        sendTextToElement(lastNameField, lastName);
    }

    public void clickOnPostCode(String postCode) {
        CustomListeners.test.log(Status.PASS, "clickOnPostCode " + postcodeField);
        sendTextToElement(postcodeField, postCode);
    }

    public void clickOnAddCustomer() {
        CustomListeners.test.log(Status.PASS, "clickOnAddCustomer " + addCustomerButton);
        clickOnElement(addCustomerButton);
    }
}
