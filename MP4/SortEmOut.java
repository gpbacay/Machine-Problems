import java.util.Scanner;

public class SortEmOut {
   public static void main (String[] args) {
   
   int[] array1 = {};
   final int MAX = 20;
   final int QUIT = 999;
   int num = 0, count = 0, temp, order, i, j;
   
   Scanner input = new Scanner (System.in);
   
   num = input.nextInt();
   
   while (num!=QUIT)
   {
      count++;
      int array2[] = new int[count];
      if (count != 1)
      {
         for (i = 0; i < count-1; i++)
         {
            array2[i] = array1[i];
         }
      }  
      array2[count-1] = num;
      
      
      array1 = new int [count];
         for (i = 0; i < count; i++)
         {  
            array1[i] = array2[i]; 
         }
      array1[count-1] = num;
            
            
      if(count == MAX)
         num = QUIT;
      else
      {
         num = input.nextInt();
      }
   }

      
   do {
   System.out.print("\nEnter 1 for asc, 2 for desc: ");
   order = input.nextInt();
   
      if (order == 1 ) //ascending order
      { 
         for (i = 1; i < array1.length; i++) 
         {
            for (j = i; j > 0; j--) 
            { 
               if (array1[j] < array1[j - 1]) 
               { 
                  temp = array1[j]; 
                  array1[j] = array1[j - 1];
                  array1[j - 1] = temp;
               }
            }
         }
      }
     
      else if (order == 2 ) //descending order
      {
         for (i = 1; i < array1.length; i++) 
         {
            for (j = i; j > 0; j--) 
            { 
               if (array1[j] > array1[j - 1]) 
               { 
                  temp = array1[j]; 
                  array1[j] = array1[j - 1];
                  array1[j - 1] = temp;
               }
            }
         }
      }
      
      else {
         System.out.print("\nEnter 1 for asc, 2 for desc: ");
         order = input.nextInt();
      }
      
      for (i = 0; i < array1.length; i++)
         System.out.println(array1[i]);
         
   }while (order != 1 || order != 2);
   
   }
}
