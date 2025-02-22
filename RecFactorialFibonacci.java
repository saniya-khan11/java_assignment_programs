/*Write a java program to find the Fibonacci series & Factorial of a number using recursive 
and non-Recursive functions.*/
//1. Recursive functions
import java.util.Scanner;
class RecFactorialFibonacci{
    static int factorial(int num){
        if(num==1)
            return num;
        return num*factorial(num-1);
    }

    static int fibNum(int num){        
        if(num==0 || num==1)
            return num;
        return (fibNum(num-1)+ fibNum(num-2))-1;
        }
    
    
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which to calculate Factorial : ");
        num =sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of "+num+" is "+fact);
        System.out.print("Enter the number at which you want to find Fibonacci number : ");
        num =sc.nextInt();
        int fib = fibNum(num);
        System.out.println("Fibonacci number at "+num+" is "+fib);
}
}