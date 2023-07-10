package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class DodajOglasOOglasuChosenCategorySectionPageSasomange extends BaseTest {
    public DodajOglasOOglasuChosenCategorySectionPageSasomange() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class=\"main-breadcrumbs-list\"]")
    WebElement chosenCategoriesAndSubcategoriesText;

    @FindBy(xpath = "//div[@class='narrow half-column']//section[@class='single-dropdown']//div//span[@class='placeholder'][normalize-space()='Odaberi']")
    WebElement markaAutomobilaDropdownMenu;

    @FindBy(css = " \t:contains('OdaberiBenzinDizelBenzin i Gas (TNG)Benzin i Metan (CNG)Električni pogonHib')")
    WebElement gorivoDropdownMenu;

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
    public void nazadButtonHide(){
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
    public void modelDropdownAccessibleAftermarkaAutomobilaRandomClick(){
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
}
