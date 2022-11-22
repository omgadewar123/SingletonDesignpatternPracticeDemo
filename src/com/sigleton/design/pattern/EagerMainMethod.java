package com.sigleton.design.pattern;

public class EagerMainMethod {
	
	public static void main(String[] args) {
		
		//System.out.println("Hello om ");
		
		EagerSingleton obj 	= EagerSingleton.getInstance();
			
	
		System.out.println(obj.hashCode());
	
	
		EagerSingleton obj1 	= EagerSingleton.getInstance();
	
	
		System.out.println(obj1.hashCode());
	
	
		
	}

}
