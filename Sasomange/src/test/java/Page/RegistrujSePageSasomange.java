package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrujSePageSasomange extends BaseTest {

    public RegistrujSePageSasomange(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[class=\"registration-header\"]")
    WebElement registrujSeJosNemasNalogText;

    @FindBy(css = "[class=\"choose-user-type active\"]")
    WebElement fizickoLiceOption;

    @FindBy(css = "#resident-email")
    WebElement imejlInputField;

    @FindBy(css = "#resident-password")
    WebElement lozinkaRegInputField;

    @FindBy(css = "div[id='register-resident-user-screen-default'] div[class='form-group'] button[type='button']")
    WebElement eyeIconReg;
    @FindBy (css = "label[for='registration-newsletter-residential-default-consent']")
    WebElement promotivnePorukeUInboxCheckbox;

    @FindBy(css = "label[for='registration-terms-residential-default-consent']")
    WebElement pravilaIPolitikaKoriscenjaCheckbox;

    @FindBy(css = "div[id='register-resident-user-screen-default'] span[class='field-info js-password-info']")
    WebElement lozinkaTrebaDaSadrziText;

    @FindBy(css = "div[id='register-resident-user-screen-default'] button[type='submit']")
    WebElement registrujSeButtonPrimary;

    @FindBy(linkText = "Registruj se")
    WebElement registrujeSeHyperLinkUnderlined;

    @FindBy(id = "Google_btn")
    WebElement registrujSeGoogleButton;

    @FindBy(xpath = "//button[@id='Facebook_btn']//div[@aria-hidden='true']")
    WebElement registrujSeFacebookButton;

    @FindBy(id = "Apple_btn")
    WebElement registrujSeAppleButton;

   public void registrujSeAppleButtonClick(){
       wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeAppleButton));
       actions.scrollToElement(registrujSeAppleButton).perform();
       registrujSeAppleButton.click();

   }
    public boolean registrujSeJosNemasNalogTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(registrujSeJosNemasNalogText));
        return registrujSeJosNemasNalogText.isDisplayed();
    }
    public String registrujSeJosNemasNalogTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(registrujSeJosNemasNalogText));
        String getText = registrujSeJosNemasNalogText.getText();
        System.out.println(getText);
        return registrujSeJosNemasNalogText.getText();
    }
    public void fizickoLiceOptionIsSelected(){
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLiceOption));
        if(!fizickoLiceOption.isSelected()) fizickoLiceOption.click();
    }
    public void imejlInputFieldSendKeys(String Imejl_Input){
        wdWait.until(ExpectedConditions.elementToBeClickable(imejlInputField)).clear();
        imejlInputField.sendKeys(Imejl_Input );
        System.out.println("Imejl input field : " +preEt + "@mailinator");

    }
    public void lozinkaRegInputFieldSendKeys(String Lozinka_Input ){
        wdWait.until(ExpectedConditions.elementToBeClickable(lozinkaRegInputField)).clear();
        lozinkaRegInputField.sendKeys(Lozinka_Input);
        System.out.println("lozinka input field : Aa#@+ .1" + lozinkaRegInputField);
    }
    public boolean lozinkaTrebaDaSadrziTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaTrebaDaSadrziText));
        return lozinkaTrebaDaSadrziText.isDisplayed();
    }
    public String lozinkaTrebaDaSadrziTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(lozinkaTrebaDaSadrziText));
        String lozinkaTreba = lozinkaTrebaDaSadrziText.getText();
        System.out.println(lozinkaTreba);
        return lozinkaTrebaDaSadrziText.getText();
    }
    public void eyeIconRegClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(eyeIconReg)).click();
        wdWait.until(ExpectedConditions.attributeToBe(lozinkaRegInputField,"type","text"));
    }
    public void promotivnePorukeUInboxCheckboxUntick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(promotivnePorukeUInboxCheckbox));
        if(promotivnePorukeUInboxCheckbox.isSelected()) promotivnePorukeUInboxCheckbox.click();
    }
    public void pravilaIPolitikaKoriscenjaCheckboxTick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(pravilaIPolitikaKoriscenjaCheckbox));
        if(!pravilaIPolitikaKoriscenjaCheckbox.isSelected()) pravilaIPolitikaKoriscenjaCheckbox.click();
    }
    public void registrujSeButtonPrimaryClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeButtonPrimary)).click();
    }
    public void registrujeSeHyperLinkUnderlinedClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujeSeHyperLinkUnderlined)).click();
    }
    public void registrujSeGoogleButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeGoogleButton)).click();
    }
    public void registrujSeFacebookButtonClick(){
       wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeFacebookButton));
       actions.scrollToElement(registrujSeFacebookButton).perform();
       registrujSeFacebookButton.click();
    }
}
