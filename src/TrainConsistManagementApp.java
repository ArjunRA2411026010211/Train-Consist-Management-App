import java.util.*;

class Bogie {
    String type;
    String cargo;

    Bogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + "(" + cargo + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC12 - Safety Compliance Check");
        System.out.println("====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new Bogie("Open", "Coal"));             // valid
        bogies.add(new Bogie("Box", "Grain"));             // valid

        // ❌ Uncomment to test invalid
        // bogies.add(new Bogie("Cylindrical", "Coal"));

        // allMatch validation
        boolean isSafe = bogies.stream().allMatch(b -> {
            if (b.type.equals("Cylindrical")) {
                return b.cargo.equals("Petroleum");
            }
            return true;
        });

        System.out.println("Train Safety Status: " + (isSafe ? "SAFE" : "UNSAFE"));

        System.out.println("\nUC12 completed...");
    }
}