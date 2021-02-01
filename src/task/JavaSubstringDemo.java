package task;

import java.util.Scanner;

public class JavaSubstringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        String newName = name.substring(start, end);
        System.out.println(newName);
    }
}
