/**
* The LoggingCompany program takes user input
* and tells the user how many logs can be carried
* on a truck based on the length
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-17
*/
//importing the scanner class
import java.util.Scanner;

public class LoggingCompany {
  public static void main(String[] args) {
    
    //giving the user important information so they can make their decision
    System.out.println("The truck can carry max 1100 kg of logs");
    System.out.println("You can choose to have lengths of 1, 0.5 or 0.25 delivered");
    System.out.println("With the above information, which length of log would you like delivered?");
        
    //declaring constant
    double maxWeight = 1100;
    double weightPerM = 20;
    
    //get the length of log from the user
    Scanner input = new Scanner(System.in);
    double lengthDes = input.nextDouble();
    
    //let the user know the length of log they have chosen
    System.out.println("Length selected is: " + lengthDes);
    
    //check for incorrect values
    if (lengthDes != 1 && lengthDes != 0.5 && lengthDes != 0.25)
    {
      System.out.println("Selected value out of range, please restart and try again");
      System.exit(0);
    }
    else{}
    
    //declare variables
    double numMaxLogs;
    double maxLength;
    
    //calculate the overall total length of logs the truck can carry
    maxLength = maxWeight / weightPerM;
    
    //calculate the max amount of logs carryable
    numMaxLogs = maxLength / lengthDes;
    
    System.out.println("The max number of logs is: " + numMaxLogs);
    
  }
  
}