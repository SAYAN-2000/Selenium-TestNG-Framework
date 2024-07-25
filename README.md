# Selenium-TestNG-Framework
## Scenarios Covered

 - **Logging in Using Username and Password** **-** We Login into the application by using the correct username and password and verify it accordingly.
 - **Add to Cart Scenario -** In this scenario we navigate to the products page and then we pick a product and then click ADD TO CART Button to add it to cart. Then we click on the cart icon to check whether it is added to cart or not.
 - **Validating the Filter Section -** Here, we filter the list of products and validate it accordingly. 
 - **End-to-End Scenario -** In this scenario, we add a product to cart, proceed to payment and navigate until we reach the ThankYou page.

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
