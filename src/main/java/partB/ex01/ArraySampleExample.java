package partB.ex01;

public class ArraySampleExample {
    public static void main(String[] args) {

        int primes[] = {2,3,5,7,11,13,17};
        System.out.println ("Array length: " + primes.length);

        System.out.println ("The first few prime numbers are:");


        for (int i : primes) {

            System.out.println(i);

        }

    }
}
