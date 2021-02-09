package co.com.choucair.certificacion.pruebachoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaswordPage {

    public static final Target INPUT_PASS = Target.the("where we write Password").located(By.id("password"));
    public static final Target INPUT_REPEAT_PASS = Target.the("where we write of new Password").located(By.id("confirmPassword"));
    public static final Target ENTER_ACCEP1 = Target.the("Accept Term 1").located(By.xpath("//input[@id='termOfUse']"));
    public static final Target ENTER_ACCEP2 = Target.the("Accept Term 2").located(By.xpath("//input[@id='privacySetting']"));
    public static final Target SUBMIT_ALL_DATES= Target.the("Submit dates").located(By.xpath("//div//div//a//span//font//font[@style = 'vertical-align: inherit;']"));

}
