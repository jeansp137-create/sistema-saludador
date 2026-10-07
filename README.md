# Sistema Saludador

Aplicación de escritorio en JavaFX. El estudiante ingresa **nombre**, **edad** y **hora (AM/PM)** y, al pulsar **Solicitar saludo**, ve un mensaje con su nombre y su edad.

El código está en un solo archivo: `src/main/java/com/sistemasaludador/MainApp.java`.

Este README es el paso a paso para que alguien clone el repositorio, compile y ejecute el programa. **GitHub no abre la ventana:** hay que hacerlo en la computadora.

---

## 0. Qué vas a hacer

1. Instalar Git y JDK 17 (si no los tienes).
2. Descargar el proyecto (`git clone`).
3. Compilar.
4. Ejecutar (se abre una ventana).

No hace falta instalar Maven: el proyecto incluye **Maven Wrapper** (`mvnw.cmd` / `mvnw`).

Necesitas **internet** la primera vez (se descargan JavaFX y otras dependencias).

---

## 1. Instalar lo necesario

### 1.1 Git

Comprueba si ya lo tienes:

```bash
git --version
```

Si no aparece, instálalo:

- Windows: https://git-scm.com/download/win
- macOS: https://git-scm.com/download/mac
- Linux: `sudo apt install git` (Debian/Ubuntu)

Cierra y vuelve a abrir la terminal después de instalar.

### 1.2 JDK 17 o superior

Comprueba:

```bash
java -version
```

Debe decir **17**, **21** o una versión mayor. Si sale un error o una versión 8/11, instala un JDK:

- Windows / macOS: https://adoptium.net/ (elige Temurin, versión **17** o **21**, instalador para tu sistema)
- Linux (Debian/Ubuntu): `sudo apt install openjdk-17-jdk`

Cierra y vuelve a abrir la terminal. Vuelve a ejecutar `java -version`.

En Windows, si `java -version` funciona pero Maven se queja de `JAVA_HOME`, apunta esa variable a la carpeta del JDK (por ejemplo `C:\Program Files\Eclipse Adoptium\jdk-17...`).

---

## 2. Descargar el proyecto

Abre **PowerShell** (Windows) o **Terminal** (macOS/Linux).

```bash
git clone https://github.com/jeansp137-create/sistema-saludador.git
cd sistema-saludador
```
Si arroja error es muy probable que necesites abrir la terminar (Administrador) por tema de permisos (Windows) 

Comprueba que estás en la carpeta correcta: debe existir el archivo `pom.xml`.

```bash
ls
```

En Windows, si `ls` no funciona, usa `dir`. Tienes que ver `pom.xml`, `mvnw.cmd` y la carpeta `src`.

Si ya habías clonado el repo y quieres la última versión:

```bash
cd sistema-saludador
git pull
```

---

## 3. Compilar

Sigue en la carpeta `sistema-saludador` (donde está `pom.xml`).

### Windows

```bash
.\mvnw.cmd compile
```

### macOS / Linux

```bash
chmod +x mvnw
./mvnw compile
```

Si termina sin error, el proyecto compiló. La primera vez tarda más porque descarga dependencias.

---

## 4. Ejecutar

### Windows

```bash
.\mvnw.cmd javafx:run
```

### macOS / Linux

```bash
./mvnw javafx:run
```

Debe abrirse la ventana **Sistema Saludador**.

Si tienes Maven instalado en el sistema, también sirve:

```bash
mvn compile
mvn javafx:run
```

---

## 5. Usar el programa

1. Escribe el nombre.
2. Escribe la edad.
3. Elige AM o PM.
4. Pulsa **Solicitar saludo**.
5. Aparece el saludo con el nombre y la edad.

---

## Si algo falla

| Qué ves | Qué hacer |
|---|---|
| `git` no se reconoce | Instala Git (paso 1.1) y abre una terminal nueva |
| `java` no se reconoce o versión menor a 17 | Instala JDK 17+ (paso 1.2) y abre una terminal nueva |
| `No such file: pom.xml` o `mvnw.cmd` no existe | Haz `cd` a `sistema-saludador` (la carpeta que contiene `pom.xml`) |
| Error de `JAVA_HOME` | Define `JAVA_HOME` a la carpeta del JDK |
| Se queda descargando / error de red | Conéctate a internet; la primera corrida necesita descargar Maven y JavaFX |
| Compila pero no hay ventana | Ejecuta en una sesión con pantalla (no en un servidor sin escritorio) |
| `Permission denied` en `./mvnw` | `chmod +x mvnw` y vuelve a intentar |

---

## Archivos importantes

```
sistema-saludador/
├── pom.xml                                          ← configuración Maven / JavaFX
├── mvnw  y  mvnw.cmd                                ← Maven Wrapper (compilar y ejecutar)
├── .mvn/wrapper/                                    ← apoyo del wrapper
├── README.md
├── prompts/secuencia_prompts.txt
├── docs/reflexion.md
└── src/main/java/com/sistemasaludador/MainApp.java  ← código de la app
```
