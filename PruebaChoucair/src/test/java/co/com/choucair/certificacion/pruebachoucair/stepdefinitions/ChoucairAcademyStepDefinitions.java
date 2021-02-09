package co.com.choucair.certificacion.pruebachoucair.stepdefinitions;

import co.com.choucair.certificacion.pruebachoucair.model.Device;
import co.com.choucair.certificacion.pruebachoucair.model.Password;
import co.com.choucair.certificacion.pruebachoucair.model.UtestData;
import co.com.choucair.certificacion.pruebachoucair.tasks.DeviceTask;
import co.com.choucair.certificacion.pruebachoucair.tasks.JoinLocation;
import co.com.choucair.certificacion.pruebachoucair.tasks.OpenUp;
import co.com.choucair.certificacion.pruebachoucair.tasks.PasswordTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Deivis wants to complete a form telling us about him and his location$")
    public void thanDeivisWantsToCompleteAFormTellingUsAboutHimAndHisLocation(List<UtestData> academyChoucairDataList) throws Exception{
        OnStage.theActorCalled("Deivis").wasAbleTo(OpenUp.thePage(), JoinLocation.onThePage(academyChoucairDataList.get(0).getFirtsname(), academyChoucairDataList.get(0).getLastname(), academyChoucairDataList.get(0).getEmail(),
                academyChoucairDataList.get(0).getMonthBirth(), academyChoucairDataList.get(0).getDayBirth(), academyChoucairDataList.get(0).getYearBirth(), academyChoucairDataList.get(0).getCountry(),
                academyChoucairDataList.get(0).getCity(), academyChoucairDataList.get(0).getPostal()));
        // throw new PendingException();
    }
    @When("^I want to add my devices$")
    public void iWantToAddMyDevices(List<Device> devicesDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(DeviceTask.his(devicesDataList.get(0).getOsComputer(),devicesDataList.get(0).getVersion(),
                devicesDataList.get(0).getLanguaOs(),
                devicesDataList.get(0).getTypeDevice(), devicesDataList.get(0).getOsMobile(), devicesDataList.get(0).getModel())
        );
    }

    @Then("^record all your data$")
    public void recordAllYourData(List<Password> devicesPass) {
        OnStage.theActorInTheSpotlight().attemptsTo(PasswordTask.go(
           devicesPass.get(0).getPassword(), devicesPass.get(0).getRepeatPassword()
        ));
    }
}
