package CsvFileManagement;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CsvFileOperation {
	
    //Java code to illustrate reading CSV file line by line
	public static void CsvFileRead(File file) {
		try {
			
			// Create an object of file reader class with CSV file as a parameter. 
			FileReader filereader = new FileReader("C:\\Users\\indira.saravanan\\Documents\\File.csv");

			//Create CSVReader object and passing file reader as a parameter 
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;
			
			//it read data line by line.
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			//close the file reader
			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	 //Java code to illustrate writing CSV file line by line
	public static void CsvFileWrite(File file) {

		try {
			
			// Create an object of file Writer class with CSV file as a parameter. 
			FileWriter outputfile = new FileWriter("C:\\Users\\indira.saravanan\\Documents\\File.csv");
			
			//Create CSVWriter object and passing file writer as a parameter
			CSVWriter filewriter = new CSVWriter(outputfile);
            
			//it write data in CSV file
			String[] header = { "ID", "Name", "Designation" };
			filewriter.writeNext(header);

			String[] data1 = { "1", "Indira", "Trainee" };
			filewriter.writeNext(data1);
			String[] data2 = { "2", "Ranjitha", "HR" };
			filewriter.writeNext(data2);
			String[] data3 = { "3", "Mahesh", "Testing" };
			filewriter.writeNext(data3);
			String[] data4 = { "4", "Nischal", "Developer" };
			filewriter.writeNext(data4);
			String[] data5 = { "5", "Suraj", "HR" };
			filewriter.writeNext(data5);
			
            //close the file writer
			filewriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	
	 //Java code to illustrate delete from CSV file
	public static void CsvDelete(File file) {
		try {
			StringBuffer sb = new StringBuffer();
			sb.delete(1, 1);
			System.out.println(sb);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}