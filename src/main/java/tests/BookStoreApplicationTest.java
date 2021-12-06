package tests;

import org.testng.annotations.Test;
import pages.BookStorePage;
import pages.HomePage;

public class BookStoreApplicationTest extends BaseTest {

    @Test
    public void  createNewUser() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.clickNewUser();
        bookStorePage.bookStoreApplicationCreateNewUser();



    }
    @Test
    public void  successfulLogin() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.bookStoreApplicationSuccessfulLogin();

    }
    @Test
    public void  unSuccessfulLoginForUserName() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.bookStoreApplicationUnSuccessfulLoginForUserName();

    }
    @Test
    public void  unSuccessfulLoginForPassword() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.bookStoreApplicationUnSuccessfulLoginForPassword();

    }
    @Test
    public void  Profile() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.bookStoreApplicationSuccessfulLogin();
        bookStorePage.goToBookStore();

    }
    @Test
    public void  searchBook() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.bookStoreApplicationSuccessfulLogin();
        bookStorePage.searchBookStore();

    }
    @Test
    public void  searchandCheckBook() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.clickLogin();
        bookStorePage.bookStoreApplicationSuccessfulLogin();
        bookStorePage.searchBookStore();
        bookStorePage.controlBookDetails();

    }
    @Test
    public void  addandCheckBook() throws InterruptedException{

        HomePage homePage = new HomePage(driver, wait);
        BookStorePage bookStorePage = new BookStorePage(driver, wait);
        homePage.goToDemoqa();
        bookStorePage.clickBookStoreApplication();
        bookStorePage.goToLogin();
        bookStorePage.bookStoreApplicationSuccessfulLogin();
        bookStorePage.controlSuccessfulLogin();
        bookStorePage.goToStore();
        bookStorePage.searchBookStore();
        bookStorePage.controlBookDetails();
        bookStorePage.addBookForCollection();
        bookStorePage.clickProfile();
        bookStorePage.checktheList();
        bookStorePage.deleteTheBook();


    }
}
