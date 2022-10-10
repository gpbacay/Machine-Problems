import java.util.Scanner;

public class BayadNong {
   public static void main (String [] args) {
   
   final double fare = 9.50;
   double bayad, kambyo;
   
   Scanner input = new Scanner (System.in);
   
   System.out.print("Bayad: ");
   bayad = input.nextDouble();
   
   if (bayad >= 9.50) 
   {
      kambyo = bayad - fare;
      System.out.printf("Kambyo nimo kay: %.2f\nSalamat!", kambyo);
   }
   else 
   {
      System.out.print("Kulang man ni boss!");
   }
   
   }
}