package starter.training.help;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;

public class WaitABit implements Performable {
    private final int time;

    public WaitABit(int time) {
        this.time = time;
    }
    public static WaitABit sleep(int time){
        return Tasks.instrumented(WaitABit.class,time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
