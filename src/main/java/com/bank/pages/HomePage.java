package com.bank.pages;


import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLoginField;
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginField;

    public void clickOnBankManagerLogIn(){
        CustomListeners.test.log(Status.PASS, "clickOnBankManagerLogIn " + bankManagerLoginField);
        clickOnElement(bankManagerLoginField);
    }
    public void clickOnCustomerLogin(){
        CustomListeners.test.log(Status.PASS, "clickOnCustomerLogin " + customerLoginField);
        clickOnElement(customerLoginField);
    }

}
