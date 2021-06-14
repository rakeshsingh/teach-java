package practice;

public class Point {
	int xVal; 
	int yVal;
	
	//constructor
	public Point() {
		this.xVal=1; 
		this.yVal=2;
	}
	//constructor2
	public Point(int x, int y) {
		this.xVal=x; 
		this.yVal=y;
	}
	
	public String toString() {
		return "(x:" + this.xVal + ", y:" + this.yVal+")";
	}

	public static void main(String args[]) {
		Point[] points;
		//memory allocate
		points = new Point[10];
		for(int i=0; i< 10; i++) {
			points[i]= new Point(i, i+5);
		}
		for(Point point: points) {
			System.out.println(point);
		}
	}
}
