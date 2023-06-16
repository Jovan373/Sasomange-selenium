package Page;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PromenaLozinkePageSasomange extends BaseTest {
    public PromenaLozinkePageSasomange(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "[class=\"registration-title\"]")
    WebElement promenaLozinkeText;

    @FindBy(css = "div[class='forgot-password-screen'] p[class='intro']")
    WebElement unesiImejlAdresuText;

    @FindBy (css = "#gigya-textbox-email-loginID")
    WebElement emailPlaceholderPromenaLozinke;

    public boolean promenaLozinkeTextIUnesiImejlAdresuTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(promenaLozinkeText));
        wdWait.until(ExpectedConditions.visibilityOf(unesiImejlAdresuText));
        driver.switchTo().defaultContent();
        return promenaLozinkeText.isDisplayed() || unesiImejlAdresuText.isDisplayed();
    }
    public String promenaLozinkeTextIUnesiImejlAdresuTextGetText(){
        wdWait.until(ExpectedConditions.visibilityOf(promenaLozinkeText));
        wdWait.until(ExpectedConditions.visibilityOf(unesiImejlAdresuText));
        String promenaLozinkeIUnesiImejlGetText = promenaLozinkeText.getText() + "\n" + unesiImejlAdresuText.getText();
        System.out.println(promenaLozinkeIUnesiImejlGetText);
        return promenaLozinkeText.getText() + "\n" + unesiImejlAdresuText.getText();
    }
    public boolean PlaceholderPromenaLozinkeIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(emailPlaceholderPromenaLozinke));
        return emailPlaceholderPromenaLozinke.isDisplayed();
    }
}
