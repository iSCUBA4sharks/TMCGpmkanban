/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tmcgpmkanban;

/**
 *
 * @author jt_sc
 */
import java.util.Scanner;

public class TMCGpmkanban {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the PM Kanban application");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter task name: ");
            String taskID = sc.nextLine();

            // get the Product object
            TaskDB db = new TaskDB();
            Task task = db.getTask(taskID);

            // display the output
            String message = "\nTASK\n" +
                "ID:        " + task.getTaskID() + "\n" +
                "Description: " + task.getTaskDescription() + "\n" +
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }
    
}
