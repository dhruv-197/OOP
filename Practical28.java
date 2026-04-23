interface Exam
{
    boolean isPassed(int mark);
}

interface Classify
{
    String getDivision(double average);
}

class Result implements Exam, Classify
{
    public boolean isPassed(int mark)
    {
        if(mark >= 35)
            return true;
        else
            return false;
    }

    public String getDivision(double average)
    {
        if(average >= 60)
            return "First Division";
        else if(average >= 50)
            return "Second Division";
        else if(average >= 35)
            return "Third Division";
        else
            return "Fail";
    }
}

public class Practical28
{
    public static void main(String[] args)
    {
        System.out.println("Dhruv Soni - 240390107005");
        Result r = new Result();

        int mark = 40;
        double avg = 62.5;

        if(r.isPassed(mark))
            System.out.println("Student Passed");
        else
            System.out.println("Student Failed");

        System.out.println("Division: " + r.getDivision(avg));
    }
}
