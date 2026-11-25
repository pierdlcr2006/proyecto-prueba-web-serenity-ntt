# Proyecto de pruebas web

## Web utilizada

Se utiliza [SauceDemo](https://www.saucedemo.com/), una web gratuita para
prácticas y pruebas de automatización web.

Flujo probado:

- Abre la página de inicio de sesión.
- Inicia sesión con el usuario de prueba `standard_user`.
- Utiliza la contraseña `secret_sauce`.
- Valida que se muestre la página de productos.

## Ejecución

Desde la raíz del proyecto:

```bash
mvn clean verify
```

## Reporte Serenity

El reporte Serenity queda generado en:

```text
target/site/serenity/index.html
```

Para ver las capturas correctamente en Brave, se puede servir el reporte por
HTTP desde la raíz del proyecto:
