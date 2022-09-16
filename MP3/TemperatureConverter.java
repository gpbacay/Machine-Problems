import java.util.Scanner;
public class TemperatureConverter {
   public static void main (String [] args) {
   
   Scanner key = new Scanner (System.in);
   
   double Celcius, Fahrenheit, num, constant = 1.8;
   char scale, option;
   
   do {
   System.out.print("Enter c or f: ");
   scale = key.next().charAt(0);
   
      if (scale == 'c' || scale == 'C') {
         System.out.print("\nEnter number to be converted: ");
         num = key.nextDouble();
         Fahrenheit = (constant * num) + 32;
         if (num == 2) {
            System.out.printf("%.0f", num);
            System.out.print(" degrees Celsius is equal to ");
            System.out.printf("%.2f", Fahrenheit);
            System.out.print(" degrees Fahrenheit.");
         }
         
         else {
            System.out.print(num + " degrees Celsius is equal to " + Fahrenheit + " degrees Fahrenheit.");
         }
      }
      
      else if (scale == 'f' || scale == 'F') {
         System.out.print("\nEnter number to be converted: ");
         num = key.nextDouble();
         Celcius = (num - 32) / constant;
         System.out.print(num + " degrees Fahrenheit is equal to " + Celcius + " degrees Celsius.");
      }
   
      else {
         System.out.println("\nYou have inputted an invalid character!");
      }
   
   System.out.print("\n");
   System.out.print("\nYou want to convert again? [Y/N]: ");
   option = key.next().charAt(0);
   System.out.print("\n");
   
   }while ((scale != 'c' || scale != 'f' || scale != 'C' || scale != 'F') && (option == 'y' || option == 'Y'));
   
   
   }
   
   
}