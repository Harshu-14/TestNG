
  package day8;
  
  public class KeywordDrivenFrameworks {
  
  public static void main(String[] args) { String
  filepath="C:\Samplesheet.xlsx";
  FileInputStream fis=new
  FileInputStream(filepath); XSSFWorkbook workbook=new XSSFWorkbook(fis);
  XSSFSheet sheet=workbook.getsheet("Data"); int rows=sheet.getLastRowNum();
  System.out.println("Total no of rows: "+rows);
  
  for(int i=1;i<=rows;i++)
  
  XSSFRow row=sheet.getRow(i); XSSFCell un=row.getCell(0); XSSFCell
  pw=row.getCell(1); System.out.println("Keyword-->" +key);
  
  switch(key.toString()) { case "url": ln.url();
  System.out.println("URL Keyword is Matching"); break;
  
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
  
  } } fis.close(); } }
 