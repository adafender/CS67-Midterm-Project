// Ada Fender
// Midterm Project

import java.util.Comparator;

public class Task
{
    private String name;
    private String description;
    private boolean complete;
    private Double priority;   

    public Task(String n, String d)
    {
        name = n;
        description = d;
        complete = false;
        priority = 2.0;
    }

    public String toString()
    {
        String returnVal = "Name: "+name+"\nDescription: "+description+"\nPriority: "+this.getPriority()+"\nStatus: "+this.getComplete();
        return returnVal;
    }

    public void markComplete()
    {
        complete = true;
    }

    public void markIncomplete()
    {
        complete = false;
    }

    /**
     * sets a new Double to the priority for the Task
     * @param newPriority the new priority to set for the task
     */
    public void setPriority(String newPriority) 
    {
        if (newPriority.equals("low")) 
        {
            priority = 1.0;
        } 
        else if (newPriority.equals("medium")) 
        {
            priority = 2.0;
        } 
        else if (newPriority.equals("high")) 
        {
            priority = 3.0;
        } 
        else {
            System.err.println("Error setting priority: please enter low, medium, or high");
        }
    }
    
    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    /**
     * @return a String saying if a task is complete or not
     */
    public String getComplete()
    {
        if (complete == true)
        {
            return "complete";
        }
        else
        {
            return "incomplete";
        }
    }

    public Double getPriorityNum()
    {
        return priority;
    }

    /**
     * @return a String saying what priority the task is
     */
    public String getPriority()
    {
        if (priority == 1.0)
        {
            return "low";
        }
        else if (priority == 2.0)
        {
            return "medium";
        }
        else if (priority == 3.0)
        {
            return "high";
        }
        else
        {
            return "error, reset priority";
        }
    }
}

/**
 * establish how to sort Task objects by priority
 */
class PriorityComparator implements Comparator<Task> {
    public int compare(Task a, Task b) {
        return Double.compare(b.getPriorityNum(), a.getPriorityNum());
    }
}