public class HELLOAPP {

    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Case 2: Arguments provided
        String names = String.join(", ", args);

        // Print greeting
        System.out.println("Hello, " + names + "!");
    }
}
