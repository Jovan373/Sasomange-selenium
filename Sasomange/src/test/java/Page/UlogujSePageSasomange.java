package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class UlogujSePageSasomange extends BaseTest {

    public UlogujSePageSasomange() {
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = "[class=\"registration-screen\"]")
    WebElement prijaviSeSasomangeText;

    @FindBy(id = "gigya-textbox-loginID")
    WebElement imejl_KorisnickoIme_InputField;

    @FindBy(id = "gigya-textbox-password")
    WebElement lozinka_InputField;
    @FindBy(xpath = "//div[@id='login-screen']//button[@type='submit'][normalize-space()='Prijavi se']")
    WebElement prijaviSeButton_Primary;
    @FindBy (css = "div[id='login-screen'] div[class='form-group gigya-composite-control " +
            "gigya-composite-control-textbox password-wrapper'] button[type='button']")
    WebElement eyeIcon;
    @FindBy(css = ".registration-title.show-on-mobile.activated")
    WebElement uspesnoAktiviranNalogText;
    @FindBy (css = "p[class='info'] span")
    WebElement pocniDaKupujesText;

    @FindBy (partialLinkText = "Ne sećaš se lozinke?")
    WebElement neSecasSeLozinkeHyperLinkUnderlined;

    public boolean prijaviSeSasomangeTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(prijaviSeSasomangeText));
        return prijaviSeSasomangeText.isDisplayed();
    }
    public String prijaviSeSasomangeTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(prijaviSeSasomangeText));
        String prijaviSe = prijaviSeSasomangeText.getText();
        System.out.println(prijaviSe);
        return prijaviSeSasomangeText.getText();
    }
    public void imejl_KorisnickoIme_InputFieldSendKeys(String ImejlInput){
        wdWait.until(ExpectedConditions.visibilityOf(imejl_KorisnickoIme_InputField)).clear();
        imejl_KorisnickoIme_InputField.sendKeys(ImejlInput);
    }
    public void lozinka_InputField(String LozinkaInput){
        wdWait.until(ExpectedConditions.visibilityOf(lozinka_InputField)).clear();
        lozinka_InputField.sendKeys(LozinkaInput);
    }
    public void eyeIconClick(){
        wdWait.until(ExpectedConditions.visibilityOf(eyeIcon)).isDisplayed();
        eyeIcon.click();
    }
    public void prijaviSeButton_PrimaryClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(prijaviSeButton_Primary)).click();
    }
    public boolean uspesnoAktiviranNalogTextAndpocniDaKupujesTextIsDisplayed(){
        String parentWindowHandle = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wdWait.until(ExpectedConditions.visibilityOf(uspesnoAktiviranNalogText));
        wdWait.until(ExpectedConditions.visibilityOf(pocniDaKupujesText));
        return uspesnoAktiviranNalogText.isDisplayed() || pocniDaKupujesText.isDisplayed();
    }
    public void neSecasSeLozinkeHyperLinkUnderlinedClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(neSecasSeLozinkeHyperLinkUnderlined)).click();
    }
}
