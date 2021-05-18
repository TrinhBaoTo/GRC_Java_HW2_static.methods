// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #2 ver2(Static method), 09/30/19
//
// This program's behavior is spell out the word MISSISSIPPI using block letters 

public class HW2
{
	public static void main(String[] args)
   {
      printM();
      printISSISS();
      printIPP();
      printI();
   } 
   //End of Main

//Start of static methods

   //Single letter 
   public static void printM()
   {
      System.out.println("M     M");
      System.out.println("MM   MM");
      System.out.println("M M M M");
      System.out.println("M  M  M");
      System.out.println("M     M");
      System.out.println("M     M");
         System.out.println();
   }
   public static void printS()
   {
      System.out.println(" SSSSSS ");
      System.out.println("S      S");
      System.out.println("S       ");
      System.out.println(" SSSSSS ");
      System.out.println("       S");
      System.out.println("S      S");
      System.out.println(" SSSSSS ");
      System.out.println();
   }
   public static void printI()
   {
      System.out.println("IIIIIII");
      System.out.println("   I   ");
      System.out.println("   I   ");
      System.out.println("   I   ");
      System.out.println("   I   ");
      System.out.println("   I   ");
      System.out.println("   I   ");
      System.out.println("IIIIIII");
         System.out.println();
   }
   public static void printP()
   {
      System.out.println(" PPPPPP ");
      System.out.println("P      P");
      System.out.println("P      P");
      System.out.println("PPPPPPP ");
      System.out.println("P      ");
      System.out.println("P       ");
      System.out.println("P       ");
       System.out.println();
   }
   //End of single letter 
   
   //Pattern
   public static void printSS()
   {
      printS();
      printS();
   }
   public static void printPP()
   {
      printP();
      printP();
   }
   public static void printISS()
   {
      printI();
      printSS();
   }
   public static void printIPP()
   {
      printI();
      printPP();
   }
   public static void printISSISS()
   {
      printISS();
      printISS();
   }
   //End of pattern 
   
      
}

