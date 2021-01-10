package location;
import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] createArray;
		int arrayRow, arrayColumn;
		Location finalResult = new Location();
		Scanner input = new Scanner(System.in);
		
		//set row and column of the array
		System.out.print("Enter the number of rows and columns in the array: ");
		arrayRow = input.nextInt();
		arrayColumn = input.nextInt();
		createArray = new double[arrayRow][arrayColumn];
		
		//Enter the value in the array
		System.out.println("Enter the array:");
		for (int row = 0; row < arrayRow; row++) {
			for (int column = 0; column < arrayColumn; column++) {
				createArray[row][column] = input.nextDouble();
			}
		}
		//find the max value
		finalResult = Location.locateLargest(createArray);
		System.out.printf("The location of the largest element is %f at (%d, %d)",finalResult.maxValue, finalResult.row, finalResult.column);
		
	}
}
