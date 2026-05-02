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
        bogies.add(new Bogie("import java.util.*;\n" +
                "import java.util.stream.*;\n" +
                "\n" +
                "class Bogie {\n" +
                "    String name;\n" +
                "    int capacity;\n" +
                "\n" +
                "    Bogie(String name, int capacity) {\n" +
                "        this.name = name;\n" +
                "        this.capacity = capacity;\n" +
                "    }\n" +
                "\n" +
                "    public String toString() {\n" +
                "        return name + \"(\" + capacity + \")\";\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "public class TrainConsistManagementApp {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "        System.out.println(\"====================================\");\n" +
                "        System.out.println(\"UC8 - Filter Passenger Bogies\");\n" +
                "        System.out.println(\"====================================\\n\");\n" +
                "\n" +
                "        List<Bogie> bogies = new ArrayList<>();\n" +
                "\n" +
                "        bogies.add(new Bogie(\"Sleeper\", 72));\n" +
                "        bogies.add(new Bogie(\"AC Chair\", 60));\n" +
                "        bogies.add(new Bogie(\"First Class\", 50));\n" +
                "        bogies.add(new Bogie(\"Second Sitting\", 80));\n" +
                "\n" +
                "        // FILTER: capacity > 60\n" +
                "        List<Bogie> filtered = bogies.stream()\n" +
                "                .filter(b -> b.capacity > 60)\n" +
                "                .collect(Collectors.toList());\n" +
                "\n" +
                "        System.out.println(\"Filtered Bogies:\");\n" +
                "        System.out.println(filtered);\n" +
                "    }\n" +
                "}AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies:");
        System.out.println(bogies);
    }
}