public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = 4;
        int d = 8;

        // The sum of pairwise values
        int sum1 = a + b;
        int sum2 = c + d;

        // Compare amounts
        System.out.println(sum1 > sum2);

        // Increase the first amount by 1 and decrease the second by 2
        sum1 += 1;
        sum2 -= 2;

        // Comparing amounts after changes
        System.out.println(sum1 > sum2);

        // Checking for multiplicity 2
        System.out.println(sum1 % 2 == 0 || sum2 % 2 == 0);
        }
    }