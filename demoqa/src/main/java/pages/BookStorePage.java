package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookStorePage  extends BasePage {

    private String bookStoreAppXPath= "(//div[contains(@class,'card-up')])[6]";
    private String loginBtnID= "login";
    private String bookStoreNewUserID= "newUser";
    private String newUserNameID= "firstname";
    private String newUserLastNameID= "lastname";
    private String newUserUserNameID= "userName";
    private String newUsePasswordID= "password";
    private String recaptchaID= "recaptcha-anchor";
    private String registerID= "register";
    private String userNameID= "userName";
    private String passwordID= "password";
    private String loginButtonID= "login";
    private String inValidID= "name";
    private String userNameTxtID= "userName-value";
    private String gotoStoreBtnID= "gotoStore";
    private String searchBoxID= "searchBox";
    private String clickFirstBookXPath= "//a[@href='/books?book=9781449331818'][contains(.,'Learning JavaScript Design Patterns')]";
    private String ISBNID= "ISBN-label";
    private String titleID= "title-label";
    private String subtitleID= "subtitle-label";
    private String authorID= "author-label";
    private String publisherID= "publisher-label";
    private String pagesID= "pages-label";
    private String descriptionID= "description-label";
    private String websiteID= "website-label";
    private String addNewRecordButtonID= "addNewRecordButton";
    private String profileXPath= "//span[@class='text'][contains(.,'Profile')]";
    private String list1XPath = "//a[contains(.,'Learning JavaScript Design Patterns')]]";
    private String deleteBookID = "delete-record-undefined";
    private String deleteTitleID = "example-modal-sizes-title-sm";
    private String deleteQuID = "example-modal-sizes-title-sm";
    private String deleteOKID = "closeSmallModal-ok";
    private String goToLoginXPath = "//span[@class='text'][contains(.,'Login')]";



    public BookStorePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickBookStoreApplication() {
       sleep(200);
        scrollDown();
        driver.findElement(By.xpath(bookStoreAppXPath)).click();
        sleep(200);


    }
    public void clickLogin() {
        driver.findElement(By.id(loginBtnID)).click();


    }
    public void clickNewUser() {
        driver.findElement(By.id(bookStoreNewUserID)).click();

    }

    public void bookStoreApplicationCreateNewUser() {

        driver.findElement(By.id(newUserNameID)).sendKeys("Firdevs");
        driver.findElement(By.id(newUserLastNameID)).sendKeys("Çetinkaya");
        driver.findElement(By.id(newUserUserNameID)).sendKeys("firdevs");
        driver.findElement(By.id(newUsePasswordID)).sendKeys("Firdevs@test1");
        driver.findElement(By.id(recaptchaID)).click();
        sleep(200);
        driver.findElement(By.id(registerID)).click();


    }
    public void bookStoreApplicationSuccessfulLogin() {

        sleep(1000);

        driver.findElement(By.id(userNameID)).sendKeys("firdevs");
        sleep(100);
        driver.findElement(By.id(passwordID)).sendKeys("Firdevs@test1");
        sleep(100);
        driver.findElement(By.id(loginButtonID)).click();
        sleep(200);
        driver.findElement(By.id(userNameTxtID)).getText().contains("firdevs");

    }
    public void controlSuccessfulLogin() {

        driver.findElement(By.id(userNameTxtID)).getText().contains("firdevs");
        sleep(200);

    }
    public void bookStoreApplicationUnSuccessfulLoginForUserName() {

        driver.findElement(By.id(userNameID)).sendKeys("test");
        driver.findElement(By.id(passwordID)).sendKeys("Firdevs@test1");
        driver.findElement(By.id(loginButtonID)).click();
        driver.findElement(By.id(inValidID)).getText().contains("Invalid username or password!");

    }
    public void bookStoreApplicationUnSuccessfulLoginForPassword() {

        driver.findElement(By.id(userNameID)).sendKeys("firdevs");
        driver.findElement(By.id(passwordID)).sendKeys("Firdevs@test12");
        driver.findElement(By.id(loginButtonID)).click();
        driver.findElement(By.id(inValidID)).getText().contains("Invalid username or password!");

    }

    public void goToBookStore() {

        driver.findElement(By.id(gotoStoreBtnID)).click();

    }
    public void searchBookStore() {

        driver.findElement(By.id(searchBoxID)).sendKeys("java");
        sleep(200);
        driver.findElement(By.xpath(clickFirstBookXPath)).click();
        sleep(200);

    }
    public void controlBookDetails() {

        driver.findElement(By.id(ISBNID)).getText().contains("ISBN");
        driver.findElement(By.id(titleID)).getText().contains("Title");
        driver.findElement(By.id(subtitleID)).getText().contains("Sub Title");
        driver.findElement(By.id(authorID)).getText().contains("Author");
        driver.findElement(By.id(publisherID)).getText().contains("Publisher");
        driver.findElement(By.id(pagesID)).getText().contains("Total Pages ");
        driver.findElement(By.id(descriptionID)).getText().contains("Description");
        driver.findElement(By.id(websiteID)).getText().contains("Website");

    }
    public void addBookForCollection() {

        scrollDown();
        driver.findElement(By.id(addNewRecordButtonID)).click();


    }
    public void clickProfile() {

        scrollDown();
        driver.findElement(By.xpath(profileXPath)).click();

    }
    public void checktheList() {

        driver.findElement(By.xpath(list1XPath)).getText().contains("Learning JavaScript Design Patterns");

    }
    public void deleteTheBook() {

        driver.findElement(By.id(deleteBookID)).click();
        driver.findElement(By.id(deleteTitleID)).getText().contains("Delete Book");
        driver.findElement(By.id(deleteQuID)).getText().contains("Do you want to delete this book?");
        driver.findElement(By.id(deleteOKID)).click();

    }
    public void goToLogin() {
        scrollDown();
        driver.findElement(By.xpath(goToLoginXPath)).click();
        sleep(500);

    }
    public void goToStore() {

        scrollDown();

        driver.findElement(By.id(gotoStoreBtnID)).click();

    }
}
