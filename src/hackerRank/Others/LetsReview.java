package hackerRank.Others;

import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = n-1;
		for (int i = 1; i < n+1 ;  i++) {
			System.out.print(new String(new char[c]).replace("\0", " ")+new String(new char[i]).replace("\0", "#"));
			//System.out.print(new String(new char[i]).replace("\0", "#"));
			if(c > 0){
				System.out.println();
			}
			c -- ;
		}
	}
}
