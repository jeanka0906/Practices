package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ContactPage;

public class ContactSteps {

    ContactPage contact = new ContactPage();

    @Given("^I am in the Contact page$")
    public void navigateToContactPage() {
        contact.navigateToContact();
    }

    @Then("^I can visualize, No hay contactos guardados message$")
    public void validateMessage() {
        Boolean value = contact.messages();

        Assert.assertTrue("No hay elementos guardados", value);
    }

    @When("^I choose Nuevo Contacto button$")
    public void nuevoContactoButton() {
        contact.contactoButton();
    }

    @And("^I enter my (.+)$")
    public void enterName(String name) {
        contact.enterName(name);
    }

    @And("^I type my (.+)$")
    public void enterMail(String mail) {
        contact.enterMail(mail);
        contact.submit();
    }

    @Then("^I can validate input data sort alphabetically on grid table$")
    public void validateData() {
        String value1 = contact.getName();
        String value2 = contact.getMail();

        Assert.assertEquals("perro", value1);
        Assert.assertEquals("perro@perro.com", value2);
    }
}
