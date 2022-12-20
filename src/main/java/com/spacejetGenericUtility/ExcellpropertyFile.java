package com.spacejetGenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellpropertyFile {

	
	
	/**
	 * this is used to get data from Excel
	 */

	 FileInputStream source = null;
	 Workbook book = null;
	 public String getExcelData(String file_path,String sheet,int row,int cell)
	 {
		try {
			source = new FileInputStream(file_path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			try {
				book = WorkbookFactory.create(source);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}DataFormatter dt=new DataFormatter();
			
			String value = book.getSheet(sheet).getRow(row).getCell(cell).toString();
			DataFormatter format=new DataFormatter();
				String value1=format.formatCellValue(book.getSheet(sheet).getRow(row).getCell(cell));
		     return value1;
	 }
	/**
	 * in this method used to write data into the Excel
	 * @param file_path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 */
	    public void writeData(String file_path,String sheet,int row,int cell,String value )
	    {
	    	try {
				source = new FileInputStream(file_path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	try {
				book = WorkbookFactory.create(source);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 book.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	    	 FileOutputStream fs = null;
			try {
				fs = new FileOutputStream(file_path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 try {
				book.write(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
	    /**
	     * in this method is used to close the Excel Files
	     */
	public void closeExcelFiles()
	{
		try {
			book.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			source.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
	
	
	
	
}
