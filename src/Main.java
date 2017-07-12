import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        String userName;
        String answer = "yes";

        System.out.print("What's your name? ");
        userName = scnr.nextLine();

        do {

            System.out.print("Enter number between 1 & 100: ");
            userNum = scnr.nextInt();
            scnr.nextLine();

            if (userNum < 60 && userNum % 2 != 0) {
                System.out.println("Odd");
            } else if (userNum >= 2 && userNum < 25 && userNum % 2 == 0) {
                System.out.println("Even and less than 25, " + userName);
            } else if (userNum > 26 && userNum < 60 && userNum % 2 == 0) {
                System.out.println("Even, " + userName);
            } else if (userNum > 60 && userNum % 2 != 0) {
                System.out.println("Odd and over 60, " + userName);
            }
            System.out.println("Congrats, " + userName + " - You now know the difference between Even and Odd numbers! You're ready for first grade! ;-)"); //Extra challenge number 1.

            System.out.println(userName + ", would you like to continue? ");
            answer = scnr.nextLine();

        }
        while (answer.equals("yes"));
    }
}
