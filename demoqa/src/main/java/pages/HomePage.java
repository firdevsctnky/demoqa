package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {


    private String elementsCardXPath = "(//div[contains(@class,'card-up')])[1]";
    private String textBoxXPath = "//li[contains(.,'Text Box')]";
    private String nameTextBox = "userName";
    private String emailTextBox = "userEmail";
    private String addressTextBox = "currentAddress";
    private String permanentAddressTextBox = "permanentAddress";
    private String submitTextBox = "submit";
    private String clickFormsXPath = "(//div[contains(.,'Forms')])[9]";
    private String clickPracticeFormXPath = "(//li[contains(@id,'item-0')])[2]";
    private String NameFormID = "firstName";
    private String lastNameFormID = "lastName";
    private String userEmailFormID = "userEmail";
    private String genderFemaleXPath = "//label[contains(.,'Female')]";
    private String mobileID = "userNumber";
    private String dateOfBirthID = "dateOfBirthInput";
    private String submitFormID = "submit";
    private String closeElementXPath= "//div[@class='header-text'][contains(.,'Elements')]";
    private String checkFormTextID= "example-modal-sizes-title-lg";



    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String baseURL = "https://demoqa.com/";



    public void goToDemoqa() {
        driver.get(baseURL);
        sleep(200);
    }
    public void clickElementsCard() {
        driver.findElement(By.xpath(elementsCardXPath)).click();
        sleep(200);
    }
    public void elementsCardTextBox() {
        driver.findElement(By.xpath(textBoxXPath)).click();
        driver.findElement(By.id(nameTextBox)).sendKeys("Firdevs Cetinkaya");
        sleep(200);
        driver.findElement(By.id(emailTextBox)).sendKeys("test@gmail.com");
        sleep(200);
        driver.findElement(By.id(addressTextBox)).sendKeys("Dublin");
        sleep(200);
        driver.findElement(By.id(permanentAddressTextBox)).sendKeys("test test 123 ");
        sleep(200);
        scrollDown();
        driver.findElement(By.id(submitTextBox)).click();


    }
    public void closeElements() {
        driver.findElement(By.xpath(closeElementXPath)).click();

    }

    public void clickForms() {
        sleep(1000);
        driver.findElement(By.xpath(clickFormsXPath)).click();
        driver.findElement(By.xpath(clickPracticeFormXPath)).click();

    }
    public void createPracticeForm() {
        driver.findElement(By.id(NameFormID)).sendKeys("Firdevs");
        driver.findElement(By.id(lastNameFormID)).sendKeys("Cetinkaya");
        driver.findElement(By.id(userEmailFormID)).sendKeys("firdevs.cetinkaya93@gmail.com");
        driver.findElement(By.xpath(genderFemaleXPath)).click();
        driver.findElement(By.id(mobileID)).sendKeys("0831222222");
        sleep(200);
        driver.findElement(By.id(dateOfBirthID)).clear();
        driver.findElement(By.id(dateOfBirthID)).sendKeys("04 Mar 1993");
        sleep(100);
        scrollDown();
        driver.findElement(By.id(submitFormID)).click();

    }
    public void checkTheForm() {
        sleep(200);
        driver.findElement(By.id(checkFormTextID)).getText().contains("Thanks for submitting the form");


    }






}