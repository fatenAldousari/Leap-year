import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a year: ");
        String year = myScanner.nextLine();
        int Year = 1900;
        boolean leap = false;
        if (Year % 4 == 0) {

            if (Year % 100 == 0) {
                if (Year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            else
                leap = true;
        } else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
