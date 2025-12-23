# 🌿 Eco-Cycle Hub - Automation Testing Framework

[![Java](https://img.shields.io/badge/Java-23-orange.svg)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.38.0-green.svg)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-7.10.2-red.svg)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-blue.svg)](https://maven.apache.org/)

A comprehensive **Selenium WebDriver automation testing framework** built with **Java** and **TestNG** for the Eco-Cycle Hub web application. This project demonstrates professional-level test automation practices including the Page Object Model (POM) design pattern, data-driven testing, extent reporting, and screenshot capture for failed test cases.

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Key Features](#-key-features)
- [Technologies & Tools](#-technologies--tools)
- [Project Structure](#-project-structure)
- [Prerequisites](#-prerequisites)
- [Installation & Setup](#-installation--setup)
- [Configuration](#-configuration)
- [Running Tests](#-running-tests)
- [Test Reports](#-test-reports)
- [Test Cases](#-test-cases)
- [Page Object Model](#-page-object-model)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)

---

## 🎯 Overview

The **Eco-Cycle Hub Automation Testing Framework** is a robust, maintainable, and scalable test automation solution designed to ensure the quality and reliability of the Eco-Cycle Hub e-commerce platform. This framework automates critical user workflows including user registration, login, product browsing, shopping cart operations, and checkout processes.

### What is Eco-Cycle Hub?

Eco-Cycle Hub is an eco-friendly e-commerce platform focused on sustainable and biodegradable products. This automation framework validates the core functionalities of the platform to ensure a seamless user experience.

---

## ✨ Key Features

- **🏗️ Page Object Model (POM)**: Clean separation of test logic and page elements for better maintainability
- **📊 Data-Driven Testing**: Excel-based test data management using Apache POI
- **📈 Extent Reports**: Beautiful HTML reports with test execution results and screenshots
- **📸 Screenshot Capture**: Automatic screenshot capture for failed test scenarios
- **🔄 Cross-Browser Support**: WebDriverManager for automated driver management
- **🧪 TestNG Framework**: Powerful test execution with parallel testing capabilities
- **🎭 Happy Path Testing**: End-to-end user journey validation
- **🔐 Authentication Testing**: Comprehensive login and registration test coverage
- **🛒 E-commerce Flow**: Complete shopping cart and checkout process validation

---

## 🛠️ Technologies & Tools

### Core Framework
| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 23 | Primary programming language |
| **Selenium WebDriver** | 4.38.0 | Browser automation |
| **TestNG** | 7.10.2 | Test execution framework |
| **Maven** | Latest | Build and dependency management |

### Supporting Libraries
| Library | Version | Purpose |
|---------|---------|---------|
| **WebDriverManager** | 5.9.2 | Automatic browser driver management |
| **ExtentReports** | 5.1.2 | Advanced HTML reporting |
| **Apache POI** | 5.4.1 | Excel file operations for data-driven testing |
| **Apache Commons IO** | Latest | File and stream operations |

### Development Tools
- **IDE**: IntelliJ IDEA / Eclipse
- **Version Control**: Git & GitHub
- **Build Tool**: Apache Maven

---

## 📁 Project Structure

```
Eco-Cycle_Hub-Automation_Testing/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/example/pageMethods/
│   │           ├── registrationPage.java      # User registration page object
│   │           ├── loginPage.java             # Login page object
│   │           ├── directLoginPage.java       # Direct login helper
│   │           ├── productPage.java           # Product listing & cart operations
│   │           ├── shoppingCartPage.java      # Shopping cart operations
│   │           ├── ordersPage.java            # Order management
│   │           ├── notificationPage.java      # Notification handling
│   │           └── datadrivenpage.java        # Excel data reader
│   │
│   ├── test/
│   │   └── java/
│   │       └── org/example/testCases/
│   │           ├── BaseTest.java              # Base test configuration & setup
│   │           ├── LoginTestCase.java         # Login functionality tests
│   │           ├── RegisterTestCase.java      # Registration tests
│   │           ├── HappyPathTestCase.java     # End-to-end user journey
│   │           ├── ProductTestCase.java       # Product operations tests
│   │           ├── dataDrivenTestCase.java    # Data-driven test execution
│   │           └── practiseTest.java          # Practice/experimental tests
│   │
│   └── reports/
│       ├── index.html                         # Extent test report
│       └── screenshots/                       # Failed test screenshots
│
├── screenshots/                               # Sample screenshots
├── pom.xml                                    # Maven configuration
├── .gitignore                                 # Git ignore rules
└── README.md                                  # Project documentation
```

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** 23 or higher
  - [Download JDK](https://www.oracle.com/java/technologies/downloads/)
  - Verify: `java -version`
  
- **Apache Maven** 3.6+
  - [Download Maven](https://maven.apache.org/download.cgi)
  - Verify: `mvn -version`
  
- **Google Chrome Browser** (Latest version)
  - ChromeDriver is managed automatically by WebDriverManager
  
- **IDE** (Recommended)
  - IntelliJ IDEA Community/Ultimate
  - Eclipse IDE for Java Developers
  - VS Code with Java extensions

- **Git** (for version control)
  - [Download Git](https://git-scm.com/downloads)

---

## 🚀 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/ChamathLahiru-CL/Eco-Cycle_Hub-Automation_Testing.git
cd Eco-Cycle_Hub-Automation_Testing
```

### 2. Install Dependencies

```bash
mvn clean install
```

This command will:
- Download all required dependencies from Maven Central
- Compile the source code
- Set up the project structure

### 3. Import Project into IDE

**For IntelliJ IDEA:**
1. Open IntelliJ IDEA
2. File → Open → Select the project folder
3. Wait for Maven to import dependencies

**For Eclipse:**
1. File → Import → Maven → Existing Maven Projects
2. Browse to the project directory
3. Finish

---

## ⚙️ Configuration

### Update Base Test Configuration

Before running tests, update the following in `BaseTest.java`:

1. **ChromeDriver Path** (if not using WebDriverManager):
```java
System.setProperty("webdriver.chrome.driver", "YOUR_PATH_TO_CHROMEDRIVER");
```

2. **Application URL**:
```java
driver.get("http://localhost:3000/");  // Update with your application URL
```

3. **Tester Name** (for reports):
```java
extent.setSystemInfo("Tester", "Your Name");
```

### WebDriverManager (Recommended)

The project uses WebDriverManager for automatic driver management. No manual driver download required!

---

## 🧪 Running Tests

### Run All Tests

```bash
mvn test
```

### Run Specific Test Class

```bash
mvn test -Dtest=LoginTestCase
mvn test -Dtest=HappyPathTestCase
mvn test -Dtest=dataDrivenTestCase
```

### Run from IDE

1. Navigate to the test class (e.g., `LoginTestCase.java`)
2. Right-click on the class or test method
3. Select "Run" or "Run Test"

### Run with TestNG XML (if configured)

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📊 Test Reports

### Extent Reports

After test execution, detailed HTML reports are generated:

**Location**: `src/reports/index.html`

**Features**:
- ✅ Test execution summary with pass/fail statistics
- 📊 Visual charts and graphs
- 📸 Screenshots for failed tests
- ⏱️ Execution time tracking
- 🔍 Detailed test steps and logs
- 💻 System information

**To View Report**:
1. Navigate to `src/reports/`
2. Open `index.html` in your web browser

### Screenshots

Failed test screenshots are automatically saved to:
`src/reports/screenshots/`

Each screenshot is named after the test method for easy identification.

---

## 🧾 Test Cases

### 1. **Registration Tests**
- ✅ Valid user registration
- ✅ Form validation
- ✅ Duplicate email handling

### 2. **Login Tests**
- ✅ Valid login credentials
- ❌ Invalid email/password
- 🔐 Direct login functionality
- 🔄 Logout functionality

### 3. **Product Tests**
- 🛍️ Browse products
- ➕ Add products to cart
- 🔢 Quantity management

### 4. **Shopping Cart Tests**
- 🛒 View cart items
- ✏️ Update quantities
- 🗑️ Remove items
- 💳 Checkout process

### 5. **Happy Path (E2E)**
- Complete user journey from registration to checkout
- Tests: Registration → Login → Browse Products → Add to Cart → Checkout

### 6. **Data-Driven Tests**
- Excel-based test data
- Multiple user login scenarios
- Parameterized test execution

---

## 🏛️ Page Object Model

The framework implements the **Page Object Model (POM)** design pattern for better code organization and maintainability.

### Page Classes

- `registrationPage.java` - Handles user registration elements and actions
- `loginPage.java` - Manages login page interactions
- `productPage.java` - Product browsing and cart operations
- `shoppingCartPage.java` - Shopping cart management
- `directLoginPage.java` - Quick login utility methods
- `datadrivenpage.java` - Excel data provider for data-driven tests

### Benefits of POM

- 🔧 **Maintainability**: Easy to update when UI changes
- ♻️ **Reusability**: Page methods can be reused across multiple tests
- 📖 **Readability**: Tests are more readable and understandable
- 🧪 **Separation of Concerns**: Test logic separated from page elements

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/YourFeatureName
   ```
3. **Commit your changes**
   ```bash
   git commit -m "Add some feature"
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/YourFeatureName
   ```
5. **Open a Pull Request**

### Coding Standards

- Follow Java naming conventions
- Add JavaDoc comments for public methods
- Write meaningful test names
- Maintain the POM structure
- Update README for significant changes

---

## 📄 License

This project is open source and available for educational and commercial use.

---

## 👤 Contact

**Chamath Lahiru Jayasuriya**

- 🐙 GitHub: [@ChamathLahiru-CL](https://github.com/ChamathLahiru-CL)
- 🌐 Project Link: [Eco-Cycle Hub Automation Testing](https://github.com/ChamathLahiru-CL/Eco-Cycle_Hub-Automation_Testing)

---

## 🙏 Acknowledgments

- Selenium WebDriver community for excellent documentation
- TestNG framework developers
- ExtentReports for beautiful test reporting
- Apache POI for Excel integration
- All contributors and testers

---

<div align="center">
  <p>Made with ❤️ by Chamath Lahiru Jayasuriya</p>
  <p>⭐ Star this repository if you find it helpful!</p>
</div>
