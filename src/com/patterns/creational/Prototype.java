/**
 * 
 */
package com.patterns.creational;

import java.util.ArrayList;
import java.util.List;

/**
 * Intent: Prototype design pattern is used when the Object creation is a costly
 * and requires a lot of time and resources and you have a similar object
 * already existing. So you clone this object first and then do the data
 * manipulations or adjust it according to your needs later.</br>
 * Problem: Application "hard wires" the class of object to create in each "new"
 * expression.
 * 
 * @author sonali
 *
 */
public class Prototype implements Cloneable{
	
	private List<String> empList;
	
	public Prototype() {
		empList = new ArrayList<String>();
	}
	
	public Prototype(List<String> list) {
		this.empList = list;
	}
	
	public void loadData() {
		empList.add("John");
		empList.add("Doe");
		empList.add("Jane");
		empList.add("Dahlia");
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<String>();
		for(String s : this.getEmpList()) {
				tempList.add(s);
		}
		return new Prototype(tempList);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype emps = new Prototype();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Prototype empsNew = (Prototype) emps.clone();
		Prototype empsNew1 = (Prototype) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");
		
		System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list1);
	}

}
