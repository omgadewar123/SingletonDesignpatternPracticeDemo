package com.lazy.innerclass;
// here is no need of manually add synchronized block 
// by default internally provide by java 
//youtube singleton java Techie channel

public class LazyInnerClassSingleton {
	
	private LazyInnerClassSingleton() {
		
	}
	
	private static class SingletonHelper{
		private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
		
	}

	public static LazyInnerClassSingleton getInstance () {
		return SingletonHelper.instance;
	}
}
