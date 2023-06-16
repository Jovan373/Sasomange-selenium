package Page;
import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailnatorPageSasomange extends BaseTest {

        public MailnatorPageSasomange(){
            PageFactory.initElements(driver,this);
    }

    @FindBy(css = " \t#search")
    WebElement malinatorInboxInputField;

    @FindBy(xpath = " \t//button[normalize-space()='GO']")
    WebElement goButton;


    @FindBy(xpath = "//td[normalize-space()='Registracija na Sasomange.rs - uspela!']")
    WebElement mailinatorSasomangeAktivacijaUspelaMail;

    @FindBy(linkText=  "Potvrdi imejl adresu")
    WebElement potvrdiImejlAdresuButton;
    public void malinatorInboxInputFieldSendKeys(String email_input){
        driver.get("https://www.mailinator.com/index.jsp");
        wdWait.until(ExpectedConditions.visibilityOf(malinatorInboxInputField)).clear();
        malinatorInboxInputField.sendKeys(email_input);
        System.out.println("Mailinator inbox input field : " + preEt + "@mailinator");
    }
    public void mailinatorSasomangeAktivacijaUspelaMailClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(mailinatorSasomangeAktivacijaUspelaMail)).click();
    }
    public void goButtonClick(){
        wdWait.until(ExpectedConditions.elementToBeClickable(goButton)).click();
    }
    public void potvrdiImejlAdresuButonScroolAndClick(){
        WebElement iframe = driver.findElement(By.id("html_msg_body"));
        driver.switchTo().frame(iframe);
        wdWait.until(ExpectedConditions.visibilityOf(potvrdiImejlAdresuButton));
        actions.scrollToElement(potvrdiImejlAdresuButton).perform();
        potvrdiImejlAdresuButton.click();
        driver.switchTo().defaultContent();
    }

}
