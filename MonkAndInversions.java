package HackerEarth;
import java.util.*;
public class MonkAndInversions {


	public static void main(String args[]) {

	Scanner s = new Scanner(System.in);
	int testCase = s.nextInt();

	for (int i = 1; i <= testCase; i++) {

	int size = s.nextInt();

	int[][] arr = new int[size][size];

	for (int p = 0; p < size; p++) {
	for (int q = 0; q < size; q++) {

	arr[p][q] = s.nextInt();
	}
	}
	int count = 0;
	for (int x = 0; x < size; x++) {
	for (int y = 0; y < size; y++) {
	for (int p = x; p < size; p++) {
	for (int q = y; q < size; q++) {

	if ((arr[x][y] > arr[p ][q]))
	count++;

	}

	}
	}
	}
	System.out.println(count);
	count = 0;

	}

	System.out.println();
	s.close();
	}
	}