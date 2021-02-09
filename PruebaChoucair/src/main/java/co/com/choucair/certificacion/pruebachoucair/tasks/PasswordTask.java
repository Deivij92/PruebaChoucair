package co.com.choucair.certificacion.pruebachoucair.tasks;

import co.com.choucair.certificacion.pruebachoucair.userinterface.PaswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PasswordTask implements Task {
    private String password;
    private String  repeatPassword;

    public PasswordTask(String password, String repeatPassword) {
        this.password = password;
        this.repeatPassword = repeatPassword;
    }
    public static PasswordTask go(String password, String repeatPassword){
        return Tasks.instrumented(PasswordTask.class, password, repeatPassword);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(password).into(PaswordPage.INPUT_PASS),
        Enter.theValue(repeatPassword).into(PaswordPage.INPUT_REPEAT_PASS),
                Click.on(PaswordPage.ENTER_ACCEP1),
                Click.on(PaswordPage.ENTER_ACCEP2),
                Click.on(PaswordPage.SUBMIT_ALL_DATES)

        );

    }
}
