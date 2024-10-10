// Ada Fender
// Midterm Project

// This code guides the user through making two Task objects. 
// It adds them to a ToDoList object and then has the user assign that ToDoList to a Person object.
// It also sorts the list by priority and checks the completeness of the Tasks given by the user.

import java.util.Scanner;

public class ToDoListDriver {
    public static void main(String[] args) 
    {   
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Creating a first task:");
        System.out.println("What is the name of the task?");
        String name = keyboard.nextLine();

        System.out.println("What is the description?");
        String description = keyboard.nextLine();
        Task t1 = new Task(name, description);

        String priority = "";
        boolean validPriority = false;

        while (!validPriority) 
        {
            System.out.println("What is the priority of the task? Enter low, medium, or high.");
            priority = keyboard.nextLine();

            if (priority.equals("low") || priority.equals("medium") || priority.equals("high")) 
            {
                t1.setPriority(priority);
                validPriority = true;
            } 
            else 
            {
                System.out.println("Invalid input. Please enter low, medium, or high.");
            }
        }
    
        System.out.println("Creating a second task:");
        System.out.println("What is the name of the task?");
        String name2 = keyboard.nextLine();

        System.out.println("What is the description?");
        String description2 = keyboard.nextLine();
        Task t2 = new Task(name2, description2);

        String priority2 = "";
        boolean validPriority2 = false;

        while (!validPriority2) 
        {
            System.out.println("What is the priority of the task? Enter low, medium, or high.");
            priority2 = keyboard.nextLine();

            if (priority2.equals("low") || priority2.equals("medium") || priority2.equals("high")) 
            {
                t2.setPriority(priority2);
                validPriority2 = true;
            } 
            else 
            {
                System.out.println("Invalid input. Please enter low, medium, or high.");
            }
        }

        System.out.println("\nHere are your tasks:");
        System.out.println(t1+"\n");
        System.out.println(t2);

        ToDoList myList  = new ToDoList();
        myList.addTask(t1);
        myList.addTask(t2);
        myList.sortByPriority();
        System.out.println("\nYour tasks sorted high to low by priority:");
        System.out.println(myList);

        System.out.println("Who do you want these two tasks to be assigned to?");
        String personName = keyboard.nextLine();
        Person p1 = new Person(personName);
        p1.assignTasks(myList);
        System.out.println(p1);

        boolean validComplete = false;
        String completed = "";

        while (!validComplete)
        {
            System.out.println("Is "+t1.getName()+" completed? Enter yes or no.");
            completed = keyboard.nextLine();
        
            if (completed.equals("yes"))
            {
                t1.markComplete();
                validComplete = true;
            }
            else if (completed.equals("no"))
            {
                t1.markIncomplete();
                validComplete = true;
            }
            else 
            {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }

        boolean validComplete2 = false;
        String completed2 = "";

        while (!validComplete2)
        {
            System.out.println("Is "+t2.getName()+" completed? Enter yes or no.");
            completed2 = keyboard.nextLine();
        
            if (completed2.equals("yes"))
            {
                t2.markComplete();
                validComplete2 = true;
            }
            else if (completed2.equals("no"))
            {
                t2.markIncomplete();
                validComplete2 = true;
            }
            else 
            {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }

        System.out.println(p1.isComplete());  

        keyboard.close();
    }
}