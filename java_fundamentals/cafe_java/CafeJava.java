public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 4.5;
        double dripCoffeePrice = 3.5;
        double lattePrice = 6.25;
        double cappuccinoPrice = 6.50;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:

        // ===== Customer Cindhuri =====
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(displayTotalMessage + mochaPrice);
        System.out.println(isReadyOrder1? customer1 + readyMessage : customer1 + pendingMessage);
        System.out.println("");

        // ===== Customer Noah ======
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(displayTotalMessage + cappuccinoPrice);
        System.out.println("");

        // ===== Customer Sam =======
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (2 * lattePrice));
        if (isReadyOrder2) {
            isReadyOrder2 = false;
            System.out.println(customer2 + pendingMessage);
        }
        else {
            System.out.println(customer2 + readyMessage);
        }
        System.out.println("");

        // ====== Customer Jimmy ======
        System.out.println(generalGreeting + customer3);
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
        System.out.println(isReadyOrder3? customer3 + readyMessage : customer3 + pendingMessage);
    }
}