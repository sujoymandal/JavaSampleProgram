package JavaDemo6;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingPropertyFileDemo {

	public static void main(String[] args) throws Exception {

		String path=System.getProperty("user.dir")+
				"\\src\\main\\java\\JavaDemo6\\SampleProp.properties";
		
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println("name is :"+prop.getProperty("name"));
		System.out.println("org name is "+prop.getProperty("org"));
		System.out.println("emp id is "+prop.getProperty("empid"));
		prop.setProperty("name", "nnnnnn");
		System.out.println("name is :"+prop.getProperty("name"));
	}

}
