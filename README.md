Instrucitons how to run tests

1.Download the project code, preferably using git clone. 

2.Download version 18 or latest version of OpenJDK and extract to Program Files>Java 

3.-Open control panel 
  -Open Edit the system environment variable <br />
  -Click on environment variables <br />
  -Within System variables section click new <br />
  -Add new variable name -> JAVA_HOME <br />
  -Add variable value -> path to jdk-18 folder and click ok <br />
  -Within System variables section click on Path <br />
  -Click on new Button, add %JAVA_HOME%\bin and click ok <br />

4.Download and install IntelliJ IDEA 

5.Open IntelliJ IDEA

6.Click on plugins 
   -Search for 'Cucumber for Java' and install it.

7.Click on File->Open <br />
8.Navigate to extracted project folder <br />
9.Select folder and click OK. <br />
10.Expand CoinMarketFront/src/test/resources/features folder <br />
11.Open feature you want to run <br />
12.Click on green play button next to Feature or Scenario you want to run <br />
13.Click on Run feature or Run scenario <br />
 	
