package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author Dell
 *
 */

public class PropertyUtility implements IAutoConstants {
	/**
	 
	 * this method is developed to read the data from property file
	 * this method accept key of switch parameter you want to fetch
	 * @param key
	 * @return value of the key
	 */
	public String readingDataFromPropertyFile(String key) {
		FileInputStream fis=null;
		try{
			fis=new FileInputStream(PROPERTY_FILE_PATH);
		}catch(FileNotFoundException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		Properties property=new Properties();
		try {
			property.load(fis);
			
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		
		}


		return property.getProperty(key);

	}

	public String getDataFromPropertyFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


