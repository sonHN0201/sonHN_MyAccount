package starter.training.question;

import net.serenitybdd.screenplay.questions.Text;
import starter.training.page.MyAccountPage;
import starter.training.page.ShopPage;

public class GetText {
    public static net.serenitybdd.screenplay.Question<String> errorMessage() {
        return actor -> Text.of(MyAccountPage.ERROR_MESSAGE).answeredBy(actor);
    }
    public static net.serenitybdd.screenplay.Question<String> check() {
        return actor -> Text.of(ShopPage.CHECK).answeredBy(actor);
    }
    public static net.serenitybdd.screenplay.Question<String> checkProductDetails() {
        return actor -> Text.of(ShopPage.VERIFY_VIEW_PRODUCT_DETAILS).answeredBy(actor);
    }

}
