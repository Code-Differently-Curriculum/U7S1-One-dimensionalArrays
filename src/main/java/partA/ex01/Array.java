package partA.ex01;

public class Array {
    public static void main(String args[]) {

        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

       // ** Your Code Here ***

        //int[] primeNum = new long[20];
        //int even=new int[5];

    }
}
