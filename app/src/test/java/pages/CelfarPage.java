package pages;

public class CelfarPage extends BasePage{

    private String inputINTLocator = "//input[@id='input']";
    private String convertirBTN = "(//input[@value='convertir!'])[1]";
    private String outputTXT = "//span[@id='output']";
    
    
    public CelfarPage(){
        super(driver);
    }

    public void navigateToCelfar(){
        navigateTo("https://nahual.github.io/qc-celfar/");
    }

    public void clickField(){
        Click(inputINTLocator);
    }

    public void enterValues(String value){
        sendKeys(inputINTLocator, value);
    }

    public void clickButton(){
        Click(convertirBTN);
    }

    public String getResult(){
        return getText(outputTXT);
    }


}
