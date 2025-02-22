/*Write a program to send the name and surname of a student through command line 
arguments and print a welcome message for the student. */
class Name{
    public static void main(String args[]){
    String first = args[0];
    String last =args[1];
    System.out.println("Welcome "+ first +" "+last+" !");
    }
}