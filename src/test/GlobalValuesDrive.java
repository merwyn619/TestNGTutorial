package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\merwynn\\eclipse-workspace\\Test\\src\\demo\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos= new FileOutputStream("C:\\Users\\merwynn\\eclipse-workspace\\Test\\src\\demo\\data.properties");
		prop.store(fos, null);
	}

}
