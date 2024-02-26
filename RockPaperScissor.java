package task_1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		//let us assume 0= rock, 1= paper, 2= scissor
		
		Scanner scan= new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("----CHOOSE O FOR ROCK-----");
		System.out.println("----CHOOSE 1 FOR PAPER----");
		System.out.println("----CHOOSE 2 FOR SCISSOR--");
		System.out.println("--------------------------");
		
		
		int userinput= scan.nextInt();
		
		
		// computer take random number from 0 to 2.
		Random randomnumber = new Random();
		 int computerInput = randomnumber.nextInt(3);
		 		
		 //what if user give correct input it allowss to play game
		 
		if (userinput<=2)
		{
			
	        if (userinput == computerInput)
	        {
	        	// if user and computer inputs are same then it will be draw
	        	
	            System.out.println(" Draw");
	        }
	        else if (userinput == 0 && computerInput == 2 || userinput == 1 && computerInput == 0
	                || userinput == 2 && computerInput == 1) 
	        
	        {
	        	//in other case you always loss 
	        	
	            System.out.println("hurray!!!! You Win!");
	        } 
	      
	        else
	        {
	       
	        	//in other cases you lost and computer win
	        	
	            System.out.println("Computer Win!");
	        }
	        
	        if(computerInput==0)
	        {
	            System.out.println("Computer choice: "+ computerInput +" that is Rock");
	        }
	        
	        else if(computerInput==1)
	        {
	            System.out.println("Computer choice:"+computerInput+" that is  Paper");
	        }
	        else if(computerInput==2)
	        {
	        	
	            System.out.println("Computer choice: "+computerInput+" that is Scissors");
	        }
		}
		
		//other wise ask for valid input
		
		
	    else 
	    {
	    	
	    	System.out.println("enter valid input  ");
	        	
         }
	}
}
