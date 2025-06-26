
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        lib.addBook(new Book(101, "Ek Samander,mere ander", "Sanjeev Joshi"));
        lib.addBook(new Book(102, "Political History of Assam (1947-1971) – Volume 1", "Dr. Rajen Saikia"));
        lib.addBook(new Book(103, "PAssam’s Braveheart – Lachit Barphukan", "Arup Kumar Dutta"));
        lib.addBook(new Book(104, "“Maha Kavithai", "Vairamuthu"));

        lib.addUser(new User(1, "Sandeep"));
        lib.addUser(new User(2, "Abhay"));
        lib.addUser(new User(3, "Akash"));
        lib.addUser(new User(4, "Prajjwal"));

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    lib.showUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int idToIssue = sc.nextInt();
                    lib.issueBook(idToIssue);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int idToReturn = sc.nextInt();
                    lib.returnBook(idToReturn);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Option.");
            }
        } while (choice != 5);
    }
}
