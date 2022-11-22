package com.lazy.singleton.obj;

public class LazySingleton {
	
	private  static LazySingleton lazySingleton ;
	
	private LazySingleton() {
		
	}

	// synchronized keyword use for thread safety 
	public static synchronized LazySingleton getInstance() {
		
		if(lazySingleton == null ) {
			
		return 	lazySingleton = new LazySingleton();
				
		}
		return lazySingleton;
			
	}
	
}
