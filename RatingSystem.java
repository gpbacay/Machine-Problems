import java.util.Scanner;
public class RatingSystem {
   public static void main (String [] args) {
   
   double IC111, GE111, GE112, IC112, rating, GWA;
   String interpretation;
   
   Scanner key = new Scanner (System.in);
   
   System.out.print("Enter IC111 grade: ");
   IC111 = key.nextInt();
   System.out.print("Enter GE111 grade: ");
   GE111 = key.nextInt();
   System.out.print("Enter GE112 grade: ");
   GE112 = key.nextInt();
   System.out.print("Enter IC112 grade: ");
   IC112 = key.nextInt();
   
   GWA = (IC111 + GE111 + GE112 + IC112)/4;
   
   if (GWA >= 98.00 && GWA <= 100.00) {
   rating = 1.0;
   interpretation = ("denotes \nmarked excellence.");
   }
   
   else if (GWA >= 97.99 && GWA <= 97.01) {
   rating = 1.0;
   interpretation = ("denotes \nmarked excellence.");
   }
   
   else if (GWA >= 95.00 && GWA < 98.00) {
   rating = 1.25;
   interpretation = ("denotes \noutstanding.");
   }
   
   else if (GWA >= 94.99 && GWA <= 94.01) {
   rating = 1.25;
   interpretation = ("denotes \nmarked outstanding.");
   }
   
   else if (GWA >= 92.00 && GWA <= 95.00) {
   rating = 1.5;
   interpretation = ("denotes \nvery good work.");
   }
   
   else if (GWA >= 91.99 && GWA <= 91.01) {
   rating = 1.5;
   interpretation = ("denotes \nmarked goodwork.");
   }
   
   else if (GWA >= 89.00 && GWA <= 92.00) {
   rating = 1.75;
   interpretation = ("denotes \nvery satisfactory work.");
   }
   
   else if (GWA >= 88.99 && GWA <= 88.01) {
   rating = 1.75;
   interpretation = ("denotes \nvery satisfactory work.");
   }
      
   else if (GWA >= 86.00 && GWA <= 89.00) {
   rating = 2.0;
   interpretation = ("denotes \nquite good work.");
   }
   
   else if (GWA >= 85.99 && GWA <= 85.01) {
   rating = 2.0;
   interpretation = ("denotes \nquite good work.");
   }
   
   else if (GWA >= 83.00 && GWA <= 86.00) {
   rating = 2.25;
   interpretation = ("denotes \ngood work.");
   }
   
  else if (GWA >= 82.99 && GWA <= 82.01) {
   rating = 2.25;
   interpretation = ("denotes \ngood work.");
   }
      
   else if (GWA >= 80.00 && GWA <= 83.00) {
   rating = 2.5;
   interpretation = ("denotes \nsatisfactory work.");
   }

   else if (GWA >= 79.99 && GWA <= 79.01) {
   rating = 2.5;
   interpretation = ("denotes \nsatisfactory work.");
   }
   
   else if (GWA >= 77.00 && GWA <= 80.00) {
   rating = 2.75;
   interpretation = ("denotes \nmoderately satisfactory work.");
   }

   else if (GWA >= 76.99 && GWA <= 76.01) {
   rating = 2.75;
   interpretation = ("denotes \nmoderately satisfactory work.");
   }

   else if (GWA >= 75.00 && GWA <= 77.00) {
   rating = 3.0;
   interpretation = ("denotes \npassing.");
   }
   
   else {
   rating = 5.0;
   interpretation = ("signifies \nfailure. It requires a re-enrollment and repetition of the course.");
   }
   
   System.out.printf("\nYour General Weighted Average for this semester is \n%.2f", GWA);
   System.out.printf(" with a rating equivalent to %.2f", rating);
   System.out.print("." + " This " + interpretation);
   
   }
   
   
}
