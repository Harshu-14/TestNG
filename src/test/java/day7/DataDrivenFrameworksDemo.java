package day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day6.Login_OHRM_PageFact;
import day6.Logout_OHRM;

public class DataDrivenFrameworksDemo {
  
  public static void main(String[] args) { WebDriver driver = new
  ChromeDriver(); driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  Login_OHRM_PageFact ln = new Login_OHRM_PageFact(driver); 
  Logout_OHRM lout = new Logout_OHRM(driver);
  
  ln.URL();
  
  String filepath="C:\Samplesheet.xlsx"; 
  FileInputStream fis=new FileInputStream(filepath);
  XSSFWorkbook workbook=new XSSFWorkbook(fis);
  XSSFSheet sheet=workbook.getsheet("Data"); 
  int rows=sheet.getLastRowNum();
  System.out.println("Total no of rows: "+rows);
  
  for(int i=1;i<=rows;i++)
  
  XSSFRow row=sheet.getRow(i); XSSFCell un=row.getCell(0); XSSFCell
  pw=row.getCell(1); XSSFCell result=row.createCell(2); XSSFCell
  err=row.createCell(3);
  
  System.out.println("UserName--->"+un+"  Password--->"+pw); try {
  ln.enterUserName(un.toString()); ln.enterPassword(pw.toString());
  ln.clickonLoginButton(); lout.clickonProfile(); lout.clickonLogout();
  System.out.println("Valid Data"); result.setCellValue("Valid data"); }
  catch(Exception e) { String
  errorMsg=driver.findElement(By.xpath("//div[@id='app']/descendant::p[1]")).
  getText(); System.out.println("Invalid Data");
  result.setCellValue("Invalid data"); } fis.close(); FileOutputStream fos=new
  FileOutputStream(filepath); workboook.write(fos); }
  
  }
 