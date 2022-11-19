
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anupam_pathak
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList todo;
    
    public UserInterface( TodoList todo , Scanner scanner) {
        this.scanner = scanner;
        this.todo = todo;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.todo.add(task);
            } else if (command.equals("list")) {
                this.todo.print();
            } else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int rem = Integer.valueOf(this.scanner.nextLine());
                this.todo.remove(rem);
            }
        }
    }
}
