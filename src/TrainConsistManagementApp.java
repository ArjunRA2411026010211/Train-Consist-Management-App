import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("====================================\n");

        // LinkedList to maintain order
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry at position 2
        train.add(2, "Pantry");

        // Remove first and last
        train.removeFirst();
        train.removeLast();

        // Display final list
        System.out.println("Final Train Consist:");
        System.out.println(train);
    }
}