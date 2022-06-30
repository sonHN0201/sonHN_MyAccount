package starter.training.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import starter.training.help.WaitABit;
import starter.training.page.ShopPage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CheckSort implements Task {

    public static CheckSort checkSportPrice(){
        return Tasks.instrumented(CheckSort.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        List<WebElement> beforeFilterPrice = driver.findElements(By.cssSelector(".price>span"));
        List<Double> beforeFilterPriceList = new ArrayList<>();
        for (WebElement p : beforeFilterPrice){
            p.getText().replace("₹","");
            actor.attemptsTo(
                    Click.on(ShopPage.SELECT_CATEGORY),
                    Click.on(ShopPage.SELECT_SORT_BY_LOW_TO_HIGH_ITEM)

            );
//        Select dropdown = new Select(driver.findElement(By.cssSelector(".orderby")));
//        dropdown.selectByVisibleText("Sort by price: low to high");
        List<WebElement> afterFilterPrice = driver.findElements(By.cssSelector(".price>span"));
        List<Double> afterFilterPriceList = new ArrayList<>();
        for (WebElement d : afterFilterPrice){
            d.getText().replace("₹","");
        }
            Collections.sort(beforeFilterPriceList);
            Assert.assertEquals(beforeFilterPriceList,afterFilterPriceList);
        }
    }
}
