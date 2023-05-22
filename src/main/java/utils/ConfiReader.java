package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfiReader {
	
	private static Properties properties;

	public static Properties init_Properties() {
		
		Properties prop = new Properties();
		File proFile = new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\config\\config.properties");
		
		try {
		FileInputStream fis = new FileInputStream(proFile);
		prop.load(fis);
		
	}catch(Throwable e) {
		e.printStackTrace();
	}
		
		return prop;
		
    }
}
	
	/*public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelfilepath");
		return excelfilelpath;
	}
		//if (excelfilelpath != null)
		//if (excelfilelpath != null )
		//	return excelfilelpath;
		//else
			//throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	
    }*/