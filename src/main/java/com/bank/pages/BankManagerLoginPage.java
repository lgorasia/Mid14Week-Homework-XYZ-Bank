package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {
    public BankManagerLoginPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement customersField;

    public void clickOnAddCustomer(){
        CustomListeners.test.log(Status.PASS, "clickOnAddCustomer " + addCustomerField);
        clickOnElement(addCustomerField);
    }
    public void clickOnOpenAccout(){
        CustomListeners.test.log(Status.PASS, "clickOnOpenAccout " + openAccountField);
        clickOnElement(openAccountField);
    }
    public void clickOnCustomers(){
        CustomListeners.test.log(Status.PASS, "clickOnCustomers " + customersField);
        clickOnElement(customersField);
    }
}
