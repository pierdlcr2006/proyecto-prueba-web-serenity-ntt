package com.ecommerce.Questions;

import com.ecommerce.Pages.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductoQuestion implements Question<Boolean> {
    public static ProductoQuestion visible() {
        return new ProductoQuestion();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginPage.PRODUCTS_TITLE.resolveFor(actor).isDisplayed();
    }
}
