package com.ecommerce.stepDefinition;

import com.ecommerce.Questions.ProductoQuestion;
import com.ecommerce.Tasks.IniciarSesion;
import com.ecommerce.Tasks.NavigateTo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {
    @Given("el {actor} está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion(Actor actor) {
        actor.attemptsTo(NavigateTo.theLoginPage());
    }

    @When("inicia sesión con usuario {string} y contraseña {string}")
    public void iniciaSesionConUsuarioYContrasenia(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.withData(usuario, password));
    }

    @Then("se muestra la página de productos")
    public void seMuestraLaPaginaDeProductos() {
        Actor actor = theActorInTheSpotlight();
        if (!ProductoQuestion.visible().answeredBy(actor)) {
            throw new AssertionError("No se mostró la página de productos");
        }
    }
}
