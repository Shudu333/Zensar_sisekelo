package readData;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

 

public class Readexcelsheet {

 

    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\Ndou\\Desktop\\SchoolRegistration\\TestData.xlsx");
        
        FileInputStream inputStream = new FileInputStream(file);
        
        XSSFWorkbook wb = new XSSFWorkbook(inputStream);
        
        XSSFSheet sheet = wb.getSheet("TEST_DATA");
        
        XSSFRow row2 = sheet.getRow(4);
        
        XSSFCell cell = row2.getCell(7);
        
        int address = (int) cell.getNumericCellValue();
        
        System.out.println("Here is the address " + address);
    }

 

}