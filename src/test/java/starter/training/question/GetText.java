package starter.training.question;

import net.serenitybdd.screenplay.questions.Text;
import starter.training.page.MyAccountPage;
import starter.training.page.ShopPage;

public class GetText {
    public static net.serenitybdd.screenplay.Question<String> errorMessage() {
        return actor -> Text.of(MyAccountPage.ERROR_MESSAGE).answeredBy(actor);
    }

    public static net.serenitybdd.screenplay.Question<String> check() {
        return actor -> Text.of(ShopPage.CHECK).answeredBy(actor).replace("₹","");
    }

    public static net.serenitybdd.screenplay.Question<String> checkProductDetails() {
        return actor -> Text.of(ShopPage.VERIFY_VIEW_PRODUCT_DETAILS).answeredBy(actor);
    }

    public static net.serenitybdd.screenplay.Question<String> checkOutOfStock() {
        return actor -> Text.of(ShopPage.OUT_OF_STOCK).answeredBy(actor);
    }

    public static net.serenitybdd.screenplay.Question<String> oldPrice() {
        return actor -> Text.of(ShopPage.OLD_PRICE).answeredBy(actor).replace("₹","");
    }

    public static net.serenitybdd.screenplay.Question<String> newPrice(){
        return actor -> Text.of(ShopPage.NEW_PRICE).answeredBy(actor).replace("₹","");
    }
}
