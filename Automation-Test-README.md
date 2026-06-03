SauceDemo Test Automation
=========================

Automated end-to-end UI testing for saucedemo.com using Selenium 4, TestNG, and WebDriverManager.
Built with Java 11 and Maven.


Tech Stack
----------

- Java 11
- Selenium 4.23.1
- TestNG 7.10.2
- WebDriverManager 5.9.2
- Maven 3.x
- Google Chrome (latest)
- Eclipse IDE


Project Structure
-----------------

    saucedemo-automation/
    ├── src/
    │   └── test/
    │       └── java/
    │           └── sauce_demo_automate/
    │               └── sauceautomation.java
    ├── testng.xml
    ├── pom.xml
    └── README.md


Prerequisites
-------------

Make sure the following are installed before running the project:

- Java JDK 11 or higher
- Maven 3.x
- Google Chrome browser
- Eclipse IDE with TestNG plugin

WebDriverManager handles ChromeDriver download automatically, no manual setup needed.


How to Run
----------

From Eclipse:
    Right-click sauceautomation.java → Run As → TestNG Test

From Terminal:
    git clone https://github.com/yourusername/saucedemo-automation.git
    cd saucedemo-automation
    mvn test


Test Scenarios
--------------

Flow 1 - Valid Login and Full Checkout

    Logs in with standard_user, adds Sauce Labs Backpack and Sauce Labs Bike Light
    to the cart, proceeds through checkout with the following details:

        First Name  : Rajesh
        Last Name   : Kumar
        Postal Code : 600001

    Verifies the order confirmation message "Thank you for your order!"

Flow 2 - Locked Out User Login

    Attempts to log in with locked_out_user and verifies that the error message
    "Epic sadface: Sorry, this user has been locked out." is displayed.


Test Credentials
----------------

    standard_user   / secret_sauce   — valid login, full access
    locked_out_user / secret_sauce   — blocked, triggers error message

These are default credentials provided by saucedemo.com for testing purposes.


Author
Yoga R
Chennai, Tamil Nadu, India
