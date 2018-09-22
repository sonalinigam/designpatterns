/**
 * 
 */
package com.patterns.creational;

/**
 * There are three major issues with Factory and Abstract Factory design
 * patterns when the Object contains a lot of attributes.
 * 
 * <li>
 * <ol>Too Many arguments to pass from client program to the Factory class that can
 * be error prone because most of the time, the type of arguments are same and
 * from client side its hard to maintain the order of the argument.</ol>
 * <ol> Some of the parameters might be optional but in Factory pattern, we are forced to send
 * all the parameters and optional parameters need to send as NULL.</ol>
 * <ol> If the object is heavy and its creation is complex, then all that complexity will be
 * part of Factory classes that is confusing.</ol>
 * </li>
 * 
 * @author sonali
 *
 */
public class Person {
	//Mandatory 
	private String name;
	private String id;
	//Optional
	private String address;
	private String work;
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getAddress() {
		return address;
	}
	public String getWork() {
		return work;
	}
	public Person(PersonBuilder builder) {
		this.name = builder.name;
		this.id = builder.id;
		this.address = builder.address;
		this.work = builder.work;
	}
	
	public static class PersonBuilder{
		//Mandatory 
		private String name;
		private String id;
		//Optional
		private String address;
		private String work;
		
		public PersonBuilder(String name, String id) {
			super();
			this.name = name;
			this.id = id;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setWork(String work) {
			this.work = work;
		}
		
		public Person build() {
			return new Person(this);
		}
		
	}

}
