/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcaveragescore;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author sebastianparaschivescu
 */
public class CalcAverageScore {

      /**
     * method
     * @param num
     * @return
     */
    public static double calcAverageScore(int num) {
       
        // initialize
        double average = 0.00;
        int number = 1;
       
        Random random = new Random();
       
        while(number <=  Math.abs(num)) {
           
            int rand = random.nextInt(100);
           
            System.out.printf("random %s : %s\n",number,  rand);
            if(rand >= 40){
                average += rand;
            }
           
            number++;
        }
 
        return average / 2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Scanner input = new Scanner(System.in);
       
        System.out.printf("Please input a number: ");
        int num = input.nextInt();
       
        double numCalc = calcAverageScore(num);
       
        System.out.printf("---------------------\n");
        System.out.printf("calcAverageScore : %.2f\n", numCalc);
        System.out.printf("---------------------\n");
    }
   
}
