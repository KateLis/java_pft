package ru.stqa.pft.addressbook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.Select;

public class CreateGroupTest extends TestBase{
  private boolean acceptNextAlert = true;

  @Test
  public void testCreateGroup() {
    gotoGroup();
    createNewGroup();
    fillGroup(new GroupData("test1", "test777", "test3"));
    submitChanges();
    returnToGroupPage();
  }

}