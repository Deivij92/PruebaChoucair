package co.com.choucair.certificacion.pruebachoucair.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class JoinTodayPage {
      /*| firname    | lasname| email | monthBirth | dayBirth | yearBirth | languaje | city | postal | country|*/
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form for user registration").
            located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(), 'Join Today')]"));
    public static final Target INPUT_FIRNAME = Target.the("where we write first name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where we write last names").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where we write last names").
            located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("where we write last names").
            located(By.xpath("//div//div[@class='ui-select-box']//div[@class='col-xs-5 col-md-5 col-lg-5 months']//select[@id='birthMonth']/option[January]"));
    /*public static final Target INPUT_DAY = Target.the("where we write last names").
            located(By.id("lastName"));
    public static final Target INPUT_YEAR = Target.the("where we write last names").
            located(By.id("lastName"));*/

    public static final Target ENTER_BUTTON = Target.the("button that shows us the form to add location").
            located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
