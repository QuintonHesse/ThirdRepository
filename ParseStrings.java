package Parse;

import java.util.Scanner;

public class ParseStrings {
   public static void main(String[] args) {
	   String userInput = ""; //Initialize variables
	   String firstWord;
	   String lastWord;
	   int commaLocation;
	   boolean inputDone = false;
	   Scanner scnr= new Scanner(System.in);
	   
	   while(!inputDone) { 
		   System.out.println("Enter input string: "); //user input
		   userInput = scnr.nextLine();

	  
		   while((userInput.equals("q")== false) && (userInput.indexOf(',') == -1)) { //no comma error message
			   System.out.println("Error: No comma in string");
			   System.out.println("Enter input string: ");
			   userInput = scnr.nextLine();
			   
		   }
		   if(userInput.equals("q")){
			   inputDone = true;
			   }
		   
		   commaLocation = userInput.indexOf(',');
		   
		   firstWord = userInput.substring(0, commaLocation); //get first word
		   firstWord = firstWord.replace(" ", "");
		   
		   lastWord = userInput.substring(commaLocation+1,userInput.length()); //get second word
		   lastWord = lastWord.replace(" ", "");
		   
		   System.out.println("First Word: " + firstWord); //output first and second word
		   System.out.println("Second Word: " + lastWord);
		   System.out.println("");
		   System.out.println("");
		   
		   
	   }
	   
      return;
   }
}
