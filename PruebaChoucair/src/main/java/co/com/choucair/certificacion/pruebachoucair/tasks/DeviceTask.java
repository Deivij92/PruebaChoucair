package co.com.choucair.certificacion.pruebachoucair.tasks;

import co.com.choucair.certificacion.pruebachoucair.model.Device;
import co.com.choucair.certificacion.pruebachoucair.userinterface.DevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DeviceTask implements Task {
    private String osComputer;
    private String version;
    private String languaOs;
    private String typeDevice;
    private String model;
    private String osMobile;

    public DeviceTask(String osComputer, String version, String languaOs,
                      String typeDevice, String model, String osMobile   )  {
        this.osComputer = osComputer;
        this.version = version;
        this.languaOs = languaOs;
        this.typeDevice = typeDevice;
        this.model = model;
        this.osMobile = osMobile;
    }
    public static DeviceTask his(String osComputer, String version, String languaOs,
                                 String typeDevice, String model, String osMobile   ){
        return Tasks.instrumented(DeviceTask.class, osComputer, version, languaOs, typeDevice, model, osMobile);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DevicePage.SELECT_OS_COMPUTER),
                Click.on(DevicePage.SELECT_VERSION),
                Click.on(DevicePage.SELECT_LAN_OS),
                //Click.on(DevicePage.SELECT_TYPE_MOBILE),
                //Click.on(DevicePage.SELECT_TYPE_MOBILE),
                //Click.on(DevicePage.SELECT_MODEL),
                //Click.on(DevicePage.SELECT_OS_MOBILE)
                Click.on(DevicePage.ENTER_DEVICE)
        );
    }
}
