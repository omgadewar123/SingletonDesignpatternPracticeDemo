package com.sigleton.design.pattern;
// EagerSingleton design pattern 
// and it is not good way 
public class EagerSingleton {

    private  EagerSingleton() {
    	
		}
	
	private final static EagerSingleton instance = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return instance;
	}

}
