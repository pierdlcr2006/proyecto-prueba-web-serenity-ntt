package com.ecommerce.Tasks;

import com.ecommerce.Pages.LoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theLoginPage() {
        return Task.where("{0} abre la página de inicio de sesión", Open.browserOn().the(LoginPage.class));
    }
}
