import java.util. Scanner;
public class RestaurantCheckManager {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        // Creating the variables needed for my program.
        double totalSale = 0;
        double totalTip = 0;
        double numOfChecks = 0;
        double totalSaleSoFar = 0;
        double totalTipSoFar = 0;

        int numOfServers = 3;
        int numOfKitchenMembers = 3;
        int numOfOthers = 2;

        double serverTips = 0;
        double headChefTips = 0;
        double sousChefTips = 0;
        double kitchenAidTips = 0;
        double hostTips = 0;
        double busserTips = 0;

        // I ask the manager to input the sale, tip, and total amount.
        do {
            System.out.println("Enter the sale amount: ");
            double sale = input.nextDouble();

            System.out.println("Enter the tip amount: ");
            double tips = input.nextDouble();
            double total = sale + tips;

            System.out.println("Enter the total amount: ");
            double checkTotal = input.nextDouble();

            totalSale += sale;
            totalTip += tips;
            numOfChecks++;
            totalSaleSoFar += sale;
            totalTipSoFar += tips;

            // I use an if statement to check whether someone is present at work, but based on the assignment I assumed someone was already absent.
            boolean serverWorking = true;
            double serverPercentage = 0.8;
            if (serverWorking) {
                serverPercentage = 0.8 / (numOfServers - 1);
            }
            serverTips += serverPercentage * tips;
            headChefTips += 0.5 * (tips * 0.1);
            sousChefTips += 0.3 * (tips * 0.1);
            kitchenAidTips += 0.2 * (tips * 0.1);
            hostTips += 0.05 * tips;
            busserTips += 0.05 * tips;
            // After calculating tips for each group it then asks whether the manager wants to continue inputting more.
            System.out.println("Do you want to stop? (y/n): ");
            String terminate = input.next();
            if (terminate.equalsIgnoreCase("y")) {
                break; }
        }
        // Then when the "manager" is finished it outputs each value.
        while (true);
        System.out.println("Total sale amount: " + totalSale);
        System.out.println("Total tip amount: " + totalTip);
        System.out.println("Number of checks: " + numOfChecks);
        System.out.println("Total sale so far: " + totalSaleSoFar);
        System.out.println("Total pooled tips so far: " + totalTipSoFar);
        System.out.println("Server tips so far: " + serverTips);
        System.out.println("Head Chef tips so far: " + headChefTips);
        System.out.println("Sous Chef tips so far: " + sousChefTips);
        System.out.println("Kitchen aid tips so far: " + kitchenAidTips);
        System.out.println("Host/Hostess tips so far: " + hostTips);
        System.out.println("Busser tips so far: " + busserTips);
    }
}
