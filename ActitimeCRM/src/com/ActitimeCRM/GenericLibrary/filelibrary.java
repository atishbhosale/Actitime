package com.ActitimeCRM.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class is generic class which contains non static methodsto read data from property excel
 * @author DELL
 *
 */
public class filelibrary {
/**
 * this method is a non static method used to read data from property file
 * @param key
 * @return
 * @throws IOException
 */
	public String readdatafrompropertyfile(String key) throws IOException 
	{
		FileInputStream fs = new FileInputStream("./testdata/commondata.property");
		Properties p = new Properties();
		p.load(fs);
		String value = p.getProperty(key);
		return value;
	}
	
	public String  readdatfromexcelsheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./testdata/BANKINGINFO.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
}
