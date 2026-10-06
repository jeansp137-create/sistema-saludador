# Sistema Saludador

Aplicación de escritorio en **JavaFX** que cubre el caso de uso **Solicitar saludo** (incluye **Pedir datos**). El estudiante ingresa nombre, edad y hora con selector AM/PM; al pulsar **Solicitar saludo**, la aplicación valida los datos y muestra un mensaje personalizado.

## Requisitos

- JDK 17 o superior
- Apache Maven 3.8 o superior **o** el Maven Wrapper incluido en este repositorio (`mvnw` / `mvnw.cmd`)
- Entorno gráfico (JavaFX abre una ventana de escritorio)

Comprueba el JDK:

```bash
java -version
```

## Compilar y ejecutar con Maven

Desde la raíz del repositorio (`sistema-saludador`).

### Windows (PowerShell o CMD)

1. Descargar dependencias y compilar:

```bash
.\mvnw.cmd clean compile
```

2. Ejecutar la interfaz gráfica:

```bash
.\mvnw.cmd javafx:run
```

Si ya tienes Maven instalado y en el `PATH`, también sirve `mvn clean compile` y `mvn javafx:run`.

### Linux / macOS

```bash
chmod +x mvnw
./mvnw clean compile
./mvnw javafx:run
```

## Uso

1. Escribe tu **nombre**.
2. Escribe tu **edad** (número entero entre 1 y 120).
3. Elige la **hora** y **minutos**, y marca **AM** o **PM**.
4. Pulsa **Solicitar saludo**.
5. Si hay un dato inválido, verás un mensaje de error. Si todo es correcto, verás un saludo con tu nombre, edad y hora.

## Estructura

```
sistema-saludador/
├── pom.xml
├── README.md
├── docs/prompts/prompt_1.txt
└── src/main/
    ├── java/com/sistemasaludador/
    │   ├── MainApp.java
    │   └── SaludadorController.java
    └── resources/com/sistemasaludador/
        ├── saludador-view.fxml
        └── styles.css
```
