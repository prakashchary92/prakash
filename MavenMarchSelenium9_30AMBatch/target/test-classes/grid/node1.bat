java -DwebDriver.chrome.driver=C:\Users\DELL\Desktop\LatestDrivers\chromedriver.exe -DwebDriver.geckodriver.driver=C:\Users\DELL\Desktop\LatestDrivers\geckodriver.exe -jar C:\Users\DELL\Desktop\LatestDrivers\selenium-server-standalone-3.141.59.jar -role node -hub http://192.168.43.48:4444/grid/register/ -browser browserName=chrome,maxInstances=2 -browser browserName=firefox,maxInstances=2 -port 9999