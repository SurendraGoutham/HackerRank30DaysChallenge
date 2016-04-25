package hackerRank.Others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SolutionSorting {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> z = new ArrayList<Integer>();
		int c = Integer.MAX_VALUE;
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			a.add(b);
		}
		Collections.sort(a);
		for (int i = 0; i < (n - 1); i++) {
			if (c >= (Math.abs(a.get(i) - a.get(i + 1))))
				c = (Math.abs(a.get(i) - a.get(i + 1)));
		}
		for (int i = 0; i < (n - 1); i++) {
			if (c == (Math.abs(a.get(i) - a.get(i + 1)))) {
				z.add(a.get(i));
				z.add(a.get(i + 1));
			}
		}
		for (int counter : z) {
			System.out.print(counter + " ");
		}
	}
}