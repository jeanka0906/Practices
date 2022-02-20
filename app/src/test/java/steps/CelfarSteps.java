package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.CelfarPage;

public class CelfarSteps {

    CelfarPage converter = new CelfarPage();

    @Given("^I am in the Celfar page$")
    public void navigateToCelfarPage(){
        converter.navigateToCelfar();
    }

    @When("^I cilck on then numeric field$")
    public void clickNumericField(){
        converter.clickField();
    }


    @And("^I enter the following data (.+)$")
    public void enterData(String value){
        converter.enterValues(value);
    }


    @And("^click on convertir button$")
    public void clickConvertir(){
        converter.clickButton();
    }

    @Then("^I will be able to validate the output data (.+)$")
    public void validateData(String far){
        
        //var length = value.length();

        Assert.assertEquals(far, converter.getResult());
    }
        
}
