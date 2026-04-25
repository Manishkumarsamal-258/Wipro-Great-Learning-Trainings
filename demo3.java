import java.util.Scanner;

public class Demo {
    static class Emp {  // Changed to static inner class (or could be a separate file), and capitalized name
        private int id;
        private String name;
        private Scanner sc;

        // Constructor to initialize employee details
        public Emp(Scanner sc) {  // Pass Scanner to avoid multiple instances
            this.sc = sc;
            System.out.println("Enter ID");
            id = sc.nextInt();
            System.out.println("Enter Name");
            name = sc.next();
        }

        // Method to display employee details
        public void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Single Scanner instance
        try {
            Emp e = new Emp(sc);
            e.display();
        } finally {
            sc.close();  // Always close Scanner to prevent resource leaks
        }
    }
}
