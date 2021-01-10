package location;

public class Location {
	public int row;
	public int column;
	public double maxValue;
	
	//Constructor
	public Location(){
	}
	
	public static Location locateLargest(double[][] a) {
		double tempMaxValue = a[0][0];
		Location returnValue = new Location();
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				if (a[row][column] > tempMaxValue) {
					tempMaxValue = a[row][column];
					returnValue.row = row;
					returnValue.column = column;
				}
			}
		}
		returnValue.maxValue = tempMaxValue;
		return returnValue;
	}
}
