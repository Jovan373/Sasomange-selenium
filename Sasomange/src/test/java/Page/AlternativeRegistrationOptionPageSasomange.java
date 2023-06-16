package Page;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class AlternativeRegistrationOptionPageSasomange extends BaseTest {
    public AlternativeRegistrationOptionPageSasomange(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class='Bw8v1']")
    WebElement signInWithGoogleText;

    @FindBy(id= "header_container")
    WebElement logFacebookSasomangeText;

    @FindBy(css = "#email")
    WebElement emailInputField;

    @FindBy(css = ".si-container-title.tk-intro")
    WebElement appleID_ToSignText;
    public String appleID_ToSignTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(appleID_ToSignText));
        String appleIDText = appleID_ToSignText.getText();
        System.out.println(appleIDText);
        return appleID_ToSignText.getText();
    }

    public boolean appleID_ToSignTextIsDisplayed(){
        String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wdWait.until(ExpectedConditions.visibilityOf(appleID_ToSignText));
        return appleID_ToSignText.isDisplayed();
    }

    public boolean signInWithGoogleTextIsDisplayed(){
        String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wdWait.until(ExpectedConditions.visibilityOf(signInWithGoogleText));
        return signInWithGoogleText.isDisplayed();
    }
    public String signInWithGoogleTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(signInWithGoogleText));
        String signInGoogleText = signInWithGoogleText.getText();
        System.out.println(signInGoogleText);
        return signInWithGoogleText.getText();
    }
    public void driverClose(){
        Set<String> windowHandles = driver.getWindowHandles();
        driver.close();
        String originalWindowHandle = windowHandles.iterator().next();
        driver.switchTo().window(originalWindowHandle);
    }
    public boolean signInWithFacebookTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(logFacebookSasomangeText));
        return logFacebookSasomangeText.isDisplayed();
    }
    public String signInWithFacebookTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(logFacebookSasomangeText));
        String signInFacebookText = logFacebookSasomangeText.getText();
        System.out.println(signInFacebookText);
        return logFacebookSasomangeText.getText();
    }
    public void emailInputFieldExit(){
        String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wdWait.until(ExpectedConditions.elementToBeClickable(emailInputField)).sendKeys(Keys.ESCAPE);
    }
}
