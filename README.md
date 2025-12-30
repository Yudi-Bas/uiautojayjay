# UI Automation Framework

Framework yang digunakan :
- Java
- Gradle
- Selenium WebDriver
- Cucumber (Gherkin syntax)
- JUnit 5

## Struktur
- `pages/` → Page Object Model
- `features/` → File Gherkin
- `stepdefinitions/` → Implementasi Step
- `runners/` → Test Runner

## Cara Menjalankan
1. Clone repository
2. Jalankan `./gradlew clean test`
3. Lihat laporan di `build/reports/tests/test/index.html`
