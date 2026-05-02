import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC20 - Exception Handling in Search");
        System.out.println("====================================\n");

        List<String> bogieIds = new ArrayList<>();

        // ❌ Try with empty list first
        // bogieIds.add("BG101");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            // Defensive check
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException("No bogies available for search");
            }

            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(key)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Bogie ID FOUND");
            } else {
                System.out.println("Bogie ID NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}