import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC5 - Preserve Insertion Order");
        System.out.println("====================================\n");

        // LinkedHashSet → maintains order + no duplicates
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Duplicate (ignored)
        train.add("Sleeper");

        // Display
        System.out.println("Train Formation:");
        System.out.println(train);
    }
}