/*Write a java program to find the largest number out of N-natural numbers.*/
import java.util.Scanner;
class LargestNum{
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        num =sc.nextInt();
        //array declaration 
        int [] arr =new int[num];
        System.out.println("Enter any "+num+" values: ");
        int maxNum=0;
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            if (arr[i]>maxNum)
                maxNum =arr[i];
        }
        System.out.println("The largest number is "+maxNum);  


    }
}