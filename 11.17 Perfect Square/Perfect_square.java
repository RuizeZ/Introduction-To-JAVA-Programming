package Perfect_square;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		int num;
		int n;
		Scanner inputNum = new Scanner(System.in);
		System.out.print("Please input the number: ");
		num = inputNum.nextInt();
		n = findFactor(num);
		System.out.format("The smallest number n for m*n to be a perfect square is %d m * n is %d", n, n * num);
	}

	public static int findFactor(int num) {
		int n = 1;
		Dictionary<Integer, Integer> dict = new Hashtable();
		ArrayList<Integer> factorArrayList = new ArrayList<>();
		// Print the number of 2s that divide n
		while (num % 2 == 0) {
			if (dict.get(2) == null) {
				dict.put(2, 1);
			} else {
				dict.put(2, dict.get(2) + 1);
			}
			if (dict.get(2) % 2 != 0) {
				factorArrayList.add(2);
			} else {
				factorArrayList.remove(Integer.valueOf(2));
			}
			num /= 2;
		}

		// n must be odd at this point. So we can
		// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			// While i divides n, print i and divide n
			while (num % i == 0) {
				if (dict.get(i) == null) {
					dict.put(i, 1);
				} else {
					dict.put(i, dict.get(i) + 1);
				}
				if (dict.get(i) % 2 != 0) {
					factorArrayList.add(i);
				} else {
					factorArrayList.remove(Integer.valueOf(i));
				}
				num /= i;
			}
		}
		// This condition is to handle the case when
		// n is a prime number greater than 2
		if (num > 2) {
			if (dict.get(num) == null) {
				dict.put(num, 1);
			} else {
				dict.put(num, dict.get(num) + 1);
			}
			if (dict.get(num) % 2 != 0) {
				factorArrayList.add(num);
			} else {
				factorArrayList.remove(Integer.valueOf(num));
			}
		}
		for (int i : factorArrayList) {
			n *= i;
		}

		return n;
	}
}
