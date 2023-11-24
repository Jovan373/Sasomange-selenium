package Page;

import Base.BaseTest;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OOglasivacuPageSasomange extends BaseTest {
    public OOglasivacuPageSasomange(){PageFactory.initElements(driver,this);}

    @FindBy(css = "class=\"one-more-step\"")
    WebElement ostaoJosJedanKorakText;

    @FindBy(xpath = "//label[@for='userTypeResidential']")
    WebElement fizickoLiceOption;

    @FindBy(css = "name=\"resFirstName\"")
    WebElement imeInputField;

    @FindBy(css = "name=\"resLastName\"")
    WebElement prezimeInputField;

    @FindBy(css = "label[class='form-group mandatory'] input[type='tel']")
    WebElement kontaktTelefoniInputField;

    @FindBy(xpath = "//div[@class='content-wrapper renew basic-user-padding']//span[@class='checkbox-sign squared-checkbox-sign']")
    WebElement automatskiObnoviOglasCheckBox;

    public void automatskiObnoviOglasCheckBoxUnTick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(automatskiObnoviOglasCheckBox));
        if (automatskiObnoviOglasCheckBox.isEnabled())automatskiObnoviOglasCheckBox.click();
    }


    public void kontaktTelefoniInputFieldSendKeys(String Broj_telefona){
        wdWait.until(ExpectedConditions.visibilityOf(kontaktTelefoniInputField));
        actions.scrollToElement(kontaktTelefoniInputField).sendKeys(Broj_telefona).perform();
    }

    public void prezimeInputFieldSendKeys(String Unesi_prezime){
        wdWait.until(ExpectedConditions.visibilityOf(prezimeInputField));
        actions.scrollToElement(prezimeInputField).sendKeys(Unesi_prezime).perform();
    }

    public void imeInputFieldSendKeys(String Unesi_ime){
        wdWait.until(ExpectedConditions.visibilityOf(imeInputField)).sendKeys(Unesi_ime);
    }

    public void fizickoLiceOptionClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(fizickoLiceOption));
        if(!fizickoLiceOption.isSelected())fizickoLiceOption.click();
    }

    public boolean ostaoJosJedanKorakTextIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(ostaoJosJedanKorakText));
        return ostaoJosJedanKorakText.isDisplayed();
    }
    public String ostaoJosJedanKorakTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(ostaoJosJedanKorakText));
        String ostaoJosJedan = ostaoJosJedanKorakText.getText();
        System.out.println(ostaoJosJedan);
        return ostaoJosJedanKorakText.getText();
    }
}
