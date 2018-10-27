package tmcgpmkanban;

import java.util.Scanner;

public class TMCGpmkanban {

    public static void main(String args[]) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter product noteNumber: ");
            String noteName = sc.nextLine();

            // get the Product object
            TaskDB db = new TaskDB();
            Note note = db.getNote(noteName);

            // display the output
            String message = "\nNOTE\n" +
                "ID:        " + note.getCode() + "\n" +
                "Assigned To:        " + note.getOwner() + "\n" +    
                "Description: " + note.getDescription() + "\n";
                
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}