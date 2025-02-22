/*Write a program to print the square of a number passed through command line 
arguments.*/
class CommandLineArgs{
    public static void main(String args[]){
        double num = Double.parseDouble(args[0]);
        double sq = num * num;
        System.out.print("Square of "+num+" is "+sq);
        }
}