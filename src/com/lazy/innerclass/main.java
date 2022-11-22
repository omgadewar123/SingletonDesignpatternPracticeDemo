package com.lazy.innerclass;

public class main {
	
	public static void main(String[] args) {
		
		LazyInnerClassSingleton obj =LazyInnerClassSingleton.getInstance();
		
		System.out.println(obj.hashCode());
		
		LazyInnerClassSingleton obj1 =LazyInnerClassSingleton.getInstance();
		
		System.out.println(obj1.hashCode());
		
	}

}
