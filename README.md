# Sistema Saludador

Aplicación de escritorio sencilla en JavaFX. El estudiante ingresa **nombre**, **edad** y **hora (AM/PM)** y, al pulsar **Solicitar saludo**, ve un mensaje con su nombre y su edad.

Todo el código está en un solo archivo: `src/main/java/com/sistemasaludador/MainApp.java`.

## Requisitos

- JDK 17 o superior
- Maven, o el Maven Wrapper incluido (`mvnw.cmd` en Windows, `mvnw` en Linux/macOS)
- Entorno gráfico (se abre una ventana)

Comprueba Java:

```bash
java -version
```

## Cómo ejecutar

Desde la carpeta raíz del proyecto (`sistema-saludador`).

### Windows

```bash
.\mvnw.cmd javafx:run
```

### Linux / macOS

```bash
chmod +x mvnw
./mvnw javafx:run
```

Si ya tienes Maven instalado:

```bash
mvn javafx:run
```

## Uso

1. Escribe el nombre.
2. Escribe la edad.
3. Elige AM o PM.
4. Pulsa **Solicitar saludo**.
5. Aparece el saludo con el nombre y la edad.

## Archivos del proyecto

```
sistema-saludador/
├── pom.xml
├── README.md
├── prompts/secuencia_prompts.txt
├── docs/reflexion.md
└── src/main/java/com/sistemasaludador/MainApp.java
```
