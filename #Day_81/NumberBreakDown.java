// Question#6. Number Breakdown

// Details 
// Write a function that prints out a breakdown of an integer into a sum of numbers that have just one non-zero digit which is at the first position.
// Test cases 
// Input: 12345, Output: Print 10000 + 2000 + 300 + 40 + 5
// Input: 43018, Output: Print 40000 + 3000 + 10 + 8

import java.util.Scanner;

public class NumberBreakDown {

    public static void numBraekDown(int num){
        String numStr= Integer.toString(num);

        int length=numStr.length();
        String result="";

        for(int i=0; i<numStr.length(); i++){
            char ch=numStr.charAt(i);
            if (ch != '0') {
                
                if (!result.isEmpty()) {
                    result += '+';
                }
                
                result +=ch;

                int currcount= length-1-i;
                for(int j=0; j<currcount; j++){
                    result += '0';
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        numBraekDown(num);
    }
    
}
