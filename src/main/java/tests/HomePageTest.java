package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest{

    @Test
    public void  createTools() throws InterruptedException {

        HomePage homePage = new HomePage(driver, wait);
        homePage.goToDemoqa();
        homePage.clickElementsCard();
        homePage.elementsCardTextBox();
        homePage.closeElements();
        homePage.clickForms();
        homePage.createPracticeForm();
        homePage.checkTheForm();



    }

}
