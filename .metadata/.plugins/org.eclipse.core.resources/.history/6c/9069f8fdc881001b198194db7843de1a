import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public ArrayList<String> getdata(String testData) throws IOException

	{
		ArrayList<String> data=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\sangitasadhu\\Documents\\Demodata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheetCount=workbook.getNumberOfSheets(); // number of sheets present in exel
		
		for(int i=0;i<sheetCount;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) // checking sheet name what we want using getSheetName(i)
			{
				
				XSSFSheet sheet=workbook.getSheetAt(i);  // enter that particular sheet
				
				Iterator<Row> rows=sheet.iterator(); // sheet is collections of Rows
				
				Row firstrow=rows.next(); //using this rows moving to the firstrow
				//from this 1st row want to go to cell 
				Iterator<Cell> cells=firstrow.cellIterator(); // row is collection of cells/collumn
				int k=0;
				int collumn=0;
				while(cells.hasNext()) // checking has next object or not
				{
					Cell value=cells.next(); //move to cell
					if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
					{
						collumn=k;
					}
					k++;
				}
				System.out.println(collumn); //getting the collumn's index from which column wants to fetch data 0
			
				//after getting 1st column data and get any colunm's data
				
				while(rows.hasNext())  //checking next row are present or not
				{
				Row r=rows.next(); // moving to next row            collumn=0
				if(r.getCell(collumn).getStringCellValue().equalsIgnoreCase(testData)) //get the 1st column and particular row's data and checking
				{
					
					Iterator<Cell> cv=r.cellIterator();  // again get all the cell's value from this row
					while(cv.hasNext())
					{
						Cell c=cv.next();
						if(c.getCellTypeEnum()==CellType.STRING) 
							data.add(c.getStringCellValue());
										 
						else
							
							data.add(NumberToTextConverter.toText(c.getNumericCellValue())); // converting integer to string
					}
				}
				
				}
				
				
			}
		
		}
		return data;
		
	}

}
