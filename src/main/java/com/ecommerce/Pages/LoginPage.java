package com.ecommerce.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    public static final Target USERNAME = Target.the("Campo de usuario")
            .located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("Campo de contraseña")
            .located(By.id("password"));
    public static final Target BTN_LOGIN = Target.the("Botón de inicio de sesión")
            .located(By.id("login-button"));
    public static final Target PRODUCTS_TITLE = Target.the("Título de productos")
            .located(By.className("title"));
}
