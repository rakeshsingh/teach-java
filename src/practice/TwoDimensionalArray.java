package practice;

public class TwoDimensionalArray {
	
	public static void main(String args[]) {
		
		boolean arr1[][] = {
					{true, false, false}, // arr1[1] i =1 
					{false, false, false, true, true, false, false} // arr1[2] i = 2
				};
		String printValue="";
		
		for(int i=0; i<arr1.length;i++) {
			for (int j=0; j<arr1[i].length;j++) {
				if(arr1[i][j]== true) {
					printValue = "T";
				}
				else {
					printValue="F";
				}
				System.out.print(printValue);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
