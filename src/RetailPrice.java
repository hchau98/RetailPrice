import java.util.Scanner;
public class RetailPrice {
    public static void main(String args[]) {
        String cont;
        double cost, retail, rate;

        Scanner keybd = new Scanner(System.in);

        do {
            System.out.println("How much is the wholesale cost of the item?");
            cost = keybd.nextDouble();
            System.out.println("What is the rate from wholesale to retail?");
            keybd.nextLine();
            rate = keybd.nextDouble();
            retail = cost * rate;
            keybd.nextLine();
            System.out.println("Retail price is: "+retail);
            System.out.println("Do you wish to continue press Y or N");
            cont = keybd.nextLine();




        }while(!cont.equalsIgnoreCase("n"));
    }
}
