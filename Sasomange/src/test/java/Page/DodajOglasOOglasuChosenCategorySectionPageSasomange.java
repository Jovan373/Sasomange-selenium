package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

public class DodajOglasOOglasuChosenCategorySectionPageSasomange extends BaseTest {
    public DodajOglasOOglasuChosenCategorySectionPageSasomange() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"main-breadcrumbs-list\"]")
    WebElement chosenCategoriesAndSubcategoriesText;

    @FindBy(xpath = "//div[@class='narrow half-column']//section[@class='single-dropdown']//div//span[@class='placeholder'][normalize-space()='Odaberi']")
    WebElement markaAutomobilaDropdownMenu;

    @FindBy(xpath = "//div[@data-attribute-type='dropDownSingleSelectOrFreeText']//section[@class='single-dropdown']//div//i[@class='dropdown-arrow icon-dropdown-arrow-bottom']")
    WebElement modelAccessibleAftermarkaAutomobilaPick;

    @FindBy (xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement modelDropdownMenuUL;

    @FindBy(xpath = "//div[@class='add-product-wrapper js-scroll-element']//div[3]//section[1]//div[1]//p[1]//i[1]")
    WebElement gorivoDropdownMenuAccessibleAfterModelPick;

    @FindBy(xpath = "//div[@class='half-column']//input[@placeholder='Unesi']")
    WebElement ifChosedOptionIsNemaTrazeneVrednostiInputField;

    @FindBy (xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement gorivoDropdownMenuAccessibleAfterModelPickUL;

    @FindBy(xpath = "//div[4]//section[1]//div[1]//p[1]//i[1]")
    WebElement oblikKaroserijeAccessibleAfterGorivoRandomClick;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement oblikKaroserijeAccessibleAfterGorivoRandomClickUL;

    @FindBy(xpath = "//div[5]//section[1]//div[1]//p[1]//i[1]")
    WebElement brojVrataDropdownMenuAccessibleAfterOblikKaroserije;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement brojVrataDropdownMenuAccessibleAfterOblikKaroserijeUL;

    @FindBy(xpath = "//section[@class='info-about-product']//section[1]//section[1]//div[2]//div[6]//section[1]//div[1]//p[1]//i[1]")
    WebElement godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrata;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrataUL;

    @FindBy(xpath = "//div[@class='full-column']//section[@class='single-dropdown']//div//i[@class='dropdown-arrow icon-dropdown-arrow-bottom']")
    WebElement tipDropdownMenuConditional;

    @FindBy(xpath = "//div[@class='full-column']//input[@placeholder='Unesi']")
    WebElement tipInputField;

    @FindBy(xpath = "//*[@class='section-content-wrapper two-columns'][1]")
    WebElement opstiPodaciOVozilu;

    @FindBy (xpath = "//*[@class='ps dropdown-scroll-content theme-scrollbar ps--active-y'] //ul")
    WebElement markeAutomobilaOptionsUL;

    @FindBy (css = "button[class='btn btn--type-primary step-next']")
    WebElement napredIButton;

    @FindBy(css = "button[class='btn button--type-bordered-tertiary step-back']")
    WebElement nazadButton;

    public void opstiPodaciOVozilu() {
        wdWait.until(ExpectedConditions.visibilityOf(opstiPodaciOVozilu));
        actions.scrollToElement(opstiPodaciOVozilu).scrollByAmount(0, 200).perform();

    }

    public boolean chosenCategoriesAndSubcategoriesTextIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(chosenCategoriesAndSubcategoriesText));
        return chosenCategoriesAndSubcategoriesText.isDisplayed();
    }

    public String chosenCategoriesAndSubcategoriesTextGetText() {
        wdWait.until(ExpectedConditions.visibilityOf(chosenCategoriesAndSubcategoriesText));
        String chosenSubAndCat = chosenCategoriesAndSubcategoriesText.getText();
        System.out.println(chosenSubAndCat);
        return chosenCategoriesAndSubcategoriesText.getText();
    }
    public void nazad_I_NapredButtonHide(){
        wdWait.until(ExpectedConditions.visibilityOf(nazadButton));
        wdWait.until(ExpectedConditions.visibilityOf(napredIButton));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.display = 'none';", nazadButton);
        jsExecutor.executeScript("arguments[0].style.display = 'none';", napredIButton);
    }

    public void markaAutomobilaDropdownmenuRandomClick() {
        wdWait.until(ExpectedConditions.visibilityOf(markaAutomobilaDropdownMenu));
        markaAutomobilaDropdownMenu.click();
        wdWait.until(ExpectedConditions.visibilityOf(markeAutomobilaOptionsUL));
        WebElement[] checkboxMarke = markeAutomobilaOptionsUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String markeOptions = markeAutomobilaOptionsUL.getText();
        System.out.println("Marke automobila all options to pick: " + markeOptions);
        Random r = new Random();
        int randomIndex = r.nextInt(checkboxMarke.length);
        String randomPickMarke = checkboxMarke[randomIndex].getText();
        System.out.println("Random pick marke automobila: " + randomPickMarke );
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxMarke[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxMarke[randomIndex])).click();
    }
    public void modelDropdownmenuAccessibleAftermarkaAutomobilaRandomClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(modelAccessibleAftermarkaAutomobilaPick)).click();
        wdWait.until(ExpectedConditions.visibilityOf(modelDropdownMenuUL));
        WebElement[]checkboxModeli = modelDropdownMenuUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String modeliOptions = modelDropdownMenuUL.getText();
        System.out.println("Modeli all options to pick: " + modeliOptions);
        Random m = new Random();
        int randomIndex = m.nextInt(checkboxModeli.length);
        String randomPickModeli = checkboxModeli[randomIndex].getText();
        System.out.println("Random pick from modeli options: " + randomPickModeli);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxModeli[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxModeli[randomIndex])).click();
    }

    public void gorivoDropdownMenuAccessibleAfterModelPickRandomClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(gorivoDropdownMenuAccessibleAfterModelPick)).click();
        wdWait.until(ExpectedConditions.visibilityOf(gorivoDropdownMenuAccessibleAfterModelPickUL));
        WebElement[]checkboxVrsteGoriva = gorivoDropdownMenuAccessibleAfterModelPickUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String gorivoOptions = gorivoDropdownMenuAccessibleAfterModelPickUL.getText();
        System.out.println("Gorivo all options to pick: " + gorivoOptions);
        Random m = new Random();
        int randomIndex = m.nextInt(checkboxVrsteGoriva.length);
        String randomPickModeli = checkboxVrsteGoriva[randomIndex].getText();
        System.out.println("Random pick from modeli options: " + randomPickModeli);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxVrsteGoriva[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxVrsteGoriva[randomIndex])).click();
    }
    public void oblikKaroserijeAccessibleAfterGorivoRandomClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(oblikKaroserijeAccessibleAfterGorivoRandomClick)).click();
        wdWait.until(ExpectedConditions.visibilityOf(oblikKaroserijeAccessibleAfterGorivoRandomClickUL));
        WebElement[]checkboxOblikKaroserije = oblikKaroserijeAccessibleAfterGorivoRandomClickUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String karoserijaOptions = oblikKaroserijeAccessibleAfterGorivoRandomClickUL.getText();
        System.out.println("Oblik karoserije options: " + karoserijaOptions);
        Random m = new Random();
        int randomIndex = m.nextInt(checkboxOblikKaroserije.length);
        String randomPickKaroserija = checkboxOblikKaroserije[randomIndex].getText();
        System.out.println("Random pick from oblik karoserije options: " + randomPickKaroserija);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxOblikKaroserije[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxOblikKaroserije[randomIndex])).click();
    }
    public void brojVrataDropdownMenuAccessibleAfterOblikKaroserijeRandomClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(brojVrataDropdownMenuAccessibleAfterOblikKaroserije)).click();
        wdWait.until(ExpectedConditions.visibilityOf(brojVrataDropdownMenuAccessibleAfterOblikKaroserijeUL));
        WebElement[]checkboxBrojVrata = brojVrataDropdownMenuAccessibleAfterOblikKaroserijeUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String brojVrataOptions = brojVrataDropdownMenuAccessibleAfterOblikKaroserijeUL.getText();
        System.out.println("Broj vrata options: " + brojVrataOptions);
        Random v = new Random();
        int randomIndex = v.nextInt(checkboxBrojVrata.length);
        String randomPickVrata = checkboxBrojVrata[randomIndex].getText();
        System.out.println("Random pick from oblik karoserije options: " + randomPickVrata);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxBrojVrata[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxBrojVrata[randomIndex])).click();
    }
    public void godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrataRandomClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrata)).click();
        wdWait.until(ExpectedConditions.visibilityOf(godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrataUL));
        WebElement[]checkboxgodinaProizvodnje = godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrataUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String godinaProizvodnjeOptions = godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrataUL.getText();
        System.out.println("Godina Proizvodnje options: " + godinaProizvodnjeOptions);
        Random k = new Random();
        int randomIndex = k.nextInt(checkboxgodinaProizvodnje.length);
        String randomPickGodina = checkboxgodinaProizvodnje[randomIndex].getText();
        System.out.println("Random pick from oblik karoserije options: " + randomPickGodina);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxgodinaProizvodnje[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxgodinaProizvodnje[randomIndex])).click();
    }
    public void tipInputFieldSendKeys(String Primer_za_Citroen_C3_Exclusive_dizel_1400cm3_obeležje_je_14_HDI_Exclusive){
        wdWait.until(ExpectedConditions.visibilityOf(tipInputField));
        tipInputField.sendKeys(Primer_za_Citroen_C3_Exclusive_dizel_1400cm3_obeležje_je_14_HDI_Exclusive);
    }
}
