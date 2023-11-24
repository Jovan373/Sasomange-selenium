package Page;

import Base.BaseTest;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;

public class DodajOglasOOglasuChosenCategorySectionPageSasomange extends BaseTest {
    public DodajOglasOOglasuChosenCategorySectionPageSasomange() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"main-breadcrumbs-list\"]")
    WebElement chosenCategoriesAndSubcategoriesText;
    //-------------OPSTI PODACI O VOZILU SECTION WEBELEMENTS------------------------------------------------------------
    @FindBy(xpath = "//div[@class='narrow half-column']//section[@class='single-dropdown']//div//span[@class='placeholder']" +
            "[normalize-space()='Odaberi']")
    WebElement markaAutomobilaDropdownMenu;

    @FindBy(xpath = "//div[@data-attribute-type='dropDownSingleSelectOrFreeText']//section[@class='single-dropdown']" +
            "//div//i[@class='dropdown-arrow icon-dropdown-arrow-bottom']")
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
    //------------------------------------------------------------------------------------------------------------------

    @FindBy (css = "button[class='btn btn--type-primary step-next']")
    WebElement napredIButton;

    @FindBy(css = "button[class='btn button--type-bordered-tertiary step-back']")
    WebElement nazadButton;
    //----------TEHNICKE KARAKTERISTIKE AUTOMOBILA WEBELEMENTS----------------------------------------------------------
    @FindBy(xpath = "//div[@id='app']//div[1]//section[1]//ul[1]//li[1]//button[1]")
    WebElement kliznaVrataButtonDa;

    @FindBy(xpath = "//div[@id='app']//div[1]//section[1]//ul[1]//li[1]//button[1]")
    WebElement kliznaVrataButtonNe;

    @FindBy(css = "input[placeholder='Unesi (cm³)']")
    WebElement kubikaza_cm3_InputField;

    @FindBy(css = "input[placeholder='Unesi (kWh)']")
    WebElement kapacitetPogonskeBaterije_kwhInputField;

    @FindBy(xpath = "//button[normalize-space()='Prednji']")
    WebElement vrstaPogonaPrednjiButton;

    @FindBy(xpath = "//button[normalize-space()='Zadnji']")
    WebElement vrstaPogonaZadnjiButton;

    @FindBy(xpath = "//button[normalize-space()='4x4']")
    WebElement vrstaPogona4x4Button;

    @FindBy(css = "input[placeholder='Unesi (km)']")
    WebElement predjeniKilometriInputField;

    @FindBy(xpath = "//section[@data-section='mainLayout']//section[2]//section[1]//div[2]//div[6]//section[1]//div[1]//p[1]//i[1]")
    WebElement ekoloskaKategorijaVozilaDropDownMenu;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement ekoloskaKategorijaVozilaDropDownMenuUL;

    @FindBy (xpath = "//input[@placeholder='Unesi (kW)']")
    WebElement snagaMotora_kw_inputField;

    @FindBy(xpath = "//button[normalize-space()='Manuelni']")
    WebElement vrstaMenjacaButton;

    @FindBy(xpath = "//div[9]//section[1]//div[1]//p[1]//i[1]")
    WebElement brojBrzina_opcionoDropDownMenu;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement brojBrzina_opcionoDropDownMenuUL;

    @FindBy(xpath = "//div[10]//section[1]//div[1]//p[1]//i[1]")
    WebElement brojSedistaDropDownMenu;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement brojSedistaDropDownMenuUL;

    @FindBy(xpath = "//div[11]//section[1]//div[1]//p[1]//i[1]")
    WebElement bojaDropDownMenu;

    @FindBy(xpath = "//section[@class='dropdown-content with-search small-icon']")
    WebElement bojaDropDownMenuUL;

    @FindBy(xpath = "//div[14]//section[1]//div[1]//p[1]//i[1]")
    WebElement registrovanDoDropDownMenu;

    @FindBy(xpath = "//section[@class='single-dropdown open']//section[@class='dropdown-content with-search']")
    WebElement registrovanDoDropDownMenuUL;

    @FindBy(xpath = "//div[12]//section[1]//ul[1]//li[1]//button[1]")
    WebElement metalic_opcionoButton;

    @FindBy(xpath = "//div[13]//section[1]//ul[1]//li[2]//button[1]")
    WebElement mat_OpcionoButton;

    @FindBy(xpath = "//button[normalize-space()='Nema']")
    WebElement klima_opcionoButton;

    @FindBy(xpath = "//div[16]//section[1]//ul[1]//li[1]//button[1]")
    WebElement zamenaButton;
    //---------------------OPREMA WEBELEMENTS---------------------------------------------------------------------------
    @FindBy(xpath = "//div[@class='full-column inline-checkbox']//section[@class='checkbox-section']")
    WebElement stanjeVozila_opcionoSquareCheckboxes;

    @FindBy(xpath = "//section[@class='dynamic-configuration']//div[@class='section-content-wrapper']//div[1]//section[1]")
    WebElement sigurnost_OpcionoSquarecheckboxes;

    @FindBy(xpath = "//div[@class='section-content-wrapper']//div[2]//section[1]")
    WebElement airbag_Opciono;

    @FindBy(xpath = "//div[@class='section-content-wrapper']//div[3]//section[1]")
    WebElement autoRadio_Opciono;

    @FindBy(xpath = "//div[@class='section-content-wrapper']//div[4]//section[1]")
    WebElement dodatnaOprema_Opciono;
