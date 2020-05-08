###Just EAT
Just eat is UK's leader in online food order and delivery service provider.It provides the users the facility to order from the local restaurants with over 30000+ restaurant menus.

#####Prerequisites
 ######1.Download and Install Java8.
   Click on the link https://www.java.com/en/download/
   
   Click on Java download
   
   Click on Agree and start free download
   
   After download click on the executable and install.
   
 ######2.Set java path
   Go to My computer>Properties
   
   Click on Advanced system settings
   
   Click on Environment variables
   
   Click on the new tab of user variables
   
   Write path in the variable name
   
   Copy the java path till bin folder
   eg: C:\Program Files\Java\jdk1.8.0_211\bin
   
   Paste the java bin folder path in the variable value
   
   Click ok button
   
   Click ok button
   
 ######3.Download and Install Intellij Community edition
   Click on the link https://www.jetbrains.com/idea/download/#section=windows
   
   Click on community edition download.
   
   After download, run the installer and follow the wizard steps.
   
   After installation, open intellij. 
   
 ######4.Install Git
   Click on the link https://git-scm.com/download/win and download   
   git for windows setup
   
   Run the installer
   
 ######5. Clone/download the project
   Navigate to the repository https://github.com/anusha-jakka/JustEatProject
   
   Click on clone or download and copy the url
   
   Create a folder in your local
   
   Inside the folder ,right click and select git bash
   
   write the command:
   git clone "paste the repository url" and click on enter
   
   The entire project is cloned.
   
  ######6. Import the project to intellij
   Open Intellij
   
   Click on File>open>select the project location clone before
   
   Click on ok
   
   Allow all the dependencies to import
   
#####Running the tests

   1.Navigate to src/main/java/Runner/TestRunner.java 
   
   2.On the top right panel.Click on the drop down.click on Edit configurations and ensure below configurations are set:
   On the left panel click on junit 
   Add the configuration:
   class: Runner.TestRunner
   classpath of module: JustEat
   JRE: Default
   Click on Apply
   
   3.Run the Test by clicking on the Green triangle(Run: TestRunner) on the top right panel..
   
   4.After execution the results are displayed in the console section.
   
   5.Also the Cucumber reports are generated in the path target/cucumber-reports
   
#####Built With

BDD style Cucumber framework using selenium and java

Maven is used for dependency management

#####Author
Anusha Jakka 

    
    
    