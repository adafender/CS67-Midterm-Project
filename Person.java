// Ada Fender
// Midterm Project

public class Person 
{
    private String name;
    private ToDoList assignedTasks;
    
    public Person(String n)
    {
        name = n;
        assignedTasks = new ToDoList();
    }

    public String getName()
    {
        return name;
    }

    /**
     * assigns a ToDoList object to the field assignedTasks
     * @param t the ToDoList object being assigned to the person
     */
    public void assignTasks(ToDoList t)
    {
            assignedTasks = t;
    }
    
    public String toString()
    {
        return name+"'s Tasks: \n"+assignedTasks.getTaskNames();
    }

    /**
     * checks if all Task objects in assignedTasks are complete
     * @return a string saying whether or not the person has completed their tasks
     */
    public String isComplete()
    {
        if (assignedTasks.allComplete())
        {
            return name+" has completed all tasks.";
        }
        else
        {
            return name+" has not completed all tasks.";
        }
    }
}
