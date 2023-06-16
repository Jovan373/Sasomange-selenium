package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CokieBotPageSasomange extends BaseTest {
   public CokieBotPageSasomange(){
       PageFactory.initElements(driver,this);
   }
   @FindBy(xpath = "(//button[@id='CybotCookiebotDialogBodyButtonDecline'])")
    WebElement kolaciciWindow;

   public void kolacicWindowCloseClick(){
       wdWait.until(ExpectedConditions.elementToBeClickable(kolaciciWindow)).click();
   }
}
