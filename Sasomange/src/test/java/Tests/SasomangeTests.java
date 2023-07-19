package Tests;
import Base.BaseTest;
import Page.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SasomangeTests extends BaseTest {

    HomePageSasomange homePageSasomange;
    RegistrujSePageSasomange registrujSePageSasomange;
    MailnatorPageSasomange mailnatorPageSasomange;
    UlogujSePageSasomange ulogujSePageSasomange;
    LoggedInUserHomeSasomangePage loggedInUserHomeSasomangePage;
    PromenaLozinkePageSasomange promenaLozinkePageSasomange;
    AlternativeRegistrationOptionPageSasomange alternativeRegistrationOptionPageSasomange;
    CokieBotPageSasomange cokieBotPageSasomange;
    MojSasomangeDodajOglasIzborKategorijeSectionPage mojSasomangeDodajOglasIzborKategorijeSectionPage;
    DodajOglasOOglasuChosenCategorySectionPageSasomange dodajOglasOOglasuSectionPageSasomange;
    @Before
    public void setUpTest(){

        homePageSasomange = new HomePageSasomange();
        registrujSePageSasomange = new RegistrujSePageSasomange();
        mailnatorPageSasomange = new MailnatorPageSasomange();
        ulogujSePageSasomange = new UlogujSePageSasomange();
        loggedInUserHomeSasomangePage = new LoggedInUserHomeSasomangePage();
        promenaLozinkePageSasomange = new PromenaLozinkePageSasomange();
        alternativeRegistrationOptionPageSasomange = new AlternativeRegistrationOptionPageSasomange();
        cokieBotPageSasomange = new CokieBotPageSasomange();
        mojSasomangeDodajOglasIzborKategorijeSectionPage = new MojSasomangeDodajOglasIzborKategorijeSectionPage();
        dodajOglasOOglasuSectionPageSasomange = new DodajOglasOOglasuChosenCategorySectionPageSasomange();
    }
    //-------------------------------------POSITIVE TESTS---------------------------------------------------------------
    @Test public void registerOnSasomange() {
        homePageSasomange.registrujSeButtonClick();
        Assert.assertTrue(registrujSePageSasomange.registrujSeJosNemasNalogTextIsDisplayed());
        Assert.assertEquals("Registruj se\n" + "Još uvek nemaš nalog na Sasomange.rs? Pridruži nam se! " +
                        "Da kupuješ, prodaješ, pretražuješ, da čuvaš oglase i pretrage!",
                registrujSePageSasomange.registrujSeJosNemasNalogTextGetText());
        registrujSePageSasomange.fizickoLiceOptionIsSelected();
        Assert.assertTrue(registrujSePageSasomange.lozinkaTrebaDaSadrziTextIsDisplayed());
        Assert.assertEquals("Lozinka treba da sadrži najmanje: 8 karaktera, 1 veliko slovo, 1 malo slovo, 1 broj.",
                registrujSePageSasomange.lozinkaTrebaDaSadrziTextGetText());
        registrujSePageSasomange.imejlInputFieldSendKeys(preEt + "@mailinator.com");
        registrujSePageSasomange.lozinkaRegInputFieldSendKeys("Aa#@+ .1" + afterMinBoundVal);
        registrujSePageSasomange.eyeIconRegClick();
        Assert.assertTrue(registrujSePageSasomange.lozinkaTrebaDaSadrziTextIsDisplayed());
        Assert.assertEquals("Lozinka je sigurna", registrujSePageSasomange.lozinkaTrebaDaSadrziTextGetText());
        registrujSePageSasomange.promotivnePorukeUInboxCheckboxUntick();
        registrujSePageSasomange.pravilaIPolitikaKoriscenjaCheckboxTick();
        registrujSePageSasomange.registrujSeButtonPrimaryClick();
        mailnatorPageSasomange.malinatorInboxInputFieldSendKeys(preEt + "@mailinator.com");
        mailnatorPageSasomange.goButtonClick();
        mailnatorPageSasomange.mailinatorSasomangeAktivacijaUspelaMailClick();
        mailnatorPageSasomange.potvrdiImejlAdresuButonScroolAndClick();
        Assert.assertTrue(ulogujSePageSasomange.uspesnoAktiviranNalogTextAndpocniDaKupujesTextIsDisplayed());
        Assert.assertEquals("Uspešno aktiviran nalog!\n" + "Počni da kupuješ, da pretražuješ, prodaješ, razgledaš i" +
                        " čuvaš sve što ti se svidi, do mile volje - iskoristi sve prednosti koje nudi Sasomange.rs."
                , ulogujSePageSasomange.prijaviSeSasomangeTextGetText());

    }
     @Test public void logInUsingRegisteredAccountAndLogOutSasomange() {
         homePageSasomange.ulogujSeButtonClick();
         Assert.assertTrue(ulogujSePageSasomange.prijaviSeSasomangeTextIsDisplayed());
         Assert.assertEquals("Prijavi se\n" + "Prijavi se na svoj Sasomange.rs nalog!",
                   ulogujSePageSasomange.prijaviSeSasomangeTextGetText());
         ulogujSePageSasomange.imejl_KorisnickoIme_InputFieldSendKeys("jojel.7233@gmail.com");
         ulogujSePageSasomange.lozinka_InputField("Aa#@+ .1");
         ulogujSePageSasomange.eyeIconClick();
         ulogujSePageSasomange.prijaviSeButton_PrimaryClick();
         Assert.assertTrue(loggedInUserHomeSasomangePage.uspesnaPrijavaTimeLimitedMessageIsDisplayed());
         Assert.assertEquals("USPEŠNA PRIJAVA",loggedInUserHomeSasomangePage.uspesnaPrijavaTimeLimitedMessageGetText());
        loggedInUserHomeSasomangePage.userInboxDropDownMenuClick();
        loggedInUserHomeSasomangePage.izlogujMeButton_UserInboxDropDownIconClick();
        loggedInUserHomeSasomangePage.daIzlogujMeButtonInSmallWindowClick();
        Assert.assertTrue(homePageSasomange.uspesnaOdjavaTimeLimitedMessageIsDisplayed());
        Assert.assertEquals("USPEŠNA ODJAVA", homePageSasomange.uspesnaOdjavaTimeLimitedMessageGetText());
    }
    @Test public void inspectTheLinkRegistrujSe(){
        homePageSasomange.ulogujSeButtonClick();
        registrujSePageSasomange.registrujeSeHyperLinkUnderlinedClick();
        Assert.assertTrue(registrujSePageSasomange.registrujSeJosNemasNalogTextIsDisplayed());
        Assert.assertEquals("Registruj se\n" + "Još uvek nemaš nalog na Sasomange.rs? Pridruži nam se! " +
                        "Da kupuješ, prodaješ, pretražuješ, da čuvaš oglase i pretrage!",
                registrujSePageSasomange.registrujSeJosNemasNalogTextGetText());
    }
    @Test public void inspectTheLinkNeSecasSeLozinke(){
        homePageSasomange.ulogujSeButtonClick();
        ulogujSePageSasomange.neSecasSeLozinkeHyperLinkUnderlinedClick();
        Assert.assertTrue(promenaLozinkePageSasomange.promenaLozinkeTextIUnesiImejlAdresuTextIsDisplayed());
        Assert.assertEquals("Promena lozinke\n" + "Unesi imejl adresu na koju ćemo ti poslati link za resetovanje."
                ,promenaLozinkePageSasomange.promenaLozinkeTextIUnesiImejlAdresuTextGetText());
        Assert.assertTrue(promenaLozinkePageSasomange.PlaceholderPromenaLozinkeIsDisplayed());
    }
    @Test public void inspectRegistrujSePrekoGoogleButton(){
        homePageSasomange.registrujSeButtonClick();
        cokieBotPageSasomange.kolacicWindowCloseClick();
        registrujSePageSasomange.registrujSeGoogleButtonClick();
        Assert.assertTrue(alternativeRegistrationOptionPageSasomange.signInWithGoogleTextIsDisplayed());
        Assert.assertEquals("Sign in with Google",
                alternativeRegistrationOptionPageSasomange.signInWithGoogleTextGetText());
    }
    @Test public void inspectRegistrujSePrekoFacebookButton(){
        homePageSasomange.registrujSeButtonClick();
        cokieBotPageSasomange.kolacicWindowCloseClick();
        registrujSePageSasomange.registrujSeFacebookButtonClick();
        alternativeRegistrationOptionPageSasomange.emailInputFieldExit();
        Assert.assertTrue(alternativeRegistrationOptionPageSasomange.signInWithFacebookTextIsDisplayed());
        Assert.assertEquals("Facebook"
                ,alternativeRegistrationOptionPageSasomange.signInWithFacebookTextGetText());
    }
    @Test public void inspectRegistrujSePrekoAppleButton(){
        homePageSasomange.registrujSeButtonClick();
        cokieBotPageSasomange.kolacicWindowCloseClick();
        registrujSePageSasomange.registrujSeAppleButtonClick();
        Assert.assertTrue(alternativeRegistrationOptionPageSasomange.appleID_ToSignTextIsDisplayed());
        Assert.assertEquals("Use your Apple ID to sign in to Sasomange.",
                alternativeRegistrationOptionPageSasomange.appleID_ToSignTextGetText());
    }
    @Test public void placeAnAddWhileLoggedInSasomange(){
        homePageSasomange.ulogujSeButtonClick();
        ulogujSePageSasomange.imejl_KorisnickoIme_InputFieldSendKeys("Registered mail");
        ulogujSePageSasomange.lozinka_InputField("Valid password");
        ulogujSePageSasomange.prijaviSeButton_PrimaryClick();
        loggedInUserHomeSasomangePage.dodajOglasButtonClick();
        cokieBotPageSasomange.kolacicWindowCloseClick();
        Assert.assertTrue(mojSasomangeDodajOglasIzborKategorijeSectionPage.korisnickaZaOglasIsDisplayed());
        Assert.assertEquals("Ukoliko ti je potrebna pomoć oko postavljanja oglasa uvek možeš da kontaktiraš " +
                "našu korisničku podršku:",mojSasomangeDodajOglasIzborKategorijeSectionPage.korisnickaZaOglasTextGetText());
        mojSasomangeDodajOglasIzborKategorijeSectionPage.staOglasavasSearchBoxPlaceHolderInputField
                ("vozila");
        mojSasomangeDodajOglasIzborKategorijeSectionPage.thumbScrollButtonHoldAndScroll();
        mojSasomangeDodajOglasIzborKategorijeSectionPage.xCloseButtonInSearchBoxPlaceHolderInputFieldClick();
        mojSasomangeDodajOglasIzborKategorijeSectionPage.vozilaCategoryListClick();
        mojSasomangeDodajOglasIzborKategorijeSectionPage.automobiliSubCategoryFromVozilaClick();
        mojSasomangeDodajOglasIzborKategorijeSectionPage.polovniAutomobiliSubcategoryFromAutomobiliClick();
        mojSasomangeDodajOglasIzborKategorijeSectionPage.nastaviButtonPrimaryClick();
        Assert.assertTrue(dodajOglasOOglasuSectionPageSasomange.chosenCategoriesAndSubcategoriesTextIsDisplayed());
        Assert.assertEquals("Odabir kategorije\n" + "Vozila\n" + "Automobili\n" + "Polovni automobili"
                ,dodajOglasOOglasuSectionPageSasomange.chosenCategoriesAndSubcategoriesTextGetText());
        dodajOglasOOglasuSectionPageSasomange.opstiPodaciOVozilu();
        dodajOglasOOglasuSectionPageSasomange.nazad_I_NapredButtonHide();
        dodajOglasOOglasuSectionPageSasomange.markaAutomobilaDropdownmenuRandomClick();
        dodajOglasOOglasuSectionPageSasomange.modelDropdownmenuAccessibleAftermarkaAutomobilaRandomClick();
        dodajOglasOOglasuSectionPageSasomange.gorivoDropdownMenuAccessibleAfterModelPickRandomClick();
        dodajOglasOOglasuSectionPageSasomange.oblikKaroserijeAccessibleAfterGorivoRandomClick();
        dodajOglasOOglasuSectionPageSasomange.brojVrataDropdownMenuAccessibleAfterOblikKaroserijeRandomClick();
        dodajOglasOOglasuSectionPageSasomange.godinaProizvodnjeDropdownMenuAccessibleAfterBrojVrataRandomClick();
        dodajOglasOOglasuSectionPageSasomange.tipInputFieldSendKeys("Cb1# .");
    }
}