//----------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@class='section-content-wrapper']//div[5]//section[1]//label[1]//input[1]")
    WebElement brojSasije_OpcionoInputField;

    @FindBy(css = "[data-section=\"mainLayout\"]")
    WebElement layout;

    @FindBy(css = "class=\"btn btn--type-primary step-next\"")
    WebElement nastaviPrimaryButtonNext;

    @FindBy(xpath = "//div[@class='section-content-wrapper']//div[6]//section[1]//label[1]//input[1]")
    WebElement brojRegistarcijeVozila_OpcionoInputField;
//----------------------------------------------------------------------------------------------------------------------
//---------------------------------INFORMACIJE O OGLASU WEBELEMENTS-----------------------------------------------------
    @FindBy(xpath = "//textarea[@placeholder='Unesi naziv oglasa']")
    WebElement nazivInputField;

    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    WebElement tekstOglasa_AreaInputField;


    @FindBy (xpath = "//input[@placeholder='Unesi cenu (EUR)']")
    WebElement cenaInputField;

    @FindBy(xpath = "//section[@class='price-section']//label[1]//span[1]")
    WebElement umestoCeneOptionCheckbox;

    @FindBy(css = "[placeholder=\"Unesi šifru artikla\"]")
    WebElement unesiSifruArtikla_InputField;
