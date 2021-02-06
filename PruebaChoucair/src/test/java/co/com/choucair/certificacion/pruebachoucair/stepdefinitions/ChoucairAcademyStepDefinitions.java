package co.com.choucair.certificacion.pruebachoucair.stepdefinitions;

import co.com.choucair.certificacion.pruebachoucair.model.AcademyChoucairData;
import co.com.choucair.certificacion.pruebachoucair.model.UtestData;
import co.com.choucair.certificacion.pruebachoucair.questions.Answer;
import co.com.choucair.certificacion.pruebachoucair.tasks.JoinLocation;
import co.com.choucair.certificacion.pruebachoucair.tasks.OpenUp;
import co.com.choucair.certificacion.pruebachoucair.tasks.Search;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
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
                academyChoucairDataList.get(0).getMonthBirth(), academyChoucairDataList.get(0).getDayBirth(), academyChoucairDataList.get(0).getYearBirth()));
        // throw new PendingException();
    }

    @When("^she search for the course on the Choucair academy plataform$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlataform(List<AcademyChoucairData> academyChoucairData)  throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo( Search.the(academyChoucairData.get(0).getStrCourse()));
        throw new PendingException();
    }


    @Then("^he finds the course called$")
    public void heFindsTheCourseCalled(List<AcademyChoucairData> academyChoucairData, String question) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
        throw new PendingException();
    }


}
