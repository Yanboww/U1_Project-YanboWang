import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //border design
        String decoration = "--------------------------------";
        System.out.println(decoration+decoration);
        //user instructions
        System.out.printf("|%s |%n","Note! do not use any symbols when inputting data! (no $ or %)");
        System.out.println(decoration+decoration);
        //asks for user input and detects/stores through scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Bill($): ");
        String transBill = s.nextLine();
        double bill = Double.parseDouble(transBill);
        System.out.print("Tip Percent: ");
        String transTip = s.nextLine();
        int tip  = Integer.parseInt(transTip);
        System.out.print("Number of People: ");
        String transNumP = s.nextLine();
        int numP = Integer.parseInt(transNumP);
        //no longer need scanner
        s.close();
        //setting variables that will be printed using equations
        double totalTip = bill * ((double)tip/100);
        double totalBill = bill + totalTip;
        double tipPer = totalTip / numP;
        double billPer = totalBill / numP;
        System.out.println();
        //prints the data and outputs in the console
        System.out.println(decoration);
        System.out.printf("|Total Tip Amount: $" +"%.2f",totalTip);
        System.out.println("       |");
        System.out.println(decoration);
        System.out.printf("|Total bill cost: $" + "%.2f",totalBill);
        System.out.println("       |");
        System.out.println(decoration);
        System.out.printf("|Tip per person: $" + "%.2f", tipPer);
        System.out.println("         |");
        System.out.println(decoration);
        System.out.printf("|Total bill per person: $" + "%.2f", billPer );
        System.out.println("  |");
        System.out.println(decoration);
    }
}