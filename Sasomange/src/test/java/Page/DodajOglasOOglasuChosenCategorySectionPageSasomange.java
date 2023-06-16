package Page;
import java.util.List;
import java.util.Random;
import Base.BaseTest;
import org.checkerframework.common.value.qual.StringVal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class DodajOglasOOglasuChosenCategorySectionPageSasomange extends BaseTest {
   public DodajOglasOOglasuChosenCategorySectionPageSasomange(){
       PageFactory.initElements(driver,this);
   }

   @FindBy(css = "[class=\"main-breadcrumbs-list\"]")
    WebElement chosenCategoriesAndSubcategoriesText;

   @FindBy(xpath = "//div[@class='narrow half-column']//section[@class='single-dropdown']//div//i[@class='dropdown-arrow icon-dropdown-arrow-bottom']")
   WebElement markaAutomobilaDropdownMenu;

   @FindBy(css = "div[data-attribute-type='dropDownSingleSelectOrFreeText'] section[class='single-dropdown'] div i[class='dropdown-arrow icon-dropdown-arrow-bottom']")
   WebElement modelDropdownMenu;

   @FindBy(css = " \t:contains('OdaberiBenzinDizelBenzin i Gas (TNG)Benzin i Metan (CNG)Električni pogonHib')")
   WebElement gorivoDropdownMenu;

   @FindBy(xpath = "//*[@class='section-content-wrapper two-columns'][1]")
   WebElement opstiPodaciOVozilu;

   public void opstiPodaciOVozilu(){
       wdWait.until(ExpectedConditions.visibilityOf(opstiPodaciOVozilu));
       actions.scrollToElement(opstiPodaciOVozilu).scrollByAmount(0,200).perform();

   }
   public boolean chosenCategoriesAndSubcategoriesTextIsDisplayed(){
       wdWait.until(ExpectedConditions.visibilityOf(chosenCategoriesAndSubcategoriesText));
       return chosenCategoriesAndSubcategoriesText.isDisplayed();
   }
   public String chosenCategoriesAndSubcategoriesTextGetText(){
       wdWait.until(ExpectedConditions.visibilityOf(chosenCategoriesAndSubcategoriesText));
       String chosenSubAndCat = chosenCategoriesAndSubcategoriesText.getText();
       System.out.println(chosenSubAndCat);
       return chosenCategoriesAndSubcategoriesText.getText();
   }

}
