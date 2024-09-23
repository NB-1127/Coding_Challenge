// Details
// Write a function that prints the next n leap years after the given year. The input is the (year) and the number of leap-years to print.

// A leap year is one that is divisible by 4. There is one additional condition: if the year is divisible by 100, then the year needs to be divisible by 400 to be considered a leap year. For example, 1900 is not a year leap but 2000 is a leap year.

// Test cases for candidate
// Input: 996, 5 Output: 1004, 1008, 1012, 1016, 1020
// Input: 1996, 3 Output: 2000, 2004, 2008
// 20 min
import java.util.Scanner;

public class LeapYearNum {
    

    public static void leapYNum(int num, int syear){

        int count=0;
        int year= syear+1;

        while (count < num) {

            if ((year % 100 != 0 && year % 4 == 0) || (year % 400 ==0)) {

                System.out.println("Leap year is :" + year);
                count++; 
            }
            year++;
           
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int syear= sc.nextInt();
        int num= sc.nextInt();
        leapYNum(num, syear);
    }
}
