# First Assessment Project

A Java Selenium test automation project for verifying key user flows on **Nairaland**, such as user registration, login, and homepage accessibility.  
This project is built with **Maven** for test execution.

##  Project Structure
FirstAssementProject/
├── src/
│ ├── main/
│ │ └── java/org/example/
│ │ ├── Main.java
│ │ └── NairaLandAuth.java
│ ├── resources/
│ └── test/
├── target/ # Build output
├── pom.xml # Maven project configuration
├── .gitignore
└── README.md

## 🛠 Prerequisites

Before running this project, ensure you have the following installed:

1. **Java Development Kit (JDK)**
    - Version: Java 8 or later (`java -version` to check).
    - Download from: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
    - **Installation (macOS / Linux):**
        1. Download the `.dmg` (macOS) or `.tar.gz` (Linux) file for your OS from Oracle.
        2. Install following the prompts (macOS) or extract and configure JAVA_HOME (Linux).
        3. Verify installation in your terminal:
           ```bash
           java -version
           ```
           Expected output: A valid Java version number (e.g., `java version "17.0.10"`).

2. **IntelliJ IDEA**
    - Download from: [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
    - Recommended: **Community Edition** (free) is enough for this project.
    - During setup, install or enable these plugins:
        - **Maven** (for dependency management — usually built-in)
        - **JUnit** (for running Java tests)
        - **Selenium Support** (optional but useful for syntax highlighting & code templates)
        - **Git Integration** (for version control)

3. **Maven**
    - Version: Maven 3.6+ (`mvn -v` to check).
    - Download: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

4. **Google Chrome**
    - Latest version from: [https://www.google.com/chrome/](https://www.google.com/chrome/)

5. **ChromeDriver**
    - Version must match your installed Chrome version.
    - Download: [https://chromedriver.chromium.org/downloads](https://chromedriver.chromium.org/downloads)

6. **Internet connection**
    - Required to run against the live Nairaland site and fetch Maven dependencies.
