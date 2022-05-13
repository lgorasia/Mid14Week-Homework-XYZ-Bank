package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility
{
    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//select[@id='userSelect']")
        WebElement customerNameField;
        @FindBy(xpath = "//select[@id='currency']")
        WebElement currencyField;
        @FindBy(xpath = "//button[contains(text(),'Process')]")
        WebElement processField;

        public void clickOnCustomerName(){
            CustomListeners.test.log(Status.PASS, "clickOnCustomerName " + customerNameField);
            selectByVisibleTextFromDropDown(customerNameField,"Hermoine Granger");
        }
        public void clickOnCurrency(String currency){
            CustomListeners.test.log(Status.PASS, "clickOnCurrency " + currencyField);
            sendTextToElement(currencyField,currency);
        }
        public void clickOnProcess(){
            CustomListeners.test.log(Status.PASS, "clickOnProcess " + processField);
            clickOnElement(processField);
        }


    }

