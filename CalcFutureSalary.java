/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfuturesalary;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class CalcFutureSalary {

     /**
     * method
     * @param curretSalary
     * @param year
     * @return
     */
    public static double calcFutureSalary(double curretSalary, int year) {
       
        // initialize
        double futureSalary = curretSalary;
       
        do {
            if(year < 3) {
                futureSalary += curretSalary * 3 / 100;
            }
            else if(year < 10) {
                     futureSalary += curretSalary * 5 / 100;
            }
            else {
                futureSalary += curretSalary * 8 / 100;
            }
          year--;
        }
        while (year > 0);
       
        return futureSalary;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
       
        System.out.printf("Please input curret salary: ");
        double curretSalary = input.nextDouble();
       
        System.out.printf("Please input a year: ");
        int year = input.nextInt();
       
        double futureSalary = calcFutureSalary(curretSalary, year);
       
        System.out.printf("---------------------\n");
        System.out.printf("future salary after %s years: %.2f\n",year,  futureSalary);
        System.out.printf("---------------------\n");
    }
   
}