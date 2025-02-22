/*Write a java program to read n number of values in an array and display it in reverse 
order. */
import java.util.Scanner;
class Array{
    static void readArray(int [] arr){
        int len =arr.length;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter values for your array : ");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void displayArray(int [] arr){
         
        System.out.println("Displaying values of Array in reverse order : ");
        for(int i =(arr.length)-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of your array : ");
        int size=sc.nextInt();
        int [] arr = new int[size];
        readArray(arr);
        displayArray(arr);
    }
}