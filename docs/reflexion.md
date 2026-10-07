# Reflexión

## ¿Retos?

El reto principal fue mantener el programa **muy simple** y, al mismo tiempo, cumplir el caso de uso: pedir datos, pulsar un botón y mostrar un saludo. JavaFX no viene “listo para usar” en cualquier JDK: hay que declarar las dependencias y el plugin de Maven. Otro reto fue decidir cómo pedir la hora (AM/PM) sin complicar la pantalla.

## ¿Descubrimientos y sorpresas?

Sorprende lo poco que hace falta para una ventana: un `Stage`, una `Scene` y un `VBox` con campos y un botón. No hace falta FXML ni CSS para este ejercicio. También sorprende que el evento del botón se pueda escribir en una sola expresión (`setOnAction`) y que el saludo se arme concatenando el nombre y la edad.

## ¿Estructura del software?

El software es una sola clase, `MainApp`, que hereda de `Application`. El método `start` construye la interfaz, lee los campos y muestra el mensaje. Maven (`pom.xml`) describe el proyecto y permite ejecutar JavaFX. Los documentos (`README.md`, `prompts/`, `docs/reflexion.md`) no forman parte de la ejecución; solo explican y registran el trabajo.

```
sistema-saludador/
├── pom.xml
├── README.md
├── prompts/secuencia_prompts.txt
├── docs/reflexion.md
└── src/main/java/com/sistemasaludador/MainApp.java
```

## ¿Comandos, librerías o conceptos utilizados/no comprendidos?

**Utilizados**

- **Maven / Maven Wrapper** (`mvnw.cmd javafx:run`): descarga dependencias y lanza la app.
- **JavaFX**: `Application`, `Stage`, `Scene`, `TextField`, `ComboBox`, `Button`, `Label`, `VBox`.
- **Evento de botón**: `setOnAction` para reaccionar al clic.
- **JDK 17**: versión mínima del compilador en `pom.xml`.

**Menos comprendidos al inicio**

- Por qué JavaFX se declara en `pom.xml` y no se importa “solo” con el JDK.
- Qué hace exactamente el plugin `javafx-maven-plugin`.
- La diferencia entre armar la UI en código y hacerlo con FXML.

**Cursor asumía varias cosas al momento de inidicar el paso a paso para la ejecución del prototipo, por lo que hizo falta aclarar eso y así tener un README más completo**
