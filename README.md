Instrucitons how to run tests

1.Download the project code, preferably using git clone.
2.Download version 18 or latest version of OpenJDK and extract to Program Files>Java 
3.-Open control panel 
  -Open Edit the system environment variable 
  -Click on environment variables
  -Within System variables section click new
  -Add new variable name -> JAVA_HOME
  -Add variable value -> path to jdk-18 folder and click ok
  -Within System variables section click on Path 
  -Click on new Button, add %JAVA_HOME%\bin and click ok 
4.Download and install IntelliJ IDEA 
5.Open IntelliJ IDEA
6.Click on plugins 
   -Search for 'Cucumber for Java' and install it.
7.Click on File->Open
8.Navigate to extracted project folder
9.Select folder and click OK.
10.Expand CoinMarketFront/src/test/resources/features folder
11.Open feature you want to run
12.Click on green play button next to Feature or Scenario you want to run
13.Click on Run feature or Run scenario
 	
