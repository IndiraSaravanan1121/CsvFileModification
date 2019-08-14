package CsvFileManagement;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *Purpose:Perform Read,Write,Delete in CSV file
 *FilePath:C:\\Users\\indira.saravanan\\Documents\\File.csv
 */
public class CsvFileModification {
	
	public static void main(String[] args) throws Exception {
		
		
		File file=new File("C:\\Users\\indira.saravanan\\Documents\\File.csv");
        
		//Create an object for FileInputStream and passing file path as parameter
		FileInputStream fis=new FileInputStream(file); 
		
		//Create an object for FileOutputStream and passing file path as parameter
        FileOutputStream fout=new FileOutputStream(file);
        
        //Create an object for Class CsvFileOperation
		CsvFileOperation csv=new CsvFileOperation();
		
		//Calling CsvFileRead,CsvFileWrite,csvDelete using the object csv
		csv.CsvFileRead(file);
		csv.CsvFileWrite(file);
		csv.CsvDelete(file);
	}
	

}
