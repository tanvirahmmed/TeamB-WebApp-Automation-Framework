package BestBuyPageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



/**
 * Created by rinko on 8/31/2016.
 */
public class UserLoginPage {

    @FindBy(how = How.XPATH, using = "//*[@id='fld-e']")
    public static WebElement userEmail;

    @FindBy(how = How.XPATH, using = "//*[@id='fld-p1']")
    public static WebElement UserPass ;

    @FindBy(how = How.XPATH, using = "html/body/section/main/div[1]/div[1]/div/form/button")
    public static WebElement SubmitBtn ;



    public void bestBuyLogin(String uID, String Pass){

       // searchInput.click();
        userEmail.sendKeys(uID);
        UserPass.sendKeys(Pass);
        SubmitBtn.sendKeys(Keys.ENTER);


    }
    public void clearSearchInput(){
        userEmail.clear();
    }
}
