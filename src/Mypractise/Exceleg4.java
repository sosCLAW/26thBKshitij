package Mypractise;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Excel\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		int totalnumofrows = mysheet.getLastRowNum();// total no of rows will given
		System.out.println(totalnumofrows);
		short totalnumofcell = mysheet.getRow(totalnumofrows).getLastCellNum();
		System.out.println(totalnumofcell);
		int cellcount = totalnumofcell-1;
		System.out.println(cellcount);
		
		for(int i=0;i<=totalnumofrows;i++)
		{
			for(int j=0;j<=cellcount;j++)
			{
				 Cell cellvalue = mysheet.getRow(i).getCell(j);
				 CellType datatype = cellvalue.getCellType();
				 
				 if(datatype==CellType.STRING)
				 {
					 String value = cellvalue.getStringCellValue();
					 System.out.print(value+" ");
				 }
				 else if(datatype==CellType.NUMERIC)
				 {
					 
					 double value = cellvalue.getNumericCellValue();
					 System.out.print(value+" ");
				 }
				
				 else if (datatype==CellType.BOOLEAN)
				 {
					 boolean value = cellvalue.getBooleanCellValue();
					 System.out.print(value+" ");
				 }
				 else if (datatype==CellType.BLANK)
				 {
					 System.out.println("");
				 }
				
			}
			System.out.println();
		}

	}

}


	


