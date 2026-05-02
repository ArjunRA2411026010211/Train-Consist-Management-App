import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + "(" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity");
        System.out.println("====================================\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies:");
        System.out.println(bogies);
    }
}