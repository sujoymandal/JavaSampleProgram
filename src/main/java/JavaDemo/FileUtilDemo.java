package JavaDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilDemo {

	public static void main(String[] args) throws Exception {
		
		File src=new File("D:\\PPP\\voter card2_Sujoy_Mandal_2.pdf");
		File dst=new  File("D:\\Dest\\voter card2_Sujoy_Mandal_2.pdf");
		
		FileUtils.copyFile(src,dst);
		
		if(dst.exists())
			System.out.println("copied..");
		
		dst.delete();
		System.out.println("filed deleted");

	}

}
