interface Classify
{
    String getDivision(double average);
}

class Result implements Classify
{
    public String getDivision(double average)
    {
        if(average >= 60)
        {
            return "First Division";
        }
        else
        {
            return "No First Division";
        }
    }
}

public class Practical27
{
    public static void main(String[] args)
    {
        System.out.println("Dhruv Soni - 240390107005");
        Result r = new Result();

        double avg = 65.5;

        System.out.println("Average = " + avg);
        System.out.println(r.getDivision(avg));
    }
}
