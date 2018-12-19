package main6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertyUtil {
	
	public static String getProperty(String key){
		Properties properties = new Properties();
		
		File file = new File("D:\\Work\\java_workspace_temp\\AbstractFactory\\resource\\config.properties");
		String propValue = null;
		try{
			InputStream in = new FileInputStream(file);
			properties.load(in);
			propValue = properties.getProperty("dbName");
		}catch(Exception e){
			e.printStackTrace();
		}
		return propValue;
	}

}
