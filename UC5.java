public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments provided
        StringBuilder names = new StringBuilder();

        for (String name : args) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(name);
        }

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}
