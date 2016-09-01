package user.login;
//package BestBuyHomePage;

import BestBuyPageFactory.UserLoginPage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;


/**
 * Created by rinko on 8/31/2016.
 */
public class UserLoginBestBuy extends Base{



    @Test
    public void bestBuyLogin()throws IOException,InterruptedException {
        //initialize Search page factory

        //okAlert();
      //  BestBuyHomePage loginAction = PageFactory.initElements(driver, BestBuyHomePage.class);
        UserLoginPage userLogin =  PageFactory.initElements(driver, UserLoginPage.class); //new UserLoginPage();

        //Read search.data from excel file
        // ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //String [] value = itemsToBeSearched.getData();
        // for(String read:value) {

        //  Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
        //Iterator<String> itererator = windowId.iterator();
        //
        //String mainWinID = itererator.next();
        //String  newAdwinID = itererator.next();
        //
        //driver.switchTo().window(newAdwinID);
        //System.out.println(driver.getTitle());
        //Thread.sleep(3000);
        //driver.close();
        //
        //driver.switchTo().window(mainWinID);
        //System.out.println(driver.getTitle());
        //Thread.sleep(2000);
       // Alert alert = driver.switchTo().alert();
       // alert.dismiss();

        userLogin.bestBuyLogin("rinko.ewu@gmail.com","Rinko10028");
        sleepFor(5);
        //loginAction.clearSearchInput();
        //}
    }

  //  private void bestBuyLlogin(WebElement item){
        //loginClick.sendKeys(item, Keys.ENTER);
        // Click a login page
       // clickByCss
       // driver.findElement(item.click());
      //  driver.findElement(By.item.click());


   // }
}
