/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcdays;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class Calcdays {

      /**
     * method
     * @param year
     * @return
     */
    public static boolean leapYear(int year) {
     
        if(year % 4 == 0) {
           return true;
        } else {
            if(year % 100 == 0) {
                 return false;
            } else {
                if(year % 400 == 0) {
                    return true;
                }  else {
                     return false;
                }
            }
        }
    }
   
    /**
     * method
     * @param year
     * @param month
     * @return
     */
    public static int calcDays1(int year, int month){  
       
        // initialize
        int day = 0;
       
        if(month == 2) {
            if(leapYear(year) ) {
                day = 29;
            } else {
                day = 28;
            }
       
        }
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
               day = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        }
       
        return day;
    }
   
    /**
     * method
     * @param year
     * @param month
     * @return
     */
    public static int calcDays2(int year, int month){  
       
        // initialize
        int day = 0;
       
        switch(month) {
            case(2):
                if(leapYear(year) ) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            case(1):
            case(3):
            case(5):
            case(7):
            case(8):
            case(10):
            case(12):
                    day = 31;
                break;
            case(4):
            case(6):
            case(9):
            case(11):
                    day = 30;
                break;            
            default:
                break;
        }
       
        return day;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Scanner input = new Scanner(System.in);
         
        System.out.printf("Please input a year: ");
        int year = input.nextInt();
       
        System.out.printf("Please input a month (1 - 12): ");
        int month = input.nextInt();
       
        int days1 = calcDays1(year, month);
        int days2 = calcDays2(year, month);
       
        System.out.printf("---------------------\n");
        System.out.printf("calcDays1 : %s days\n", days1);
        System.out.printf("calcDays2 : %s days\n", days2);
        System.out.printf("---------------------\n");
    }
   
}
