import java.util.Scanner;

public class MultiplicationTable 
{
   public static void main (String [] args)
   {
      int multiplicand;
      int multiplier;
      int product;
      
      Scanner input = new Scanner (System.in);
      
      multiplicand = input.nextInt();
      System.out.print("\n");
      multiplier = input.nextInt();
      
      
      for (int i = 0; i < multiplier; i++)
      {
         product = multiplicand * (i + 1);
         System.out.println("\n" + multiplicand + " x " + (i + 1) + " = " + product);
      }
      
   }
}
      