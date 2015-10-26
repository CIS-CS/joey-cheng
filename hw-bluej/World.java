import java.util.Scanner;
public class World
{
   public static void main (String[]args)
   {
      System.out.println("Hello World");
      int index = 0;
      int amount;
      int sum=0;
      
      
         while (index < args.length)
         { 
    
             amount = Integer.parseInt(args[index]);
             if (amount%2 != 0)
             return ;
             else
             {
             index++;
             sum =+ amount;
             }        
         }
            int runtimes = 0;
            while (runtimes < sum)
            {
               System.out.println("Hello World");
               runtimes++;
               
            }
   }
}         
                
            
         
/*
public static void main (String[]args)
   {
   System.out.println("hello world");
   Scanner scan = new Scanner (System.in);
   System.out.println("Enter the number of times you want 'hello world' to be printed");
   int printtimes;
   printtimes = scan.nextInt;
      if (!scan.hasNextInt())
      {
         return (System.out.println("Your input is not an integer"));
      }
      if (printtimes%2 != 0)
      {
         return "Your input is not an even number. Please input an even number";
      }
      
   int number = 1;
   while (number <= printtimes)
   {
      System.out.println("hello world");
      number++;
   }
   
   }
}     */ 
            