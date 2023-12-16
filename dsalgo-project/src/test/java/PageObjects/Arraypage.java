package PageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Helper;




 public class Arraypage extends Helper {
         protected static String string = "Array";
         protected static String arr;
     protected static  JavascriptExecutor js;
	 static By dropdownmenu = By.xpath("//a[@class='nav-link dropdown-toggle\']");
	 static By getstarted1 = By.xpath("//a[@href='data-structures-introduction']");
     
    // static By getstartedd = By.xpath("////div[2]/div/div/a[@href='array']");
   //  static By getstartedd = By.xpath("/html/body/div[3]/div[2]/div/div/a");
	 static By dropdownarray = By.xpath("//a[@href='/array']");
     static By Arrayinpython= By.xpath("//a[@href='arrays-in-python']");
     static By ArrayusingList = By.xpath("//a[@href='arrays-using-list']");
	 static By Basicoperations = By.xpath("//a[@href='basic-operations-in-lists']");
	 static By Applicationofarr =By.xpath("//a[@href='applications-of-array']");
	 static By tryhere = By.xpath("//a[@href='/tryEditor']");
	 static By texteditor = By.xpath("//div[@class='CodeMirror-scroll']");
	 static By runbutt  = By.xpath("//button[@type='button']");
	 static By arraytxt = By.xpath("//h4[@class='bg-secondary text-white']");
	 protected static By loginbutt = By.xpath("//input[@value='Login']");
	 static By signin = By.xpath("//a[@href='/login']");
     protected static By Username = By.xpath("//*[@id='id_username']");
     protected static By Password = By.xpath("//*[@id='id_password']");
   //  static By signout = By.xpath("//a[@href='/logout']");
	   static By signout = By.xpath("//a[text()='Sign out']");  
	 public static void clickgetstarted() throws InterruptedException {
		 
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(signout)).build().perform();
//	     clickOnWebelement(driver.findElement(signout),10);
//	     act.moveToElement(driver.findElement(signin)).build().perform();
//	     clickOnWebelement(driver.findElement(signin),10);
//	     act.moveToElement(driver.findElement(Username)).build().perform();
//	     driver.findElement(Username).sendKeys("Ninjabonds");
//		  driver.findElement(Password).sendKeys("Ninja@123");
//		  act.moveToElement(driver.findElement(loginbutt)).build().perform();
//		     clickOnWebelement(driver.findElement(loginbutt),10);
//	     act.moveToElement(driver.findElement(getstartedd)).build().perform();
//	     clickOnWebelement(driver.findElement(getstartedd),10);
	   //   js.executeScript("argument[0].click();",driver.findElement(getstartedd));
	    
	  //   System.out.println("clicked dropdown menu");
	   //  driver.findElement(dropdownarray).click();
	     //System.out.println("signout successful");
	     
//        WebElement getstart = driver.findElement(By.xpath("//a[@href='array']"));
//        js.executeScript("argument[0].click();",getstart);
//        Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(getstartedd)).build().perform();
		 WebElement getstart = driver.findElement(getstarted1);
		 By getstartedd = RelativeLocator.with(By.tagName("a")).toRightOf(getstart);
        clickOnWebelement(driver.findElement(getstartedd),10);
//
	   //  driver.findElement(signin).click();
	   //  System.out.println("signin successful");
	   //  driver.findElement(Username).sendKeys("Ninjabonds");
	   //  driver.findElement(Password).sendKeys("Ninja@123");
	   //  driver.findElement(loginbutt).click();
		 
//		 WebElement getstartedt = driver.findElement(getstartedd);
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	     wait.until(ExpectedConditions.elementToBeClickable(getstartedt));
//		
//	     Actions act = new Actions(driver);
//		 act.moveToElement(getstartedt);
//		 getstartedt.click();
		 
		 
	 }
	 
     public static void directoarraypage() {
    	 	 arr = driver.findElement(arraytxt).getText();
             System.out.println(arr+"page");
     }
     
     
     public static void dropdownarray() {
    	 driver.findElement(dropdownmenu).click();
    	 driver.findElement(dropdownarray).click();
    	 
     }
 }
//     public static void clickarrayinpython() {
//    	 driver.findElement(Arrayinpython).click();
//    	 driver.findElement(tryhere).click();
//     }
//     public static void clickarrayusingll() {
//    	 driver.findElement(ArrayusingList).click();
//    	 driver.findElement(tryhere).click(); 
//     }
//     public static void clickbasicoper() {
//    	 driver.findElement(Basicoperations).click();
//    	 driver.findElement(tryhere).click(); 
//     }
//     
//     public static void clickappofarray() {
//    	 
//    	 driver.findElement(Applicationofarr).click();
//    	 driver.findElement(tryhere).click(); 
//     }
//     }
 