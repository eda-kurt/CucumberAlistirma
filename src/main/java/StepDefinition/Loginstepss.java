package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepss {
    @Given("Amazon sitesine git")
    public void amazonSitesineGit()   {
        System.out.println("amazon sitesine gidildi");
    }

    @And("login butonuna tıkla")
    public void loginButonunaTıkla()   {
        System.out.println("Login butonuna tiklandi");}

    @And("isim gir")
    public void isimGir()   {
        System.out.println("isim girildi");
    }

    @And("sifre gir")
    public void sifreGir()   {
        System.out.println("sifre girildi");
    }

    @When("submit butonuna tıkladıgımda")
    public void submitButonunaTıkladıgımda()   {
        System.out.println("submit butonuna tikladigimda");
    }

    @Then("success mesajini verify et")
    public void successMesajiniVerifyEt()   {
        System.out.println("basarili giris yapildi");
    }
}
