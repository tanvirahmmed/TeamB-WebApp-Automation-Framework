package home.page;

import common.Base;
import org.testng.annotations.Test;

/**
 * Created by rinko on 8/31/2016.
 */
public class SearchProduct extends Base  {

    @Test
    public void searchProducts() throws InterruptedException {
        //clickByCss(".button.search-button");
        typeByCss("#gh-search-input", "hp spectre x360");
        sleepFor(5);
    }
}