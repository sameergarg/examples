import org.openqa.selenium.chrome.ChromeDriver

driver = {
    //for mac, need to download chromedriver from http://chromedriver.storage.googleapis.com/index.html?path=2.7/ and put it in /usr/bin
    System.setProperty('webdriver.chrome.driver',"/usr/bin/chromedriver")
    new ChromeDriver()


}

//target directory to keep reports
reportsDir = "target/geb-reports"