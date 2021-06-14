package practice;

public class Person {
	//private, public, protected
	public String name; 
	protected int age;
	private String gender;
	
	public Person(String name, int age, String gender){
		this.name=name;
		this.age = age;
		this.gender = gender;
	}
	
	public static String speak() {
		return "Hello !!";
	}
	public String toString() {
		return "name:"+ name +  " age:" + age + " gender:" + gender;
	}
	
	public static void main(String args[]) {
		Person somu = new Person("somu",22,"M");
		System.out.println(somu.name); //public
		System.out.println(somu.age); //protected
		System.out.println(somu.gender);//private
		System.out.println(Person.speak());
		System.out.println(somu);
		System.out.println(somu.toString());
		//Integer numberTen = new Integer(10);
		//System.out.println(numberTen);
		//System.out.println(speak());

	}
}

