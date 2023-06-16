package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePageSasomange extends BaseTest {

    public HomePageSasomange() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".icon.icon-avatar")
    WebElement ulogujSeButton;

    @FindBy (xpath = "//*[normalize-space()='Uspešna odjava']")
    WebElement uspesnaOdjavaTimeLimitedMessage;

    @FindBy(css = "[class=\"icon icon-register\"]")
    WebElement registrujSeButton;

    public void ulogujSeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(ulogujSeButton)).click();
    }

    public boolean uspesnaOdjavaTimeLimitedMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaOdjavaTimeLimitedMessage));
        return uspesnaOdjavaTimeLimitedMessage.isDisplayed();
    }
    public String uspesnaOdjavaTimeLimitedMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaOdjavaTimeLimitedMessage));
        String uspesnaOdjavaPoruka = uspesnaOdjavaTimeLimitedMessage.getText();
        System.out.println(uspesnaOdjavaPoruka);
        return uspesnaOdjavaTimeLimitedMessage.getText();
    }
    public void registrujSeButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(registrujSeButton)).click();
    }

}
