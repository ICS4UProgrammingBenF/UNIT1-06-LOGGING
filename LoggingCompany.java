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
    System.out.println("You can choose to have lengths of 1m, 0.5m or 0.25m delivered");
    System.out.println("With the above information, which length of log would you like delivered?");
        
    //declaring constant
    double maxWeight = 1100;
    double weightPerM = 20;
    
    //get the length of log from the user
    double lengthDes = logLength.nextDouble();
    
    //let the user know the length of log they have chosen
    System.out.println("Length chosen by user is :" + logLength);
    
    //set numMaxLogs to be the user's input
    //lengthDes = logLength;
    
    //declare variables
    double maxWeight;
    double weightPerM;
    double numMaxLogs;
    
    //calculate the overall total length of logs the truck can carry
    maxLength = maxWeight / weightPerM;
    
    //calculate the max amount of logs carryable
    numMaxLogs = maxLength / lengthDes;
    
    System.out.println("The max number of logs is :" + numMaxLogs);
  }
}