package full_guide.part_01.chapter_05._12_FindPrime;

/**
 * Created by mega on 24.08.2016.
 */
public class FindPrime {
    public static void main(String[] args) {
        int num = 5;
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) isPrime = false;
        }
        if (isPrime) System.out.println(num + " is prime");
        else System.out.println(num + " is not prime");
    }
}
