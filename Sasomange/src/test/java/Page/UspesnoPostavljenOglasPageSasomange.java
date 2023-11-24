package Page;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UspesnoPostavljenOglasPageSasomange extends BaseTest {
    public UspesnoPostavljenOglasPageSasomange(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[@class='thank-you-title']")
    WebElement uspesanOglasPostavljenText;

    public boolean uspesanOglasPostavljenTextIsDisplayed(){
        wdWait.until(ExpectedConditions.visibilityOf(uspesanOglasPostavljenText));
        return uspesanOglasPostavljenText.isDisplayed();
    }
    public String uspesanOglasPostavljenTextGetText(){
        uspesanOglasPostavljenText.getText();
        String uspesanOglas = uspesanOglasPostavljenText.getText();
        System.out.println(uspesanOglas);
        return uspesanOglasPostavljenText.getText();
    }
}
