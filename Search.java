package homework1;

public class Search {
    public static void main(String[] args) {
        double start = System.nanoTime();
        double favourable = 0;
        long[] primes = getPrimes();
        for (int i = 1; i <= 1000000; i++) {
            long x = getRandomInt(2, Integer.MAX_VALUE);
            // favourable += linearSearch(x, primes) ? 1.0 : 0.0;
            favourable += binarySearch(x, primes) ? 1.0 : 0.0;
            System.out.println(favourable / i);
        }
        double duration = (System.nanoTime() - start) / Math.pow(10, 9);
        System.out.printf(" Time taken : %.2f seconds %n", duration);
        for (int i = 0; i < primes.length; i++) {
            while (true) {
                int random = getRandomInt(2, Integer.MAX_VALUE);
                System.out.println(random);
            }
        }
    }

    public static boolean linearSearch(long x, long[] primes) {
        boolean found = false;

        for (long i : primes) {
            if (x == i)
                found = true;
            break;
        }

        return found;
    }

    public static boolean binarySearch(long x, long[] primes) {
        int start = 0;
        int end = primes.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (x == primes[mid]) {
                return true;
            } else if (primes[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

    public static int getRandomInt(int min, int max) {
        int randomInt = (int) (Math.round(Math.random() * max) + min);
        return randomInt;
    }

    public static long[] getPrimes() {
        return Primes.returnPrimes();
    }
}