package com.lazy.singleton.obj;

public class LazyMain {
	
	public static void main(String[] args) {
		
		System.out.println("hey hi om");
		
		
		LazySingleton obj = LazySingleton.getInstance();
		 
		 System.out.println(obj.hashCode());
		 
		 LazySingleton obj1 = LazySingleton.getInstance();

		 System.out.println(obj1.hashCode());
		 
	}

}
