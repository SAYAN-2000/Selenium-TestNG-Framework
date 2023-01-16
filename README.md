# Selenium-TestNG-Framework
# Overview
Selenium is one of the most widely used open source Web UI (User Interface) automation testing suite. Selenium can be easily deployed on platforms such as Windows, Linux, Solaris and Macintosh. Moreover, it supports OS (Operating System) for mobile applications like iOS, windows mobile and android. Selenium supports a variety of programming languages through the use of drivers specific to each language.Languages supported by Selenium include C#, Java, Perl, PHP, Python and Ruby.Currently, Selenium Web driver is most popular with Java and C#. Selenium test scripts can be coded in any of the supported programming languages and can be run directly in most modern web browsers. Browsers supported by Selenium include Internet Explorer, Mozilla Firefox, Google Chrome and Safari.

 Selenium can be used to automate functional tests and can be integrated with automation test tools such as **Maven**, **Jenkins**, **& Docker** to achieve continuous testing. It can also be integrated with tools such as **TestNG**, & **JUnit** for managing test cases and generating reports.

# About
In this project I have taken the [Swag Labs Application](https://www.saucedemo.com/) and ran tests on it through Automation to validate different scenarios.

# Pre-Requisites
-   [Java](https://www.guru99.com/install-java.html)  should be installed and configured.
-   [Maven](https://mkyong.com/maven/how-to-install-maven-in-windows/)  should be installed and configured.
-    [TestNG](https://testng.org/doc/)should be Installed in your IDE.
-   Clone the files from Git repository using  [Git Bash](https://phoenixnap.com/kb/how-to-install-git-windows).
- [Scoop](https://docs.qameta.io/allure/#_installing_a_commandline) should be Installed in your System to view the Allure Reports through Command Line.
- Additionally you can configure [Jenkins](https://www.jenkins.io/doc/book/getting-started/) to run Daily Jobs.

# Running Tests

To run tests we need to naviagate to the [testng.xml](https://github.com/SAYAN-2000/Selenium-TestNG-Framework/blob/master/testng.xml) file and the Right-Click and run as Testng Suite. Bring the neccessary changes to the xml file to run test individually. Or you can use `mvn test` command from thr command Line to run the tests mentioned in testng.xml file.

To run a Jenkins job you need to first configure Jenkins in your system. To configure Jenkins in your system follow [this documentation.](https://www.jenkins.io/doc/book/getting-started/%5C) Then you need to create a new project and rub build now to see the tests and the console logs. 
