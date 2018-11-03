package collection;

import java.util.*;
public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		prop.setProperty("timeout","30"); // key와 value를 저장
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10"); // 무조건 String
		prop.setProperty("capacity", "10");
		
		Enumeration e = prop.propertyNames(); // name = key
		
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element+"="+prop.getProperty(element));
		}
		
		System.out.println();
		
		prop.setProperty("size", "20"); // 변경
		System.out.println("size="+prop.getProperty("size")); 
		System.out.println("capacity="+prop.getProperty("capacity","20")); // getProperty(keyname, default)
		System.out.println("loadfactor="+prop.getProperty("loadfactor","0.75"));
		
		System.out.println(prop); // 출력
		prop.list(System.out);
	}

}
