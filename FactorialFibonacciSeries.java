/*Write a java program to find the Fibonacci series & Factorial of a number using recursive 
and non-Recursive functions.*/
//1. Non- recursive functions

import java.util.Scanner;
class FactorialFibonacciSeries{
    static void Factorial(int num){
        int fact =1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
    static void FibonacciSeries(int terms){
        int a=0,b=1,s;
        
        System.out.println("Fibonaccies series of "+terms+" terms : ");
        for(int i=0;i<terms;i++){
            
            System.out.print(a+" ");
            s=a+b;
            a=b;
            b=s;
        }
    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which to calculate Factorial : ");
        num =sc.nextInt();
        Factorial(num);
        System.out.print("Enter the number of Fibonacci terms : ");
        num =sc.nextInt();
        FibonacciSeries(num);

    }
}