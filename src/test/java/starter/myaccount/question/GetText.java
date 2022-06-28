package starter.myaccount.question;

import net.serenitybdd.screenplay.questions.Text;
import starter.myaccount.page.MyAccountPage;

public class GetText {
    public static net.serenitybdd.screenplay.Question<String> errorMessage() {
        return actor -> Text.of(MyAccountPage.ERROR_MESSAGE).answeredBy(actor);
    }
}
