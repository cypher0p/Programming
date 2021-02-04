package task;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class SubstringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = "";

        for (int i = 0; i < (s.length() - k + 1); i++) {
            if (s.substring(i,i+k).compareTo(smallest) < 0) {
                smallest = s.substring(i, i+k);
            }
            if (s.substring(i, i+k).compareTo(largest) > 0) {
                largest = s.substring(i, i+k);
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int ki = scanner.nextInt();
        scanner.close();
        System.out.println(getSmallestAndLargest(str, ki));
    }
}
