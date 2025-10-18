package day8;
  
  public class HybridFrameworkDemo {
  
  public static void main(String[] args) {
  
  String filepath="C:\Samplesheet.xlsx"; 
  FileInputStream
  fis=new FileInputStream(filepath); XSSFWorkbook workbook=new
  XSSFWorkbook(fis); XSSFSheet dataSheet=workbook.getsheet("Data"); XSSFSheet
  keySheet=workbook.getsheet("Keyword"); int rows=dataSheet.getLastRowNum();
  System.out.println("Total no of Data rows: "+datarows); int
  rows=keySheet.getLastRowNum(); System.out.
  println("Total no of System.out.println(\"UserName--->\"+un+\"  Password--->\"+pw); rows: "
  +keyrows);
  
  for(int dr=1;dr<=datarows;dr++) {
  
  XSSFRow drow=dataSheet.getRow(dr); XSSFCell un=drow.getCell(0); XSSFCell
  pw=drow.getCell(1);
  
  System.out.println("UserName--->"+un+"  Password--->"+pw);
  
  for(int kr=1;kr<=keyrows;kr++) {
  
  XSSFRow drow=keySheet.getRow(kr); XSSFCell key=row.getCell(1);
  System.out.println("Keyword--->" +key);
  
  switch(key.toString()) {
  
  case "url": ln.url(); System.out.println("URL Keyword is Matching"); break;
  
  case "enterUserName": ln.enterUserName("Admin");
  System.out.println("enterUserName Keyword is Matching"); break;
  
  case "enterUserName": ln.enterPassword("Admin123");
  System.out.println("enterUserName Keyword is Matching"); break;
  
  case "clickonLoginButton": ln.clickonLoginButton();
  System.out.println(" clickonLoginButton keyword is Matching"); break;
  
  case "clickonProfile": lout.clickonProfile();
  System.out.println(" clickonProfile keyword is Matching"); break;
  
  case "clickonLogout": lout.clickonLogout();
  System.out.println(" clickonLogout keyword is Matching"); break;
  
  default:System.out.println("Invalid Password"); break;
  
  }
  
  } System.out.println("Valid Data"); } catch(Exception e) {
  System.out.println("Invalid Data"); }
  
  } 
  
  fis.close();
  
  }
  
  }
  
  
  
  
  
  
  
 