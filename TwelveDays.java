/**
 * @Author Professor Wooster and ____________
 * Description: 
 * Feedback: 
 */
import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        final int MAX = 12;
        int lastDay = 0;  // last day for the song
        Scanner scan = new Scanner(System.in);

        // Prompt the user for the number of days to sing.
        while (lastDay < 1 || lastDay > MAX) {
            System.out.print("How many days (1 to " + MAX + ")? ");
            lastDay = scan.nextInt();
        }

        for (int day = 1; day <= lastDay; day++) {
            System.out.print("On the " + day);

            // switch on the value of day and output the cooresponding end for
            // the day number; for example 1st 2nd 3rd 4th 5th 6th etc.
            // don't use more cases than are necessary; default case will help.
            switch (day) {
            }

            // figure out what to print here to finish the song

            switch (day) {
                case 12: System.out.println("Twelve drummers drumming,");
            }

            System.out.println();
        }
        scan.close();
    }
}
