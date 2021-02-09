package co.com.choucair.certificacion.pruebachoucair.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage {

    public static final Target SELECT_OS_COMPUTER = Target.the("input the register type OS computer").located(
            By.xpath("//span[@class='ui-select-match-text pull-left ui-select-allow-clear' and contains(text(), 'Windows')]"));
    public static final Target SELECT_VERSION = Target.the("input the register type version computer").located(
            By.xpath("//span[@class = 'ui-select-match-text pull-left ui-select-allow-clear' and contains(text(), '10')]"));
    public static final Target SELECT_LAN_OS = Target.the("input the register type languaje computer").located(
            By.xpath("//span[@class = 'ui-select-match-text pull-left ui-select-allow-clear' and contains(text(), 'Spanish') ]"));

    public static final Target SELECT_TYPE_MOBILE = Target.the("input the register type mobile").located(
            By.xpath("//div[@class = 'form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form']//span[@aria-label='Select Brand']" +
                    "//span[@class='ui-select-match-text pull-left ng-hide' and contains(text(), 'Select Brand')]"));
    public static final Target SELECT_MODEL = Target.the("input the register model mobile").located(
            By.xpath("//span[@class = 'ui-select-match-text pull-left ui-select-allow-clear' and contains(text(), 'Redmi 8')]"));
    public static final Target SELECT_OS_MOBILE = Target.the("input the register os mobile").located(

            By.xpath("//span[@class = 'ui-select-match-text pull-left ui-select-allow-clear' and contains(text(), 'Android 10')]"));

    public static final Target ENTER_DEVICE = Target.the("input the register os mobile").
            located(By.xpath("//div[@class='pull-right next-step']//a//span[contains(text(), 'Next: Last Step')]"));
}
//span//span[@class=ui-select-match-text pull-left ng-hide']