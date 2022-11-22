package com.prevent.everything;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainMethod {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		LazySingleton obj =LazySingleton.getInstance();
		
		//System.out.println(obj.hashCode());
		
		// Serialize singleton object to a file
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		
		out.writeObject(obj);
		out.close();
		
		// Deserialize singleton object from the file 
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		
		LazySingleton obj1 =(LazySingleton) in.readObject();
		
		in.close();
		
		System.out.println("obj hashcode " + obj);
		
		System.out.println("obj1 hashcode "+obj1.hashCode());
		
		//LazySingleton obj2 =(LazySingleton) obj.clone();
		
		//System.out.println(obj2.hashCode());
		
//		LazySingleton reflectionInstance = null;
//		
//		Constructor [] constructors = LazySingleton.class.getDeclaredConstructors();
//		
//		for(Constructor constructor : constructors ) {
//			constructor.setAccessible(true);
//			
//			reflectionInstance = (LazySingleton) constructor.newInstance();
//			
//			
//		}
//		System.out.println(reflectionInstance.hashCode());
//		
		
		
		
		
	}
}
