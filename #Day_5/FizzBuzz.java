import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();

        if (num % 15 ==0) {
            System.out.println("FizzBuzz");
        }else if (num % 3 ==0) {
            System.out.println("Fizz");
        }else if (num %5 ==0) {
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }
}