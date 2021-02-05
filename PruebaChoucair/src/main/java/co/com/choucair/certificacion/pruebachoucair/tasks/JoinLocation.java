package co.com.choucair.certificacion.pruebachoucair.tasks;

import co.com.choucair.certificacion.pruebachoucair.userinterface.JoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class JoinLocation implements Task {

    private String firtsname;
    private String lastname;
    private String email;
    private String monthBirth;

    public JoinLocation(String firtsname, String lastname,
                        String email,String monthBirth) {
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.email = email;
        this.monthBirth = monthBirth;
    }

    public static JoinLocation onThePage(String firtsname, String lastname, String email, String monthBirth) {
        return Tasks.instrumented(JoinLocation.class, firtsname, lastname, email, monthBirth);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayPage.JOIN_BUTTON),
                Enter.theValue(firtsname).into(JoinTodayPage.INPUT_FIRNAME),
                Enter.theValue(lastname).into(JoinTodayPage.INPUT_LASTNAME),
                Enter.theValue(email).into(JoinTodayPage.INPUT_EMAIL),
                Enter.theValue(monthBirth).into(JoinTodayPage.INPUT_MONTH),
                Click.on(JoinTodayPage.ENTER_BUTTON));


    }
}
