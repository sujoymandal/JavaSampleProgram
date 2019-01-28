package JavaDemo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialisedCalss1 implements Serializable{
	
	private String name;
	private String org;
	private int id;
	
	public SerialisedCalss1(String name, String org,int id){
		
		this.name=name;
		this.org=org;
		this.id=id;
	}
	
	public void setName(String nm){
		this.name=nm;
	}
	
	public void setOrg(String org){
		
		this.org=org;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getOrg(){
		return this.org;
	}
	
	public int getId(){
		return this.id;
	}
}

public class SerialisationDemo {

	public static void main(String[] args) throws Exception {
		
		SerialisedCalss1 cls1=new SerialisedCalss1("abc","xyz",1);
		
		String file="D:\\serialisationdemo.txt";
		FileOutputStream out=new FileOutputStream(file);
		ObjectOutputStream os=new ObjectOutputStream(out);
		os.writeObject(cls1);
		os.close();
		out.close();
		System.out.println("Serialisation done!!!!");
		
		SerialisedCalss1 cls2=null;
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream io=new ObjectInputStream(fis);
		cls2=(SerialisedCalss1) io.readObject();
		System.out.println("Deserialisation done!!!!");
		System.out.println(cls2.getName());
		System.out.println(cls2.getId());
		System.out.println(cls2.getOrg());

	}

}
