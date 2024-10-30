package dsalgo_Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties prop = null;

	
	public static String getProperty(String key) {
		
		if ( prop == null ) intializeProperties();		
		return prop.getProperty(key);
		
	}

	public static Properties intializeProperties() {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/Config/Config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	//
	public static String registerPageUrl() {
		
		String url=prop.getProperty("registerUrl");
		if(url!=null)
			return url;
		else
			throw new RuntimeException("url not specified");
		
	}
	
	public static String getExcelFilePath() {
		String excelFilePath=ConfigReader.getProperty("excelFilePath");
	if(excelFilePath !=null)
		return excelFilePath;
	else 
		throw new RuntimeException("Excel file path not specified in the config.properties file");
	}

}
