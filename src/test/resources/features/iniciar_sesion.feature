Feature: Iniciar sesión

  @Login
  Scenario: Iniciar sesión con un usuario válido
    Given el usuario está en la página de inicio de sesión
    When inicia sesión con usuario "standard_user" y contraseña "secret_sauce"
    Then se muestra la página de productos
