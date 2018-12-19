package d_config;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigDemo {
	
	public static void main(String[] args) {
		Properties properties = new Properties();
		
		File file = new File("D:\\Work\\java_workspace_temp\\AbstractFactory\\resource\\config.properties");
		
		try{
			InputStream in = new FileInputStream(file);
			properties.load(in);
			String propValue = properties.getProperty("dbName");
			System.out.println( propValue );
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
