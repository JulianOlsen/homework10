package homework10;

import java.util.Scanner;
import java.util.Random;

public class Homework10 
{   

    public static void main(String[] args) 
    {
        
       System.out.println("type in how many chances your need out of 1 to 1000");
        
       Scanner Sc = new Scanner(System.in);
       int chances = Sc.nextInt();
       Random rand = new Random();
       int randomnum = rand.nextInt(1000);
       int loop =0;
     
        System.out.println("type in your first gess");
       
       while(chances-1>loop){
           loop=loop+1;
       
       int guess = Sc.nextInt();
           if (randomnum>guess)
       { 
            System.out.println("too low");
       }
       else if (guess>randomnum)
       {
           System.out.println("too high ");
       }
       else if (guess==randomnum)
       {
            System.out.println("you win");
       }
       else{}
       }
      
       
       int guess = Sc.nextInt();
       
       if (randomnum>guess)
       { 
            System.out.println("sorry you lost. the number was "+ randomnum );
       }
       else if (guess>randomnum)
       {
           System.out.println("sorry you lost. the number was "+ randomnum );
       }
       else if (guess==randomnum)
       {
            System.out.println("you win");
       }
       else{}
    }
}
