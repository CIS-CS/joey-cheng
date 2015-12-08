import java.util.ArrayList;

/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    private String name;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
        name = " ";
    }
    
    public LogAnalyzer(String fileName)
    {
        hourCounts = new int[24];
        name = fileName;
        reader = new LogfileReader(name);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    public int numberOfAccesses()
    {
        int total = 0;
        for (int index = 0; index < hourCounts.length; index++)
        {
            total = total + hourCounts[index];
        }
        return total;
    }
    
    public int busiestHour()
    {
        int biggest = 0;
        int location = 0;
        for (int index = 0; index < hourCounts.length; index++)
        {
            if (biggest < hourCounts[index])
            {
                biggest = hourCounts[index];
                location = index;
                
            }
            
        }
        
        return location;
    }
    
    public int quietestHour()
    {
        int smallest = Integer.MAX_VALUE;
        int location = 0;
        for (int index = 0; index < hourCounts.length; index++)
        {
            if (hourCounts[index] < smallest)
            {
                smallest = hourCounts[index];
                location = index;
            }
        }
        
        return location;
    }
    
    public int busiestTwoHours()
    {
        int total = 0;
        for (int index = 0; index < hourCounts.length; index=+2)
        {
            if ((hourCounts[index]+hourCounts[index+1]) > total)
            {
                total = (hourCounts[index]+hourCounts[index+1]);
            }
        }
        
        return total;
    }
            
            
        
       
    
}
