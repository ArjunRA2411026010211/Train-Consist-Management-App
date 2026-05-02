import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("====================================\n");

        // HashMap → key-value mapping
        HashMap<String, Integer> bogieMap = new HashMap<>();

        // Insert values
        bogieMap.put("Sleeper", 72);
        bogieMap.put("AC Chair", 60);
        bogieMap.put("First Class", 50);

        // Iterate using entrySet
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}