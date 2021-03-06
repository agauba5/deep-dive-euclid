package edu.cnm.deepdive.algorithms;

/**
 * This class implements Euclids's algorithm for finding the GCD of 2
 * integers. When run as a java application, the input valus are read
 * from the command line arguments.
 *
 * @author Abdul Haseeb Gauba
 */

public class Euclid {

/** Format string used for display of input valus and GCD*/
  public static final String DISPLAY_FORMAT = "GCD(%,d, %,d) = %,d%n";

  /**
   * Reads 2 integer values from the command line and displays their GCD,
   * alogn with the inputs
   *
   * @param args
   */
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int gcd = gcd(a,b);
    System.out.printf(DISPLAY_FORMAT,a, b, gcd);
  }

  /**
   * Computes and returns the GCD of 2 integers, using the modular division form of
   * Euclid's algorithm
   *
   * @param a is the first input
   * @param b is the second input
   * @return the GCD of <code>a</code> and <code>b</code>
   */
  public static int gcd(int a , int b){
    a = Math.abs(a);
    b = Math.abs(b);
    int c = Math.max(a,b);
    b = Math.min(a, b);
    a = c;
    while(b > 0){
      c = a % b;
      a = b;
      b = c;
    }
    return a;
  }
}
