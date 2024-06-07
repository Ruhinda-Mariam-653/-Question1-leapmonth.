
package mariam.leapmonth;

import java.util.Scanner;
public class Leapmonth {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap month.");
        } else {
            System.out.println(year + " is not a leap month.");
        }


        scanner.close();
    }
}
