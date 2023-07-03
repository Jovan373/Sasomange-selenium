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

    public void markaAutomobilaDropdownMenuSelect() {
        wdWait.until(ExpectedConditions.visibilityOf(markaAutomobilaDropdownMenu));
       markaAutomobilaDropdownMenu.click();
        wdWait.until(ExpectedConditions.visibilityOf(markeAutomobilaOptionsUL));
        WebElement[] checkboxMarke = markeAutomobilaOptionsUL.findElements(By.cssSelector(".checkbox-sign.round-checkbox-sign")).toArray(new WebElement[0]);
        Random r = new Random();
        int randomIndex = r.nextInt(checkboxMarke.length);
        System.out.println(randomIndex);
        actions.scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(checkboxMarke[randomIndex]),0,200).perform();
        wdWait.until(ExpectedConditions.elementToBeClickable(checkboxMarke[randomIndex])).click();
    }
}
