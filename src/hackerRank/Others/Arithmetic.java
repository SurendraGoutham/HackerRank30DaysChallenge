package hackerRank.Others;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt(); // tip percentage
      int X = sc.nextInt(); // tax percentage
      double tip;
        tip = (M*T)/100;
      double tax;
        tax = (M*X)/100;
        
      // Enter your code here!
      // Run some computations....
      
      int total = (int) Math.round(M+tip+tax);
      System.out.printf("The final price of the meal is $%d.",total);
      // ...then print!
      
    }
}
