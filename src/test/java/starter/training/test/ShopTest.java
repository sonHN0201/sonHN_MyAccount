package starter.training.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.training.page.HomePage;
import starter.training.page.MyAccountPage;
import starter.training.page.NavigateWebsite;
import starter.training.page.ShopPage;
import starter.training.question.CheckSort;
import starter.training.question.GetText;
import starter.training.task.shop.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

@ExtendWith(SerenityJUnit5Extension.class)
public class ShopTest {
    @CastMember(name = "sonHN")
    static
    Actor sonHN;

    @Test
    @Title("Verify that the user can only view books for 150 to 450 rps")
    public void tc_01() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(PriceSlider.selectedPrice(ShopPage.SLIDER_RIGHT));
        sonHN.attemptsTo(
                Ensure.that(GetText.check()).isLessThan("450.00"),
                Ensure.that(GetText.check()).isGreaterThan("150.00")
        );
    }

    @Test
    @Title("Verify that the user can only view that specific product")
    public void tc_02() {
        String text = "Android 4.4 (KitKat®) is the latest version of the world’s favorite operating system for mobile phones and tablets.";
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(ViewProductDetails.viewProduct());
        sonHN.attemptsTo(
                Ensure.that(GetText.checkProductDetails()).isEqualTo(text)
        );
    }

    @Test
    @Title("Verify that users can only view popular products")
    public void tc_03() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(SelectCategoryProduct.selectCategory(ShopPage.SELECT_SORT_BY_POPULARITY));

    }

    @Test
    @Title("Verify that users can only view popular products")
    public void tc_04() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(SelectCategoryProduct.selectCategory(ShopPage.SELECT_SORT_BY_AVERAGE_RATINGS));
    }

    @Test
    @Title("Verify that users can only view popular products")
    public void tc_05() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(SelectCategoryProduct.selectCategory(ShopPage.SELECT_SORT_BY_NEWNESS));
    }

    @Test
    @Title("Verify that users can only view popular products")
    public void tc_06() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(
                Click.on(HomePage.SHOP_MENU)
        );
        sonHN.attemptsTo(CheckSort.checkSportPrice());

    }

    @Test
    @Title("Verify that users can only view popular products")
    public void tc_07() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(SelectCategoryProduct.selectCategory(ShopPage.SELECT_SORT_BY_HIGH_TO_LOW_ITEM));
    }

    @Test
    @Title("Verify that the user can't add the product read more options because it's out of stock")
    public void tc_08() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(ReadMoreProducts.readMore());
        sonHN.attemptsTo(
                Ensure.that(GetText.checkOutOfStock()).isEqualTo("Out of stock")
        );
        sonHN.should(
                seeThat("Check Add to basket not visible", WebElementQuestion.the(ShopPage.SUBMIT_BUTTON),isNotVisible())
        );
    }

    @Test
    @Title("Verify that users can clearly see the actual price with the difference in old prices for products sold in writing")
    public void tc_09() {
        sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
        sonHN.attemptsTo(SaleProduct.selectSaleProduct());
        sonHN.should(
                seeThat("check old price visible",WebElementQuestion.the(ShopPage.OLD_PRICE),isVisible()),
                seeThat("check new price visible",WebElementQuestion.the(ShopPage.NEW_PRICE),isVisible())
        );
        sonHN.attemptsTo(
                Ensure.that(GetText.newPrice()).isLessThan(""+GetText.oldPrice())
        );
    }

    @Test
    @Title("")
    public void tc_10() {

    }

    @Test
    @Title("")
    public void tc_11() {

    }

    @Test
    @Title("")
    public void tc_12() {

    }
}
