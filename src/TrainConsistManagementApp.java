import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("====================================\n");

        String[] bogieIds = {"BG101", "BG102", "BG103", "BG104"};

        // Ensure sorted (important)
        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0, high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID FOUND");
        } else {
            System.out.println("Bogie ID NOT FOUND");
        }
    }
}