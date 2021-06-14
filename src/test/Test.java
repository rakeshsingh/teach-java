package test;

import practice.Person;

public class Test {
	public static void main(String args[]) {
		Person somu = new Person("somu",22,"M");
		System.out.println(somu.name); //public
//		System.out.println(somu.age); //protected
		//System.out.println(somu.gender);//private

	}
}