//----------------------------------------------------------------------------------------------------------------------
//------------------------LOKACIJA PREDMETA OGLASAVANJA WEBELEMENTS-----------------------------------------------------
    @FindBy(xpath = "//div[@class='country-dropdown-selected']//i[@class='drop-icon icon-dropdown-arrow-bottom']")
    WebElement zemljaDropDownMenu;

    @FindBy(id = "searchLocations")
    WebElement lokacijaInputField;

    @FindBy(xpath = " \t//*[normalize-space()='Beograd']")
    WebElement simpleTypeHeadOpenForBeogradInput;

    public void simpleTypeHeadOpenForBeogradInputClick(){
        wdWait.until(ExpectedConditions.visibilityOf(simpleTypeHeadOpenForBeogradInput)).click();
    }
    public void lokacijaInputFieldSendKeys(String Enter_location){
        wdWait.until(ExpectedConditions.visibilityOf(lokacijaInputField));
        scrollIntoView(lokacijaInputField);
        lokacijaInputField.sendKeys(Enter_location);
        lokacijaInputField.click();
    }
    public void unesiSifruArtiklaSendKeys(String Unesi_sifru_artikla_maxChar30All){
        wdWait.until(ExpectedConditions.visibilityOf(unesiSifruArtikla_InputField));
        actions.scrollToElement(unesiSifruArtikla_InputField).click().perform();
        unesiSifruArtikla_InputField.sendKeys(Unesi_sifru_artikla_maxChar30All);


    }

    public void umestoCeneOptionCheckboxClick(){
        wdWait.until(ExpectedConditions.visibilityOf(umestoCeneOptionCheckbox));
        umestoCeneOptionCheckbox.click();
    }

    public void cenaInputFieldSendKeys(String Unesi_cenu_bez_tacke_razmaka_ili_zareza_maxChar15){
    wdWait.until(ExpectedConditions.visibilityOf(cenaInputField));
    scrollIntoView(cenaInputField);
    cenaInputField.click();
    actions.sendKeys(Unesi_cenu_bez_tacke_razmaka_ili_zareza_maxChar15);
    }

    public void brojSasije_OpcionoInputFieldSendKeys(String Broj_Sasije){
        wdWait.until(ExpectedConditions.visibilityOf(brojSasije_OpcionoInputField));
        scrollIntoView(brojSasije_OpcionoInputField);
        brojSasije_OpcionoInputField.click();
        actions.sendKeys(Broj_Sasije).perform();

    }

    public void brojRegistarcijeVozila_OpcionoInputFieldSendKeys(String Broj_Registracije){
        wdWait.until(ExpectedConditions.visibilityOf(brojRegistarcijeVozila_OpcionoInputField));
        scrollIntoView(brojRegistarcijeVozila_OpcionoInputField);
        brojRegistarcijeVozila_OpcionoInputField.click();
        actions.sendKeys(Broj_Registracije).perform();
    }

    public void tekstOglasa_AreaInputFieldSendKeys(String Tekst_Oglasa){
        wdWait.until(ExpectedConditions.visibilityOf(tekstOglasa_AreaInputField)).sendKeys(Tekst_Oglasa);
    }

    public void airbag_OpcionoSquareCheckBoxesClick() {
        wdWait.until(ExpectedConditions.visibilityOf(airbag_Opciono));
        List<WebElement> squareCheckboxes = airbag_Opciono.findElements(
                By.cssSelector(".checkbox-sign.squared-checkbox-sign"));
        for (WebElement checkbox : squareCheckboxes) {
            scrollIntoView(checkbox);
            wdWait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
        }
    }

    public void autoRadio_OpcionoClick(){
        wdWait.until(ExpectedConditions.visibilityOf(autoRadio_Opciono));
        List<WebElement> squareCheckboxes = autoRadio_Opciono.findElements(By.cssSelector(".checkbox-sign.squared-checkbox-sign"));
        for (WebElement checkbox : squareCheckboxes){
            scrollIntoView(checkbox);
            wdWait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
        }
    }

    public void dodatnaOprema_OpcionoClick() {
        wdWait.until(ExpectedConditions.visibilityOf(dodatnaOprema_Opciono));
        List<WebElement> squareCheckboxes = dodatnaOprema_Opciono.findElements(By.cssSelector(".checkbox-sign.squared-checkbox-sign"));
        for (WebElement checkbox : squareCheckboxes) {
            scrollIntoView(checkbox);
            wdWait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
        }
    }

    private void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView" +
                "({behavior: 'auto', block: 'center', inline: 'center'});", element);
    }

    public void scroll(){
        actions.scrollByAmount(0,500).perform();
    }

    public void sigurnost_OpcionoSquarecheckboxesClick() {
        wdWait.until(ExpectedConditions.visibilityOf(sigurnost_OpcionoSquarecheckboxes));
        List<WebElement> squareCheckboxes = sigurnost_OpcionoSquarecheckboxes.findElements(
                By.cssSelector(".checkbox-sign.squared-checkbox-sign"));

        for (WebElement checkbox : squareCheckboxes) {
            checkbox.click();
        }
    }

    public void stanjeVozila_opcionoSquareCheckboxesClick() {
        wdWait.until(ExpectedConditions.visibilityOf(stanjeVozila_opcionoSquareCheckboxes));
        List<WebElement> squareCheckboxes = stanjeVozila_opcionoSquareCheckboxes.findElements(
                By.cssSelector(".checkbox-sign.squared-checkbox-sign"));
        for (WebElement checkbox : squareCheckboxes) {
            checkbox.click();
        }
}

    public void registrovanDoDropDownMenuRandomPick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrovanDoDropDownMenu)).click();
        WebElement[]checkboxRegistrovanDo = registrovanDoDropDownMenuUL
                .findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String registrovanDoOptions = registrovanDoDropDownMenuUL.getText();
        System.out.println("Registrovan do all options to pick: " + registrovanDoOptions);
        Random registrovanDo = new Random();
        int randomIndex = registrovanDo.nextInt(checkboxRegistrovanDo.length);
        String randomPickRegistrovanDo = checkboxRegistrovanDo[randomIndex].getText();
        System.out.println("Random pick from registrovan do options: " + randomPickRegistrovanDo);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxRegistrovanDo[randomIndex])
                ,0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxRegistrovanDo[randomIndex])).click();
    }

    public void brojSedistaDropDownMenuRandomPick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(brojSedistaDropDownMenu));
        actions.moveToElement(brojSedistaDropDownMenu).perform();
        brojSedistaDropDownMenu.click();
        WebElement[]checkboxBrojSedista = brojSedistaDropDownMenuUL
                .findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String brojSedistaOptions = brojBrzina_opcionoDropDownMenuUL.getText();
        System.out.println("Broj sedista all options to pick: " + brojSedistaOptions);
        Random brojSedista = new Random();
        int randomIndex = brojSedista.nextInt(checkboxBrojSedista.length);
        String randomPickBrojSedista = checkboxBrojSedista[randomIndex].getText();
        System.out.println("Random pick from sedista options: " + randomPickBrojSedista);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxBrojSedista[randomIndex])
                ,0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxBrojSedista[randomIndex])).click();
    }

    public void bojaDropDownMenuRandomPick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(bojaDropDownMenu)).click();
        WebElement[]checkboxBoja = bojaDropDownMenuUL
                .findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String bojaOptions = bojaDropDownMenuUL.getText();
        System.out.println("boja all options to pick: " + bojaOptions);
        Random boja = new Random();
        int randomIndex = boja.nextInt(checkboxBoja.length);
        String randomPickBoja = checkboxBoja[randomIndex].getText();
        System.out.println("Random pick from boja options: " + randomPickBoja);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxBoja[randomIndex])
                ,0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxBoja[randomIndex])).click();
    }

    public void metalic_opcionoButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(metalic_opcionoButton));
        actions.moveToElement(metalic_opcionoButton).click();
    }

    public void mat_OpcionoButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(mat_OpcionoButton));
        actions.moveToElement(mat_OpcionoButton).click();
    }
    public void klima_opcionoButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(klima_opcionoButton));
        actions.scrollToElement(klima_opcionoButton).click();
    }
    public void zamenaButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(zamenaButton));
        actions.scrollToElement(zamenaButton).click();
    }

    public void brojBrzina_opcionoRandomClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(brojBrzina_opcionoDropDownMenu)).click();
        WebElement[]checkboxBrojBrzina = brojBrzina_opcionoDropDownMenuUL
                .findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String brojBrzinaOptions = brojBrzina_opcionoDropDownMenuUL.getText();
        System.out.println("Broj brzina all options to pick: " + brojBrzinaOptions);
        Random broj = new Random();
        int randomIndex = broj.nextInt(checkboxBrojBrzina.length);
        String randomPickBrojBrzina = checkboxBrojBrzina[randomIndex].getText();
        System.out.println("Random pick from modeli options: " + randomPickBrojBrzina);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxBrojBrzina[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxBrojBrzina[randomIndex])).click();
    }
    public void snagaMotora_kw_inputFieldSendKeys(String Unesi_kw){
        wdWait.until(ExpectedConditions.visibilityOf(snagaMotora_kw_inputField)).sendKeys(Unesi_kw);
    }

    public void vrstaMenjacaButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(vrstaMenjacaButton)).click();
    }
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
    public void nazad_I_NapredButtonDisplay(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.display = 'block';", nazadButton);
        jsExecutor.executeScript("arguments[0].style.display = 'block';", napredIButton);
    }


    public void markaAutomobilaDropdownmenuRandomClick() {
        wdWait.until(ExpectedConditions.visibilityOf(markaAutomobilaDropdownMenu));
        markaAutomobilaDropdownMenu.click();
        wdWait.until(ExpectedConditions.visibilityOf(markeAutomobilaOptionsUL));
        WebElement[] checkboxMarke = markeAutomobilaOptionsUL
                .findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
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
        Random h = new Random();
        int randomIndex = h.nextInt(checkboxOblikKaroserije.length);
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
    public void kliznaVrataButtonDaClick(){
        wdWait.until(ExpectedConditions.visibilityOf(kliznaVrataButtonDa)).click();
    }
    public void kubikaza_cm3_InputFieldSendKeys(String Unesi_cm3 ){
        wdWait.until(ExpectedConditions.visibilityOf(kubikaza_cm3_InputField));
        kubikaza_cm3_InputField.sendKeys(Unesi_cm3);

    }
    public void kapacitetPogonskeBaterije_kwhInputFieldSendKeys(String Unesi_kwh){
        wdWait.until(ExpectedConditions.visibilityOf(kapacitetPogonskeBaterije_kwhInputField));
        kapacitetPogonskeBaterije_kwhInputField.sendKeys(Unesi_kwh);
    }
    public void vrstaPogonaPrednjiButtonClick(){
        wdWait.until(ExpectedConditions.visibilityOf(vrstaPogona4x4Button));
        actions.scrollToElement(vrstaPogona4x4Button).click().perform();
    }
    public void predjeniKilometriInputFieldSendKeys(String Unesi_kw){
        wdWait.until(ExpectedConditions.visibilityOf(predjeniKilometriInputField)).sendKeys(Unesi_kw);
    }
    public void ekoloskaKategorijaVozilaDropDownMenuRandomPick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ekoloskaKategorijaVozilaDropDownMenu)).click();
        wdWait.until(ExpectedConditions.visibilityOf(ekoloskaKategorijaVozilaDropDownMenuUL));
        WebElement[]checkboxekoloskaKategorijaVozila = ekoloskaKategorijaVozilaDropDownMenuUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        String ekoloskaKategorijaVozilaOptions = ekoloskaKategorijaVozilaDropDownMenuUL.getText();
        System.out.println("Ekoloska kategorija vozila: " + ekoloskaKategorijaVozilaOptions);
        Random e = new Random();
        int randomIndex = e.nextInt(checkboxekoloskaKategorijaVozila.length);
        String randomPickEURO = checkboxekoloskaKategorijaVozila[randomIndex].getText();
        System.out.println("Random pick from EURO options: " + randomPickEURO);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxekoloskaKategorijaVozila[randomIndex]),0,100).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxekoloskaKategorijaVozila[randomIndex])).click();
    }
    public void vrstaPogona4x4ButtonClick(){
        wdWait.until(ExpectedConditions.visibilityOf(vrstaPogona4x4Button)).click();
    }


}
