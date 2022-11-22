package com.duble.checking.singleton;

public class DoubleCheckingSingleton {
	
	private static  DoubleCheckingSingleton instance;

	public DoubleCheckingSingleton() {
		
	}
	
	public  static DoubleCheckingSingleton getInstance() {
		if(instance== null) {
			
			synchronized (DoubleCheckingSingleton.class) {
				if(instance== null) {
					instance = new DoubleCheckingSingleton();
					
				}
				
			}
		}
		return instance;
	}
	

}
