package starter.training.test;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.training.page.NavigateWebsite;
import starter.training.task.PriceSlider;

@ExtendWith(SerenityJUnit5Extension.class)
public class ShopTest {
    @CastMember(name = "sonHN")
    static
    Actor sonHN;

    @Test
    @Title("Verify that the user can only view books for 150 to 450 rps")
    public  void tc_01(){
    sonHN.attemptsTo(Open.browserOn(new NavigateWebsite()));
    sonHN.attemptsTo(PriceSlider.selectedPrice());
    }
    @Test
    @Title("Verify that the user can only view that specific product")
    public  void tc_02(){

    }
    @Test
    @Title("Verify that users can only view popular products")
    public  void tc_03(){

    }
    @Test
    @Title("")
    public  void tc_04(){

    }
    @Test
    @Title("")
    public  void tc_05(){

    }
    @Test
    @Title("")
    public  void tc_06(){

    }
    @Test
    @Title("")
    public  void tc_07(){

    }
    @Test
    @Title("")
    public  void tc_08(){

    }
    @Test
    @Title("")
    public  void tc_09(){

    }
    @Test
    @Title("")
    public  void tc_10(){

    }
    @Test
    @Title("")
    public  void tc_11(){

    }
    @Test
    @Title("")
    public  void tc_12(){

    }
}
