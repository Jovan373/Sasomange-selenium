package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoggedInUserHomeSasomangePage extends BaseTest {

  public LoggedInUserHomeSasomangePage(){
      PageFactory.initElements(driver,this);
    }
   @FindBy(xpath = "//h3[@class='el-notification__title']")
   WebElement uspesnaPrijavaTimeLimitedMessage;

   @FindBy(css = "[class=\"inbox-notification\"]")
   WebElement userInboxDropDownIcon;

  @FindBy(css = "[class=\"icon grey icon-logout\"]")
  WebElement izlogujMeButton_UserInboxDropDownIcon;

  @FindBy(css = ".btn.btn--type-primary.btn--size-large")
  WebElement daIzlogujMeButtonInSmallWindow;

  @FindBy(css = ".btn.btn--type-primary.add-btn.d-none.d-sm-flex")
  WebElement dodajOglasButton;

  public void dodajOglasButtonClick(){
      wdWait.until(ExpectedConditions.elementToBeClickable(dodajOglasButton)).click();
  }

    public boolean uspesnaPrijavaTimeLimitedMessageIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaPrijavaTimeLimitedMessage));
        return uspesnaPrijavaTimeLimitedMessage.isDisplayed();
    }
    public String uspesnaPrijavaTimeLimitedMessageGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesnaPrijavaTimeLimitedMessage));
        String uspesnaPrijavaPoruka = uspesnaPrijavaTimeLimitedMessage.getText();
        System.out.println(uspesnaPrijavaPoruka);
        return uspesnaPrijavaTimeLimitedMessage.getText();
    }
    public void userInboxDropDownMenuClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(userInboxDropDownIcon)).click();
    }
    public void izlogujMeButton_UserInboxDropDownIconClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(izlogujMeButton_UserInboxDropDownIcon)).click();
    }
    public void daIzlogujMeButtonInSmallWindowClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(daIzlogujMeButtonInSmallWindow)).click();
    }

}
