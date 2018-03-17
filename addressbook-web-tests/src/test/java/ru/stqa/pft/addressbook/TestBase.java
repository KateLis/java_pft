package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
    public WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver","C://Tools//Webdrivers/chromedriver.exe");
      driver = new ChromeDriver();
      baseUrl = "https://www.katalon.com/";
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://192.168.1.180/addressbook/");
      login("admin", "secret");
    }

    public void login(String userName, String pwd) {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).clear();
      driver.findElement(By.name("user")).sendKeys(userName);
      driver.findElement(By.name("pass")).clear();
      driver.findElement(By.name("pass")).sendKeys(pwd);
      driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    protected void submitChanges() {
      driver.findElement(By.name("submit")).click();
    }

    protected void fillGroup(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).clear();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).clear();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).clear();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    protected void createNewGroup() {
      driver.findElement(By.name("new")).click();
    }

    protected void gotoGroup() {
      driver.findElement(By.linkText("groups")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
      driver.quit();
      String verificationErrorString = verificationErrors.toString();
      if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
      }
    }
}
