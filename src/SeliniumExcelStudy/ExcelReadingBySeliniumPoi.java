package SeliniumExcelStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingBySeliniumPoi {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Excel\\Book1.xlsx");
		
		String xcl = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(xcl);
		
		String xccl = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(xccl);
		
		boolean boolin = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		System.out.println(boolin);
	
		String chr = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		System.out.println(chr);
		
		double in = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.println(in);
		
	}
		
	}


