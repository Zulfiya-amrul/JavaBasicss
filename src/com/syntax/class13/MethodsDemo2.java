package com.syntax.class13;

public class MethodsDemo2 {

	void TeyfurAndHorse(String personName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("this is a camel ");
		}

		else if ("horse".equalsIgnoreCase((animalName))) {
			System.out.println("this is a horse ");
		}

	}

	// methods that can return something and we can store them

	public static void main(String[] args) {
		MethodsDemo2 obj = new MethodsDemo2();
		obj.TeyfurAndHorse("teyfur", "Horse");
		obj.TeyfurAndHorse("tarik", "horse");

	}

}
