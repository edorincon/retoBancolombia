package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import org.example.userinterfaces.OpenEvalartApp;

public class OpenUp implements Task {

    private static OpenEvalartApp openEvalartApp;

    public OpenUp(OpenEvalartApp openEvalartApp) {
        this.openEvalartApp = openEvalartApp;
    }

    public static OpenUp urlApp() {

        return Tasks.instrumented(OpenUp.class, openEvalartApp);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(openEvalartApp));
    }
}
