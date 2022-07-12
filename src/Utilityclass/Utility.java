package Utilityclass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
    //excel
	//Screenshot
	//closing
	// all used mtds here should be static and jenric
	
	public static String readdatafromexcel(int row,int cell) throws EncryptedDocumentException, IOException
	{

		File myfile=new File("D:\\Excel\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}
	
	public static void capturescreenshot(WebDriver driver , String TCID) throws IOException
	{
	   File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest= new File("E:\\ScreenShot\\Mysc"+TCID+".png");
	   FileHandler.copy(src, dest);
		
		
		
	}
	
	
	
}