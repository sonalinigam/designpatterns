/**
 * 
 */
package com.patterns.creational;

/**
 * Intent: Ensure a class has only one instance, and provide a global point of
 * access to it. Encapsulated "just-in-time initialization" or "initialization
 * on first use". </br>
 * Problem: Application needs one, and only one, instance of an
 * object. Additionally, lazy initialization and global access are necessary.
 * 
 * @author sonali
 *
 */
public class Singleton {
		
		private Singleton() {}
		
		private static class SingletonHolder{
			private static final Singleton instance = new Singleton();
		}
		
		public static Singleton getInstance() {
			System.out.println("Creating instance.....");
			return SingletonHolder.instance;
		}

}
