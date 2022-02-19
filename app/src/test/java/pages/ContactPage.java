package pages;

public class ContactPage extends BasePage {
    
    private String message ="//*[@class='empty']";
    private String nuevoContacto = "//button[@type='button']";
    private String nameLocator = "//input[@id='contact-name']";
    private String mailLocator = "//input[@id='contact-mail']";
    private String submit = "//button[@type='submit']";
    private String nameResult = "//td[@name='contact-name']";
    private String mailResult = "//td[@name='contact-mail']";

    public ContactPage(){
        super(driver);
    }

    public void navigateToContact(){
        navigateTo("https://nahual.github.io/qc-contactos/contactos.html");
    }

    public Boolean messages(){
        return isDisplayed(message);
    }

    public void contactoButton(){
        Click(nuevoContacto);
    }

    public void enterName(String name){
        sendKeys(nameLocator, name);
    }

    public void enterMail(String mail){
        sendKeys(mailLocator, mail);
    }

    public void submit(){
        Click(submit);
    }

    public String getName(){
        return getText(nameResult);
    }

    public String getMail(){
        return getText(mailResult);
    }

}
