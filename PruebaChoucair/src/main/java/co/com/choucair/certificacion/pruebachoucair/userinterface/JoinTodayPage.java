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

    public static final Target INPUT_MONTH = Target.the("where we write month birth").
            located(By.xpath("//div[@class='ui-select-box']//div[@class='col-xs-5 col-md-5 col-lg-5 months']//select[@id='birthMonth']//option[contains(text(), 'October')]"));
    public static final Target INPUT_DAY = Target.the("where we write day birth").
            located(By.xpath("//div[@class='ui-select-box']//div[@class='col-xs-3 col-md-3 col-lg-3 days']//select[@id = 'birthDay']//option[contains(text(), '17')]"));
    public static final Target INPUT_YEAR = Target.the("where we write year birth").
            located(By.xpath("//div[@class='ui-select-box']//div[@class='col-xs-4 col-md-4 col-lg-4 years']//select[@id = 'birthYear']//option[contains(text(), '1992')]"));
    ////div[@class='form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 select2-theme-form']//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//li[@id='ui-select-choices-3']//div[@class='ui-select-choices-row active']//span[@class = 'ui-select-choices-row-inner']//div[contains(text(), 'Spanish')]
    public static final Target ENTER_BUTTON = Target.the("button that shows us the form to add location").
            located(By.xpath("//div[@class= 'form-group col-xs-12 text-right']//a//span[contains(text(), 'Next: Location')]"));
}
