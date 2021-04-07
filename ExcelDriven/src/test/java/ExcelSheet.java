import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\sangitasadhu\\Documents\\Demodata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		for(int i=0;i<workbook.getNumberOfSheets();i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i); // enter that particular sheet
				Iterator<Row>rows=sheet.rowIterator(); // sheet is collections of Rows
				
			while(rows.hasNext())
			{
				//if(rows.equals(Y))
				XSSFRow row=(XSSFRow) rows.next();
				 System.out.println("ROW:-->");
				
				Iterator<Cell> cell=row.cellIterator(); // getting all the column or cell // row is collection of cells/collum
				while(cell.hasNext())
				{
					XSSFCell value=(XSSFCell) cell.next();
					System.out.println("CELL->" +value.toString());
				}
				
			}
			
				
				
			}
			
			
		}
		

	}

}
