import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC17 - Sort Bogie Names");
        System.out.println("====================================\n");

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Built-in sorting
        Arrays.sort(bogies);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}