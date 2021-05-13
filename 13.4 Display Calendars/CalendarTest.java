import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println("Enter month: ");
		int month = input.nextInt();
		Calendar calendar = new GregorianCalendar(year, month - 1, 1);
		int lengthOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
		printMonth(year, month, dayofweek, lengthOfMonth);

	}

	public static void printMonth(int year, int month, int dayofweek, int lengthOfMonth) {
		// TODO Auto-generated method stub
		printMonthBody(year, month, dayofweek, lengthOfMonth);
	}

	public static void printMonthBody(int year, int month, int dayofweek, int lengthOfMonth) {
		// TODO Auto-generated method stub
		int startIndex = dayofweek * 4 - 2;
		int currentIndex = 0;
		int date = 1;
		System.out.println("          " + (month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		for (int i = 0; i < startIndex; i++) {
			System.out.print(" ");
			currentIndex = i;
		}
		for (int i = currentIndex; i < 28; i += 4) {
			System.out.print(date + "   ");
			date++;
		}
		System.out.println("");
		while(date <= lengthOfMonth) {
			for (int i = 0; i < 28; i += 4) {
				if (i == 0) {
					if(date<10) {
						System.out.print("  "+date+"   ");
					}
					else {
						System.out.print("  "+date+"  ");
					}
				}
				else {
					if(date<10) {
						System.out.print(date+"   ");
					}
					else {
						System.out.print(date+"  ");
					}
				}
				date++;
				if(date > lengthOfMonth) {
					break;
				}
			}
			System.out.println("");
		}
	}

}
