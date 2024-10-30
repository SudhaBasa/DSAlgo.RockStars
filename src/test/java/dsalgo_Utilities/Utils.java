package dsalgo_Utilities;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import dsalgo_Utilities.ExcelReading;
import dsalgo_Utilities.ConfigReader;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Utils {
	private ExcelReading reader = new ExcelReading();
	private ConfigReader configObj = new ConfigReader();
	String excelPath = configObj.getProperty("pythonCodeExcelPath");
	public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetname);
		String code = testdata.get(rownumber).get("pythonCode");
		return code;
	}
	
	public String getOutputFromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		List<Map<String, String>> testdata = reader.getData(excelPath, sheetname);
		String result = testdata.get(rownumber).get("output");
		return result;
	}
}
