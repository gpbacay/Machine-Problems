import java.util.Scanner;
public class LawOfMotion {
   public static void main (String [] args) {
   double Mass, Acceleration, Force;
   
   Scanner key = new Scanner (System.in);
   
   System.out.print("Mass (m) = ");
   Mass = key.nextDouble();
   System.out.print("Acceleration (a) = ");
   Acceleration = key.nextDouble();
   
   Force = Mass * Acceleration;
   
   System.out.print("\nForce required is " + Force + " N.");
   
   }

}