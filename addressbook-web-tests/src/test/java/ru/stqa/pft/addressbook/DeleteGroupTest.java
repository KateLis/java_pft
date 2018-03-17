package ru.stqa.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.TestBase;

public class DeleteGroupTest extends TestBase {

  @Test
  public void testDeleteGroup() {
    gotoGroup();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

  private void deleteSelectedGroups() {
    driver.findElement(By.name("delete")).click();
  }

  private void selectGroup() {
    driver.findElement(By.name("selected[]")).click();
  }
}
