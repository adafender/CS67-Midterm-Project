// Ada Fender
// Midterm Project

import java.util.ArrayList;
import java.util.Collections;

public class ToDoList extends ArrayList<Task>
{
    private ArrayList<Task> tasks;

    public ToDoList()
    {
        tasks = new ArrayList<Task>();
    }

    public String toString()
    {
        String returnVal = "";
        for(Task t : tasks)
        {
            returnVal += t;
            returnVal += "\n\n";
        }
        return returnVal;
    }

    /**
     * @return a String containing just the names of the tasks
     */
    public String getTaskNames()
    {
        String returnVal = "";
        for(Task t : tasks)
        {
            returnVal += "- "+t.getName();
            returnVal += "\n";
        }
        return returnVal;
    }

    /**
     * tests whether all tasks are completed or not
     * @return true if all tasks complete, false otherwise
     */
    public boolean allComplete()
    {
        boolean returnVal = true;
        for(Task t : tasks)
        {
            if (t.getComplete() == "incomplete")
            {
                returnVal = false;
            }
        }
        return returnVal;
    }

    /**
     * adds a new Task object to the ToDoList
     * @param newTask the Task object that is being added
     */
    public void addTask(Task newTask)
    {
        tasks.add(newTask);
    }

    /**
     * sorts a ToDoList by priority, low to high
     */
    public void sortByPriority()
    {
        Collections.sort(tasks, new PriorityComparator());
    }
}
