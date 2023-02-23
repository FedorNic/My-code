package Seminar_18;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(findPrimeNumbers(100));
    }

    /**
     * Найти все простые число от 1 до n (и распечатать их в консоль).
     */
    public static int findPrimeNumbers(int n) {
        int res = 0;
        boolean[] used = new boolean[n + 1];

        for (int i = 1; i < n; i += 2) {
            boolean s = true;
            for (int j = 2; j < i; j++) {   // 1 2 3 4 5 6 7 8 9     1 2 3 5 7
                if (!used[i]) {
                    System.out.println(i);
                    int k = i;
                    while (k < n) {
                        used[k] = true;
                        k += k;
                    }
                    //if (i % j==0) {
                    //    s = false;

                    //    break;
                }

            }

        }
        return 0;
        //throw new UnsupportedOperationException();
    }

}
