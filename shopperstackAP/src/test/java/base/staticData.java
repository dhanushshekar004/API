package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class staticData {
	
	public static String id;
	public static String getID() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("sera/id.ser"));
		
			id=(String) ois.readObject();	
		return id;
		
	}
	
	
	public static void setID(String id) throws FileNotFoundException, IOException {		
ObjectOutputStream userID=new ObjectOutputStream(new FileOutputStream("sera/id.ser"));
userID.writeObject(id);
		 
		
	}

}
