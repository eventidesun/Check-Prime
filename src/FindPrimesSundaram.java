public class FindPrimesSundaram {
    public static void main(String[] args) {
        int N = 100;

        // Step 1: Need to calculate n
        int n = (N - 2) / 2;

        // Step 2: Create the boolean array
        boolean[] marked = new boolean[n + 1];

        // Step 3: mark the numbers of the form i + j + 2ij (the composites)
        for (int i = 1; i <= n; i++) {
            for (int j = i; (i + j + 2 * i * j) <= n; j++) {
                marked[i + j + 2 * i * j] = true;
            }
        }

        // Step 4: Then print the primes
        System.out.print("Primes ≤ " + N + ": 2 "); // we add 2 manually since this algorithm ignores all even numbers
        for (int i = 1; i <= n; i++) {
            if (!marked[i]) {
                System.out.print((2 * i + 1) + " ");
            }
        }
    }
}
