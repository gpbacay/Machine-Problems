import java.util.Scanner;

public class PighaTeaMenu 
{
   public static void divider()
   {
      System.out.println("=================================================");
   }
   public static void main (String [] args) 
   {
      int menuOrder, quantity, price, total = 0, currentTotal = 0;
      int cash, change = 0, lackingAmount = 0, addAmount, NewCash = 0;
      char addOrder;
      
      Scanner input = new Scanner (System.in);
      
      divider();
      System.out.println("       WELCOME TO PighaTEA MILK TEA SHOP!");
      System.out.println("       Ang Milk Tea ng mga Sadboy/Sadgirl");
      
      do {
      divider();
      System.out.println("PighaTEA MENU:");
      System.out.println("[1] PighaTEA Classic Milk Tea - Php 70.00");
      System.out.println("[2] PighaTEA Cokies & Cream Milk Tea - Php 70.00");
      System.out.println("[3] PighaTEA Mango Graham Milk Tea - Php 70.00");
      System.out.println("[4] PighaTEA Taho Milk Tea - Php 70.00");
      System.out.println("[0] Exit");
      divider();
      
      System.out.print("What type of Milk Tea do you want? ");
      menuOrder = input.nextInt();
      divider();
      
      if (menuOrder == 1) 
      {
         System.out.print("\nEnter quantity for Classic Milk Tea: ");
         quantity = input.nextInt();
         price = 70;
         total = quantity * price;
         System.out.print("\n");
         divider();
      }
      
      else if (menuOrder == 2) 
      {
         System.out.print("\nEnter quantity for Cokies & Cream Milk Tea: ");
         quantity = input.nextInt();
         price = 70;
         total = quantity * price;
         System.out.print("\n");
         divider();
      }
      
      else if (menuOrder == 3) 
      {
         System.out.print("\nEnter quantity for Mango Graham Milk Tea: ");
         quantity = input.nextInt();
         price = 70;
         total = quantity * price;
         System.out.print("\n");
         divider();
      }
      
      else if (menuOrder == 4) 
      {
         System.out.print("\nEnter quantity for Taho Milk Tea: ");
         quantity = input.nextInt();
         price = 70;
         total = quantity * price;
         System.out.print("\n");
         divider();
      }
      
      else
      {
         System.exit(0);
      }
      
      currentTotal+= total;
      System.out.println("Current total of purchase is " + "Php " + currentTotal);
      
      divider();
      System.out.print("You want to add another order? [Y/N]: ");
      addOrder = input.next().charAt(0);
      divider();
      
      } while ((menuOrder != 1 || menuOrder != 2 || menuOrder != 3 || menuOrder != 0) && (addOrder == 'y' || addOrder == 'Y'));

      System.out.print("Total due: " + "Php " + currentTotal);

      System.out.print("\nEnter cash amount: ");
      cash = input.nextInt();
         if (cash >= currentTotal)
         {
            change = cash - currentTotal;
         }
         
      while (cash < currentTotal)
         {
            lackingAmount = currentTotal - cash;
            System.out.print("Insufficient amount! " + "add " + "Php ");
            System.out.print(lackingAmount);
            
            System.out.print("\nAdd Ammount: ");
            addAmount = input.nextInt();
            cash = cash + addAmount;
            if (cash >= currentTotal)
            {
               change = cash - currentTotal;
            }

         }
              
      System.out.println("\nChange: " + "Php " + change);
      divider();
      System.out.println("THANK YOU FOR ORDERING, PLEASE COME BACK AGAIN!");
      divider();
   }

}        