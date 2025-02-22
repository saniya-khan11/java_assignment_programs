//Write a program to read two numbers from user and print their product.
import java.util.Scanner;
 class Product{
    public static void main(String args[]){
        int num1;
        int num2;
        System.out.println("Enter two integers : ");
        //Creating scanner object
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 =sc.nextInt();
        int prod = num1*num2;
        System.out.print("Product = "+prod);
    }
 }