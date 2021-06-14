package practice;

public class Point2 {
	int xVal; 
	int yVal; 
	
	public Point2(int x, int y) 
	{
		this.xVal=x;
		this.yVal=y;
	}
	public String toString() {
		return "x: "+ xVal + ", y:" + yVal;
	}

	public static void main(String args[]) {
		Point [] points;
		points = new Point[10];
		for(int i=0; i<10; i++) {
			points[i]=new Point(i, i+2);
		}
		
		for(Point point: points) {
			System.out.println(point);
		}
	}
}
