package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utilities.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[@class='search-header__title']")
    WebElement resultText;

    public void verifyTheResults(String expected){
        Reporter.log("Verifying Results Displayed: " + resultText);
        verifyThatTextIsDisplayed(resultText,expected);
        CustomListeners.test.log(Status.PASS, "The expected text " + resultText + " was successfully displayed.");
    }

    }



