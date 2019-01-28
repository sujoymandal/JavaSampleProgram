package JavaDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
		"\\src\\main\\java\\com\\excelRead\\PropFile.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		//prop.setProperty("sal", "123");
		prop.put("sal", "123");
		prop.getOrDefault("name", "0000");
		System.out.println(prop.getProperty("sal"));
		//System.out.println(System.getProperty("user.dir"));
		
	}

}
