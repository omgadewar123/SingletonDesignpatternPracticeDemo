package com.duble.checking.singleton;

public class Main {
	
	public static void main(String[] args) {
		
		DoubleCheckingSingleton obj =DoubleCheckingSingleton.getInstance();
		
		System.out.println(obj.hashCode());
		
		DoubleCheckingSingleton obj1 =DoubleCheckingSingleton.getInstance();
		System.out.println(obj1.hashCode());
	}

}
