package excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
static FileInputStream file;
static XSSFWorkbook w;
static XSSFSheet sh;
public static String readStringData(int i,int j) throws IOException
{
file=new FileInputStream("C:\\Users\\HP\\Desktop\\ExcelRead.xlsx");
w=new XSSFWorkbook(file);
sh=w.getSheet("Sheet1");
Row r=sh.getRow(i);
Cell c=r.getCell(j);
return c.getStringCellValue();
}
public static String readIntegerData(int i,int j) throws IOException
{file=new FileInputStream("C:\\Users\\HP\\Desktop\\ExcelRead.xlsx");
w=new XSSFWorkbook(file);
sh=w.getSheet("Sheet1");
Row r=sh.getRow(i);
Cell c=r.getCell(j);
int a=(int) c.getNumericCellValue();
return String.valueOf(a);
}

}