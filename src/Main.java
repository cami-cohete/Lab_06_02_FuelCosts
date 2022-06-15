import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int gasInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        String trash = "";

        System.out.print("Please enter the number of gallons of gas in the tank: ");
        if (in.hasNextInt())
        {
            gasInTank = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid number for the number of gallons of gas in the tank. You incorrectly inputted: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

        System.out.println("Please enter the fuel efficiency in miles per gallon: ");
        if (in.hasNextDouble())
        {
            fuelEfficiency = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid number for the fuel efficiency in miles per gallon. You incorrectly inputted: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

        System.out.println("Please enter the price of gas per gallon: ");
        if (in.hasNextDouble())
        {
            pricePerGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Please enter a valid number for the price of gas per gallon. You incorrectly inputted: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);

        }

    }
}
