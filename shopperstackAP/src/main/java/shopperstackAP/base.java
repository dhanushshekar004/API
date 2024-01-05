package shopperstackAP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class base {
	public static String credentialsFilepath="C:\\Users\\Dhanush S\\Desktop\\new\\shopperstackAP\\src\\main\\java\\shopperstackAP\\cred.properties";
	public void url() throws IOException{
		Properties pro = new Properties();
		FileInputStream ips = new FileInputStream(credentialsFilepath);
		pro.load(ips);
		
		
	}

}
