package co.com.choucair.certificacion.pruebachoucair.questions;

import co.com.choucair.certificacion.pruebachoucair.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{

    private String questios;

    public Answer(String question) {
        this.questios = question;

    }

    public static Answer toThe(String question) {
        return new Answer(question);

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (questios.equals(nameCourse)){
            result =  true;
        } else{
            result =  false;

        }
    return result;
    }

}
