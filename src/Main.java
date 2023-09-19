import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Note! Please input percent as a whole number without % symbol");
        Scanner s = new Scanner(System.in);
        System.out.print("Bill: ");
        String transBill = s.nextLine();
        double bill = Double.parseDouble(transBill);
        System.out.print("Tip Percent: ");
        String transTip = s.nextLine();
        int tip  = Integer.parseInt(transTip);
        System.out.print("Number of People: ");
        String transNumP = s.nextLine();
        int numP = Integer.parseInt(transNumP);
        s.close();
        double totalTip = bill * ((double)tip/100);
        double totalBill = bill + totalTip;
        double tipPer = totalTip / numP;
        double billPer = totalBill / numP;
        System.out.println();
        System.out.printf("Total Tip Amount: " + "%.2f",totalTip);


    }
}