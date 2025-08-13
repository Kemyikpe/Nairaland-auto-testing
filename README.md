# Nairaland Automated Testing Project

Selenium WebDriver tests for **Nairaland** website validation.

##  Exercise Requirements

### 1. Defect Reporting
- **File**: `DEFECT_REPORT.md` - Complete chatbot bug scenario with proper documentation

### 2. Selenium Automation
- **New User Creation**:  Dynamic user generation for each test run
- **Registration Test**: Tests user registration with new account
- **Sign In Test**: Tests login with newly created account
- **Homepage Test**: Validates homepage functionality

## Quick Start

### Prerequisites
- IntelliJ IDEA Community Edition (free version)
- Java 11+
- Chrome browser
- ChromeDriver (installed via Homebrew: `brew install chromedriver`)

### Run Tests
```bash
# Run all tests
mvn test

# Run specific test
mvn test -Dtest=NairalandTest
```

### In IntelliJ
- Right-click `NairalandTest.java` → "Run 'NairalandTest'"

## Files
- `NairalandTest.java` - Streamlined test focusing on core requirements
- `DEFECT_REPORT.md` - Bug scenario documentation
- `pom.xml` - Maven configuration
