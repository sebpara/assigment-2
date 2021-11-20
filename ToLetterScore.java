/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toletterscore;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class ToLetterScore {

       /**
     * method
     * @param digitScore
     * @return
     */
    public static char toLetterScore(double digitScore) {
       if(90 <= digitScore && digitScore <= 100){
           return 'A';
       }
       else if(80 <= digitScore && digitScore < 90){
           return 'b';
       }
       else if(70 <= digitScore && digitScore < 80){
           return 'C';
       }
         else if(60 <= digitScore && digitScore < 70){
           return 'd';
       }
       else if(0 <= digitScore && digitScore < 60){
           return 'F';
       }
       else {
           return 'Y';
       }
    }

    /**
     * method
     * @param letterScore
     */
    public static void printMessage1(char letterScore) {
       
       if(letterScore == 'A' || letterScore == 'a') {
         System.out.printf("\"Excellent\"\n");  
       }
       else if(letterScore == 'B' || letterScore == 'b') {
         System.out.printf("\"Well done\"\n");  
       }
       else if(letterScore == 'C' || letterScore == 'c') {
         System.out.printf("\"Well done\"\n");  
       }
       else if(letterScore == 'D' || letterScore == 'd') {
         System.out.printf("\"Passed\"\n");  
       }
       else if(letterScore == 'F' || letterScore == 'f') {
         System.out.printf("\"Better try again\"\n");  
       }
       else {
        System.out.printf("\"Your digit score is not in the range [0, 100]\"\n");  
       }
       
    }
   
    /**
     * method
     * @param letterScore
     */
    public static void printMessage2(char letterScore) {
       
        switch(letterScore) {
            case('A'):
            case('a'):  
                    System.out.printf("\"Excellent\"\n");  
                break;
            case('B'):
            case('b'):  
            case('C'):
            case('c'):  
                    System.out.printf("\"Well done\"\n");    
                break;
            case('D'):
            case('d'):  
                    System.out.printf("\"Passed\"\n");    
                break;
            case('F'):
            case('f'):  
                    System.out.printf("\"Better try again\"\n");    
                break;
            default:
                    System.out.printf("\"Your digit score is not in the range [0, 100]\"\n");  
                break;
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Scanner input = new Scanner(System.in);
       
        System.out.printf("Please input digit score in range [0, 100]: ");
        double score = input.nextDouble();
       
        char letterScore = toLetterScore(score);
       
        System.out.printf("---------------------\n");
        printMessage1(letterScore);
        System.out.printf("---------------------\n");
        printMessage2(letterScore);
        System.out.printf("---------------------\n");
       
    }
   
}
