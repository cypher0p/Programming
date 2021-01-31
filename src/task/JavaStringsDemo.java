package task;

import java.util.Scanner;

public class JavaStringsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        scanner.close();

        int sum1 = name1.length();
        int sum2 = name2.length();
        int sum = sum1 + sum2;
        System.out.println(sum);

        int compare = name1.compareTo(name2);
        if (compare > 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        String firstLetter1 = name1.substring(0,1);
        String remainingLetter1 = name1.substring(1, name1.length());
        firstLetter1 = firstLetter1.toUpperCase();

        name1 = firstLetter1 + remainingLetter1;

        String firstLetter2 = name2.substring(0, 1);
        String remainingLetter2 = name2.substring(1, name2.length());
        firstLetter2 = firstLetter2.toUpperCase();

        name2 = firstLetter2 + remainingLetter2;

        System.out.println(name1);
        System.out.println(name2);
    }
}