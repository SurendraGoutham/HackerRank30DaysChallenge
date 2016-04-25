package hackerRank.Others;

import java.util.Scanner;

public class BinaryNumbers {
	public static void main(String a[]) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			int n = scan.nextInt();
			System.out.println(Integer.toBinaryString(n));
		}
	}
}
