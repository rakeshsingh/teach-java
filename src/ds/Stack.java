package ds;

public class Stack<T> {
	private int[] items;
	private int itemsCount;

	public Stack(int size) {
		this.items = new int[size];
		this.itemsCount = 0;
	}

	public void push(int item) {
		items[itemsCount++] = item;
	}

	public int pop() {
		return items[--itemsCount];
	}

	public int top() {
		return items[itemsCount];
	}

	public int size() {
		return itemsCount;
	}

	public boolean isFull() {
		if (itemsCount == items.length)
			return true;
		else
			return false;
	}

	public boolean isEmpty() {
		if (itemsCount == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String args[]) {
		Stack stack = new Stack(5);
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("size: " + stack.size() + "member:" + stack.pop());
		}
	}
}