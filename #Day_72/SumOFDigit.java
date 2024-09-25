// Details 
// Write a function that takes input an integer number and returns the sum of digits of that number.

// Test cases for candidate
// Input = 12 Output: "3"
// Input = 1234 Output: "10"

// Test cases for interview
// Input = 12 Output: 3
// Input = 1234 Output: 10
// Input = 1 Output: 1
// Input = 10 Output: 1

// Follow-up question
// If the candidate is able to write the solution, ask a follow up question where the candidate has to keep adding the digits until a single digit.
// 5 min
import java.util.*;
public class SumOFDigit {

    public static void sumOfDigit(int n){

        int d;
        int sum=0;
        while (n > 0) {
            d= n % 10;
            sum = sum + d;
            n=n/10;
        }
        System.out.println("Sum of Numbers is : " + sum);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int n= sc.nextInt();

        sumOfDigit(n);
    }
}