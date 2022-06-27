package starter.myaccount.help;

import net.serenitybdd.screenplay.questions.Text;
import starter.myaccount.page.MyAccountPage;

public class Question {
    public static net.serenitybdd.screenplay.Question<String> errorMessage() {
        return actor -> Text.of(MyAccountPage.ERROR_MESSAGE).answeredBy(actor);
    }
}
