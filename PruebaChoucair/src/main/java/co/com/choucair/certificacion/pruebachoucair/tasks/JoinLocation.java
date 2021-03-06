package co.com.choucair.certificacion.pruebachoucair.tasks;

import co.com.choucair.certificacion.pruebachoucair.userinterface.JoinTodayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.Select;

public class JoinLocation implements Task {

    private String firtsname;
    private String lastname;
    private String email;
    private String monthBirth;
    private String dayBirth;
    private String yearBirth;
    private String country;
    private String city;
    private String postal;

    public JoinLocation(String firtsname, String lastname,
                        String email,String monthBirth,
                        String dayBirth, String yearBirth,
                        String country, String city, String postal) {
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.email = email;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
        this.country = country;
        this.city =     city;
        this.postal = postal;
    }

    public static JoinLocation onThePage(String firtsname, String lastname, String email, String monthBirth, String dayBirth,
                                         String yearBirth, String country,String city,  String postal) {
        return Tasks.instrumented(JoinLocation.class, firtsname, lastname, email,
                monthBirth, dayBirth,yearBirth, country, city,  postal);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayPage.JOIN_BUTTON),
                Enter.theValue(firtsname).into(JoinTodayPage.INPUT_FIRNAME),
                Enter.theValue(lastname).into(JoinTodayPage.INPUT_LASTNAME),
                Enter.theValue(email).into(JoinTodayPage.INPUT_EMAIL),
                Click.on(JoinTodayPage.INPUT_MONTH),
                Click.on(JoinTodayPage.ENTER_BUTTON),
                Click.on(JoinTodayPage.INPUT_DAY),
                Click.on(JoinTodayPage.INPUT_YEAR),
                Click.on(JoinTodayPage.ENTER_BUTTON),
                Click.on(JoinTodayPage.INPUT_COUNTRY),
                //Click.on(JoinTodayPage.INPUT_CITY),
                Enter.theValue(postal).into(JoinTodayPage.INPUT_POSTAL),
                Click.on(JoinTodayPage.ENTER_DEVICE));


    }
}
