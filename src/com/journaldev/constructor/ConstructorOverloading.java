
package com.journaldev.constructor;

public class ConstructorOverloading {

	private String name;
	private int id;

	//no-args constructor
	public ConstructorOverloading() {
		this.name = "Default Name";
	}
	//one parameter constructor
	public ConstructorOverloading(String n) {
		this.name = n;
	}
	//two parameter constructor
	public ConstructorOverloading(String n, int i) {
		this.name = n;
		this.id = i;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ID="+id+", Name="+name;
	}
	public static void main(String[] args) {
		ConstructorOverloading d = new ConstructorOverloading();
		System.out.println(d);
		
		d = new ConstructorOverloading("Java");
		System.out.println(d);
		
		d = new ConstructorOverloading("Geetha", 25);
		System.out.println(d);
		
	}

}