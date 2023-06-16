package Page;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MojSasomangeDodajOglasIzborKategorijeSectionPage extends BaseTest {
    public MojSasomangeDodajOglasIzborKategorijeSectionPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[class=\"description\"]")
    WebElement korisnickaZaOglasText;

    @FindBy(css = "[placeholder=\"Šta oglašavaš? Npr. fotelja, farbanje kose\"]")
    WebElement staOglasavasSearchBoxPlaceHolderInputField;

    @FindBy(css = "[class=\"ps__thumb-y\"]")
    WebElement thumbScrollButton;

    @FindBy(css = ".icon.icon-cancel.close-btn")
    WebElement xCloseButtonInSearchBoxPlaceHolderInputField;

    @FindBy(xpath = "//div[@class='category-list-wrapper']//li[1]")
    WebElement vozilaCategoryList;

    @FindBy(xpath = "//p[normalize-space()='Automobili']")
    WebElement automobiliSubCategoryFromVozila;

    @FindBy(xpath = "//p[normalize-space()='Polovni automobili']")
    WebElement polovniAutomobiliSubcategoryFromAutomobili;

    @FindBy(xpath = "//button[normalize-space()='Nastavi']")
    WebElement nastaviButtonPrimary;

    public void nastaviButtonPrimaryClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(nastaviButtonPrimary)).click();
    }

    public void polovniAutomobiliSubcategoryFromAutomobiliClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(polovniAutomobiliSubcategoryFromAutomobili)).click();
    }

    public void automobiliSubCategoryFromVozilaClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(automobiliSubCategoryFromVozila)).click();
    }

    public void vozilaCategoryListClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(vozilaCategoryList)).click();
    }

    public void xCloseButtonInSearchBoxPlaceHolderInputFieldClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(xCloseButtonInSearchBoxPlaceHolderInputField)).click();
    }

    public void thumbScrollButtonHoldAndScroll(){
        wdWait.until(ExpectedConditions.elementToBeClickable(thumbScrollButton));
        actions.clickAndHold(thumbScrollButton).moveByOffset(0,400).release(thumbScrollButton).perform();
    }

    public void staOglasavasSearchBoxPlaceHolderInputField(String Šta_oglašavaš_Npr_fotelja_farbanje_kose){
        wdWait.until(ExpectedConditions.visibilityOf(staOglasavasSearchBoxPlaceHolderInputField)).clear();
        actions.scrollToElement(staOglasavasSearchBoxPlaceHolderInputField).perform();
        staOglasavasSearchBoxPlaceHolderInputField.sendKeys(Šta_oglašavaš_Npr_fotelja_farbanje_kose);
        staOglasavasSearchBoxPlaceHolderInputField.click();
    }

    public boolean korisnickaZaOglasIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(korisnickaZaOglasText));
        actions.scrollToElement(korisnickaZaOglasText).perform();
        return korisnickaZaOglasText.isDisplayed();
    }
    public String korisnickaZaOglasTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(korisnickaZaOglasText));
        String korisnickaPodrska = korisnickaZaOglasText.getText();
        System.out.println(korisnickaPodrska);
        return korisnickaZaOglasText.getText();
    }
}
