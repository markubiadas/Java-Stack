import java.util.ArrayList;
class CafeUtil {
    
    public int getStreakGoal() {
        int[] rewardPoints = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for (int i = 0; i < rewardPoints.length; i++) {
            count += rewardPoints[i];
        }
        return count;
    }

    public double getOrderTotal(double[]prices) {
        double count = 0;
        for (int i = 0; i < prices.length; i++) {
            count += prices[i];
        }
        return count;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " : " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
    }

}