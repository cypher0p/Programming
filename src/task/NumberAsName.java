/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher0p)
 *   Date: 03-11-2020
 *   Time: 16:32
 *   File: NumberAsName.java
 */

package task;

import java.util.Scanner;

public class NumberAsName {
    public static void main(String[] args) {
        System.out.println("Please enter a number from 0 to 100: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        int onesPlace = num % 10;
        int tensPlace = num / 10;

        System.out.print(num + " is written as:- ");

        if (tensPlace == 0 && onesPlace == 0) {
            System.out.print("Zero");
        } else if (tensPlace == 10 && onesPlace == 0) {
            System.out.print("Hundred");
        } else if (tensPlace == 1) {

            if (onesPlace == 1) {
                System.out.print("Eleven");
            } else if (onesPlace == 2) {
                System.out.print("Twelve");
            } else if (onesPlace == 3) {
                System.out.print("Thirteen");
            } else if (onesPlace == 4) {
                System.out.print("Fourteen");
            } else if (onesPlace == 5) {
                System.out.print("Fifteen");
            } else if (onesPlace == 6) {
                System.out.print("Sixteen");
            } else if (onesPlace == 7) {
                System.out.print("Seventeen");
            } else if (onesPlace == 8) {
                System.out.print("Eighteen");
            } else if (onesPlace == 9) {
                System.out.print("Nineteen");
            } else if (onesPlace == 0) {
                System.out.print("Ten");
            }

        } else if (tensPlace == 2) {
            System.out.print("Twenty ");
        } else if (tensPlace == 3) {
            System.out.print("Thirty ");
        } else if (tensPlace == 4) {
            System.out.print("Fourty ");
        } else if (tensPlace == 5) {
            System.out.print("Fifty ");
        } else if (tensPlace == 6) {
            System.out.print("Sixty ");
        } else if (tensPlace == 7) {
            System.out.print("Seventy ");
        } else if (tensPlace == 8) {
            System.out.print("Eighty ");
        } else if (tensPlace == 9) {
            System.out.print("Ninety ");
        }
        if (onesPlace == 1) {
            System.out.print("One");
        }
        else if (onesPlace == 2) {
            System.out.print("Two");
        } else if (onesPlace == 3) {
            System.out.print("Three");
        } else if (onesPlace == 4) {
            System.out.print("Four");
        } else if (onesPlace == 5) {
            System.out.print("Five");
        } else if (onesPlace == 6) {
            System.out.print("Six");
        } else if (onesPlace == 7) {
            System.out.print("Seven");
        } else if (onesPlace == 8) {
            System.out.print("Eight");
        } else if (onesPlace == 9) {
            System.out.print("Nine");
        }
        System.out.println(".");
    }
}

