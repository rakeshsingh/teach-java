package practice;

public class MyArrayList {
	String elements[];
	int last;
	public MyArrayList() {
		this.elements = new String[2];
	}
	
	//get
	public String get(int i) {
		return this.elements[i];
	}
	
	//add
	public void add(String a) {
		if(last == elements.length) {
			String temp[] = new String[last*2];
			//copy past values
			for(int i=0; i<last;i++) {
				temp[i]=elements[i];
			}
			this.elements = temp;
		}
		this.elements[last++]=a;
	}
	
	private void resize() {
		System.out.println("memory exceeded, resizing");
	}
	
	public void print() {
		for (int i=0; i<this.last; i++) {
			System.out.print(elements[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		MyArrayList list = new MyArrayList();
		list.add("a");
		list.add("b");
		list.print();
		list.add("c");
		list.print();

		
	}
}
