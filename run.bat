set projectLocation=C:\Users\ksaik\eclipse-workspace\AutomationFramework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml

-cd
PAUSE

