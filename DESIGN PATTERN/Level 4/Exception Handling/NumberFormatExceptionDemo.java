/* Write a program that takes an integer input as a string and handles
NumberFormatException if the input is not a valid number.*/

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String input= "123";

        try{
            int result= Integer.parseInt(input);
            System.out.println("Number: "+result);
        } catch(NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Continue...");
    }
    
}
